
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JButton;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class VistaVotaciones extends Vista{

    /**
     * Creates new form VistaVotaciones
     */
    public VistaVotaciones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        BtnGraficaPastel = new javax.swing.JButton();
        BtnGraficaBarras = new javax.swing.JButton();
        candidato1 = new javax.swing.JButton();
        candidato2 = new javax.swing.JButton();
        candidato3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(221, 221, 255));

        titulo.setFont(new java.awt.Font("Arial Narrow", 3, 48)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Votaciones");

        BtnGraficaPastel.setBackground(new java.awt.Color(173, 173, 255));
        BtnGraficaPastel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        BtnGraficaPastel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Gráfica de pastel.png"))); // NOI18N
        BtnGraficaPastel.setBorder(null);
        BtnGraficaPastel.setBorderPainted(false);
        BtnGraficaPastel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnGraficaPastel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGraficaPastelActionPerformed(evt);
            }
        });

        BtnGraficaBarras.setBackground(new java.awt.Color(255, 178, 127));
        BtnGraficaBarras.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        BtnGraficaBarras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Gráfica de barras.png"))); // NOI18N
        BtnGraficaBarras.setBorder(null);
        BtnGraficaBarras.setBorderPainted(false);
        BtnGraficaBarras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnGraficaBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGraficaBarrasActionPerformed(evt);
            }
        });

        candidato1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png"))); // NOI18N
        candidato1.setBorder(null);
        candidato1.setBorderPainted(false);
        candidato1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        candidato1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                candidato1ActionPerformed(evt);
            }
        });

        candidato2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2.png"))); // NOI18N
        candidato2.setBorder(null);
        candidato2.setBorderPainted(false);
        candidato2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        candidato2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                candidato2ActionPerformed(evt);
            }
        });

        candidato3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3.png"))); // NOI18N
        candidato3.setBorder(null);
        candidato3.setBorderPainted(false);
        candidato3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        candidato3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                candidato3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(candidato1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(candidato2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(candidato3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnGraficaBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnGraficaPastel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titulo)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(candidato1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(candidato3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(candidato2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnGraficaBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnGraficaPastel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGraficaPastelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGraficaPastelActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame ("Gráfica de pastel - Votaciones"); 
        frame.setSize(700, 450); 
        frame.setLocationRelativeTo(getRootPane());
        this.setLocationRelativeTo(getRootPane());
        
        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("Candidato 1", count1);
        data.setValue("Candidato 2", count2);
        data.setValue("Candidato 3", count3);

        JFreeChart barras = ChartFactory.createPieChart("Gráfica de pastel - Votaciones",data,true, true,false);
        ChartPanel chartPanel = new ChartPanel(barras, false);
        frame.setContentPane(chartPanel);
        frame.setVisible(true);
    }//GEN-LAST:event_BtnGraficaPastelActionPerformed
    
    private int count1 = 0; 
    private void candidato1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_candidato1ActionPerformed
        // TODO add your handling code here:
        count1++; 
        String numero = String.valueOf(count1); 
        candidato1.setText(numero); 
    }//GEN-LAST:event_candidato1ActionPerformed

    private void BtnGraficaBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGraficaBarrasActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        
        JFrame frame = new JFrame ("Gráfica de barras - Votaciones"); 
        frame.setSize(700, 450); 
        frame.setLocationRelativeTo(getRootPane());
        this.setLocationRelativeTo(getRootPane());
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(count1, "Candidato 1", "Candidatos");
        dataset.addValue(count2, "Candidato 2", "Candidatos");
        dataset.addValue(count3, "Candidato 3", "Candidatos");

        JFreeChart chart = ChartFactory.createBarChart("Gráfica de barras - Votaciones","Candidatos", "Votos", dataset,PlotOrientation.VERTICAL, true, true,true);
        ChartPanel chartPanel = new ChartPanel(chart, false);
        frame.setContentPane(chartPanel);
        frame.setVisible(true); 
        //frame.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_BtnGraficaBarrasActionPerformed

        private int count2 = 0;
    private void candidato2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_candidato2ActionPerformed
        // TODO add your handling code here:
        count2++;  
        String numero = String.valueOf(count2);
        candidato2.setText(numero);
    }//GEN-LAST:event_candidato2ActionPerformed

    public JButton getBtnGraficaBarras() {
        return BtnGraficaBarras;
    }

    public JButton getBtnGraficaPastel() {
        return BtnGraficaPastel;
    }

    public JButton getCandidato1() {
        return candidato1;
    }

    public JButton getCandidato2() {
        return candidato2;
    }

    public JButton getCandidato3() {
        return candidato3;
    }

        private int count3 = 0;
    private void candidato3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_candidato3ActionPerformed
        // TODO add your handling code here:
        count3++;
        String numero = String.valueOf(count3); 
        candidato3.setText(numero);
    }//GEN-LAST:event_candidato3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaVotaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaVotaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaVotaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaVotaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaVotaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGraficaBarras;
    private javax.swing.JButton BtnGraficaPastel;
    private javax.swing.JButton candidato1;
    private javax.swing.JButton candidato2;
    private javax.swing.JButton candidato3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

   
}
