import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaSaludo {
    public static void main(String[] args) {

        JFrame ventana = new JFrame("app de saludo icc490");
        ventana.setSize(600, 500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);
        ventana.getContentPane().setBackground(Color.decode("#41a0b3"));


        JTextField campoTexto = new JTextField();
        campoTexto.setBounds(100, 60, 200, 25);


        JButton botonSaludar = new JButton("Saludar");
        botonSaludar.setBounds(300, 60, 100, 25);
        campoTexto.addKeyListener (new KeyAdapter() {
            public void keyPressed (KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER ) {
                    botonSaludar.doClick();
                }
            }
        });


        JLabel etiquetaSaludo = new JLabel("");
        etiquetaSaludo.setBounds(100, 200, 300, 25);

        botonSaludar.addActionListener(_ -> {
            String nombre = campoTexto.getText();
            if (nombre.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un nombre");
            } else {
                etiquetaSaludo.setText("Hola: "+ nombre);
            }

        });

        ventana.add(campoTexto);
        ventana.add(botonSaludar);
        ventana.add(etiquetaSaludo);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}







