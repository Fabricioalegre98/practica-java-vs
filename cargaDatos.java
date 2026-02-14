import java.util.Scanner;

public class cargaDatos{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String nombre = "";
        int numUno = 0, numDos = 0, resultado = 0;
        
        System.out.println("escribe tu nombre");
        nombre = in.nextLine();
        
        System.out.println("indica el primer numero para la suma:");
        numUno = in.nextInt();
        
        System.out.println("indica segundo valor para la suma");
        
        numDos = in.nextInt();
        
        resultado = numUno + numDos;
        
        System.out.println("hola "+nombre+" el resultado de tu suma es: "+resultado);
        
    }
}