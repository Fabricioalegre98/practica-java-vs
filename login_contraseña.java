import java.util.Scanner;

public class login_contraseña {
    public static void main(String[]args){

        String Usuario = "", password = "";

        Scanner entrada = new Scanner (System.in);
        System.out.print("Ingrese su usuario: ");
        Usuario = entrada.nextLine();

        System.out.print("Ingrese su contraseña: ");
        password = entrada.nextLine();

        if(Usuario.equals("ernesto") && password.equals("1234") ) {
            System.out.println("Inicio de sesión correcto ");
        }else{
            System.out.println("Nombre de usuario o contraseña incorrecta ");
        }
       }

    }

