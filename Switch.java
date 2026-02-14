import java.util.Scanner;

public class Switch{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        String nombre = "";
        int NumUno = 0, NumDos = 0, resultado = 0;
        int parametro = resultado;
        
        System.out.println("ingrese un numero del 1 al 4");
        parametro = entrada.nextInt();
        
        switch(parametro){
            
        case 1: System.out.println("ingrese primer numero:"); 
            NumUno = entrada.nextInt();
                System.out.println("ingrese 2do numero:");
            NumDos = entrada.nextInt();
                resultado = NumUno + NumDos;
            System.out.println("el resultado de la suma es: "+resultado);
            
            break;
        case 2: System.out.println("ingrese primer numero");
            NumUno = entrada.nextInt();
                System.out.println("ingrese segundo numero");
            NumDos =entrada.nextInt();
                resultado = NumUno - NumDos;
            System.out.println("el resultado de la resta es: "+resultado);
            break;
        case 3: System.out.println("ingrese primer numero");
            NumUno = entrada.nextInt();
                System.out.println("ingrese segundo numero");
            NumDos = entrada.nextInt();
                resultado = NumUno * NumDos;
            System.out.println("el resultado de la multiplicacion es: "+resultado);
            break;
        case 4: System.out.println("ingrese primer numero");
            NumUno = entrada.nextInt();
                System.out.println("ingrese segundo numero");
            NumDos = entrada.nextInt();
                resultado = NumUno / NumDos;
            System.out.println("el resultado de la division es: "+resultado);
            break;
            
        default: System.out.println("Error!, la opcion es inconrrecta.");
        }
    }
}