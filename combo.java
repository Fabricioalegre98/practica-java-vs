import javax.swing.*;
import java.awt.event.*;



public class combo extends JFrame implements ItemListener {
    
    private JComboBox box1;
    
    public combo(){
        setLayout(null);
        box1 = new JComboBox();
        box1.setBounds(10,10,80,20);
        add(box1);

        box1.addItem("rojo");
        box1.addItem("azul");
        box1.addItem("verde");
        box1.addItem("violeta");
        box1.addItem("amarillo");
        box1.addItemListener(this);
     } 

     //se captura un evento y se guarda en memoria
     public void itemStateChanged(ItemEvent e){
        if(e.getSource() == box1){
            String seleccion = box1.getSelectedItem().toString();
            setTitle(seleccion);//con esto colocamos el texto en el titulo de la interfaz
        }
     } 

     public static void main(String[]args){
        combo combo1 = new combo();
        combo1.setBounds(0,0,400,300);
        combo1.setVisible(true);
        combo1.setResizable(false);
        combo1.setLocationRelativeTo(null);
     }
}
