import javax.swing.*;

public class Etiqueta extends JFrame {

    private JLabel label1; //elementos a utilizar
    private JLabel label2;

    public Etiqueta (){
        setLayout(null);//con null indicamos que no haga nada a menos que demos la instruccion
        label1 = new JLabel("Interfaz grafica");
        label1.setBounds(10,20,300,30);
        add(label1);//mostramos la etiqueta con este elemento

        label2 = new JLabel("version 1.1");
        label2.setBounds(10,100,100,30);
        add(label2);
    }

    public static void main(String []args){
        Etiqueta etiqueta1 = new Etiqueta();
        etiqueta1.setBounds(0,0,300,200);
        etiqueta1.setResizable(false);
        etiqueta1.setVisible(true);
        etiqueta1.setLocationRelativeTo(null);
        
    }
    
}
