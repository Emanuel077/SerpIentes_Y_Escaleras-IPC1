/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicioJuego;
import tablero.Tablero;
import inicioJuego.AgregarJugador;



/**
 *
 * @author Usuario
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(Menu.this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1AgregarJugador = new javax.swing.JButton();
        jButton1Jugar = new javax.swing.JButton();
        jButton2Reportes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_Salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1AgregarJugador.setBackground(new java.awt.Color(255, 255, 255));
        jButton1AgregarJugador.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jButton1AgregarJugador.setForeground(new java.awt.Color(0, 0, 0));
        jButton1AgregarJugador.setText("Agregar Jugador");
        jButton1AgregarJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1AgregarJugadorActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1AgregarJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        jButton1Jugar.setBackground(new java.awt.Color(255, 255, 255));
        jButton1Jugar.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jButton1Jugar.setForeground(new java.awt.Color(0, 0, 0));
        jButton1Jugar.setText("Jugar ");
        jButton1Jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1JugarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Jugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 200, 40));

        jButton2Reportes.setBackground(new java.awt.Color(255, 255, 255));
        jButton2Reportes.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jButton2Reportes.setForeground(new java.awt.Color(0, 0, 0));
        jButton2Reportes.setText("Reportes");
        jButton2Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ReportesActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2Reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 200, 40));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("      BIENVENIDO AL MENU PRINCIPAL");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 40));

        btn_Salir.setBackground(new java.awt.Color(255, 255, 255));
        btn_Salir.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btn_Salir.setForeground(new java.awt.Color(0, 0, 0));
        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 200, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FONDO MADERA2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1AgregarJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1AgregarJugadorActionPerformed
         AgregarJugador agregar = new AgregarJugador ();
         agregar.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jButton1AgregarJugadorActionPerformed

    private void jButton2ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ReportesActionPerformed
        Reportes reporte = new Reportes();
        reporte.setVisible(true);
        this.dispose();    
    }//GEN-LAST:event_jButton2ReportesActionPerformed

    private void jButton1JugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1JugarActionPerformed

        Tablero jugar = new Tablero();
  
    }//GEN-LAST:event_jButton1JugarActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
    System.exit(WIDTH);
    }//GEN-LAST:event_btn_SalirActionPerformed

    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton jButton1AgregarJugador;
    private javax.swing.JButton jButton1Jugar;
    private javax.swing.JButton jButton2Reportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    private void btn_AgregarActionPerformed() {
        btn_AgregarActionPerformed ();
    }

   
}
