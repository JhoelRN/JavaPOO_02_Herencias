/*
 * Clase Padre: Empleado
 * CLASE DERIVADA EMPLEADOSINHORASTRIPLES
 */
package edu.utp.poo.jerarquiaclases;
/**
 * Versión 1.0
 * @author Jhoel RN MH  U17106156@utp.edu.pe
 */
public class EmpleadoConHorasTriples extends Empleado{
    
    //ATRIBUTOS
    private int horasExtras;
    
    //CONSTRUCTORES
    public EmpleadoConHorasTriples(int horasExtras) {
        this.horasExtras = horasExtras;
    }
    public EmpleadoConHorasTriples(int horasExtras, int horastrabajadas, double sueldoporhora) {
        super(horastrabajadas, sueldoporhora);
        this.horasExtras = horasExtras;
    }
    
    //METODOS GETTER Y SETTER
    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

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
    public double CalcularSalario(){ 
        return horastrabajadas*sueldoporhora + (horasExtras * 2 * sueldoporhora);
    }
}
