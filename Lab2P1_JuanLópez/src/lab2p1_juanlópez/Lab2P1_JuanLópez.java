/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_juanlópez;
import java.util.Scanner;
/**
 *
 * @author jjlm1
 */
public class Lab2P1_JuanLópez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la opción que desee:");
        System.out.println("");
        System.out.println("1 = Longitudes de triángulo");
        System.out.println("2 = Áreas de Figuras");
        System.out.println("3 = Evaluación de números");
        int opcion=leer.nextInt();
        while (opcion>0&&opcion<4){
        if (opcion==1){
            
            char resp='s';
        while (resp=='s'){
        
             System.out.println("Ingrese la primera longitud:");
             int largo1=leer.nextInt();
             System.out.println("Ingrese la segunda longitud:");
             int largo2=leer.nextInt();
             System.out.println("Ingrese la tercera longitud:");
             int largo3=leer.nextInt();
             if (largo1>0&&largo2>0&&largo3>0){
              
                 if(largo3<largo1+largo2||largo2<largo1+largo3||largo1<largo3+largo2){
                     System.out.println("Las medidas forman un triángulo");
                   
                 }else{
                     System.out.println("Las medidas no forman un triángulo");
                 }
             
                 
             }
                    if (largo1<=0||largo2<=0||largo3<=1){
                 System.out.println("Las medidas no pueden ser negativas o cero");
             
             
             }
             System.out.println("¿Desea continuar?");
                 resp=leer.next().charAt(0);
        }

    }//fin de la primera opcion
        if (opcion==2){
           char resp='s';
           while (resp=='s'){
            System.out.println("Elija la figura cuyo área quiera calcular");
            System.out.println("1 =Triángulo");
            System.out.println("2 = Rectángulo");
            System.out.println("3 = Círculo");
            int figura=leer.nextInt();
            if(figura>0&&figura<4){
                if (figura==1){
                    System.out.println("Ingrese la base del triángulo:");
                    double base=leer.nextDouble();
                    System.out.println("Ingrese la altura del triángulo:");
                    double altura=leer.nextDouble();
                    double area;
                    area=base*altura*1/2;
                    System.out.println("El área del triángulo es: "+area);
                }//area del triangulo
            
                if (figura==2){
                    System.out.println("Ingrese la base del rectángulo:");
                    double base=leer.nextDouble();
                    System.out.println("Ingrese la altura del rectángulo:");
                    double altura=leer.nextDouble();
                    double area;
                    area=base*altura;
                    System.out.println("El área del rectángulo es: "+area);
            }//area del rectangulo
                if (figura==3){
                    System.out.println("Ingrese el radio del círculo:");
                    double radio=leer.nextDouble();
                    double area;
                    area=radio*radio*Math.PI;
                    System.out.println("El área del círculo es: "+area);
                    
                }//area del circulo
              
        }
            System.out.println("¿Desea continuar?");
                 resp=leer.next().charAt(0);
        }//fin del menu de las figuras
           
        }
        char resp='s';
                while (resp=='s'){
        if (opcion==3){
            System.out.println("Ingrese un numero para evaluar;");
            int numero=leer.nextInt();
            if (numero %2==0){
                System.out.print("El número es par");
            } else {
                System.out.print("El numero es impar");
            }
            boolean primo;
                int contdiv;
                contdiv=1;
                int contquo;
                contquo=0;
                int divisores;
                divisores=0;
                while (contdiv<=numero){
                contquo=numero%contdiv;
                
                if (contquo==0){
                    divisores=divisores+1; 
                }
                contdiv=1+contdiv;
        }
                if (divisores==2){
                    System.out.println(" y primo");
                }
                }
         System.out.println("¿Desea continuar?");
                 resp=leer.next().charAt(0);
        }
        }              
                 
        }

        }//fin del menu
        

    

