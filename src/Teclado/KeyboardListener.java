package Teclado;

import ejercicios.JFrame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener {
    public static void main(String[] args) {
        Marco marco = new Marco();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Marco extends JFrame{
    public Marco(){
        setVisible(true);
        setBounds(700,300,600,450);
        EventsKeyboard eventsKeyboard = new EventsKeyboard();
        addKeyListener(eventsKeyboard);
    }
}

class EventsKeyboard implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        char letra = e.getKeyChar();
        System.out.print(letra);
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}