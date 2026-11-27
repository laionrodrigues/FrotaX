package visao;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import service.GerenciadorCliente;

public class TelaCliente extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaCliente.class.getName());
    
    private GerenciadorCliente gerenciadorCliente;

    public TelaCliente(GerenciadorCliente gerenciadorCliente) {
        initComponents();
        this.configTelas();
        this.gerenciadorCliente = gerenciadorCliente;
        carregarTabela();
        pack();
    }
    
    public TelaCliente() {
        initComponents();
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
        jTable_TabelaCliente = new javax.swing.JTable();
        jButton_Voltar = new javax.swing.JButton();
        jToggleButton_CadastrarCliente = new javax.swing.JToggleButton();
        jToggleButton_RemoverCliente = new javax.swing.JToggleButton();
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

        jTable_TabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "D.N.", "CPF", "CNH"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_TabelaCliente.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable_TabelaCliente);
        if (jTable_TabelaCliente.getColumnModel().getColumnCount() > 0) {
            jTable_TabelaCliente.getColumnModel().getColumn(0).setMinWidth(55);
            jTable_TabelaCliente.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable_TabelaCliente.getColumnModel().getColumn(0).setMaxWidth(70);
        }

        jButton_Voltar.setText("Voltar");
        jButton_Voltar.addActionListener(this::jButton_VoltarActionPerformed);

        jToggleButton_CadastrarCliente.setText("Cadastrar");
        jToggleButton_CadastrarCliente.addActionListener(this::jToggleButton_CadastrarClienteActionPerformed);

        jToggleButton_RemoverCliente.setText("Remover");
        jToggleButton_RemoverCliente.addActionListener(this::jToggleButton_RemoverClienteActionPerformed);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("FrotaX");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Voltar)
                .addContainerGap(946, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton_RemoverCliente)
                        .addGap(40, 40, 40)
                        .addComponent(jToggleButton_CadastrarCliente))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(431, 431, 431))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Voltar)
                .addGap(9, 9, 9)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton_CadastrarCliente)
                    .addComponent(jToggleButton_RemoverCliente))
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

    private void jToggleButton_CadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_CadastrarClienteActionPerformed
        TelaCadastrarCliente telaCadastrarCliente = new TelaCadastrarCliente(gerenciadorCliente, this);
        telaCadastrarCliente.setVisible(true);
    }//GEN-LAST:event_jToggleButton_CadastrarClienteActionPerformed

    private void jButton_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VoltarActionPerformed
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_VoltarActionPerformed

    private void jToggleButton_RemoverClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_RemoverClienteActionPerformed
        int linha = jTable_TabelaCliente.getSelectedRow();
        if (linha == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um cliente para remover.");
            return;
        }

        Cliente clienteParaRemover = gerenciadorCliente.listarClientes().get(linha);

        try {
            gerenciadorCliente.removerCliente(clienteParaRemover);
            carregarTabela();
            javax.swing.JOptionPane.showMessageDialog(this, "Cliente removido com sucesso.");
        } catch (IllegalArgumentException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jToggleButton_RemoverClienteActionPerformed

    
    protected void carregarTabela() {
        DefaultTableModel modelo = (DefaultTableModel) jTable_TabelaCliente.getModel();
        modelo.setRowCount(0);

        for (Cliente veiculo : gerenciadorCliente.listarClientes()) {
            modelo.addRow(new Object[]{
                veiculo.getId(),
                veiculo.getNome(),
                veiculo.getDataNascimento(),
                veiculo.getCpf(),
                veiculo.getCnh()
            });
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(() -> new TelaCliente().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_TabelaCliente;
    private javax.swing.JToggleButton jToggleButton_CadastrarCliente;
    private javax.swing.JToggleButton jToggleButton_RemoverCliente;
    // End of variables declaration//GEN-END:variables
}
