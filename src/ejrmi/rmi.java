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
import java.util.logging.Level;
import java.util.logging.Logger;
//
//import java.sql.Connection;
//import java.sql.DriverManager;


public class rmi extends UnicastRemoteObject implements Calculadora{

    public rmi() throws RemoteException {
        int a,b;
    }

    @Override
    public int div(int a, int b) throws RemoteException {
       return a/b;
    }

    @Override
    public int mul(int a, int b) throws RemoteException {
        return a * b;
    }

    @Override
    public int sub(int a, int b) throws RemoteException {
        return a - b;
    }

   @Override
    public String add(String nombre, int edad, float peso, float estatura, String usuario, String contrasena) throws RemoteException {
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
        
        }
        catch(Exception problem)
        {
            bandera= false;
        }
       if(bandera=true){
           texto= "Registro Satisfactorio";
       }else{
           texto= "No se pudo registrar. INTENTELO MAS TARDE";
       }
        
     return texto;   
    // return bandera; 
    }
    
    
    public Connection conex (){
        
        Connection connection = null;
        String userDB="root";
        String passDB="";
      //  boolean bandera= true;
        String texto = "";
       // String vuelta = user + " "+ password; 
        
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
              //    String userDB = 
                              if( respuesta.getString("usuario").trim().equals(user.trim() ) && respuesta.getString("contrasena").trim().equals(password.trim()) )
                              {
                                    texto= "BIENVENIDO"+ " "+ user;
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

    
    
    
    
}



