
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.AdjustmentEvent;
import java.awt.image.BufferedImage;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

public class Panel_Imagen_Dinamico extends JScrollPane{
    private JScrollBar HBar, VBar;
    private EstadisticasImagen stats;
    private BufferedImage I;

    public void setI(BufferedImage I) {
        this.I = I;
    }
    
    
    public Panel_Imagen_Dinamico() {
        this.HBar = getHorizontalScrollBar();
        this.VBar = getVerticalScrollBar();
        HBar.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                miHScrollAdjust(e);
            }
        });
        VBar.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                miVScrollAdjust(e);
            }
        });
    }
    
    
    public void miHScrollAdjust(AdjustmentEvent e){
        //setStats();
    }
    private void miVScrollAdjust(AdjustmentEvent e){
        //setStats();
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
    
    public int[] parametros(){
        JViewport vista = getViewport();
        int[] parametros= new int[4];
        
        Point p = vista.getViewPosition();
        parametros[0]= p.x;
        parametros[1]= p.y;
        
        Dimension d = vista.getExtentSize();
        parametros[2]= d.height;
        parametros[3]= d.width;
        return parametros; 
    }
    
    protected void setStatistics(){
        int[] pos = this.parametros();
        this.stats = EstadisticasImagen.calculaEstadisticas(I,
                new Point(pos[0],pos[1]),new Point(pos[0]+pos[2],pos[1]+pos[3]));
    }

    public EstadisticasImagen getStats() {
        return stats;
    }
    
    
}
