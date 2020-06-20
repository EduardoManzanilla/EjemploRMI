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
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

public class Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.setProperty("java.rmi.server.hostname", "192.168.0.6");//se añade la direción ip en la se montara el servidor 
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);//se le asigna un puerto para que este escuchando el servidor
            //LocateRegisty.getRegistry();
            r.rebind("Calculadora", new rmi());//se crea un registros con un nombre identificador se le asigna la intancia del metodo a implementar
            JOptionPane.showMessageDialog(null, "Servidor Levantado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Servidor no Conectado" + e);
        }
    }

}



