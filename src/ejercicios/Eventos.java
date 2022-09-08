package ejercicios;

import java.awt.event.MouseListener;

import static java.awt.event.MouseEvent.*;


     class  ventanaRaton  extends JFrame{
        // TODO code application logic here
        Eventos evento = new Eventos();

         addMouseListener(evento) {

         }

     }
public class Eventos implements MouseListener {
    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        System.out.println("Hizo click numero  de clicks: " + 	MOUSE_CLICKED + ")");

    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        System.out.println("Click precionado numero de clicks: " + MOUSE_PRESSED + ")");
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        System.out.println("Libero el click numero de clicks: " + MOUSE_RELEASED + ")");
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        System.out.println("Mouse entrante");
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        System.out.println("Mouse saliente");
    }
}
