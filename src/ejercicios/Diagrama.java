package ejercicios;

import javax.swing.*;
import java.awt.*;

public class Diagrama {
    /**VARIABLES*/
    double value;
    Color color;
    static double limite = 0.0D;
    static int grados = 0;
    static double total = 0.0D;
    public Diagrama(double value, Color color) {
        this.value = value;
        this.color = color;

    }

    /*METODO CONSTRUCTOR*/
    public static class Pieza extends JComponent{

        Diagrama[] cortes = {
                new Diagrama(10, Color.getHSBColor(34, 44, 20)),
                new Diagrama(10, Color.getHSBColor(50, 28, 93)),
                new Diagrama(10, Color.getHSBColor(35, 11, 85)),
                new Diagrama(10, Color.getHSBColor(29, 47, 65)),
                new Diagrama(10, Color.getHSBColor(13, 84, 73))
        };

        public Pieza() {
        }

        public void paint(Graphics g) {
            rebanada((Graphics2D) g, getBounds(), cortes);
        }

        void rebanada(Graphics2D g, Rectangle area, Diagrama[] cortes) {


            for (int i = 0; i < cortes.length; i++) {
                total += cortes[i].value;
//               *************************** TEXTO***************
//                g.setColor(Color.black);
//                g.drawString(" HOLA", 60, 80);
            }
            for (int i = 0; i < cortes.length; i++) {
                grados = (int) (limite * 360 / total);
                int arcAngle = (int) (cortes[i].value * 360 / total);
                g.setColor(cortes[i].color);
                g.fillArc(area.x, area.y, area.width, area.height,
                        grados, arcAngle);
                limite += cortes[i].value;
            }
        }
    }
}
