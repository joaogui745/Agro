
package telas;

import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelos.Fazenda;
import modelos.Imagem;
import modelos.Local;
import modelos.Pastor;
import permanencia.sqlite.ProprietarioDAO;
import modelos.Proprietario;
import permanencia.sqlite.FazendaDAO;
import permanencia.sqlite.LocalDAO;


public class TelaLocal extends javax.swing.JFrame {
    ArrayList<Local> locais;
    boolean criar;
    Imagem imagemSelecionada;
    
    public TelaLocal() {
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
        tblLocais = new javax.swing.JTable();
        jspSeparador = new javax.swing.JSeparator();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtArea = new javax.swing.JTextField();
        lblArea = new javax.swing.JLabel();
        cmbFazenda = new javax.swing.JComboBox<>();
        cmbPastor = new javax.swing.JComboBox<>();
        lblFazenda = new javax.swing.JLabel();
        lblPastor = new javax.swing.JLabel();
        pnlBordaEnviar = new javax.swing.JPanel();
        lblcaminhoImagem = new javax.swing.JLabel();
        btnAbrir = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();
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

        tblLocais.setBackground(new java.awt.Color(225, 225, 225));
        tblLocais.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        tblLocais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "FAZENDA", "AREA", "PASTOR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
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
        tblLocais.setToolTipText("");
        tblLocais.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblLocais.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblLocais.setShowGrid(true);
        tblLocais.getTableHeader().setReorderingAllowed(false);
        pnlTable.setViewportView(tblLocais);

        jspSeparador.setBackground(new java.awt.Color(51, 51, 51));
        jspSeparador.setForeground(new java.awt.Color(51, 51, 51));

        lblNome.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("NOME:");

        txtNome.setBackground(new java.awt.Color(51, 51, 51));
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNome.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNome.setEnabled(false);

        txtArea.setBackground(new java.awt.Color(51, 51, 51));
        txtArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtArea.setForeground(new java.awt.Color(255, 255, 255));
        txtArea.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtArea.setCaretColor(new java.awt.Color(255, 255, 255));
        txtArea.setEnabled(false);

        lblArea.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblArea.setForeground(new java.awt.Color(232, 232, 232));
        lblArea.setText("AREA:");

        cmbFazenda.setBackground(new java.awt.Color(51, 51, 51));
        cmbFazenda.setForeground(new java.awt.Color(255, 255, 255));
        cmbFazenda.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cmbPastor.setBackground(new java.awt.Color(51, 51, 51));
        cmbPastor.setForeground(new java.awt.Color(255, 255, 255));
        cmbPastor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblFazenda.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblFazenda.setForeground(new java.awt.Color(232, 232, 232));
        lblFazenda.setText("FAZENDA:");

        lblPastor.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblPastor.setForeground(new java.awt.Color(232, 232, 232));
        lblPastor.setText("PASTOR:");

        pnlBordaEnviar.setBackground(new java.awt.Color(0, 153, 102));
        pnlBordaEnviar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblcaminhoImagem.setText("               ");

        btnAbrir.setBackground(new java.awt.Color(51, 51, 51));
        btnAbrir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAbrir.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrir.setText("Abrir");
        btnAbrir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBordaEnviarLayout = new javax.swing.GroupLayout(pnlBordaEnviar);
        pnlBordaEnviar.setLayout(pnlBordaEnviarLayout);
        pnlBordaEnviarLayout.setHorizontalGroup(
            pnlBordaEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBordaEnviarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblcaminhoImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
        pnlBordaEnviarLayout.setVerticalGroup(
            pnlBordaEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBordaEnviarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBordaEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcaminhoImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAbrir))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlDataLayout = new javax.swing.GroupLayout(pnlData);
        pnlData.setLayout(pnlDataLayout);
        pnlDataLayout.setHorizontalGroup(
            pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspSeparador)
            .addGroup(pnlDataLayout.createSequentialGroup()
                .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDataLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlTable, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE))
                    .addGroup(pnlDataLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblArea)
                            .addComponent(lblFazenda)
                            .addComponent(lblPastor))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbFazenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                .addComponent(txtArea))
                            .addComponent(cmbPastor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlBordaEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)))
                .addContainerGap())
        );
        pnlDataLayout.setVerticalGroup(
            pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTable, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDataLayout.createSequentialGroup()
                        .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblArea)
                            .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbFazenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFazenda))
                        .addGap(36, 36, 36)
                        .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbPastor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPastor))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDataLayout.createSequentialGroup()
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlBordaEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
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
                        .addGap(96, 96, 96)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBackLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(lblBusca)
                        .addGap(18, 18, 18)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
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
        txtNome.setEnabled(true);
        txtArea.setEnabled(true);
        
        
        criar = true;
        txtNome.setText("");
        txtArea.setText("");
        
        
        btnSalvar.setEnabled(true);
        tblLocais.clearSelection();
        lblFoto.setIcon(null);
        imagemSelecionada = null;
        lblcaminhoImagem.setText("");
        cmbFazenda.setSelectedIndex(0);
        cmbPastor.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnCriarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        LocalDAO conexao = new LocalDAO();
        int index = tblLocais.getSelectedRow();
        if (index == -1){
            JOptionPane.showMessageDialog(null, "Selecione um local", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String nome = (String) tblLocais.getValueAt(index, 0);
        int idFazenda = (int) tblLocais.getValueAt(index, 1);
        
        
        conexao.apagar(nome, idFazenda);
        atualizaModelo();
        btnSalvar.setEnabled(false);
        txtNome.setText("");
        txtArea.setText("");
        lblFoto.setIcon(null);
        imagemSelecionada = null;
        lblcaminhoImagem.setText("");
        cmbFazenda.setSelectedIndex(0);
        cmbPastor.setSelectedIndex(0);
        
        JOptionPane.showMessageDialog(null, "Local excluido com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void pnlBlackComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlBlackComponentShown
        pnlTable.setVisible(false);
        tblLocais.setVisible(false);
    }//GEN-LAST:event_pnlBlackComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        atualizaModelo();
        buscaFazendas(Proprietario.getProprietarioSessao().getEmail());
        buscaPastores(Proprietario.getProprietarioSessao().getEmail());
    }//GEN-LAST:event_formComponentShown

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int index = tblLocais.getSelectedRow();
        if (index == -1){
            JOptionPane.showMessageDialog(null, "Selecione um local", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        criar = false;
        
        String nome = (String) tblLocais.getValueAt(index, 0);
        int idFazenda = (int) tblLocais.getValueAt(index, 1);
        Local localSelecionado = buscarLocal(nome, idFazenda);
        
        imagemSelecionada = localSelecionado.getFoto();
        lblFoto.setIcon(imagemSelecionada.fit(lblFoto));
        txtNome.setText(localSelecionado.getNome());
        txtArea.setText(Double.toString(localSelecionado.getArea()));
        String item;
        for (int i = 1; i < cmbFazenda.getItemCount(); i++) {
             
            if(((Fazenda) cmbFazenda.getItemAt(i)).getIdFazenda() == localSelecionado.getIdFazenda()){
                 cmbFazenda.setSelectedIndex(i);
             }
        }
        for (int i = 1; i < cmbPastor.getItemCount(); i++) {
             if(((Pastor) cmbPastor.getItemAt(i)).getNis().equals(localSelecionado.getNisPastor())){
                 cmbPastor.setSelectedIndex(i);
             }
        }
        
        btnSalvar.setEnabled(true);
        txtNome.setEnabled(true);
        txtArea.setEnabled(true);
        lblcaminhoImagem.setText("");
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            boolean resposta;
            Double area = Double.valueOf(txtArea.getText());
            int indexFazenda = cmbFazenda.getSelectedIndex();
            int indexPastor = cmbPastor.getSelectedIndex();
            String nome = txtNome.getText();
            
            int index = (int) tblLocais.getSelectedRow();

            if (nome.isBlank() || (criar && imagemSelecionada == null) || (!criar && index == -1) || indexFazenda <= 0 || indexPastor <= 0){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Aviso", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            int idFazenda = ((Fazenda) cmbFazenda.getSelectedItem()).getIdFazenda();
            String nis = ((Pastor) cmbPastor.getSelectedItem()).getNis();
            LocalDAO conexao = new LocalDAO();
            Local local = new Local(nome, nis, idFazenda, area, imagemSelecionada);
            
            if (criar){
                resposta = conexao.criar(local); 
            }
            else{
                String nomeAntigo = (String) tblLocais.getValueAt(index, 0);
                int idFazendaAntigo = (int) tblLocais.getValueAt(index, 1);
                resposta = conexao.atualizar(local, nomeAntigo, idFazendaAntigo);
            }
           
            if(resposta){
                JOptionPane.showMessageDialog(null, "Local " +  (criar ? "criado" : "atualizado") + " com sucesso", "sucesso", JOptionPane.INFORMATION_MESSAGE);
                atualizaModelo();
                txtArea.setText("");
                txtNome.setText("");
                cmbFazenda.setSelectedIndex(0);
                cmbPastor.setSelectedIndex(0);
                lblcaminhoImagem.setText("");
                imagemSelecionada = null;
                lblFoto.setIcon(null);
            }
            else{
                JOptionPane.showMessageDialog(null, "Erro na " +  (criar ? "criação" : "atualização") + " do local", "Erro!", JOptionPane.ERROR_MESSAGE);
            }

        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Verifique todos os campos", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filtroImagens = new FileNameExtensionFilter("Imagens", "jpg", "png");
        fileChooser.setFileFilter(filtroImagens);
        int resposta = fileChooser.showOpenDialog(null);
        if (resposta == JFileChooser.APPROVE_OPTION) {
            File arquivoImagem = new File(fileChooser.getSelectedFile().getAbsolutePath());
            boolean tipoValido = Imagem.imagemValida(arquivoImagem.getName());
            if (tipoValido){
                lblcaminhoImagem.setText(arquivoImagem.getName());
                imagemSelecionada = new Imagem(arquivoImagem);
                lblFoto.setIcon(imagemSelecionada.fit(lblFoto));
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Arquivo Inválido",
                    "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAbrirActionPerformed
    
    private Local buscarLocal(String nome, int idFazenda){
        for (Local local : locais){
            if (local.getNome().equals(nome) && idFazenda == local.getIdFazenda()){
                return local;
            }
        }
        return null;
    }
    
    private void atualizaModelo(){
        DefaultTableModel modelo = (DefaultTableModel) tblLocais.getModel();
        modelo.setRowCount(0);
        ProprietarioDAO conexao = new ProprietarioDAO();
        locais = conexao.buscarLocais(Proprietario.getProprietarioSessao().getEmail());
        for (Local local : locais){
            modelo.addRow( new Object[]{local.getNome(), local.getIdFazenda(), local.getArea(), local.getNisPastor()});
        }
        
        tblLocais.setModel(modelo);
    }
    
    private void buscaFazendas(String email){
         DefaultComboBoxModel<Object> model = new DefaultComboBoxModel<>();
         model.addElement("Selecione a fazenda");
         ProprietarioDAO conexao = new ProprietarioDAO();
         ArrayList<Fazenda> fazendas = conexao.buscarFazendas(email);
         for (Fazenda fazenda : fazendas){
             model.addElement(fazenda);
         }
         cmbFazenda.setModel(model);
    }
    private void buscaPastores(String email){
         DefaultComboBoxModel<Object> model = new DefaultComboBoxModel<>();
         model.addElement("Selecione um pastor");
         ProprietarioDAO conexao = new ProprietarioDAO();
         ArrayList<Pastor> pastores = conexao.buscarPastores(email);
         for (Pastor pastor : pastores){
             model.addElement(pastor);
         }
         cmbPastor.setModel(model);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<Object> cmbFazenda;
    private javax.swing.JComboBox<Object> cmbPastor;
    private javax.swing.JSeparator jspSeparador;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblBusca;
    private javax.swing.JLabel lblFazenda;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPastor;
    private javax.swing.JLabel lblcaminhoImagem;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlBlack;
    private javax.swing.JPanel pnlBordaEnviar;
    private javax.swing.JPanel pnlData;
    private javax.swing.JScrollPane pnlTable;
    private javax.swing.JTable tblLocais;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
