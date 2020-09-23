/*
 * Clase Padre: Empleado
 * CLASE DERIVADA EMPLEADOSINHORASEXTRAS
 */
package edu.utp.poo.jerarquiaclases;

/**
 * Versión 1.0
 * @author Jhoel RN MH  U17106156@utp.edu.pe
 */
public class EmpleadoSinHorasExtras extends Empleado{

    
    //CONSTRUCTORES
    public EmpleadoSinHorasExtras() {
    }

    public EmpleadoSinHorasExtras(int horastrabajadas, double sueldoporhora) {
        super(horastrabajadas, sueldoporhora);
    }
    //METODOS GETTER Y SETTER
    //METODOS PUBLICOS
     public double CalcularSalario(){  // salario base de 40hrs o menos...
        return horastrabajadas*sueldoporhora;
    }  
    
}
