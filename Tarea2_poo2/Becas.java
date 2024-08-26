import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Becas{

    public Becas(){
        JFrame frame = new JFrame("Solicitud de Becas");
        
        frame.setSize(900,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new GridLayout(2,2));
        //PANEL
        JPanel panel1 = new JPanel();
        frame.add(panel1);
        panel1.setBackground(Color.BLUE);
        panel1.setLayout(null);
       
        JLabel inicio = new JLabel("Inicio de sesion");
        inicio.setBounds(180, 20, 100, 10);
        panel1.add(inicio);

        JLabel  usuario = new JLabel("Usuario:");
        usuario.setBounds(100, 100, 100, 10);
        panel1.add(usuario);
        JLabel  contra = new JLabel("Contraseña:");
        contra.setBounds(100, 160, 100, 10);
        panel1.add(contra);
        
        JButton Boton = new JButton("Entrar");
        Boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        Boton.setBounds(180, 230, 80, 20);
        
        panel1.add(Boton);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.YELLOW);
        panel2.setLayout(new BorderLayout());
        

        panel2.add(new JLabel("Detalles del usuario"),BorderLayout.NORTH);
        
        //JLabel nombre = new JLabel("Nombre:");

        JButton boton2 = new JButton("Entrar");
        Boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        panel2.add(boton2,BorderLayout.SOUTH);
        JPanel panel2_1 = new JPanel();
        panel2_1.setLayout(new GridLayout(3,2));
        panel2_1.add(new JLabel("Nombre:"));
        panel2_1.add(new JTextArea());
        panel2_1.add(new JLabel("Edad:"));
        panel2_1.add(new JTextArea());
        panel2_1.add(new JLabel("Entidad federativa:"));
        panel2_1.add(new JTextArea());

        panel2.add(panel2_1);
        frame.add(panel2);


        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.GREEN);
        frame.add(panel3);
        panel3.add(new JLabel("Paredes de la vivienda",SwingConstants.CENTER),BorderLayout.NORTH);

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.ORANGE);
        frame.add(panel4);
        panel4.add(new JLabel("Servicios en la vivienda",SwingConstants.CENTER),BorderLayout.NORTH);

        

       
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Becas();
    }
}