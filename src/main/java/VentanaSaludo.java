import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaSaludo {
    public static void main(String[] args) {

        JFrame ventana = new JFrame("app de saludo icc490");
        ventana.setSize(400, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null);


        JTextField campotexto = new JTextField();
        campotexto.setBounds(50,30,200,25);

        JButton botonSaludar = new JButton("Saludar");
        botonSaludar.setBounds(270, 30, 100, 25);

        JLabel etiquetaSaludo = new JLabel("");
        etiquetaSaludo.setBounds(50, 80, 300, 25 );

        botonSaludar.addActionListener(e -> {
            String nombre = campotexto.getText();
            etiquetaSaludo.setText("Hola: " + nombre );
        });

        ventana.add(campotexto);
        ventana.add(botonSaludar);
        ventana.add(etiquetaSaludo);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);



    }
}

