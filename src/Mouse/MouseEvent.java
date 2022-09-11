package Mouse;

import ejercicios.JFrame;

import javax.swing.*;
import java.awt.event.MouseListener;

public class MouseEvent {
    public static void main(String[] args) {
        Marco marco = new Marco();//crear objeto marco
        marco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//finalizar al cerrar
    }
}

class Marco extends JFrame{//clase marco
    public Marco(){//metodo marco con sus atributos
        setVisible(true);//mostrar ventana
        setBounds(700,300,600,450);//tamano y horientacion
        EventsMouse eventmouse = new EventsMouse();//objeto del la clase eventomouse
        addMouseListener(eventmouse);//agregar eventmouse a el escuchador
    }
}
//clase con  Metodos sobreescrito del mouse
class EventsMouse implements MouseListener{

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        System.out.println("Click (precionar):" + e.getClickCount()+ "de veces");
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        System.out.println("Click (precionar y soltar):" + e.getClickCount()+ "de veces");

    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        System.out.println("Click (soltar):" + e.getClickCount()+ "de veces");

    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        System.out.println("Entraste al panel");

    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        System.out.println("Saliste del panel");


    }
}
