package ejercicios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class monito extends JFrame implements ActionListener {

    public monito(){
        setSize(300,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void paint (Graphics g) {
        super.paint(g);
        g.setColor(Color.black);
        g.drawString("Monito", 210, 80);
        /**Sonrisa**/
        g.drawArc(120, 70, 30, 30, 180, 180);
        /**Cabeza**/
        g.drawArc(110, 60, 50, 50, 0, 360);
        /**OJOS**/
        g.fillOval(125, 75, 5, 5);
        g.fillOval(140, 75, 5, 5);
        /**torso**/
        g.drawLine(135, 110, 135, 200);
        /**Bazo IZQ y DER**/
        g.drawLine(135,120,105,160);
        g.drawLine(135,120,165,160);
        /**Pie IZQ y DER**/
        g.drawLine(135,200,105,240);
        g.drawLine(135,200,165,240);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
