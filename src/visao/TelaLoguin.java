package visao;

import javax.swing.JOptionPane;

public class TelaLoguin extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaLoguin.class.getName());

    public TelaLoguin() {
        initComponents();
        this.configTelas();
    }
    
    private void configTelas() {
        setTitle("FrotaX");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo.png")).getImage());
        setResizable(false);
        setLocationRelativeTo(this);
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToggleButton_Entrar = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField_CampoLoguin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField_CampoSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 700));
        setMinimumSize(new java.awt.Dimension(1024, 700));
        setPreferredSize(new java.awt.Dimension(1024, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 700));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 700));

        jToggleButton_Entrar.setText("Entrar");
        jToggleButton_Entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton_Entrar.setFocusCycleRoot(true);
        jToggleButton_Entrar.addActionListener(this::jToggleButton_EntrarActionPerformed);

        jLabel2.setText("Loguin:");

        jTextField_CampoLoguin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextField_CampoLoguin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField_CampoLoguin.setMaximumSize(new java.awt.Dimension(64, 22));
        jTextField_CampoLoguin.addActionListener(this::jTextField_CampoLoguinActionPerformed);

        jLabel3.setText("Senha:");

        jPasswordField_CampoSenha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPasswordField_CampoSenha.setMaximumSize(new java.awt.Dimension(64, 22));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("FrotaX");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(458, 458, 458)
                        .addComponent(jToggleButton_Entrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_CampoLoguin, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jPasswordField_CampoSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(435, 435, 435)
                        .addComponent(jLabel4)))
                .addContainerGap(407, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_CampoLoguin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField_CampoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jToggleButton_Entrar)
                .addGap(211, 211, 211))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 700));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\Design sem nome (1).png")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1024, 700));
        jLabel1.setMinimumSize(new java.awt.Dimension(1024, 700));
        jLabel1.setPreferredSize(new java.awt.Dimension(1024, 700));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getAccessibleContext().setAccessibleName("teste");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_EntrarActionPerformed
        String loginDigitado = jTextField_CampoLoguin.getText().trim();
        char[] senhaDigitada = jPasswordField_CampoSenha.getPassword();

        try {
            if (loginDigitado.isBlank() || senhaDigitada.length == 0) {
                JOptionPane.showMessageDialog(
                        this,
                        "Preencha o login e a senha.",
                        "Campos obrigatórios",
                        JOptionPane.WARNING_MESSAGE
                );
                return;
            }

            if (!loginDigitado.equals("admin") || !java.util.Arrays.equals(senhaDigitada, "admin".toCharArray())) {
                JOptionPane.showMessageDialog(
                        this,
                        "Senha incorreta!",
                        "Falha no login",
                        JOptionPane.ERROR_MESSAGE
                );
                jPasswordField_CampoSenha.setText("");
                jPasswordField_CampoSenha.requestFocusInWindow();
                return;
            }

            JOptionPane.showMessageDialog(
                    this,
                    "Login realizado com sucesso!",
                    "Bem-vindo",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } finally {
            java.util.Arrays.fill(senhaDigitada, '\0');
        }
        jTextField_CampoLoguin.setText("");
        jPasswordField_CampoSenha.setText("");

        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton_EntrarActionPerformed

    private void jTextField_CampoLoguinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CampoLoguinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CampoLoguinActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(() -> new TelaLoguin().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_CampoSenha;
    private javax.swing.JTextField jTextField_CampoLoguin;
    private javax.swing.JToggleButton jToggleButton_Entrar;
    // End of variables declaration//GEN-END:variables
}
