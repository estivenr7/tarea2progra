package ejer5tarea;
import java.util.Scanner;
/**
 *
 * @author Estiven Ramirez
 */
public class Ejer5tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner mes=new Scanner(System.in);
       int num;
        System.out.println("Ingrese un numero");
        num=mes.nextInt();
        
        if(num==1){
        System.out.println("El mes correspondiente al numero es:" + num + " " + "Enero");
        
        } else if (num==2){
            System.out.println("El mes correspondiente al numero es:" + num + " " + "Febrero");
            
        } else if (num==3){
            System.out.println("El mes correspondiente al numero es:" + num + " " + "Marzo");
            
        }  else if (num==4){
            System.out.println("El mes correspondiente al numero es:" + num + " " + "Abril");
            
        } else if (num==5){
            System.out.println("El mes correspondiente al numero es:" + num + " " + "Mayo");
            
        } else if (num==6){
            System.out.println("El mes correspondiente al numero es:" + num + " " + "Junio");
            
        } else if (num==7){
            System.out.println("El mes correspondiente al numero es:" + num + " " + "Julio");
            
        } else if (num==8){
            System.out.println("El mes correspondiente al numero es:" + num + " " + "Agosto");
            
        } else if (num==9){
            System.out.println("El mes correspondiente al numero es:" + num + " " + "Septiembre");
            
        } else if (num==10){
            System.out.println("El mes correspondiente al numero es:" + num + " " + "Octubre");
            
        } else if (num==11){
            System.out.println("El mes correspondiente al numero es:" + num + " " + "Noviembre");
            
        } else if (num==12){
            System.out.println("El mes correspondiente al numero es:" + num + " " + "Diciembre");
            
        }else{
        System.out.println("El numero se sale del rango de dias de meses");
        }
    
    
    
    }
    
}
