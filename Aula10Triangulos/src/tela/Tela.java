/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tela;

/**
 *
 * @author lucas
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
        rIsTriang.setVisible(false);
        rTipoTriang.setVisible(false);
    }

    //Verifica se é triângulo e retorna o tipo
    //Teste se é triangulo conforme condição abaixo:
    /*
    * Só irá existir um triângulo se, somente se, 
    * os seus lados obedeceram à seguinte regra: 
    * um de seus lados deve ser maior que o valor 
    * absoluto (módulo) da diferença dos outros 
    * dois lados e menor que a soma dos outros dois lados.
     */
    //Se todos os segmentos tem o mesmo tamanho, informa que é um triângulo Equilátero;
    //Se dois segmentos tem o mesmo tamanho, informa que é um triângulo Isósceles;
    //Se todos os segmentos tem tamanhos diferentes, informa que é um triângulo Escaleno. 

    public void isTriangulo(int a, int b, int c) {
        if (((a > Math.abs(b - c)) & a < (b + c)) & ((b > Math.abs(a - c)) & b < (a + c)) & ((c > Math.abs(a - b)) & c < (a + b))) {
            if ((a == b) & (b == c)) {
                rIsTriang.setText("<html>É um Triângulo!</html>");
                rIsTriang.setVisible(true);
                rTipoTriang.setText("<html>Tipo = <strong>Equilátero</strong></html>");
                rTipoTriang.setVisible(true);
            } else if ((a == b) | (a == c) | (b == c)) {
                rIsTriang.setText("<html>É um Triângulo!</html>");
                rIsTriang.setVisible(true);
                rTipoTriang.setText("<html>Tipo = <strong>Isósceles</strong></html>");
                rTipoTriang.setVisible(true);
            } else {
                rIsTriang.setText("<html>É um Triângulo!</html>");
                rIsTriang.setVisible(true);
                rTipoTriang.setText("<html>Tipo = <strong>Escaleno</strong></html>");
                rTipoTriang.setVisible(true);
            }
        } else {
            rIsTriang.setText("<html>Não é um triângulo!</html>");
            rIsTriang.setVisible(true);
            rTipoTriang.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        slA = new javax.swing.JSlider();
        slC = new javax.swing.JSlider();
        slB = new javax.swing.JSlider();
        valueSA = new javax.swing.JLabel();
        valueSB = new javax.swing.JLabel();
        valueSC = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        verificar = new javax.swing.JButton();
        rIsTriang = new javax.swing.JLabel();
        rTipoTriang = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("<html>Segmento<strong> a</strong></html>");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("<html>Segmento<strong> b</strong></html>");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("<html>Segmento <strong>c</strong></html>");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Identificando Triângulos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        slA.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        slA.setMaximum(50);
        slA.setValue(0);
        slA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        slA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slAStateChanged(evt);
            }
        });
        getContentPane().add(slA, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        slC.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        slC.setMaximum(50);
        slC.setValue(0);
        slC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        slC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slCStateChanged(evt);
            }
        });
        getContentPane().add(slC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        slB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        slB.setMaximum(50);
        slB.setValue(0);
        slB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        slB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slBStateChanged(evt);
            }
        });
        getContentPane().add(slB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        valueSA.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        valueSA.setForeground(new java.awt.Color(153, 153, 153));
        valueSA.setText("0");
        getContentPane().add(valueSA, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        valueSB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        valueSB.setForeground(new java.awt.Color(153, 153, 153));
        valueSB.setText("0");
        getContentPane().add(valueSB, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        valueSC.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        valueSC.setForeground(new java.awt.Color(153, 153, 153));
        valueSC.setText("0");
        getContentPane().add(valueSC, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/triangulo.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, -1));

        verificar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        verificar.setText("Verificar");
        verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarActionPerformed(evt);
            }
        });
        getContentPane().add(verificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        rIsTriang.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        rIsTriang.setForeground(new java.awt.Color(102, 153, 255));
        rIsTriang.setText("É triangulo?");
        getContentPane().add(rIsTriang, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, -1));

        rTipoTriang.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        rTipoTriang.setForeground(new java.awt.Color(153, 0, 0));
        rTipoTriang.setText("Tipo do triangulo = ");
        getContentPane().add(rTipoTriang, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("B");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("C");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("A");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 30, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Muda o valor informado do segmento a conforme o usuário interage com o Slider
    private void slAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slAStateChanged
        // TODO add your handling code here:
        valueSA.setText(Integer.toString(slA.getValue()));
    }//GEN-LAST:event_slAStateChanged
    //Muda o valor informado do segmento b conforme o usuário interage com o Slider
    private void slBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slBStateChanged
        // TODO add your handling code here:
        valueSB.setText(Integer.toString(slB.getValue()));
    }//GEN-LAST:event_slBStateChanged
    //Muda o valor informado do segmento c conforme o usuário interage com o Slider
    private void slCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slCStateChanged
        // TODO add your handling code here:
        valueSC.setText(Integer.toString(slC.getValue()));
    }//GEN-LAST:event_slCStateChanged
    //Ação após clicar no botão verificar
    private void verificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarActionPerformed
        // TODO add your handling code here:
        isTriangulo(slA.getValue(), slB.getValue(), slC.getValue());
    }//GEN-LAST:event_verificarActionPerformed
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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel rIsTriang;
    private javax.swing.JLabel rTipoTriang;
    private javax.swing.JSlider slA;
    private javax.swing.JSlider slB;
    private javax.swing.JSlider slC;
    private javax.swing.JLabel valueSA;
    private javax.swing.JLabel valueSB;
    private javax.swing.JLabel valueSC;
    private javax.swing.JButton verificar;
    // End of variables declaration//GEN-END:variables
}