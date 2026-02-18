import javax.swing.*;

public class textoArea extends JFrame {

    //indicamos los componentes que vamos a utilizar
    private JTextField textfield1;
    private JTextArea textarea1;

    public textoArea(){
        setLayout(null);
        textfield1 = new JTextField("");
        textfield1.setBounds(10,10,200,30);
        add(textfield1);

        textarea1 = new JTextArea("");
        textarea1.setBounds(10,50,400,300);
        add(textarea1);
    }

    public static void main(String[]args){
        textoArea formulario1 = new textoArea();
        formulario1.setBounds(0,0,540,400);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
        
    }
    
}
