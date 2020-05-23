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
public class bitacoraLista {
    float peso;
    float IMC;
    String clasificacion;
    String creado;

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setIMC(float IMC) {
        this.IMC = IMC;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setCreado(String creado) {
        this.creado = creado;
    }
    
    
    public bitacoraLista() {
    }
    public bitacoraLista(float peso, float IMC, String clasificacion, String creado) {
        this.peso = peso;
        this.IMC = IMC;
        this.clasificacion = clasificacion;
        this.creado = creado;
    }

    public float getPeso() {
        return peso;
    }

    public float getIMC() {
        return IMC;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public String getCreado() {
        return creado;
    }
    
}
