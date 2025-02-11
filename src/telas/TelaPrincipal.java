package telas;

import javax.swing.JOptionPane;
import modelos.Proprietario;
import permanencia.sqlite.ProprietarioDAO;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostraLogin();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBack = new javax.swing.JPanel();
        camadas = new javax.swing.JLayeredPane();
        pnlMenu = new javax.swing.JPanel();
        btnLocal = new javax.swing.JButton();
        btnFazenda = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        btlConta = new javax.swing.JButton();
        tblPastores = new javax.swing.JButton();
        pnlPrincipal = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnOK = new javax.swing.JButton();
        lblCriaConta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBack.setBackground(new java.awt.Color(0, 51, 0));

        camadas.setFocusCycleRoot(true);
        camadas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMenu.setBackground(new java.awt.Color(0, 102, 51));
        pnlMenu.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pnlMenuComponentShown(evt);
            }
        });

        btnLocal.setBackground(new java.awt.Color(51, 51, 51));
        btnLocal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLocal.setForeground(new java.awt.Color(255, 255, 255));
        btnLocal.setText("Locais");
        btnLocal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalActionPerformed(evt);
            }
        });

        btnFazenda.setBackground(new java.awt.Color(51, 51, 51));
        btnFazenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFazenda.setForeground(new java.awt.Color(255, 255, 255));
        btnFazenda.setText("Fazendas");
        btnFazenda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnFazenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFazendaActionPerformed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));

        btlConta.setBackground(new java.awt.Color(51, 51, 51));
        btlConta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btlConta.setForeground(new java.awt.Color(255, 255, 255));
        btlConta.setText("Conta");
        btlConta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btlConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlContaActionPerformed(evt);
            }
        });

        tblPastores.setBackground(new java.awt.Color(51, 51, 51));
        tblPastores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblPastores.setForeground(new java.awt.Color(255, 255, 255));
        tblPastores.setText("Pastores");
        tblPastores.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblPastores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblPastoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addComponent(btnFazenda, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 198, Short.MAX_VALUE))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tblPastores, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btlConta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btnFazenda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btlConta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(tblPastores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        camadas.add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlPrincipal.setBackground(new java.awt.Color(0, 102, 51));
        pnlPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblEmail.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(232, 232, 232));
        lblEmail.setText("Email:");

        lblSenha.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha:");

        txtEmail.setBackground(new java.awt.Color(51, 51, 51));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtSenha.setBackground(new java.awt.Color(51, 51, 51));
        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtSenha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSenha.setCaretColor(new java.awt.Color(255, 255, 255));
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        btnOK.setBackground(new java.awt.Color(51, 51, 51));
        btnOK.setForeground(java.awt.SystemColor.control);
        btnOK.setText("OK");
        btnOK.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        lblCriaConta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCriaConta.setForeground(new java.awt.Color(255, 255, 255));
        lblCriaConta.setText("<html><u>Criar uma conta</u></html>");
        lblCriaConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCriaContaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSenha)
                            .addComponent(lblEmail))
                        .addGap(14, 14, 14)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(txtEmail)))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addGap(0, 181, Short.MAX_VALUE)
                .addComponent(lblCriaConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(lblCriaConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        camadas.add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout pnlBackLayout = new javax.swing.GroupLayout(pnlBack);
        pnlBack.setLayout(pnlBackLayout);
        pnlBackLayout.setHorizontalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(camadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBackLayout.setVerticalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(camadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        String email = txtEmail.getText();
        String senha = String.valueOf(txtSenha.getPassword());
        
        if (email.isBlank() || senha.isBlank()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        else{
            ProprietarioDAO conexao = new ProprietarioDAO();
            Proprietario proprietario = conexao.buscarPorEmail(email);
            if(proprietario != null && email.equals(proprietario.getEmail()) && senha.equals(proprietario.getSenha())){
                Proprietario.setProprietarioSessao(proprietario);
                pnlPrincipal.setVisible(false);
                pnlMenu.setVisible(true);
                txtEmail.setText("");
                txtSenha.setText("");
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Dados incorretos", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void lblCriaContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCriaContaMouseClicked
        TelaConta telaCadastro =  new TelaConta(true, this);
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_lblCriaContaMouseClicked

    private void btnFazendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFazendaActionPerformed
        TelaFazenda telaFazenda = new TelaFazenda();
        telaFazenda.setVisible(true);
    }//GEN-LAST:event_btnFazendaActionPerformed

    private void pnlMenuComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pnlMenuComponentShown
       helloWorld();
    }//GEN-LAST:event_pnlMenuComponentShown

    private void btlContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlContaActionPerformed
    TelaConta telaConta =  new TelaConta(false, this);
    telaConta.setVisible(true);
    }//GEN-LAST:event_btlContaActionPerformed

    private void btnLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalActionPerformed
        TelaLocal telaLocal = new TelaLocal();
        telaLocal.setVisible(true);
    }//GEN-LAST:event_btnLocalActionPerformed

    private void tblPastoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblPastoresActionPerformed
        TelaPastor telaPastor = new TelaPastor();
        telaPastor.setVisible(true);
    }//GEN-LAST:event_tblPastoresActionPerformed

    public void mostraLogin(){
        pnlPrincipal.setVisible(true);
        pnlMenu.setVisible(false);
    }
    
    public void helloWorld(){
        lblUsuario.setText("Olá " + Proprietario.getProprietarioSessao().getNome() + "!");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btlConta;
    private javax.swing.JButton btnFazenda;
    private javax.swing.JButton btnLocal;
    private javax.swing.JButton btnOK;
    private javax.swing.JLayeredPane camadas;
    private javax.swing.JLabel lblCriaConta;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JButton tblPastores;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
