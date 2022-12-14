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
    private int acertosConc;
    public Tela() {
        initComponents();
        lblText.setText("<html>Vou pensar em um número entre <strong>1 e 5</strong>. Tente adivinhar!</html>");
        acertosConc = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGenio = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();
        lblBalao = new javax.swing.JLabel();
        numEscolhido = new javax.swing.JSpinner();
        btnVerificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(350, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/assustado-peq.png"))); // NOI18N
        getContentPane().add(lblGenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 173, -1, -1));

        lblText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblText.setLabelFor(lblBalao);
        lblText.setText("label");
        lblText.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 120, 60));

        lblBalao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/balão-peq.png"))); // NOI18N
        getContentPane().add(lblBalao, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        numEscolhido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        numEscolhido.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        getContentPane().add(numEscolhido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 50, -1));

        btnVerificar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        // TODO add your handling code here:
        //Sorteia um número entre 1 e 5
        int numSor = (int) (Math.random()*5)+1;
        //Transforma o número escolhido pelo usuário em uma variável int
        int numEsc = Integer.parseInt(numEscolhido.getValue().toString());
        //Variável texto que retornará após verificar se o número escolhido está correto
        String texto;
        //Compara o número escolhido com o número sorteado.
        //Ao acertar:
        //Muda a imagem do gênio para um gênio comemorando
        //Acrescenta +1 aos acertos concecutívos 
        //Se a quantidade de acertos consecutivos for maior que 1 retorna um texto diferente para parabenizar o usuário
        //Se for igual ou menor que 1 retorno de texto padrão
        if (numEsc == numSor){
            lblGenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rindopeq.png"))); 
            acertosConc += 1;         
            if (acertosConc > 1){
                texto = String.format("<html>Você <strong>acertou</strong> %s vezes seguidas, o número é <strong>%s</strong>.</html> ", acertosConc, numSor);
                lblText.setText(texto);
            }
            else{
                texto = String.format("<html>Você <strong>acertou</strong>, o número escolhido foi <strong>%s</strong>.</html>", numSor);
                lblText.setText(texto);
            }
        }
        //Retorno quando o usuário errar:
        //Muda a imagem do Gênio
        //Retorna texto avisando o número escolhido e informando que errou
        //Zera a quantidade de acertos consecutívos.
        else {
            lblGenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/errou-peq.png"))); 
            texto = String.format("<html>Você <strong>errou</strong>, o número escolhido era: <strong>%s</strong>", numSor);
            lblText.setText(texto);
            acertosConc = 0;
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

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
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel lblBalao;
    private javax.swing.JLabel lblGenio;
    private javax.swing.JLabel lblText;
    private javax.swing.JSpinner numEscolhido;
    // End of variables declaration//GEN-END:variables
}
