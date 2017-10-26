import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class PanelImagen extends JPanel{

    private BufferedImage I = null;
    
    public BufferedImage getI() {
        return I;
    }
    
    public void setI(BufferedImage I){
        this.I = I;
        setPreferredSize(new Dimension(I.getWidth(),I.getHeight()));
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(I, 0, 0, null);
    }
    
}
