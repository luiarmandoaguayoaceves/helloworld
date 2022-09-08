package ejercicios;

import java.awt.*;

public class JFrame extends javax.swing.JFrame {




    public static void ventana() {
        JFrame ventana = new JFrame();
        ventana.add(new Panel());
        ventana.setVisible(true);
        ventana.setBounds(100, 100, 600, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
