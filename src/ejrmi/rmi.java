/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejrmi;

/**
 *
 * @author Eduardo Manzanilla
 */
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//
//import java.sql.Connection;
//import java.sql.DriverManager;


public class rmi extends UnicastRemoteObject implements Calculadora{
    
     private static float imc;
     private static String nombre;

    public rmi() throws RemoteException {
       // int a,b;
    }

    @Override
    public void CalcularIMC(float peso, float estatu) throws RemoteException {
         imc= peso/(estatu*estatu);
    }

    @Override
    public String Clasificacion(String u) throws RemoteException {
        
        Connection connection = conex();

        String texto = "";
        float peso = 0;
        float estatura = 0;
       
  
        Statement consulta;
        String ConsultaLoggin ="select nombre, peso, talla from login where usuario= '"+u+"'";
        
        try
        {
        consulta = connection.createStatement();
        ResultSet respuesta = consulta.executeQuery(ConsultaLoggin);
        
        while(respuesta.next())
           {

                nombre = respuesta.getString("nombre");
                System.out.println(nombre);
                peso = respuesta.getFloat("peso");
                estatura = respuesta.getFloat("talla");
            }
               CalcularIMC(peso,estatura);
   
            String cad="";
            
            if(imc<16.00){
              cad="Infrapeso: Delgadez Severa";
            }else if(imc<=16.00 || imc<=16.99){
              cad="Infrapeso: Delgadez moderada";
            }else if(imc<=17.00 || imc<=18.49){
              cad="Infrapeso: Delgadez aceptable";
            }else if(imc<=18.50 || imc<=24.99){
              cad="Peso Normal";
            }else if(imc<=25.00 || imc<=29.99){
              cad="Sobrepeso";
            }else if(imc<=30.00 || imc<=34.99){
              cad="Obeso: Tipo I";
            }else if(imc<=35.00 || imc==40.00){
              cad="Obeso: Tipo III";
            }else{
              cad="no existe clasificacion";
            }
              return cad;
               
        }
        catch(Exception problem)
        {
            return texto = "Lo sentimos tenemos problemas para calcular su IMC" + problem;
        }
    }

    @Override
    public boolean sub(String user) throws RemoteException {
          
        Connection connection = conex();
       
        boolean bandera= false; 
       
        Statement consulta;
        String ConsultaLoggin ="select usuario from login where usuario= '"+user+"'";
        
        try
        {
        consulta = connection.createStatement();
        ResultSet respuesta = consulta.executeQuery(ConsultaLoggin); 
             
            if(respuesta.next()){
                bandera = true;
            }   
        }
        catch(Exception problem)
        {
            
        }
     return bandera;   
    }
    
   @Override
    public boolean add(String nombre, int edad, float peso, float estatura, String usuario, String contrasena) throws RemoteException {
      Connection connection = conex();
       
        boolean bandera= true;
        String texto = "";
       
        PreparedStatement insertar;
        ResultSet rs;
        String InsertarLoggin ="Insert into login (usuario, contrasena, nombre, edad, peso, talla) values (?,?,?,?,?,?) ";

        try
        {
        insertar = connection.prepareStatement(InsertarLoggin);
        insertar.setString(1, usuario);
        insertar.setString(2, contrasena);
        insertar.setString(3, nombre);
        insertar.setInt(4, edad);
        insertar.setFloat(5, peso);
        insertar.setFloat(6, estatura);
        
        insertar.executeUpdate();
        
        }
        catch(Exception problem)
        {
            bandera= false;
        }
//       if(bandera=true){
//           texto= "Registro Satisfactorio";
//       }else{
//           texto= "No se pudo registrar. INTENTELO MAS TARDE";
//       }
        
    // return texto;   
     return bandera; 
    }
    
    
    public Connection conex (){
        
        Connection connection = null;
        String userDB="root";
        String passDB="";
        
        try{
        //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Class.forName("com.mysql.cj.jdbc.Driver");
       // String connectionDB = "jdbc:sqlserver://LAPTOP-ML0NLCLN:1433;databaseName=donto";
        String connectionDB = "jdbc:mysql://localhost:3306/rmi";
        connection =DriverManager.getConnection(connectionDB, userDB, passDB);
        
        }catch(ClassNotFoundException e){
            System.out.println("Error: "+ e.getMessage());
        }catch(SQLException e){
            System.out.println("Error: "+ e.getMessage());
        }catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
        return connection;
    }

    @Override
    public String log(String user, String password) throws RemoteException {
        
        
        Connection connection = conex();
       
        boolean bandera= true;
        String texto = "";
        String vuelta = user + " "+ password;    
  
       /*
        if(connection != null){
        bandera = "true";
        
        }
        */
        Statement consulta;
        String ConsultaLoggin ="select usuario, contrasena from login where usuario= '"+user+"'";
        
        try
        {
        consulta = connection.createStatement();
        ResultSet respuesta = consulta.executeQuery(ConsultaLoggin);

        while(respuesta.next())
            {
                bandera = false;
   
                if( respuesta.getString("usuario").trim().equals(user.trim() ) && 
                    respuesta.getString("contrasena").trim().equals(password.trim()) )
                {
                    texto= "true";
                }else
                {
                    texto= "Verifique su usuario y contrasena";
                }
            } 
             
            if(bandera){
                texto= "El"+ " "+ user+ " "+ "No fue encontrado"+ "\n" + "INTENTE DE NUEVO ";
            }   
        }
        catch(Exception problem)
        {
            
        }
 
        
     return texto;   
    // return bandera;
    }

    @Override
    public float getIMC() throws RemoteException{
        return imc;
    }   

    @Override
    public String getNombre()throws RemoteException {
       return nombre;
    }
}



