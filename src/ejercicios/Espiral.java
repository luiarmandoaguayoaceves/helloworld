package ejercicios;

import javax.swing.*;
import java.awt.*;

public class Espiral {
    ventana ventana = new ventana();//se crea el objeto
    public static class ventana extends JFrame implements Runnable{
        int x, y , rad;
        final int height = 400;//alto de la interfaz
        final int width = 400;//ancho de la interfaz
        final int delay = 2;//tiempo

        int pto = 300;//que tan siguido dibija el punto
        private Thread hilo;//declaracion del hilo

        public ventana(){
            super();
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar
            this.setResizable(false);//Establece si el usuario puede cambiar el tamaño de este marco.
            this.setSize(width,height);//Cambia el tamaño de este componente para que tenga ancho d.width y alto d.height.
            this.setVisible(true);//Muetre la ventana
            hilo = new Thread(this);//Inicializar el hilo aqui
            hilo.start();//se inicia
        }

        public void paint (Graphics g){//metodo Grapgics
            update(g);//actualizar
        }
        public void update(Graphics g){
            rad += 1;//radio a dibujar
            x = (int)(rad*Math.cos((pto*Math.PI-1)*rad/pto)/pto*2);//ingremento en la cordenada x
            y = (int)(rad*Math.sin((pto*Math.PI-1)*rad/pto)/pto*2);//Incremento en la cordenada y

            //Dibuja el contorno del rectángulo especificado. Los bordes izquierdo y derecho del rectángulo están en xy x + width. Los bordes superior e inferior están en yy y + height. El rectángulo se dibuja utilizando el color actual del contexto gráfico.
            g.drawRect(x+width/2, y+height/2, 1, 1);
        }


        @Override
        public void run() {
            while (Math.abs(x)<width || Math.abs(y)<height){
                try {
                    Thread.sleep(delay);
                }catch (InterruptedException ex){

                }
                repaint();
            }
        }
    }
}
