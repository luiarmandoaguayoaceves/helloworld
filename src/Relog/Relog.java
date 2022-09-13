package Relog;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class Relog extends JFrame {
    JPanel panel;

    public Relog() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        //Panel Uno Fondo 1
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(370, 610));
        panel.setBackground(Color.white);
        panel.setLayout(null);
        add(panel);
    }

    public static void main(String[] args) {
        Relog ventana = new Relog();
        ventana.setSize(370, 610);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setResizable(false);

        Font f = new Font("Agency FB", Font.BOLD, 19);
        Graphics lapiz = ventana.panel.getGraphics();
        Graphics2D lapiz2d;
        lapiz2d = (Graphics2D) lapiz;
        lapiz2d.setFont(f);
        lapiz2d.setColor(Color.white);
        lapiz2d.drawString("Dia", 128, 205);

        GradientPaint degradado1 = new GradientPaint(0, 0, Color.black, 0, 170, Color.decode("#ffe642"), true);
        GradientPaint degradado3 = new GradientPaint(0, 0, Color.gray, 0, 50, Color.white, true);
        GradientPaint degradado4 = new GradientPaint(0, 0, Color.decode("#332000"), 170, 170, Color.decode("#8000"), true);

        lapiz2d.setPaint(degradado4);
        lapiz2d.fillRect(30, 40, 190, 500);
        lapiz2d.fillRoundRect(105, 18, 160, 535, 80, 80);
        lapiz2d.setColor(Color.WHITE);
        lapiz2d.fillRect(110, 38, 150, 495);

        lapiz2d.fillOval(28, 50, 100, 100);
        lapiz2d.fillOval(28, 520, 100, 100);
        lapiz2d.fillOval(243, -50, 100, 100);
        lapiz2d.fillOval(243, 520, 100, 100);

        lapiz2d.setPaint(degradado1);
        lapiz2d.setStroke(new BasicStroke(4));
        lapiz2d.drawOval(15, 60, 340, 340);
        lapiz2d.drawOval(16, 61, 340, 340);
        lapiz2d.drawOval(17, 62, 340, 340);

        //RECTANGULO AMARTLLO DEL PENDULO
        lapiz2d.fillRect(178, 360, 10, 60);
        lapiz2d.fillRect(178, 400, 10, 20);
//SEGUNDO CIRCULO AMARILLO
        lapiz2d.fillOval(45, 88, 280, 280);
//TERCER CIRCULO PLATA
        lapiz2d.setPaint(degradado3);
        lapiz2d.fillOval(54, 96, 263, 263);
//CUARTO CIRCULO AMARILLO
        lapiz2d.setPaint(degradado1);
        lapiz2d.fillOval(58, 100, 255, 255);
//PRIMER CIR L MAR 0O PENDULO
        lapiz2d.fillOval(145, 410, 75, 75);
        lapiz2d.setColor(Color.white);
        lapiz2d.fillOval(150, 415, 65, 65);
//SEGUNDO CTRCULO AMARILLO PENDULC
        lapiz2d.setPaint(degradado1);
        lapiz2d.fillOval(152, 410, 0, 60);
        lapiz2d.setColor(Color.white);
        lapiz2d.fillOval(157, 415, 50, 50);
//TERCER CIRCULO AMAR: .0 PENDULO
        lapiz2d.setPaint(degradado1);
        lapiz2d.fillOval(157, 410, 50, 50);


        double grados, radianes, a = 0, o = 0, b = 0;
        for (int i = 1; i > 0; i++) {
            Calendar calendario = Calendar.getInstance();
            int hora = calendario.get(Calendar.HOUR_OF_DAY);
            int minutos = calendario.get(Calendar.MINUTE);
            int segundos = calendario.get(Calendar.SECOND);


            lapiz2d.setColor(Color.cyan);
            Font f1 = new Font("Agency FBL", Font.BOLD, 30);
            lapiz2d.setFont(f1);
//PENULTIMO CIRCULO PLATA DEL RELOJ
            lapiz2d.setPaint(degradado3);
            lapiz2d.fillOval(70, 111, 230, 230);//circulo de 6
//CIRCULO AMARILLO DE EN MEDIO
            lapiz2d.setPaint(degradado1);
            lapiz2d.fillOval(125, 168, 120, 120);
            lapiz2d.setColor(Color.black);
            lapiz2d.drawString("XII", 165, 150);
            lapiz2d.drawString("I", 224, 165);
            lapiz2d.drawString("II", 249, 194);
            lapiz2d.drawString("III", 259, 238);
            lapiz2d.drawString("IV", 245, 278);
            lapiz2d.drawString("V", 215, 313);
            lapiz2d.drawString("VI", 168, 325);
            lapiz2d.drawString("VII", 118, 313);
            lapiz2d.drawString("VIII", 83, 278);
            lapiz2d.drawString("IX", 85, 240);
            lapiz2d.drawString("X", 98, 194);
            lapiz2d.drawString("XI", 120, 165);
//CREACION DE LOS PUNTITOS DEL SEGUNDERO
            for (int j = 1; j <= 360; j++) {
                grados = o;
                radianes = Math.toRadians(grados);
                a = Math.sin(radianes) * 108;
                b = Math.cos(radianes) * 108;
                lapiz2d.setColor(Color.BLACK);
                lapiz2d.drawString(".", 182 + (int) a, 228 - (int) b);
                Font f2 = new Font("Agency FB", Font.BOLD, 15);
                lapiz2d.setFont(f2);
                if (grados % 10 == 0) {
                    double al = Math.sin(radianes) * 65;
                    double bl = Math.cos(radianes) * 65;
                    lapiz2d.drawString(".", 182 + (int) al, 228 - (int) bl);

                }
                o = o + 6;

            }

            lapiz2d.setStroke(new BasicStroke(2));
            grados = hora * 30;
            radianes = Math.toRadians(grados);
            a = Math.sin(radianes) * 60;
            b = Math.cos(radianes) * 60;
            lapiz2d.setColor(Color.white);
            lapiz2d.drawLine(182, 228, 182 + (int) a, 228 - (int) b);
            grados = minutos * 6;
            radianes = Math.toRadians(grados);
            a = Math.sin(radianes) * 85;
            b = Math.cos(radianes) * 85;
            lapiz2d.setPaint(degradado4);
            lapiz2d.drawLine(182, 228, 182 + (int) a, 228 - (int) b);

//MANECILIA DE LOS SEGUNDOS
            grados = segundos * 6;
            radianes = Math.toRadians(grados);
            a = Math.sin(radianes) * 100;
            b = Math.cos(radianes) * 100;
            lapiz2d.setColor(Color.black);
            lapiz2d.drawLine(182, 228, 182 + (int) a, 228 - (int) b);
            System.out.println("bandera 4");
            clic();

//ESQUINAS DE LA CARCASA DE MADERA
            lapiz2d.setPaint(degradado4);
            lapiz2d.fillArc(85, 13, 50, 50, 0, -90);
            lapiz2d.fillArc(235, 13, 50, 50, -90, -90);
            lapiz2d.fillArc(85, 508, 50, 50, 90, -90);
            lapiz2d.fillArc(235, 508, 50, 50, 90, 90);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
//ALARMA A TAS 12 Y A LAS 6
            if (hora == 1 && minutos == 0 && segundos == 0) {
                reproducir();
            } else if (hora == 6 && minutos == 0 && segundos == 0) {
                reproducir1();
            } else if (hora == 18 && minutos == 0 && segundos == 0) {
                reproducir1();
            }
        }
    }

    public static void reproducir() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(""));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido.");
                        System.out.println("Bandera 1");

        }
    }

    public static void reproducir1() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(""));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido.");
            System.out.println("Bandera 2");
        }
    }

    public static void clic() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/home/armando/IdeaProjects/helloworld/src/Relog/reloj-tic-tac-.au"));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido.");
                        System.out.println("Bandera 3");

        }
    }


}