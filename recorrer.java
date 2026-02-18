import javax.swing.*;

public class recorrer extends JFrame {

    private JTextArea area1;
    private JTextField archivo1;
    private JScrollPane scroll1;

    public recorrer(){
        setLayout(null);
        archivo1 = new JTextField("");
        archivo1.setBounds(10,10,200,30);
        add(archivo1);
        
        area1 = new JTextArea();
        scroll1 = new JScrollPane(area1);
        scroll1.setBounds(10,50,400,300);
        add(scroll1);
    }

    public static void main(String[]args){
     recorrer formulario1 = new recorrer();
     formulario1.setBounds(0,0,540,400);
     formulario1.setVisible(true);
     formulario1.setResizable(false);
     formulario1.setLocationRelativeTo(null);
    }

}
