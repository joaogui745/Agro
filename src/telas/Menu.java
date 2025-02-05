package telas;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBack = new javax.swing.JPanel();
        pnlPrincipal = new javax.swing.JPanel();
        btnEnt0 = new javax.swing.JButton();
        btnEnt1 = new javax.swing.JButton();
        btnEnt2 = new javax.swing.JButton();
        lblEnt0 = new javax.swing.JLabel();
        lblEnt1 = new javax.swing.JLabel();
        lblEnt2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBack.setBackground(new java.awt.Color(0, 0, 0));

        pnlPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        pnlPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEnt0.setBackground(new java.awt.Color(102, 102, 102));
        btnEnt0.setForeground(new java.awt.Color(255, 255, 255));
        btnEnt0.setText("ENT");
        btnEnt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnt0ActionPerformed(evt);
            }
        });

        btnEnt1.setBackground(new java.awt.Color(102, 102, 102));
        btnEnt1.setForeground(new java.awt.Color(255, 255, 255));
        btnEnt1.setText("ENT");

        btnEnt2.setBackground(new java.awt.Color(102, 102, 102));
        btnEnt2.setForeground(new java.awt.Color(255, 255, 255));
        btnEnt2.setText("ENT");

        lblEnt0.setForeground(new java.awt.Color(255, 255, 255));
        lblEnt0.setText("Entidade 0");

        lblEnt1.setForeground(new java.awt.Color(255, 255, 255));
        lblEnt1.setText("Entidade 1");

        lblEnt2.setForeground(new java.awt.Color(255, 255, 255));
        lblEnt2.setText("Entidade 2");

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblEnt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblEnt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEnt0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEnt0, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEnt1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEnt2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(97, 97, 97))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnt0)
                    .addComponent(lblEnt0))
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnt1)
                    .addComponent(lblEnt1))
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnt2)
                    .addComponent(lblEnt2))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlBackLayout = new javax.swing.GroupLayout(pnlBack);
        pnlBack.setLayout(pnlBackLayout);
        pnlBackLayout.setHorizontalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBackLayout.setVerticalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnt0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnt0ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnt0;
    private javax.swing.JButton btnEnt1;
    private javax.swing.JButton btnEnt2;
    private javax.swing.JLabel lblEnt0;
    private javax.swing.JLabel lblEnt1;
    private javax.swing.JLabel lblEnt2;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
