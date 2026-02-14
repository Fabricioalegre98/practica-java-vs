import java.util.Scanner;

public class metodo_lenght {
    public static void main(String[]args){

        String cadena_original = "", cadena_substraccion = "";
        int num_caracteres = 0, desde = 0, hasta = 0;

        //guardamamos lo que ingresa el usuario en in
        Scanner in = new Scanner (System.in);

        //primer cadena de caracteres
        System.out.print("Introduce una cadena de caracteres: ");
        cadena_original = in.nextLine();

        num_caracteres = cadena_original.length();

        System.out.println("la cadena de caracteres " +cadena_original+ " posee " + num_caracteres + " caracteres. ");

        System.out.print("Desde que caracter deseas obtener nueva cadena? ");
        desde = in.nextInt();
        System.out.print("hasta que caracter deseas obtener una cadena?");
        hasta = in.nextInt();

        cadena_substraccion = cadena_original.substring(desde, hasta);
        System.out.println("la nueva cadena es: " + cadena_substraccion );

    }
}
