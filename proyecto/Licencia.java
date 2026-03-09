package proyecto;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener {
    

    private JLabel label1, label2;
    private JCheckBox check1;
    private JButton boton1, boton2;
    private JScrollPane scroll1;
    private JTextArea area1;


    public Licencia(){
        setLayout(null);
        setTitle("Licencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        label1 = new JLabel("TERMINOS Y CONDICIONES");
        label1.setBounds(215,5,200,30);
        label1.setFont(new Font("Andale Mono", 1,14));
        label1.setForeground(new Color(0,0,0));
        add(label1);

        area1 = new JTextArea();
        area1.setEditable(false);
        area1.setFont(new Font("Andale Mono", 0,9));
        area1.setText("\n\n          TÉRMINOS Y CONDICIONES"+
                      "\n\n          aca van los terminos y condiciones de la empresa"
        );
        scroll1 = new JScrollPane(area1);
        scroll1.setBounds(10,40,575,200);
        add(scroll1);

        check1 = new JCheckBox("Yo Acepto");
        check1.setBounds(10,250,200,30);
        check1.addChangeListener(this);
        add(check1);

        boton1 = new JButton("Continuar");
        boton1.setBounds(10,290,100,30);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        add(boton1);
        

        boton2 = new JButton("No Acepto");
        boton2.setBounds(120,290,100,30);
        boton2.addActionListener(this);
        boton2.setEnabled(true);
        add(boton2);

        ImageIcon imagen = new ImageIcon("proyecto/images/coca-cola.png");
        label2 = new JLabel(imagen);
        label2.setBounds(315,135,300,300);
        add(label2);
    }

    public void stateChanged(ChangeEvent e) {}
        
    

    public void actionPerformed(ActionEvent e){}
        
    

    public static void main(String[]args){

        Licencia ventanalicencia = new Licencia();
        ventanalicencia.setBounds(0,0,600,360);
        ventanalicencia.setVisible(true);
        ventanalicencia.setResizable(false);
        ventanalicencia.setLocationRelativeTo(null);

    }

    
}
