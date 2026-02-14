import java.util.Scanner;
//arreglo unidimensional

public class Arreglos {

    public static void main(String[]args){

        //declaramos un entero llamado longitud y una nueva entrada de scanner
        int longitud = 0;
        Scanner entrada = new Scanner (System.in);

        System.out.print("cuantos numeros deseas ingresar? ");
        longitud = entrada.nextInt();

        //declaramos el vector de tipo entero
        int numeros [] = new int [longitud];

        for (int i=0; i<numeros.length; i++){
            System.out.println("por favor dame el valor # "+ (i+1) );
            numeros[i] = entrada.nextInt();
        }
        for (int i=0; i<numeros.length; i++){
            System.out.print("[" +numeros [i]+"]");
        }

    }
}
