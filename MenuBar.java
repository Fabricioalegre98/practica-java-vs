import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 
public class MenuBar extends JFrame implements ActionListener{
    private JMenuBar menubar;
    private JMenu menu1, menu2, menu3;
    private JMenuItem item1, item2,item3, item4,item5, item6;

    public MenuBar(){
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
        Container fondo = this.getContentPane();
        if(e.getSource()==item1){

        }

    }
}



