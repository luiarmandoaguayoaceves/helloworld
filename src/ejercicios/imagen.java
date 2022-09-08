package ejercicios;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class imagen extends JFrame{
    public static void Windows(String image){
        JFrame frame = new JFrame();
        frame.add(new panel(image));
        frame.pack();
        frame.setBounds(400,400,400,400);
        frame.setVisible(true);
    }


}

class panel extends JPanel{
    private JPanel cpanel = new JPanel();
    private JScrollPane scroll = new JScrollPane(cpanel);

    private BufferedImage img;
    private int width, height;

    @Override
    public Dimension getPreferredSize() {
        if (img.getWidth() >= 800){
            this.width = img.getWidth()/2;
            this.height = img.getHeight()/2;
        }else{
            this.width = img.getWidth();
            this.height = img.getHeight();
        }
        return new Dimension(this.width, this.height);
    }

    public panel(String image){
        setBorder(BorderFactory.createLineBorder(Color.black));
        setCPanel(cpanel);
        scroll.add(cpanel);
        try{
            img = ImageIO.read(new File(image));
        }catch (IOException ex){

        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, this.width, this.height, this);
    }

    private void setCPanel(JPanel scroll){
        throw new UnsupportedOperationException("Error");
    }
}