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
        //Esconde os resultados até o cálculo.
        resultado.setVisible(false);
        resultado2.setVisible(false);
    }
    //Método para calcular o Delta
    public String calculaDelta(String a, String b, String c){
        int va,vb,vc, r;
        String result;
        va = Integer.parseInt(a);
        vb = Integer.parseInt(b);
        vc = Integer.parseInt(c);
        r = (int)Math.pow(vb,2)-(4*va*vc);    
        result = Integer.toString(r);
        return result;
    }
    //Retornar se existe raízes reais para o Delta calculado
    public String retornaRR(){
        String retorno, delta;
        delta = calculaDelta(valorA.getValue().toString(),valorB.getValue().toString(),valorC.getValue().toString());
        if (Integer.parseInt(delta) == 0)
            retorno = "Para Δ igual a 0 existe apenas 1 raíz real possível.";
        else if (Integer.parseInt(delta) < 0)
            retorno = "Para Δ menor que 0 não existe raízes reais possíveis";
        else if (Integer.parseInt(delta) > 0)
            retorno = "Para Δ maior que 0 existem 2 raízes reais possíveis";
        else 
            retorno = "O valor de Δ é inválido não sendo possível deduzir as raízes reias.";
        return retorno;
    }
    //Atualizar a expressão com os novos valores das variáveis
    public void atualizaExpressao(){
        expressao.setText("Δ = " + valorB.getValue().toString() + "² - 4." + valorA.getValue().toString() + "." + valorC.getValue().toString());
    }
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTit = new javax.swing.JLabel();
        lblDescESG = new javax.swing.JLabel();
        lblDescFD = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        valorA = new javax.swing.JSpinner();
        valorB = new javax.swing.JSpinner();
        valorC = new javax.swing.JSpinner();
        resultado = new javax.swing.JLabel();
        calcular = new javax.swing.JButton();
        resultado2 = new javax.swing.JLabel();
        expressao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTit.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTit.setForeground(new java.awt.Color(0, 0, 102));
        lblTit.setText("Calculando o valor de Δ ");

        lblDescESG.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblDescESG.setText("<html>Lembrando que uma equação de segundo grau é dada pela fórmula: <strong>ax² + bx + c = 0</strong> </html>");

        lblDescFD.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblDescFD.setText("<html>E que o Δ é o resultado da fórmula: <strong>Δ = b² - 4ac</strong></html>");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Digite os valores das variáveis (a, b, c) abaixo para calcularmos o Δ");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("a = ");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("b = ");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("c = ");

        valorA.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        valorA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                valorAStateChanged(evt);
            }
        });

        valorB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        valorB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                valorBStateChanged(evt);
            }
        });

        valorC.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        valorC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                valorCStateChanged(evt);
            }
        });

        resultado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        resultado.setText("<html>A valor de Δ é:</html>");

        calcular.setBackground(new java.awt.Color(153, 153, 153));
        calcular.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        calcular.setForeground(new java.awt.Color(204, 0, 0));
        calcular.setText("Calcular Δ ");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        resultado2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        resultado2.setText("<html>A valor de Δ é:</html>");

        expressao.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        expressao.setForeground(new java.awt.Color(0, 0, 0));
        expressao.setText("Δ = b² - 4.a.c");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblDescFD)
                            .addComponent(lblDescESG)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(expressao)
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(valorB, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(calcular)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(valorC, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(valorA, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultado)
                            .addComponent(lblTit)
                            .addComponent(resultado2))))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTit)
                .addGap(36, 36, 36)
                .addComponent(lblDescESG)
                .addGap(18, 18, 18)
                .addComponent(lblDescFD)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(valorA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(valorB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(valorC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcular)
                    .addComponent(expressao))
                .addGap(45, 45, 45)
                .addComponent(resultado)
                .addGap(18, 18, 18)
                .addComponent(resultado2)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Calcula o resultado de delta considera a possibilidade de raízes reais para o valor de delta e mostra o resultado.
    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        // TODO add your handling code here:
        resultado.setText("<html> O valor de Δ é: <strong>"+calculaDelta(valorA.getValue().toString(),valorB.getValue().toString(),valorC.getValue().toString()) + "</strong></html> ");
        resultado.setVisible(true);
        resultado2.setText("<html>" + retornaRR() + "</html>");
        resultado2.setVisible(true);
    }//GEN-LAST:event_calcularActionPerformed
    //Atualiza a expressão ao mudar o valor de a
    private void valorAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_valorAStateChanged
        // TODO add your handling code here:
        atualizaExpressao();
    }//GEN-LAST:event_valorAStateChanged
    //Atualiza a expressão ao mudar o valor de b
    private void valorBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_valorBStateChanged
        // TODO add your handling code here:
        atualizaExpressao();
    }//GEN-LAST:event_valorBStateChanged
    //Atualiza a expressão ao mudar o valor de c
    private void valorCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_valorCStateChanged
        // TODO add your handling code here:
        atualizaExpressao();
    }//GEN-LAST:event_valorCStateChanged
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
    private javax.swing.JButton calcular;
    private javax.swing.JLabel expressao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblDescESG;
    private javax.swing.JLabel lblDescFD;
    private javax.swing.JLabel lblTit;
    private javax.swing.JLabel resultado;
    private javax.swing.JLabel resultado2;
    private javax.swing.JSpinner valorA;
    private javax.swing.JSpinner valorB;
    private javax.swing.JSpinner valorC;
    // End of variables declaration//GEN-END:variables
}
