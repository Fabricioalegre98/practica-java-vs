package proyecto;


import javax.crypto.spec.DESKeySpec;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener {
    private JMenuBar mb;
    private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
    private JMenuItem miCalculo, miRojo, miNegro, miMorado, miElCreador, miSalir, miNuevo;
    private JLabel labelLogo, labelBienvenido, labeltitle, labelNombre, labelAPaterno, labelAMaterno, labelDepartamento, labelAntiguedad, labelResultado, labelFooter;
    private JTextField txtNombreTrabajador, txtAPaternoTrabajador, txtAmaternoTrabajador;
    private JComboBox comboDepartamento, comboAntiguedad;
    private JScrollPane scrollpane1;
    private JTextArea area1;
    
    public Principal (){
        setLayout(null);
        setTitle("Pantalla Principal");
        getContentPane().setBackground(new Color(255,0,0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        //creamos el menu principal
        mb = new JMenuBar();
        mb.setBackground(new Color(255,0,0));
        setJMenuBar(mb);

        //añadimos las opciones del menu a la barra de arriba
        menuOpciones = new JMenu("Opciones");
        menuOpciones.setBackground(new Color(255,0,0));
        menuOpciones.setFont(new Font("Andale Mono",1, 14));
        menuOpciones.setForeground(new Color(255,255,255));
        mb.add(menuOpciones);

        menuCalcular = new JMenu("Calcular");
        menuCalcular.setBackground(new Color(255,0,0));
        menuCalcular.setFont(new Font("Andale Mono", 1, 14));
        menuCalcular.setForeground(new Color(255,255,255));
        mb.add(menuCalcular);

        menuAcercaDe = new JMenu("Acerca de");
        menuAcercaDe.setBackground(new Color(255,0,0));
        menuAcercaDe.setFont(new Font("Andale Mono",1, 14));
        menuAcercaDe.setForeground(new Color(255,255,255));
        mb.add(menuAcercaDe);

        menuColorFondo = new JMenu("Color de fondo");
        menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
        menuColorFondo.setForeground(new Color(255,0,0));
        menuOpciones.add(menuColorFondo);
        
        miCalculo = new JMenuItem("Vacaciones");
        miCalculo.setFont(new Font("Andale Mono",1, 14));
        miCalculo.setForeground(new Color(255,0,0));
        menuCalcular.add(miCalculo);
        miCalculo.addActionListener(this);

        miRojo = new JMenuItem("Rojo");
        miRojo.setFont(new Font("Andale Mono",1, 14));
        miRojo.setForeground(new Color(255,0,0));
        menuColorFondo.add(miRojo);
        miRojo.addActionListener(this);

        miNegro = new JMenuItem("Negro");
        miNegro.setFont(new Font("Andale Mono",1,14));
        miNegro.setForeground(new Color(255,0,0));
        menuColorFondo.add(miNegro);
        miNegro.addActionListener(this);

        miMorado = new JMenuItem("Morado");
        miMorado.setFont(new Font("Andale Mono",1,14));
        miMorado.setForeground(new Color(255,0,0));
        menuColorFondo.add(miMorado);
        miMorado.addActionListener(this);

        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setFont(new Font("Andale Mono",1,14));
        miNuevo.setForeground(new Color(255,0,0));
        menuOpciones.add(miNuevo);
        miNuevo.addActionListener(this);

        miElCreador = new JMenuItem("El creador");
        miElCreador.setFont(new Font("Andale Mono",1,14));
        miElCreador.setForeground(new Color(255,0,0));
        menuAcercaDe.add(miElCreador);
        miElCreador.addActionListener(this);

        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font("Andale Mono",1,14));
        miSalir.setForeground(new Color(255,0,0));
        menuOpciones.add(miSalir);
        miSalir.addActionListener(this);

    }
}
