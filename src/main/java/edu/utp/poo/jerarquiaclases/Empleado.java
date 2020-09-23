/*
 * CLASE BASE EMPLEADO
 */
package edu.utp.poo.jerarquiaclases;

/**
 * Versión 1.0
 * @author Jhoel RN MH  U17106156@utp.edu.pe
 */
public class Empleado {
    
    //ATRIBUTOS
    protected int horastrabajadas;
    protected double sueldoporhora;
    
    //CONSTRUCTORES
    public Empleado(){
        
    }
    
    public Empleado(int horastrabajadas, double sueldoporhora) {
        this.horastrabajadas = horastrabajadas;
        this.sueldoporhora = sueldoporhora;
    }

    //METODOS GETTER Y SETTER
    public int getHorastrabajadas() {
        return horastrabajadas;
    }

    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

    public double getSueldoporhora() {
        return sueldoporhora;
    }

    public void setSueldoporhora(double sueldoporhora) {
        this.sueldoporhora = sueldoporhora;
    }
    
    //METODOS PUBLICOS
    public double CalcularSalario(){  // salario base de 40hrs o menos...
        return horastrabajadas*sueldoporhora;
    }

}
