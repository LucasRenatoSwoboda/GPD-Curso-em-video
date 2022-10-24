/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tela;

/**
 *
 * @author lucas
 */
public class TelaFatorial extends javax.swing.JFrame {

    /**
     * Creates new form TelaFatorial
     */
    public TelaFatorial() {
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

        numFat = new javax.swing.JSpinner();
        rFat = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fatSM = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 370));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numFat.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        numFat.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                numFatStateChanged(evt);
            }
        });
        getContentPane().add(numFat, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 121, 70, 47));

        rFat.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        rFat.setForeground(new java.awt.Color(255, 0, 0));
        rFat.setText("0");
        getContentPane().add(rFat, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 470, 47));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Python-fatorial-peq.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("<html>CALCULADORA DE <strong>FATORIAL</strong></html>");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        fatSM.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        fatSM.setText("=");
        getContentPane().add(fatSM, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 186, 510, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 20, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numFatStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_numFatStateChanged
        // TODO add your handling code here:
        int num = Integer.parseInt(numFat.getValue().toString());
        int fat = 1;
        String fatS = "";
        while (num > 0){
            fat *= num;
            if (num > 1)
                fatS += num + " x ";
            else 
                fatS += num + " = ";
            num --;
        }
        rFat.setText(Integer.toString(fat));
        fatSM.setText(fatS);
    }//GEN-LAST:event_numFatStateChanged

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
            java.util.logging.Logger.getLogger(TelaFatorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFatorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFatorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFatorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFatorial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fatSM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSpinner numFat;
    private javax.swing.JLabel rFat;
    // End of variables declaration//GEN-END:variables
}