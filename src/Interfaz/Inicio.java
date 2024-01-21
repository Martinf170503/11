package Interfaz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inicio {
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    private JButton iniciarSesiónButton;
    private JPasswordField InicioContrasena;
    private JTextField nombre;
    private JTextField apellido;
    private JTextField cedula;
    private JTextField usuario;
    private JButton registrarEstudianteButton;
    private JPasswordField contrasena;
    private JComboBox comboBox1;
    private JTextField InicioUsuario;

    public Inicio() {
        iniciarSesiónButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inicio=InicioUsuario.getText();
                String contrasena=InicioContrasena.getText();
                InicioUsuario.setText("");
                InicioContrasena.setText("");
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
