
package ejer4tarea;

import java.util.Scanner;

/**
 *
 * @author Estiven Ramirez
 */
public class Ejer4tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner nu1=new Scanner(System.in);
         
         System.out.println("Ingrese un numero");
         int n1=nu1.nextInt();
         
         if(n1>=1){
             System.out.println("El numero es positivo");
         
         }else{
         System.out.println("El numero es negativo");
         }
         
    }
    
}
