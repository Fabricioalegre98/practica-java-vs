import javax.swing.*;

public class Formulario2 extends JFrame {
    //constructor de acceso publico 
    public Formulario2(){
        setLayout(null);
    }
    public static void main(String[]args){
        Formulario2 formulario3 = new Formulario2();
        formulario3.setBounds(350,100,400,500); // le damos las coordenadas al objeto
        formulario3.setVisible(true);// pedimos que el objeto sea visible
        formulario3.setLocationRelativeTo(null);// localizamos al objeto en el centro de la pantalla
        formulario3.setResizable(false);//restringimos al usuario para que no modifique el tamaño del objeto


    }
}


    

