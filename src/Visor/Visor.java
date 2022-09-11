package Visor;

import ejercicios.JFrame;

import javax.swing.*;
import java.awt.*;

public class Visor extends JFrame {
    private JScrollPane panel;
    private window pantalla;

    public Visor(String file){


        Image img = Toolkit.getDefaultToolkit().getImage(file);
        pantalla = new window (img);
        panel = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        getContentPane().add(panel);
        panel.setViewportView(pantalla);
        setVisible(true);
        setSize(1600,900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }



    public static void main(String[] args) {

        Visor visor = new Visor("/home/armando/Imágenes/IMG_20210904_190640.jpg");
    }




}
