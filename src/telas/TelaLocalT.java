
package telas;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import modelos.Fazenda;
import permanencia.sqlite.ProprietarioDAO;
import modelos.Proprietario;
import permanencia.sqlite.FazendaDAO;


public class TelaLocalT extends javax.swing.JFrame {
    ArrayList<Fazenda> fazendas;
    boolean criar;
    public TelaLocalT() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBlack = new javax.swing.JPanel();
        pnlBack = new javax.swing.JPanel();
        lblBusca = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        btnBusca = new javax.swing.JButton();
        pnlData = new javax.swing.JPanel();
        pnlTable = new javax.swing.JScrollPane();
        tblFazendas = new javax.swing.JTable();
        jspSeparador = new javax.swing.JSeparator();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblArea = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        btnCriar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        pnlBlack.setBackground(new java.awt.Color(0, 51, 0));
        pnlBlack.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnlBlackComponentShown(evt);
            }
        });

        pnlBack.setBackground(new java.awt.Color(0, 102, 51));
        pnlBack.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblBusca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBusca.setText("Fazenda");

        txtBusca.setBackground(new java.awt.Color(51, 51, 51));
        txtBusca.setForeground(new java.awt.Color(255, 255, 255));
        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });

        btnBusca.setBackground(new java.awt.Color(51, 51, 51));
        btnBusca.setForeground(java.awt.SystemColor.control);
        btnBusca.setText("OK");
        btnBusca.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pnlData.setBackground(new java.awt.Color(0, 153, 102));

        pnlTable.setBackground(new java.awt.Color(51, 51, 51));
        pnlTable.setOpaque(false);

        tblFazendas.setBackground(new java.awt.Color(225, 225, 225));
        tblFazendas.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        tblFazendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "IDFAZENDA", "ESTADO", "AREA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFazendas.setToolTipText("");
        tblFazendas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblFazendas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblFazendas.setShowGrid(true);
        tblFazendas.getTableHeader().setReorderingAllowed(false);
        pnlTable.setViewportView(tblFazendas);

        jspSeparador.setBackground(new java.awt.Color(51, 51, 51));
        jspSeparador.setForeground(new java.awt.Color(51, 51, 51));

        lblNome.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(232, 232, 232));
        lblNome.setText("Nome");

        txtNome.setBackground(new java.awt.Color(51, 51, 51));
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNome.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNome.setEnabled(false);

        lblArea.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblArea.setForeground(new java.awt.Color(255, 255, 255));
        lblArea.setText("Area:");

        txtEstado.setBackground(new java.awt.Color(51, 51, 51));
        txtEstado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEstado.setForeground(new java.awt.Color(255, 255, 255));
        txtEstado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtEstado.setCaretColor(new java.awt.Color(255, 255, 255));
        txtEstado.setEnabled(false);

        lblEstado.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(232, 232, 232));
        lblEstado.setText("Estado:");

        txtArea.setBackground(new java.awt.Color(51, 51, 51));
        txtArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtArea.setForeground(new java.awt.Color(255, 255, 255));
        txtArea.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtArea.setCaretColor(new java.awt.Color(255, 255, 255));
        txtArea.setEnabled(false);

        javax.swing.GroupLayout pnlDataLayout = new javax.swing.GroupLayout(pnlData);
        pnlData.setLayout(pnlDataLayout);
        pnlDataLayout.setHorizontalGroup(
            pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTable, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jspSeparador)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDataLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblArea)
                        .addComponent(lblEstado, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(169, 169, 169))
        );
        pnlDataLayout.setVerticalGroup(
            pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTable, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArea)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        btnCriar.setBackground(new java.awt.Color(51, 51, 51));
        btnCriar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCriar.setForeground(new java.awt.Color(255, 255, 255));
        btnCriar.setText("CRIAR");
        btnCriar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(51, 51, 51));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("EDITAR");
        btnEditar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(51, 51, 51));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("EXCLUIR");
        btnExcluir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(51, 51, 51));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("SALVAR");
        btnSalvar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBackLayout = new javax.swing.GroupLayout(pnlBack);
        pnlBack.setLayout(pnlBackLayout);
        pnlBackLayout.setHorizontalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlBackLayout.createSequentialGroup()
                        .addComponent(btnCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBackLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(lblBusca)
                        .addGap(18, 18, 18)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlBackLayout.setVerticalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBusca)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar)
                    .addComponent(btnCriar))
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout pnlBlackLayout = new javax.swing.GroupLayout(pnlBlack);
        pnlBlack.setLayout(pnlBlackLayout);
        pnlBlackLayout.setHorizontalGroup(
            pnlBlackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBlackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBlackLayout.setVerticalGroup(
            pnlBlackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBlackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBlack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBlack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaActionPerformed

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed
        txtArea.setEnabled(true);
        txtEstado.setEnabled(true);
        txtNome.setEnabled(true);
        
        criar = true;
        txtArea.setText("");
        txtEstado.setText("");
        txtNome.setText("");
        
        btnSalvar.setEnabled(true);
        tblFazendas.clearSelection();
        
    }//GEN-LAST:event_btnCriarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        FazendaDAO conexao = new FazendaDAO();
        int index = tblFazendas.getSelectedRow();
        if (index == -1){
            JOptionPane.showMessageDialog(null, "Selecione uma fazenda", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int idFazenda = (int) tblFazendas.getValueAt(index, 0);
        conexao.apagar(idFazenda);
        atualizaModelo();
        btnSalvar.setEnabled(false);
        txtArea.setText("");
        txtEstado.setText("");
        txtNome.setText("");
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void pnlBlackComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlBlackComponentShown
        pnlTable.setVisible(false);
        tblFazendas.setVisible(false);
    }//GEN-LAST:event_pnlBlackComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        atualizaModelo();
    }//GEN-LAST:event_formComponentShown

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int index = tblFazendas.getSelectedRow();
        if (index == -1){
            JOptionPane.showMessageDialog(null, "Selecione uma fazenda", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        criar = false;
        int idFazenda = (int) tblFazendas.getValueAt(index, 0);
        Fazenda fazendaSelecionada = buscarFazenda(idFazenda);
        
        txtArea.setText(Double.toString(fazendaSelecionada.getAreaTotal()));
        txtEstado.setText(fazendaSelecionada.getEstado());
        txtNome.setText(fazendaSelecionada.getNome());
        
        btnSalvar.setEnabled(true);
        txtArea.setEnabled(true);
        txtEstado.setEnabled(true);
        txtNome.setEnabled(true);
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            Double area = Double.valueOf(txtArea.getText());
            int idFazenda;
            String estado = txtEstado.getText();
            String nome = txtNome.getText();
            
            int index = (int) tblFazendas.getSelectedRow();

            if (estado.isBlank() || nome.isBlank() || !criar && index == -1){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Aviso", JOptionPane.WARNING_MESSAGE);
                return;
            }
            idFazenda = criar ? 0 : (int) tblFazendas.getValueAt(index, 0);
            
            FazendaDAO conexao = new FazendaDAO();
            Fazenda fazenda = new Fazenda(area, estado, nome, Proprietario.getProprietarioSessao().getEmail());
            boolean resposta = criar ? conexao.criar(fazenda) : conexao.atualizar(fazenda, idFazenda);
            
            if(resposta){
                JOptionPane.showMessageDialog(null, "Conta " +  (criar ? "criada" : "atualizada") + " com sucesso", "sucesso", JOptionPane.INFORMATION_MESSAGE);
                atualizaModelo();
            }
            else{
                JOptionPane.showMessageDialog(null, "Erro na " +  (criar ? "criação" : "atualização") + " da conta", "Erro!", JOptionPane.ERROR_MESSAGE);
            }

        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Verifique todos os campos", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed
    
    private Fazenda buscarFazenda(int idFazenda){
        for (Fazenda fazenda : fazendas){
            if (fazenda.getIdFazenda() == idFazenda){
                return fazenda;
            }
        }
        return null;
    }
    
    private void atualizaModelo(){
        DefaultTableModel modelo = (DefaultTableModel) tblFazendas.getModel();
        modelo.setRowCount(0);
        ProprietarioDAO conexao = new ProprietarioDAO();
        fazendas = conexao.buscarFazendas(Proprietario.getProprietarioSessao().getEmail());
        for (Fazenda fazenda : fazendas){
            modelo.addRow( new Object[]{fazenda.getIdFazenda(), fazenda.getNome(), fazenda.getEstado(), fazenda.getAreaTotal()});
        }
        
        tblFazendas.setModel(modelo);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JSeparator jspSeparador;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblBusca;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlBlack;
    private javax.swing.JPanel pnlData;
    private javax.swing.JScrollPane pnlTable;
    private javax.swing.JTable tblFazendas;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
