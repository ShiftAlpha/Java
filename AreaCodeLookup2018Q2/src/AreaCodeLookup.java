
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class AreaCodeLookup extends javax.swing.JFrame {

    /**
     * Creates new form AreaCodeLookup
     */
    public AreaCodeLookup() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("AREA CODE LOOKUP");

        jLabel2.setText("Select Country");

        jLabel3.setText("Select Town");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select", "South Africa", "United Kingdom" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Item to Lookup");

        jRadioButton1.setText("Phone Code");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Postal Code");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBox1, 0, 185, Short.MAX_VALUE)
                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRadioButton1))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton1))
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        jComboBox1.getSelectedItem();
        System.out.println(jComboBox1.getSelectedItem()); // checks which country you have selected

        if (jComboBox1.getSelectedItem().equals("South Africa")) {
            jComboBox2.removeAllItems();

            jComboBox2.addItem("Please Select");
            jComboBox2.addItem(city1);
            jComboBox2.addItem(city2);
            jComboBox2.addItem(city3);
        } else if (jComboBox1.getSelectedItem().equals("United Kingdom")) {
            jComboBox2.removeAllItems();

            jComboBox2.addItem("Please Select");
            jComboBox2.addItem(city4);
            jComboBox2.addItem(city5);
            jComboBox2.addItem(city6);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

        ButtonGroup bg = new ButtonGroup();

        bg.add(jRadioButton1);
        bg.add(jRadioButton2);


    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        ButtonGroup bg = new ButtonGroup();

        bg.add(jRadioButton1);
        bg.add(jRadioButton2);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        if(jComboBox1.getSelectedItem().equals("South Africa") && jComboBox2.getSelectedItem().equals("Durban") && jRadioButton1.isSelected())
        {
            JOptionPane.showMessageDialog(null, "Phone Code for " + jComboBox2.getSelectedItem() + " in " + jComboBox1.getSelectedItem() + " is 031 ");
        }
        else if(jComboBox1.getSelectedItem().equals("South Africa") && jComboBox2.getSelectedItem().equals("Durban") && jRadioButton2.isSelected())
        {
            JOptionPane.showMessageDialog(null, "Postal Code for " + jComboBox2.getSelectedItem() + " in " + jComboBox1.getSelectedItem() + " is 4000 ");
        }
        
        else if(jComboBox1.getSelectedItem().equals("South Africa") && jComboBox2.getSelectedItem().equals("Cape Town") && jRadioButton1.isSelected())
        {
            JOptionPane.showMessageDialog(null, "Phone Code for " + jComboBox2.getSelectedItem() + " in " + jComboBox1.getSelectedItem() + " is 021 ");
        }
        else if(jComboBox1.getSelectedItem().equals("South Africa") && jComboBox2.getSelectedItem().equals("Cape Town") && jRadioButton2.isSelected())
        {
            JOptionPane.showMessageDialog(null, "Postal Code for " + jComboBox2.getSelectedItem() + " in " + jComboBox1.getSelectedItem() + " is 8000 ");
        }
        
        else if(jComboBox1.getSelectedItem().equals("South Africa") && jComboBox2.getSelectedItem().equals("Johannesburg") && jRadioButton1.isSelected())
        {
            JOptionPane.showMessageDialog(null, "Phone Code for " + jComboBox2.getSelectedItem() + " in " + jComboBox1.getSelectedItem() + " is 011 ");
        }
        else if(jComboBox1.getSelectedItem().equals("South Africa") && jComboBox2.getSelectedItem().equals("Johannesburg") && jRadioButton2.isSelected())
        {
            JOptionPane.showMessageDialog(null, "Postal Code for " + jComboBox2.getSelectedItem() + " in " + jComboBox1.getSelectedItem() + " is 2000 ");
        }
        
        else if(jComboBox1.getSelectedItem().equals("United Kingdom") && jComboBox2.getSelectedItem().equals("London") && jRadioButton1.isSelected())
        {
            JOptionPane.showMessageDialog(null, "Phone Code for " + jComboBox2.getSelectedItem() + " in " + jComboBox1.getSelectedItem() + " is 020 ");
        }
        else if(jComboBox1.getSelectedItem().equals("United Kingdom") && jComboBox2.getSelectedItem().equals("London") && jRadioButton2.isSelected())
        {
            JOptionPane.showMessageDialog(null, "Postal Code for " + jComboBox2.getSelectedItem() + " in " + jComboBox1.getSelectedItem() + " is WC2N5DU ");
        }
        
        else if(jComboBox1.getSelectedItem().equals("United Kingdom") && jComboBox2.getSelectedItem().equals("Oxford") && jRadioButton1.isSelected())
        {
            JOptionPane.showMessageDialog(null, "Phone Code for " + jComboBox2.getSelectedItem() + " in " + jComboBox1.getSelectedItem() + " is 01865 ");
        }
        else if(jComboBox1.getSelectedItem().equals("United Kingdom") && jComboBox2.getSelectedItem().equals("Oxford") && jRadioButton2.isSelected())
        {
            JOptionPane.showMessageDialog(null, "Postal Code for " + jComboBox2.getSelectedItem() + " in " + jComboBox1.getSelectedItem() + " is OX13PN ");
        }
        
        else if(jComboBox1.getSelectedItem().equals("United Kingdom") && jComboBox2.getSelectedItem().equals("Southampton") && jRadioButton1.isSelected())
        {
            JOptionPane.showMessageDialog(null, "Phone Code for " + jComboBox2.getSelectedItem() + " in " + jComboBox1.getSelectedItem() + " is 023 ");
        }
        else if(jComboBox1.getSelectedItem().equals("United Kingdom") && jComboBox2.getSelectedItem().equals("Southampton") && jRadioButton2.isSelected())
        {
            JOptionPane.showMessageDialog(null, "Postal Code for " + jComboBox2.getSelectedItem() + " in " + jComboBox1.getSelectedItem() + " is SO147DW ");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(AreaCodeLookup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AreaCodeLookup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AreaCodeLookup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AreaCodeLookup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AreaCodeLookup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
    private String city1 = "Durban";
    private String city2 = "Johannesburg";
    private String city3 = "Cape Town";
    private String city4 = "London";
    private String city5 = "Southampton";
    private String city6 = "Oxford";
}
