package telas;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelos.Proprietario;
import permanencia.sqlite.ProprietarioDAO;


public class Conta extends javax.swing.JFrame {
    boolean criar;
    Principal pai;

    public Conta(boolean criar, Principal pai) {
        initComponents();
        this.criar = criar;
        this.pai = pai;
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        if (criar){
            btnEsq.setText("VOLTAR");
            btnDir.setText("CRIAR");
        }
        else{
            carregaDados();
            btnEsq.setText("EXCLUIR");
            btnDir.setText("SALVAR");
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBlack = new javax.swing.JPanel();
        pnlBack = new javax.swing.JPanel();
        pnlData = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        btnDir = new javax.swing.JButton();
        btnEsq = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBlack.setBackground(new java.awt.Color(0, 51, 0));

        pnlBack.setBackground(new java.awt.Color(0, 102, 51));
        pnlBack.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pnlData.setBackground(new java.awt.Color(0, 153, 102));

        lblEmail.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(232, 232, 232));
        lblEmail.setText("Email:");

        txtEmail.setBackground(new java.awt.Color(51, 51, 51));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblSenha.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha:");

        txtSenha.setBackground(new java.awt.Color(51, 51, 51));
        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtSenha.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNome.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(232, 232, 232));
        lblNome.setText("Nome:");

        txtNome.setBackground(new java.awt.Color(51, 51, 51));
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCPF.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(232, 232, 232));
        lblCPF.setText("CPF:");

        txtCPF.setBackground(new java.awt.Color(51, 51, 51));
        txtCPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCPF.setForeground(new java.awt.Color(255, 255, 255));
        txtCPF.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTelefone.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(232, 232, 232));
        lblTelefone.setText("Celular:");

        txtTelefone.setBackground(new java.awt.Color(51, 51, 51));
        txtTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTelefone.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefone.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pnlDataLayout = new javax.swing.GroupLayout(pnlData);
        pnlData.setLayout(pnlDataLayout);
        pnlDataLayout.setHorizontalGroup(
            pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
            .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlDataLayout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSenha)
                            .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(lblTelefone)
                        .addComponent(lblEmail)
                        .addComponent(lblCPF))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(75, Short.MAX_VALUE)))
        );
        pnlDataLayout.setVerticalGroup(
            pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
            .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlDataLayout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmail)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblSenha)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNome)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCPF)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelefone)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(46, Short.MAX_VALUE)))
        );

        btnDir.setBackground(new java.awt.Color(51, 51, 51));
        btnDir.setForeground(java.awt.SystemColor.control);
        btnDir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDirActionPerformed(evt);
            }
        });

        btnEsq.setBackground(new java.awt.Color(51, 51, 51));
        btnEsq.setForeground(java.awt.SystemColor.control);
        btnEsq.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEsq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBackLayout = new javax.swing.GroupLayout(pnlBack);
        pnlBack.setLayout(pnlBackLayout);
        pnlBackLayout.setHorizontalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(pnlData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        pnlBackLayout.setVerticalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(pnlData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEsq, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(btnDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

    private void btnDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDirActionPerformed
        String email = txtEmail.getText();
        String senha = String.valueOf(txtSenha.getPassword());
        String nome = txtNome.getText();
        String cpf = txtCPF.getText();
        String telefone = txtTelefone.getText();
        if (email.isBlank() || senha.isBlank() || nome.isBlank() || cpf.isBlank() || telefone.isBlank()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }  
        else{
            ProprietarioDAO conexao = new ProprietarioDAO();
            Proprietario proprietario = new Proprietario(cpf, email, senha, nome, telefone);
            boolean resposta = criar ? conexao.criar(proprietario) : conexao.atualizar(proprietario, Proprietario.getProprietarioSessao().getEmail());
            if(resposta){
                Proprietario.setProprietarioSessao(proprietario);
                JOptionPane.showMessageDialog(null, "Conta "+ (criar ? "criada" : "atualizada") +" com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                pai.helloWorld();
                this.dispose();

            }
            else{
                JOptionPane.showMessageDialog(null, "Email ou CPF já em uso!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_btnDirActionPerformed

    private void btnEsqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsqActionPerformed
        if (!criar){
            int resposta = JOptionPane.showConfirmDialog(null,"Você deseja apaguar a conta?",  
                "Confirmação",JOptionPane.YES_NO_OPTION);
            
            if (resposta == JOptionPane.YES_OPTION){
                ProprietarioDAO conexao = new ProprietarioDAO();
                boolean apagado = conexao.apagar(Proprietario.getProprietarioSessao().getEmail());
                if (apagado){
                   Proprietario.setProprietarioSessao(null);
                   pai.mostraLogin();
                  JOptionPane.showMessageDialog(null, "Conta apagada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);  
                }
                else{
                    JOptionPane.showMessageDialog(null, "Não foi possível apaguar a conta!", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            else{
                return;
            }
            
        }
        this.dispose();
    }//GEN-LAST:event_btnEsqActionPerformed

    private void carregaDados(){
        Proprietario prop = Proprietario.getProprietarioSessao();
        txtEmail.setText(prop.getEmail());
        txtSenha.setText(prop.getSenha());
        txtNome.setText(prop.getNome());
        txtCPF.setText(prop.getCpf());
        txtTelefone.setText(prop.getTelefone());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDir;
    private javax.swing.JButton btnEsq;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlBlack;
    private javax.swing.JPanel pnlData;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
