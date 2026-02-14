import java.util.Scanner;

public class login_contraseña {
    public static void main(String[]args){

        // Declaración de variables para almacenar las credenciales
        String Usuario = "", password = "";

        // Instancia de Scanner para leer la entrada del teclado
        Scanner entrada = new Scanner (System.in);
        System.out.print("Ingrese su usuario: ");
        Usuario = entrada.nextLine();

        System.out.print("Ingrese su contraseña: ");
        password = entrada.nextLine();

        // Validación de credenciales usando el método equals para comparar Strings
        if(Usuario.equals("ernesto") && password.equals("1234") ) {
            // Mensaje si ambos datos coinciden
            System.out.println("Inicio de sesión correcto ");
        }else{
            System.out.println("Nombre de usuario o contraseña incorrecta ");
        }
       }

    }
