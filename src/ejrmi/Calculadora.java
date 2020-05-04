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
public interface Calculadora extends Remote{
    public int div(int a, int b) throws RemoteException;
    public int mul(int a, int b) throws RemoteException;
    public boolean sub(String user) throws RemoteException;
    public boolean add(String nombre, int edad, float peso, float estatura, String usuario, String contraseña) throws RemoteException;
    public String log(String user, String password) throws RemoteException;
    
}
