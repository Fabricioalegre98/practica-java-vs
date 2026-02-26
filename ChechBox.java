import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;



public class ChechBox extends JFrame implements ChangeListener {

    private JCheckBox checkbox1, checkbox2, checkbox3;
    

    public ChechBox(){
        setLayout(null);
        checkbox1 = new JCheckBox("ingles");
        checkbox1.setBounds(10,10,150,30);
        checkbox1.addChangeListener(this);
        add(checkbox1);

        checkbox2 = new JCheckBox("frances");
        checkbox2.setBounds(10,50,150,30);
        checkbox2.addChangeListener(this);
        add(checkbox2);

        checkbox3 = new JCheckBox("italiano");
        checkbox3.setBounds(10,90,150,30);
        checkbox3.addChangeListener(this);
        add(checkbox3);
    } 

    //
    public void stateChanged(ChangeEvent e){
       String cad = "";
       if(checkbox1.isSelected() == true){
            cad = cad + "ingles-";
       }
       if(checkbox2.isSelected() == true){
            cad = cad + "frances-";
       }
       if(checkbox3.isSelected() == true){
            cad = cad + "italiano-";
       } 
       setTitle(cad);
    }

    public static void main(String[]args){
        ChechBox formulario1 = new ChechBox();
        formulario1.setBounds(0,0,400,200);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }
    
}
