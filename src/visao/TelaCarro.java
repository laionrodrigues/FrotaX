package visao;

import javax.swing.JOptionPane;
import service.GerenciadorVeiculos;

public class TelaCarro extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaCarro.class.getName());
    
    private GerenciadorVeiculos gerenciadorVeiculos;

    public TelaCarro() {
        initComponents();
        this.configTelas();
    }
    
    public TelaCarro(GerenciadorVeiculos gerenciadorVeiculos) {
        initComponents();
        this.gerenciadorVeiculos = gerenciadorVeiculos;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_TabelaCarros = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jToggleButton_CadastrarVeiculo = new javax.swing.JToggleButton();
        jToggleButton_RemoverVeiculo = new javax.swing.JToggleButton();
        jButton_CalcularAluguel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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

        jTable_TabelaCarros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Tipo", "Placa", "Marca"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_TabelaCarros);

        jButton1.setText("Voltar");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jToggleButton_CadastrarVeiculo.setText("Cadastrar");
        jToggleButton_CadastrarVeiculo.addActionListener(this::jToggleButton_CadastrarVeiculoActionPerformed);

        jToggleButton_RemoverVeiculo.setText("Remover");

        jButton_CalcularAluguel.setText("Calcular aluguel");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("FrotaX");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(431, 431, 431))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jButton_CalcularAluguel)
                        .addGap(40, 40, 40)
                        .addComponent(jToggleButton_RemoverVeiculo)
                        .addGap(40, 40, 40)
                        .addComponent(jToggleButton_CadastrarVeiculo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(9, 9, 9)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton_CadastrarVeiculo)
                    .addComponent(jToggleButton_RemoverVeiculo)
                    .addComponent(jButton_CalcularAluguel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 700));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\Design sem nome (2).png")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1024, 700));
        jLabel1.setMinimumSize(new java.awt.Dimension(1024, 700));
        jLabel1.setPreferredSize(new java.awt.Dimension(1024, 700));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 690));
        jLabel1.getAccessibleContext().setAccessibleName("");

        getAccessibleContext().setAccessibleName("teste");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton_CadastrarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_CadastrarVeiculoActionPerformed
        TelaCadastrarCarro telaCadastrarCarro = new TelaCadastrarCarro();
        telaCadastrarCarro.setVisible(true);
    }//GEN-LAST:event_jToggleButton_CadastrarVeiculoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(() -> new TelaCarro().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_CalcularAluguel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_TabelaCarros;
    private javax.swing.JToggleButton jToggleButton_CadastrarVeiculo;
    private javax.swing.JToggleButton jToggleButton_RemoverVeiculo;
    // End of variables declaration//GEN-END:variables
}
