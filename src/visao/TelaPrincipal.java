package visao;

import javax.swing.JOptionPane;
import service.GerenciadorCliente;
import service.GerenciadorVeiculos;

public class TelaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaPrincipal.class.getName());
    
    private final GerenciadorVeiculos gerenciadorVeiculos = new GerenciadorVeiculos();
    private final GerenciadorCliente gerenciadorCliente = new GerenciadorCliente();
    
    public TelaPrincipal() {
        initComponents();
        setTitle("FrotaX");
        setResizable(false);
        this.configTelas();
    }
    
    private void configTelas() {
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo.png")).getImage());
        setResizable(false);
        setLocationRelativeTo(this);
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton_GerenciarCliente = new javax.swing.JToggleButton();
        jToggleButton_GerenciarVeiculo = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 700));
        setMinimumSize(new java.awt.Dimension(1024, 700));
        setPreferredSize(new java.awt.Dimension(1024, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 700));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 700));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("FrotaX");

        jToggleButton_GerenciarCliente.setText("Gerenciar Clientes");
        jToggleButton_GerenciarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton_GerenciarCliente.addActionListener(this::jToggleButton_GerenciarClienteActionPerformed);

        jToggleButton_GerenciarVeiculo.setText("Gerenciar Veículos");
        jToggleButton_GerenciarVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton_GerenciarVeiculo.addActionListener(this::jToggleButton_GerenciarVeiculoActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(448, 448, 448)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton_GerenciarVeiculo)
                    .addComponent(jToggleButton_GerenciarCliente)
                    .addComponent(jLabel2))
                .addGap(448, 448, 448))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel2)
                .addGap(58, 58, 58)
                .addComponent(jToggleButton_GerenciarCliente)
                .addGap(39, 39, 39)
                .addComponent(jToggleButton_GerenciarVeiculo)
                .addContainerGap(329, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 690));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TelaLoguin.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1024, 700));
        jLabel1.setMinimumSize(new java.awt.Dimension(1024, 700));
        jLabel1.setPreferredSize(new java.awt.Dimension(1024, 700));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jLabel1.getAccessibleContext().setAccessibleName("");

        getAccessibleContext().setAccessibleName("teste");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton_GerenciarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_GerenciarVeiculoActionPerformed
        TelaCarro telaCarro = new TelaCarro(gerenciadorVeiculos);
        telaCarro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton_GerenciarVeiculoActionPerformed

    private void jToggleButton_GerenciarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_GerenciarClienteActionPerformed
        TelaCliente telaCliente = new TelaCliente(gerenciadorCliente);
        telaCliente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton_GerenciarClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(() -> new TelaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton_GerenciarCliente;
    private javax.swing.JToggleButton jToggleButton_GerenciarVeiculo;
    // End of variables declaration//GEN-END:variables
}
