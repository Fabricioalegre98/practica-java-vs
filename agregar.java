import javax.swing.*;
import java.awt.event.*;


public class agregar extends JFrame implements ActionListener {
    private JTextField archivo1;
    private JButton boton1;
    private JTextArea area1;
    private JScrollPane scroll1;

    String texto = new String("");

    public agregar(){
        setLayout(null);
        archivo1 = new JTextField();
        archivo1.setBounds(10,10,200,30);
        add(archivo1);

        boton1 = new JButton("agregar");
        boton1.setBounds(250,10,100,30);
        add(boton1);
        boton1.addActionListener(this);

        area1 = new JTextArea();
        scroll1 = new JScrollPane(area1);
        scroll1.setBounds(10,50,400,300);
        add(scroll1);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            //usamos la variable como un acumulador
            texto += archivo1.getText() + "\n";//recuperamos lo que esta dentro de archivo1 y lo ponemos dentro de la variable texto
            area1.setText(texto);//agregamos el texto que guardamos dentro de texto
            archivo1.setText("");
        }
    }

    public static void main(String[]args){
        agregar formulario1 = new agregar();
        formulario1.setBounds(0,0,540,400);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
        
    }
}
