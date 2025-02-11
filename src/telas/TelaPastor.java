package telas;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelos.Pastor;
import modelos.Proprietario;
import permanencia.sqlite.PastorDAO;
import permanencia.sqlite.ProprietarioDAO;


public class TelaPastor extends javax.swing.JFrame {

    public TelaPastor() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBlack = new javax.swing.JPanel();
        pnlBack = new javax.swing.JPanel();
        pnlData = new javax.swing.JPanel();
        lblNis = new javax.swing.JLabel();
        txtNis = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        btnCriar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBlack.setBackground(new java.awt.Color(0, 51, 0));

        pnlBack.setBackground(new java.awt.Color(0, 102, 51));
        pnlBack.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pnlData.setBackground(new java.awt.Color(0, 153, 102));

        lblNis.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblNis.setForeground(new java.awt.Color(232, 232, 232));
        lblNis.setText("NIS:");

        txtNis.setBackground(new java.awt.Color(51, 51, 51));
        txtNis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNis.setForeground(new java.awt.Color(255, 255, 255));
        txtNis.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNis.setCaretColor(new java.awt.Color(255, 255, 255));

        lblNome.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome:");

        lblSalario.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblSalario.setForeground(new java.awt.Color(232, 232, 232));
        lblSalario.setText("Salario:");

        txtSalario.setBackground(new java.awt.Color(51, 51, 51));
        txtSalario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSalario.setForeground(new java.awt.Color(255, 255, 255));
        txtSalario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSalario.setCaretColor(new java.awt.Color(255, 255, 255));

        txtNome.setBackground(new java.awt.Color(51, 51, 51));
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNome.setCaretColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlDataLayout = new javax.swing.GroupLayout(pnlData);
        pnlData.setLayout(pnlDataLayout);
        pnlDataLayout.setHorizontalGroup(
            pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDataLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDataLayout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addGap(18, 18, 18)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDataLayout.createSequentialGroup()
                        .addComponent(lblSalario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
            .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlDataLayout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(lblNis)
                    .addGap(30, 30, 30)
                    .addComponent(txtNis, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(75, Short.MAX_VALUE)))
        );
        pnlDataLayout.setVerticalGroup(
            pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(18, 18, 18)
                .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalario)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlDataLayout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addGroup(pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNis)
                        .addComponent(txtNis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(214, Short.MAX_VALUE)))
        );

        btnCriar.setBackground(new java.awt.Color(51, 51, 51));
        btnCriar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCriar.setForeground(new java.awt.Color(255, 255, 255));
        btnCriar.setText("Criar");
        btnCriar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(51, 51, 51));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
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
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        pnlBackLayout.setVerticalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(pnlData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(btnCriar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed
        String nis = txtNis.getText();
        String nome = txtNome.getText();
        double salario = Double.parseDouble(txtSalario.getText());
        if (nis.isBlank() || nome.isBlank()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }  
        else{
            PastorDAO conexao = new PastorDAO();
            Pastor pastor = new Pastor(nis, nome,Proprietario.getProprietarioSessao().getEmail() ,salario);
            boolean resposta = conexao.criar(pastor);
            if(resposta){
                JOptionPane.showMessageDialog(null, "Pastor criado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();

            }
            else{
                JOptionPane.showMessageDialog(null, "Email ou CPF já em uso!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_btnCriarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
    this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblNis;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlBlack;
    private javax.swing.JPanel pnlData;
    private javax.swing.JTextField txtNis;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
