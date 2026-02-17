import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //importamos funcionalidades para los componentes
public class Boton extends JFrame implements ActionListener {
    JButton boton1;

    public Boton (){
        setLayout(null);//permite poner componentes a traves de coordenadas
        boton1 = new JButton("cerrar");
        boton1.setBounds(300,250,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }
    //con esto capturamos el evento
    public void actionPerformed(ActionEvent e){
        //recupera el evento que se guardo dentro del espacio en memoria, compara si es el boton correcto 
        if(e.getSource() == boton1){
            System.exit(0);
        }
    }

    public static void main(String[]args){
        Boton formulario1 = new Boton();
        formulario1.setBounds(0,0,600,500);
        formulario1.setVisible(true);
        formulario1.setResizable(false);//indicamos a la interfaz que el usuario no puede modificar el tamaño dle objeto
        formulario1.setLocationRelativeTo(formulario1);
    }
    

}
