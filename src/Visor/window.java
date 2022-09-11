package Visor;

import javax.swing.*;
import java.awt.*;

public class window extends JPanel {
    private Image imagen;
    public window (Image img){
        imagen = img;
    }

    public void setImg(Image img) {
        this.imagen = img;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Dimension largo = new Dimension(imagen.getWidth(this),imagen.getHeight(this));
        setPreferredSize(largo);
        setMinimumSize(largo);
        setMaximumSize(largo);
        setSize(largo);
        update(g);
    }

    @Override
    public void update(Graphics g) {
        g.drawImage(imagen,0,0,this);
    }
}
