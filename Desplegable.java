import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 
public class Desplegable extends JFrame implements ActionListener{
    private JMenuBar menubar;
    private JMenu menu1, menu2, menu3;
    private JMenuItem item1, item2,item3;

    public Desplegable(){
        setLayout(null);
        menubar = new JMenuBar();
        setJMenuBar(menubar);

        menu1 = new JMenu("archivo");
        menubar.add(menu1);

        item1 = new JMenuItem("Rojo");
        item1.addActionListener(this);
        menu1.add(item1);

         menu2 = new JMenu("edicion");
        menubar.add(menu2);
        
        item2 = new JMenuItem("azul");
        item2.addActionListener(this);
        menu2.add(item2);

        menu3 = new JMenu("formato");
        menubar.add(menu3);

        item3 = new JMenuItem("verde");
        item3.addActionListener(this);
        menu3.add(item3);

    }


    public void actionPerformed(ActionEvent e){
        Container fondo = this.getContentPane();// con este metodo indicamos que debe tomar el valor total de la interfaz y añadirlo al contenedor fondo
        
        if(e.getSource() == item1){
            fondo.setBackground(new Color(255,0,0) );
        }
        if(e.getSource() == item2){
            fondo.setBackground(new Color(0,0,255));
        }
        if(e.getSource() == item3){
            fondo.setBackground(new Color(0,255,0) );
        }

    }



    public static void main(String[]args){
        Desplegable formulario1 = new Desplegable();
        formulario1.setBounds(0,0,400,300);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);


    }
}
