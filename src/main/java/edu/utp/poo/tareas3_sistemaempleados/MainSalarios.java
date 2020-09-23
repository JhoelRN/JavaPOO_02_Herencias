/*
 * JERARQUÍA DE CLASES SISTEMA SALARIO EMPLEADOS
 */
package edu.utp.poo.tareas3_sistemaempleados;

import java.util.Scanner;
import edu.utp.poo.jerarquiaclases.*;
import javax.swing.JOptionPane;
/**
 * Versión 1.0
 * @author Jhoel RN MH
 */
public class MainSalarios {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int horastrabajadas, sueldoporhora, horasextras;
        int opcion;
        
        do
        {   System.out.println(
                    "--------------------------------------------------------\n"+
                    " Elegir una opción !\n"+
                    "1. Empleado con <= 40 horas de trabajo \n"+
                    "2. Empleado con rango de 41 a 45 hrs de trabajo\n"+
                    "3. Empleado con > 45 hrs de trabajo\n"+
                    "0. FIN\n"+
                    "--------------------------------------------------------\n"+
                    "Ingrese la opción [1 - 3]");
            opcion = consola.nextInt();
            
                    System.out.println("Ingresar las horas trabajadas : ");
                    horastrabajadas = consola.nextInt();
                    System.out.println("Ingresar sueldo por hora : ");
                    sueldoporhora = consola.nextInt();
                    
            switch(opcion)
            {
               case 1:
                    
                    System.out.println(" - - - - - OPCIÓN EMPLEADO <= 40 hrs DE TRABAJO - - - - -  ");
                    Empleado objEmpleado = new Empleado(horastrabajadas,sueldoporhora);
                    System.out.println("El salario es : "+objEmpleado.CalcularSalario());
                    
                    
                    break;
                case 2:
                    System.out.println(" - - - - - OPCIÓN 41 a 45 hrs DE TRABAJO - - - - -  ");
                    horasextras = horastrabajadas - 40;
                    EmpleadoConHorasDobles objdoble = new EmpleadoConHorasDobles(horasextras,horastrabajadas,sueldoporhora);
                    System.out.println("El salario es: "+objdoble.CalcularSalario());
                    break;
                case 3:
                    System.out.println(" - - - - - OPCIÓN MÁS DE 45 hrs  DE TRABAJO - - - - -  ");
                    horasextras = horastrabajadas - 40;
                    EmpleadoConHorasTriples objtriple = new EmpleadoConHorasTriples(horasextras,horastrabajadas,sueldoporhora);
                    System.out.println("El salario es: "+objtriple.CalcularSalario());
                    break;
               case 0:                         
                    System.exit(0);
                    break;
                default: 
                    System.out.println("Error: Ingrese una opción valida");
                    break;
            }
        }while(true); 

    }
}
