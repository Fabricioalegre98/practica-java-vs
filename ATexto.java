import javax.swing.*;
import java.awt.event.*;



public class ATexto extends JFrame implements ActionListener {
    private JTextField jtextfield1;
    private JLabel label1;
    private JButton boton1;

    public ATexto(){
       
        //diseño de la etiqueta
        setLayout(null);
        label1 = new JLabel("Usuario:");
        label1.setBounds(10,10,100,30);
        add(label1);
        //diseño de la caja de texto
        jtextfield1 = new JTextField();
        jtextfield1.setBounds(120,17,150,20);
        add(jtextfield1);

        //diseño del boton
        boton1 = new JButton("aceptar");
        boton1.setBounds(10,80,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }

    //programamos evento del boton, capturamos el evento

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton1){
            String texto = jtextfield1.getText();
            setTitle(texto);//con este metodo colocamos el texto en la parte superior de la interfaz

        }
    }

    public static void main(String[]args){
        ATexto formulario1 = new ATexto();
        formulario1.setBounds(0,0,300,150);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }

    
    
}
