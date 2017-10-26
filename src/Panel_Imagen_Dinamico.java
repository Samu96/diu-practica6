
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.AdjustmentEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

public class Panel_Imagen_Dinamico extends JScrollPane{
    private JScrollBar HBar, VBar;

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
    
    
    private void miHScrollAdjust(AdjustmentEvent e){
        
    }
    private void miVScrollAdjust(AdjustmentEvent e){
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
}
