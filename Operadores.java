import java.util.Scanner;

public class Operadores{
    
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
       
        String nombre = "";
       int clave = 0, antiguedad = 0;
       
       System.out.println("******************************************************");
       System.out.println("*Bienvenido a sistema vacacional de Coca Cola Company*");
       System.out.println("******************************************************");
       System.out.println("");
       System.out.println("");
       
       System.out.print("¿cual es el nombre del trabajador?: ");
       nombre = entrada.nextLine();
       System.out.println("");
       
       System.out.println("indique su antiguedad en la empresa a continuación: ");
       antiguedad = entrada.nextInt();
       System.out.println("");
       
       System.out.println("ingrese clave de departamento: ");
       clave = entrada.nextInt();
       System.out.println("");
       
       if(clave == 1){
         if (antiguedad ==1){
            System.out.println("el trabajador "+nombre+ " tiene derecho a 6 dias de vacaciones ");
            }else if (antiguedad >=2 && antiguedad <=6){
                System.out.println("el trabajor "+nombre+" tiene derecho a 14 dias de vacaiones");
            } else if(antiguedad >=7){
                System.out.println("el trabajador "+nombre+" tiene derecho a 20 dias de vacaciones");
            }
        }else if(clave == 2){
             if (antiguedad == 1){
                System.out.println("el trabajador "+nombre+" tiene derecho a 7 dias de vacaciones");
                } else if(antiguedad >=2 && antiguedad <=6){
                    System.out.println("el trabajador "+nombre+" tiene derecho a 15 dias de vacaciones");
                } else if(antiguedad >= 7){
                    System.out.println("el trabajador"+nombre+" tiene derecho a 22 dias de vacaciones");
                } 
          }else if(clave == 3){
            if(antiguedad ==1){
                System.out.println("el trabajador "+nombre+" tiene derecho a 10 dias de vacaciones");
            }else if(antiguedad >=2 && antiguedad<=6){
                System.out.println("el trabajador "+nombre+" tiene derecho a 20 dias de vacaciones");
            }else if(antiguedad >=7){
                System.out.println("el trabajador "+nombre+" tiene derecho a 30 dias de vacaciones");
            }
            }else {
                System.out.println("Error!, la clave del departamento no existe.");
        }
    }
}

