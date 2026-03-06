import javax.swing.*;
import javax.swing.event.*;

public class Radio extends JFrame implements ChangeListener{

    private JRadioButton radio1, radio2, radio3;
    private ButtonGroup grupo1;
    
    public Radio(){
        setLayout(null);
        grupo1 = new ButtonGroup();
        radio1 = new JRadioButton("640x480");
        radio1.setBounds(10,20,100,30);
        radio1.addChangeListener(this);
        add(radio1);
        grupo1.add(radio1);

        radio2 = new JRadioButton("800x600");
        radio2.setBounds(10,70,100,30);
        radio2.addChangeListener(this);
        add(radio2);
        grupo1.add(radio2);

        radio3 = new JRadioButton("1024x768");
        radio3.setBounds(10,120,100,30);
        radio3.addChangeListener(this);
        add(radio3);
        grupo1.add(radio3);
    }

    public void stateChanged(ChangeEvent e){
        if(radio1.isSelected()){
            setSize(640,480);
        }
        if(radio2.isSelected()){
            setSize(800,600);
        }
        if(radio3.isSelected()){
            setSize(1024,768);
        }
    }

    public static void main(String[]args){
        Radio formulario1 = new Radio();
        formulario1.setBounds(0,0,350,200);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
    }
}
