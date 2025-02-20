
package view;

import view.*;
import viewModel.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login extends JFrame{
    
    
    
    
    
    public Login(Usuario user){
        
        setTitle("Login");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        
        JLabel subtitulo = new JLabel("Ingresa tu nombre:");
        subtitulo.setBounds(50, 20, 150, 30); // Posición y tamaño
        add(subtitulo);
        
        JLabel pista = new JLabel("(Usuario:Jorge contraseña: contrasena)");
        pista.setBounds(0, 50, this.getWidth(), 30); // Posición y tamaño
        add(pista);
        
        JTextField usuario = new JTextField();
        usuario.setBounds(50, 90, 100,30);
        add(usuario);
        
        JPasswordField contrasena = new JPasswordField();
        contrasena.setBounds(50, 130, 100,30);
        add(contrasena);
        
        JButton ingresar = new JButton("Ingresar");
        ingresar.setBounds(50, 170, 100, 30);
        add(ingresar);
        
        
        
        ingresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean check=true;
                if ((usuario.getText().equals(user.getNombre())) && (contrasena.getText().equals(user.getContrasena()))) {
                    Menu menu = new Menu();
                    check=false;
                    dispose();
                }
                
                
                
                
            }
        });


        
        setVisible(true);
    }
}
