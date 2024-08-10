package ejer2tarea;
import java.util.Scanner;

/**
 *
 * @author Estiven Ramirez
 */
public class Ejer2tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        int num1=num.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        int num2=num.nextInt();
        
         System.out.println("Ingrese el tercer numero");
        int num3=num.nextInt();
        
        if(num1>num2){
            if(num1>num3){
           System.out.println("El numero mayor es" + " " + num1);
            
            }else{
                System.out.println("El numero mayor es" + " " + num3);
            }
        }else{
        if(num2>num3){
        System.out.println("El numero mayor es" + " " + num2);
        
        }else{
        System.out.println("El numero mayor es" + " " + num3);}
        
        }
        }
        }
    
    

