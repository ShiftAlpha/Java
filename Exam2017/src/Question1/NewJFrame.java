/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import javax.swing.JOptionPane;

/**
 *
 * @author ranad
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        cNameLbl = new javax.swing.JLabel();
        eAmtLbl = new javax.swing.JLabel();
        TypeLbl = new javax.swing.JLabel();
        TermLbl = new javax.swing.JLabel();
        cNameTxt = new javax.swing.JTextField();
        AmtTxt = new javax.swing.JTextField();
        TypeCBx = new javax.swing.JComboBox<>();
        FiveYrRBtn = new javax.swing.JRadioButton();
        TenYrRBtn = new javax.swing.JRadioButton();
        FifteenYrRBtn = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("investment calciulator");

        cNameLbl.setText("Customer Name:");

        eAmtLbl.setText("Enter Amount:");

        TypeLbl.setText("Select Type: ");

        TermLbl.setText("Select Term");

        AmtTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmtTxtActionPerformed(evt);
            }
        });

        TypeCBx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Moderate", "Aggressive" }));
        TypeCBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeCBxActionPerformed(evt);
            }
        });

        buttonGroup1.add(FiveYrRBtn);
        FiveYrRBtn.setText("5 Years");

        buttonGroup1.add(TenYrRBtn);
        TenYrRBtn.setText("10 Years");

        buttonGroup1.add(FifteenYrRBtn);
        FifteenYrRBtn.setText("15 Years");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cNameLbl)
                            .addComponent(eAmtLbl)
                            .addComponent(TypeLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TypeCBx, 0, 105, Short.MAX_VALUE)
                            .addComponent(AmtTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cNameTxt, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TermLbl)
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TenYrRBtn)
                            .addComponent(FiveYrRBtn)
                            .addComponent(FifteenYrRBtn))))
                .addGap(0, 186, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cNameLbl)
                    .addComponent(cNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eAmtLbl)
                    .addComponent(AmtTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TypeLbl)
                    .addComponent(TypeCBx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TermLbl)
                    .addComponent(FiveYrRBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TenYrRBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FifteenYrRBtn)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tools");

        jMenuItem2.setText("Calculate");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        String cName = cNameTxt.getSelectedText();
        double amount = Double.parseDouble(AmtTxt.getText());
        String type = TypeCBx.getSelectedItem() + "";
        int years = 0;
        double total = 0;

        if (type.equals("Moderate")) {
            if (FiveYrRBtn.isSelected()) {
                years = 5;
                total = amount * Math.pow(1 + 0.10, 5);
                JOptionPane.showMessageDialog(null, "investement report\n\n CUSTOMER NAME: " + cName + "\n ORIGINAL AMOUNT: " + amount + "\nYEARS INVESTED: " + years + "\nFINAL AMOUNT: " + total);
            }
            if (TenYrRBtn.isSelected()) {
                years = 10;
                total = amount * Math.pow(1 + 0.10, 10);
                JOptionPane.showMessageDialog(null, "investement report\n\n CUSTOMER NAME: " + cName + "\n ORIGINAL AMOUNT: " + amount + "\nYEARS INVESTED: " + years + "\nFINAL AMOUNT: " + total);

            }
            if (FifteenYrRBtn.isSelected()) {
                years = 15;
                total = amount * Math.pow(1 + 0.10, 15);
                JOptionPane.showMessageDialog(null, "investement report\n\n CUSTOMER NAME: " + cName + "\n ORIGINAL AMOUNT: " + amount + "\nYEARS INVESTED: " + years + "\nFINAL AMOUNT: " + total);

            }
        } else {
            if (FiveYrRBtn.isSelected()) {
                years = 5;
                total = amount * Math.pow(1 + 0.15, 5);
                JOptionPane.showMessageDialog(null, "investement report\n\n CUSTOMER NAME: " + cName + "\n ORIGINAL AMOUNT: " + amount + "\nYEARS INVESTED: " + years + "\nFINAL AMOUNT: " + total);
            }
            if (TenYrRBtn.isSelected()) {
                years = 10;
                total = amount * Math.pow(1 + 0.15, 10);
                JOptionPane.showMessageDialog(null, "investement report\n\n CUSTOMER NAME: " + cName + "\n ORIGINAL AMOUNT: " + amount + "\nYEARS INVESTED: " + years + "\nFINAL AMOUNT: " + total);
            }
            if (FifteenYrRBtn.isSelected()) {
                years = 15;
                total = amount * Math.pow(1 + 0.15, 15);
                JOptionPane.showMessageDialog(null, "investement report\n\n CUSTOMER NAME: " + cName + "\n ORIGINAL AMOUNT: " + amount + "\nYEARS INVESTED: " + years + "\nFINAL AMOUNT: " + total);
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void AmtTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmtTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmtTxtActionPerformed

    private void TypeCBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeCBxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypeCBxActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmtTxt;
    private javax.swing.JRadioButton FifteenYrRBtn;
    private javax.swing.JRadioButton FiveYrRBtn;
    private javax.swing.JRadioButton TenYrRBtn;
    private javax.swing.JLabel TermLbl;
    private javax.swing.JComboBox<String> TypeCBx;
    private javax.swing.JLabel TypeLbl;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cNameLbl;
    private javax.swing.JTextField cNameTxt;
    private javax.swing.JLabel eAmtLbl;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
