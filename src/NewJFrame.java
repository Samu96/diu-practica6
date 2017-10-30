
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.AdjustmentEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JViewport;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        openButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rojoMaxText = new javax.swing.JTextField();
        rojoMinText = new javax.swing.JTextField();
        verdeMinText = new javax.swing.JTextField();
        azulMinText = new javax.swing.JTextField();
        verdeMaxText = new javax.swing.JTextField();
        azulMaxText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rojoMeanText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        verdeMeanText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        azulMeanText = new javax.swing.JTextField();
        panelDinamico = new Panel_Imagen_Dinamico();
        panelImagen1 = new PanelImagen();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        openButton.setText("Abrir ...");
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(openButton)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(openButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Rojo Maximo:");

        jLabel2.setText("Verde Maximo:");

        jLabel3.setText("Azul Maximo:");

        jLabel4.setText("Rojo Mínimo:");

        jLabel5.setText("Verde Mínimo:");

        jLabel6.setText("Azul Mínimo:");

        rojoMaxText.setEditable(false);
        rojoMaxText.setPreferredSize(new java.awt.Dimension(60, 22));

        rojoMinText.setEditable(false);
        rojoMinText.setPreferredSize(new java.awt.Dimension(60, 22));

        verdeMinText.setEditable(false);
        verdeMinText.setPreferredSize(new java.awt.Dimension(60, 22));

        azulMinText.setEditable(false);
        azulMinText.setPreferredSize(new java.awt.Dimension(60, 22));

        verdeMaxText.setEditable(false);
        verdeMaxText.setPreferredSize(new java.awt.Dimension(60, 22));

        azulMaxText.setEditable(false);
        azulMaxText.setPreferredSize(new java.awt.Dimension(60, 22));

        jLabel7.setText("Rojo Promedio:");

        rojoMeanText.setEditable(false);
        rojoMeanText.setPreferredSize(new java.awt.Dimension(60, 22));

        jLabel8.setText("Verde Promedio:");

        verdeMeanText.setEditable(false);
        verdeMeanText.setPreferredSize(new java.awt.Dimension(60, 22));

        jLabel9.setText("Azul Promedio:");

        azulMeanText.setEditable(false);
        azulMeanText.setPreferredSize(new java.awt.Dimension(60, 22));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rojoMeanText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rojoMinText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rojoMaxText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(verdeMeanText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(verdeMinText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(verdeMaxText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(azulMeanText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(azulMinText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(azulMaxText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(rojoMaxText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verdeMaxText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(azulMaxText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(rojoMinText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verdeMinText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(azulMinText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(rojoMeanText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verdeMeanText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(azulMeanText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelDinamico.setPreferredSize(new java.awt.Dimension(0, 0));

        panelImagen1.setPreferredSize(new java.awt.Dimension(2000, 2000));

        javax.swing.GroupLayout panelImagen1Layout = new javax.swing.GroupLayout(panelImagen1);
        panelImagen1.setLayout(panelImagen1Layout);
        panelImagen1Layout.setHorizontalGroup(
            panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2000, Short.MAX_VALUE)
        );
        panelImagen1Layout.setVerticalGroup(
            panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2000, Short.MAX_VALUE)
        );

        panelDinamico.setViewportView(panelImagen1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDinamico, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelDinamico, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed

        JFileChooser fc = new JFileChooser(".");
        FileFilter f = new FileNameExtensionFilter("JPG: .jpg,.jpeg,.jpe", "jpg", "jpeg", "jpe", "JPG", "JPEG", "JPE");
        fc.addChoosableFileFilter(f);
        f = new FileNameExtensionFilter("PNG: .png", "png", "PNG");
        fc.addChoosableFileFilter(f);
        f = new FileNameExtensionFilter("BMP: .bmp", "bmp", "BMP");
        fc.addChoosableFileFilter(f);
        fc.setAcceptAllFileFilterUsed(false);

        int res = fc.showOpenDialog(null);
        repaint();
        if (res == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage I = ImageIO.read(fc.getSelectedFile());
                panelImagen1.setI(I);
                panelDinamico.setI(I);
                setStats();
            } catch (IOException e) {
            }
            panelImagen1.paintComponent(panelImagen1.getGraphics());
        }

    }//GEN-LAST:event_openButtonActionPerformed

    protected void setStats() {

        panelDinamico.setStatistics();
        EstadisticasImagen stats = panelDinamico.getStats();

        rojoMaxText.setText(String.valueOf(stats.maximo[0]));
        rojoMinText.setText(String.valueOf(stats.minimo[0]));
        rojoMeanText.setText(String.valueOf(stats.promedio[0]));

        verdeMaxText.setText(String.valueOf(stats.maximo[1]));
        verdeMinText.setText(String.valueOf(stats.minimo[1]));
        verdeMeanText.setText(String.valueOf(stats.promedio[1]));

        azulMaxText.setText(String.valueOf(stats.maximo[2]));
        azulMinText.setText(String.valueOf(stats.minimo[2]));
        azulMeanText.setText(String.valueOf(stats.promedio[2]));

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    public PanelImagen getPanelImagen1() {
        return panelImagen1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField azulMaxText;
    private javax.swing.JTextField azulMeanText;
    private javax.swing.JTextField azulMinText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton openButton;
    private Panel_Imagen_Dinamico panelDinamico;
    private PanelImagen panelImagen1;
    private javax.swing.JTextField rojoMaxText;
    private javax.swing.JTextField rojoMeanText;
    private javax.swing.JTextField rojoMinText;
    private javax.swing.JTextField verdeMaxText;
    private javax.swing.JTextField verdeMeanText;
    private javax.swing.JTextField verdeMinText;
    // End of variables declaration//GEN-END:variables

    public class Panel_Imagen_Dinamico extends JScrollPane {

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

        public void miHScrollAdjust(AdjustmentEvent e) {
            try {
                setStats();
            } catch (Exception ex) {
            }
        }

        private void miVScrollAdjust(AdjustmentEvent e) {
            try {
                setStats();
            } catch (Exception ex) {
            }
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
        }

        public int[] parametros() {
            JViewport vista = getViewport();
            int[] parametros = new int[4];

            Point p = vista.getViewPosition();
            parametros[0] = p.x;
            parametros[1] = p.y;

            Dimension d = vista.getExtentSize();
            parametros[2] = d.height;
            parametros[3] = d.width;
            return parametros;
        }

        protected void setStatistics() {

            int[] pos = this.parametros();
            this.stats = EstadisticasImagen.calculaEstadisticas(I,
                    new Point(pos[0], pos[1]), new Point(pos[0] + pos[2], pos[1] + pos[3]));

        }

        public EstadisticasImagen getStats() {
            return stats;
        }

    }

}
