import java.util.Scanner;


public class CadenaCaracteres {
    public static void main(String[] args){

        String nombre_uno = "", nombre_dos = "";
        //declaramos una entrada para usuario
        Scanner entrada = new Scanner (System.in);
        System.out.print("por favor, ingresa el primer nombre: ");
        //guardamos en nombre uno
        nombre_uno = entrada.nextLine();

        //guardamos el segundo nombre
        System.out.print("por favor, ingrese segundo nombre: ");
        nombre_dos = entrada.nextLine();

        if(nombre_uno.equals(nombre_dos) ){
            System.out.println("los nombres son iguales");
        }else{
            System.out.println("los nombres son diferentes");
        }
    }
}
