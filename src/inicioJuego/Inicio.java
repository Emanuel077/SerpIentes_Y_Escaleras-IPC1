
package inicioJuego;
import java.awt.Image;
import java.awt.Toolkit;
/**
 *
 * @author Usuario
 */
public class Inicio extends javax.swing.JFrame {

    
    public Inicio(){
        initComponents();
        this.setLocationRelativeTo(Inicio.this);
        
    }
    
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Icono.png"));
        return retValue;
    }
    

    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1IrMenu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1IrMenu.setBackground(new java.awt.Color(255, 255, 255));
        jButton1IrMenu.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jButton1IrMenu.setForeground(new java.awt.Color(0, 0, 0));
        jButton1IrMenu.setText("Ir a Menu");
        jButton1IrMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1IrMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1IrMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, 180, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tablero.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 120, 910, 340));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FONDO MADERA2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 880, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Programacion del boton
    private void jButton1IrMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1IrMenuActionPerformed
        Menu menu = new Menu ();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1IrMenuActionPerformed

    
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1IrMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
