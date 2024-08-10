package ejer3tarea;
import java.util.Scanner;

/**
 *
 * @author Estiven Ramirez
 */
public class Ejer3tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner edad=new Scanner(System.in);
        
       
       System.out.println("Bienvendido");
       System.out.println("Para el ingreso de este citio se necesita su edad");
       System.out.println("Ingrese su edad");
        int n1=edad.nextInt();
        
        if(n1>=18){
         System.out.println("Bienvendido"+ " "+ "Usted es mayor de edad");   
        
        }else{
        System.out.println("Acceso denegado" + " " + "Usted no es mayor de edad");
        }
    }
    
}
