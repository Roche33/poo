import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Becas{

    public Becas(){
        JFrame frame = new JFrame("Solicitud de Becas");
        
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new GridLayout(2,2));

        //PANEL
        JPanel login = new JPanel(new GridLayout(4,2,0,5));
        login.setBackground(Color.BLUE);

        login.add(new JLabel("Inicio de sesion"));
        login.add(new JLabel());
        
        JLabel  usuario = new JLabel("Usuario:");
        JTextField tusuario = new JTextField();
        
        JLabel  contra = new JLabel("Contraseña:");
        JPasswordField pass = new JPasswordField();
        JButton Boton = new JButton("Entrar");
        login.add(usuario);
        login.add(tusuario);
        login.add(contra);
        login.add(pass);
        login.add(new JLabel());
        login.add(Boton);
        
        
        /*Boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });*/
        
        
        

        //panel2
        JPanel datos = new JPanel();
        datos.setBackground(Color.YELLOW);
        datos.setLayout(new GridLayout(5,2,0,5));
        

        datos.add(new JLabel("Datos del usuario"));
        datos.add(new JLabel());
        JButton boton2 = new JButton("Siguiente");
        Boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        String[] entidades = {"Eliige una opcion","Aguascalientes", "Baja California", "Baja California Sur"};
        JComboBox<String> caja = new JComboBox<>(entidades);
        
        datos.add(new JLabel("Nombre:"));
        datos.add(new JTextArea());
        datos.add(new JLabel("Edad:"));
        datos.add(new JTextArea());
        datos.add(new JLabel("Entidad federativa:"));
        datos.add(caja);
        datos.add(new JLabel());
        datos.add(boton2,BorderLayout.SOUTH);
        

        //PANEL 3
        JPanel paredes = new JPanel();
        paredes.setLayout(new GridLayout(6,1));
        paredes.setBackground(Color.GREEN);
        ButtonGroup botones = new ButtonGroup();
        JRadioButton bloque = new JRadioButton("Bloque",false);
        JRadioButton madera = new JRadioButton("Madera",false);
        JRadioButton barro = new JRadioButton("Barro",false);
        JRadioButton aire = new JRadioButton("Aire",false);

        paredes.add(new JLabel("Paredes de la vivienda"));
        paredes.add(bloque);
        botones.add(bloque);
        paredes.add(madera);
        botones.add(madera);
        paredes.add(barro);
        botones.add(barro);
        paredes.add(aire);
        botones.add(aire);
        JButton boton3 = new JButton("Siguiente");
        paredes.add(boton3);

        //PANEL 4

        JPanel servicios = new JPanel();
        servicios.setBackground(Color.ORANGE);
        servicios.setLayout(new GridLayout(6,1));
        
        JCheckBox luz = new JCheckBox("Luz", false);
        JCheckBox drenaje = new JCheckBox("Drenaje", false);
        JCheckBox internet = new JCheckBox("Internet", false);
        JCheckBox nodecir = new JCheckBox("Prefiero no decir", false);

        servicios.add(new JLabel("Servicios en la vivienda"));
        
        servicios.add(luz);
        servicios.add(drenaje);
        servicios.add(internet);
        servicios.add(nodecir);
        JButton boton4 = new JButton("Enviar");
        servicios.add(boton4);


        

        frame.add(login);
        frame.add(datos);
        frame.add(paredes);
        frame.add(servicios);
        
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Becas();
    }
}