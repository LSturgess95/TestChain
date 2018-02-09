/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testchain;

/**
 *
 * @author lukes
 */
public class HackyUI extends javax.swing.JFrame {
    TestChain TC;
    public HackyUI() {
        initComponents();
        this.TC = new TestChain();
        this.setResizable(false);
    }
    
    public void updateConsole(String text){
         ConsoleText.setText(ConsoleText.getText()+ "\n" + text);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ConsoleText = new javax.swing.JTextArea();
        UpdateWalletAFunds = new javax.swing.JButton();
        WalletAFunds = new javax.swing.JTextField();
        UpdateWalletBFunds1 = new javax.swing.JButton();
        WalletBFunds = new javax.swing.JTextField();
        WalletA = new javax.swing.JLabel();
        WalletB = new javax.swing.JLabel();
        createGenesisBlock = new javax.swing.JButton();
        createNewBlock = new javax.swing.JButton();
        viewBlockchain = new javax.swing.JButton();
        theDifficultyText = new javax.swing.JTextField();
        SetDifficultyButton = new javax.swing.JButton();
        AtoB = new javax.swing.JButton();
        BtoA = new javax.swing.JButton();
        transferAmount = new javax.swing.JTextField();
        viewRecentBlock = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));

        ConsoleText.setColumns(20);
        ConsoleText.setRows(5);
        jScrollPane1.setViewportView(ConsoleText);

        UpdateWalletAFunds.setText("Update Funds");
        UpdateWalletAFunds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateWalletAFundsActionPerformed(evt);
            }
        });

        WalletAFunds.setText("0");

        UpdateWalletBFunds1.setText("Update Funds");
        UpdateWalletBFunds1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateWalletBFunds1ActionPerformed(evt);
            }
        });

        WalletBFunds.setText("0");

        WalletA.setText("WalletB");

        WalletB.setText("WalletA");

        createGenesisBlock.setText("Create Genesis Block");
        createGenesisBlock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createGenesisBlockActionPerformed(evt);
            }
        });

        createNewBlock.setText("Create New Block");
        createNewBlock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewBlockActionPerformed(evt);
            }
        });

        viewBlockchain.setText("View BlockChain");
        viewBlockchain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBlockchainActionPerformed(evt);
            }
        });

        theDifficultyText.setText("0");

        SetDifficultyButton.setText("Set Difficulty");
        SetDifficultyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetDifficultyButtonActionPerformed(evt);
            }
        });

        AtoB.setText("Transfer A -> B");
        AtoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtoBActionPerformed(evt);
            }
        });

        BtoA.setText("Transfer B -> A");
        BtoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoAActionPerformed(evt);
            }
        });

        transferAmount.setText("0");

        viewRecentBlock.setText("View Most Recent Block");
        viewRecentBlock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRecentBlockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(WalletB)
                        .addGap(99, 99, 99)
                        .addComponent(WalletA))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(WalletAFunds, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(UpdateWalletAFunds, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UpdateWalletBFunds1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(WalletBFunds, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AtoB, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtoA, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(transferAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(theDifficultyText, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SetDifficultyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)))
                        .addComponent(createGenesisBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(createNewBlock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(viewRecentBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewBlockchain, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createGenesisBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(theDifficultyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(SetDifficultyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(createNewBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewBlockchain, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewRecentBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WalletA)
                            .addComponent(WalletB))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WalletAFunds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WalletBFunds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UpdateWalletAFunds, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpdateWalletBFunds1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AtoB, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtoA, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transferAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateWalletAFundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateWalletAFundsActionPerformed
        float funds = 0;
        funds = TC.getWalletBalance(0);
        String toShow = String.valueOf(funds);
        WalletAFunds.setText(toShow);
        updateConsole("Updating Wallet A");
    }//GEN-LAST:event_UpdateWalletAFundsActionPerformed

    private void UpdateWalletBFunds1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateWalletBFunds1ActionPerformed
        float funds = 0;
        funds = TC.getWalletBalance(1);
        String toShow = String.valueOf(funds);
        WalletBFunds.setText(toShow);
        updateConsole("Updating Wallet B");
    }//GEN-LAST:event_UpdateWalletBFunds1ActionPerformed

    private void createGenesisBlockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createGenesisBlockActionPerformed
        TC.generateGenesisBlock();
        updateConsole("Creating and mining genesis block...");
        
        float funds = 0;
        funds = TC.getWalletBalance(0);
        String toShow = String.valueOf(funds);
        WalletAFunds.setText(toShow);
        updateConsole("Genesis block created and mined");
    }//GEN-LAST:event_createGenesisBlockActionPerformed

    private void createNewBlockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewBlockActionPerformed
        TC.createNewBlock();
        updateConsole("New Block Created");
    }//GEN-LAST:event_createNewBlockActionPerformed

    private void viewBlockchainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBlockchainActionPerformed
        String toUpdate = TC.ViewBlockchain();
        updateConsole(toUpdate);
    }//GEN-LAST:event_viewBlockchainActionPerformed

    private void SetDifficultyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetDifficultyButtonActionPerformed
        String difficultyString = theDifficultyText.getText();
        int difficulty = Integer.valueOf(difficultyString);
        TC.setDifficulty(difficulty);
        int updatedDifficulty =TC.getDifficulty();
        updateConsole("Difficulty has been set to: " + updatedDifficulty);
    }//GEN-LAST:event_SetDifficultyButtonActionPerformed

    private void AtoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtoBActionPerformed
        TC.sendFunds(0, 1, Float.valueOf(transferAmount.getText()));
        updateConsole("Sending " + transferAmount.getText() + " from wallet A to wallet B");
    }//GEN-LAST:event_AtoBActionPerformed

    private void BtoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoAActionPerformed
        TC.sendFunds(1, 0, Float.valueOf(transferAmount.getText()));
        updateConsole("Sending " + transferAmount.getText() + " from wallet B to wallet A");
    }//GEN-LAST:event_BtoAActionPerformed

    private void viewRecentBlockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRecentBlockActionPerformed
       String toUpdate = TC.ViewLastBlock();
       updateConsole(toUpdate);
    }//GEN-LAST:event_viewRecentBlockActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HackyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HackyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HackyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HackyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HackyUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtoB;
    private javax.swing.JButton BtoA;
    private javax.swing.JTextArea ConsoleText;
    private javax.swing.JButton SetDifficultyButton;
    private javax.swing.JButton UpdateWalletAFunds;
    private javax.swing.JButton UpdateWalletBFunds1;
    private javax.swing.JLabel WalletA;
    private javax.swing.JTextField WalletAFunds;
    private javax.swing.JLabel WalletB;
    private javax.swing.JTextField WalletBFunds;
    private javax.swing.JButton createGenesisBlock;
    private javax.swing.JButton createNewBlock;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField theDifficultyText;
    private javax.swing.JTextField transferAmount;
    private javax.swing.JButton viewBlockchain;
    private javax.swing.JButton viewRecentBlock;
    // End of variables declaration//GEN-END:variables
}
