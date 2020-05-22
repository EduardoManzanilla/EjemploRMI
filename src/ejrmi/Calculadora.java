package ejrmi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eduardo Manzanilla
 */
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.Date;
public interface Calculadora extends Remote{
    public float getIMC() throws RemoteException;
    public String getNombre()throws RemoteException;
    public String getRecomendacion()throws RemoteException;
    public String getVideo()throws RemoteException;
    public void CalcularIMC(float peso, float estatura) throws RemoteException;
    public String Clasificacion(String u) throws RemoteException;
    public boolean sub(String user) throws RemoteException;
    public boolean add(String nombre, int edad, float peso, float estatura, String usuario, String contraseña) throws RemoteException;
    public String log(String user, String password) throws RemoteException;
    public boolean registrar(float peso, float IMC, String clasificacion,String user )throws RemoteException;
    public boolean avance(String user)throws RemoteException;
    
}
