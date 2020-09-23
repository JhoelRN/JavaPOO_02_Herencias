/*
 * Clase Padre: Empleado
 * CLASE DERIVADA EMPLEADOSINHORASDOBLES
 */
package edu.utp.poo.jerarquiaclases;
/**
 * Versión 1.0
 * @author Jhoel RN MH  U17106156@utp.edu.pe
 */
public class EmpleadoConHorasDobles extends Empleado{
    
    //ATRIBUTOS
    private int horasExtras;
    //CONSTRUCTORES
    public EmpleadoConHorasDobles(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public EmpleadoConHorasDobles(int horasExtras, int horastrabajadas, double sueldoporhora) {
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
    
    //METODOS PUBLICOS
    public double CalcularSalario(){  
        return horastrabajadas*sueldoporhora + (horasExtras * sueldoporhora);
    }
        
    
}
