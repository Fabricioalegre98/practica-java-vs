import javax.swing.*;
import java.awt.event.*;



public class parseo extends JFrame implements ActionListener {
    private JTextField archivo1, archivo2;
    private JLabel label1, label2, label3;
    private JButton boton1;


    public parseo(){
        setLayout(null);

        label1 = new JLabel("valor 1");
        label1.setBounds(50,5,100,30);
        add(label1);

        label2 = new JLabel("valor 2");
        label2.setBounds(50,35,100,30);
        add(label2);

        label3 = new JLabel("resultado:");
        label3.setBounds(120,80,100,30);
        add(label3);

        archivo1 = new JTextField();
        archivo1.setBounds(120,10,150,20);
        add(archivo1);

        archivo2 = new JTextField();
        archivo2.setBounds(120,40,150,20);
        add(archivo2);

        boton1 = new JButton("sumar");
        boton1.setBounds(10,80,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            int valor1 = 0, valor2 = 0, resultado = 0;
            
            //recuperamos el texto y parseamos los valores para convertir a entero
            valor1 = Integer.parseInt(archivo1.getText() );
            valor2 = Integer.parseInt(archivo2.getText() );

            resultado = valor1 + valor2;

            label3.setText("Resultado: " + resultado);
        }

        }
    
    public static void main(String[]args){

        parseo formulario = new parseo();
        formulario.setBounds(0,0,300,150);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
     }


}
