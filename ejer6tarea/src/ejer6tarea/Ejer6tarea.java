
package ejer6tarea;

import java.util.Scanner;

/**
 *
 * @author Estiven Ramirez
 */
public class Ejer6tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner year = new Scanner (System.in);
                    
        int num;
        
        System.out.println(" Ingrese un anio" + "  " + "(ejemplo: 2010)");
        num=year.nextInt();
        
        if ((num % 4 == 0 && num % 100 !=0)  || num % 400 == 0){
        System.out.println("El anio es bisiesto");
        
        }else { 
        System.out.println("El anio no es bisiesto");
        }
        }
 }
    

