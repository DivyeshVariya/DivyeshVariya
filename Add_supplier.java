/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocks;

import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Add_supplier extends javax.swing.JFrame {

    /**
     * Creates new form Add_supplier
     */
    public Add_supplier() {
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

        sply_panel_1 = new javax.swing.JPanel();
        sply_lbl_title = new javax.swing.JLabel();
        sply_btn_dashbrd = new javax.swing.JButton();
        sply_panel_2 = new javax.swing.JPanel();
        sply_lbl_name = new javax.swing.JLabel();
        sply_lbl_ID = new javax.swing.JLabel();
        sply_lbl_mob = new javax.swing.JLabel();
        sply_lbl_email = new javax.swing.JLabel();
        sply_lbl_category = new javax.swing.JLabel();
        sply_lbl_address = new javax.swing.JLabel();
        sply_txt_id = new javax.swing.JTextField();
        sply_txt_name = new javax.swing.JTextField();
        sply_txt_mob = new javax.swing.JTextField();
        sply_txt_email = new javax.swing.JTextField();
        sply_dropdown_category = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        sply_txta_address = new javax.swing.JTextArea();
        sply_btn_add = new javax.swing.JButton();
        sply_btn_edit = new javax.swing.JButton();
        sply_btn_reset = new javax.swing.JButton();
        sply_btn_delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Supplier Entry");
        setName("sply_frame"); // NOI18N
        setResizable(false);

        sply_panel_1.setBackground(new java.awt.Color(255, 255, 153));
        sply_panel_1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 0), 2, true));
        sply_panel_1.setName("sply_panel_1"); // NOI18N

        sply_lbl_title.setBackground(new java.awt.Color(0, 0, 102));
        sply_lbl_title.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        sply_lbl_title.setText("Supplier entry");
        sply_lbl_title.setName("sply_lbl_title"); // NOI18N

        sply_btn_dashbrd.setBackground(new java.awt.Color(255, 204, 51));
        sply_btn_dashbrd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sply_btn_dashbrd.setText("Dashboard");
        sply_btn_dashbrd.setName("sply_btn_dashbrd"); // NOI18N
        sply_btn_dashbrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sply_btn_dashbrdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sply_panel_1Layout = new javax.swing.GroupLayout(sply_panel_1);
        sply_panel_1.setLayout(sply_panel_1Layout);
        sply_panel_1Layout.setHorizontalGroup(
            sply_panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sply_panel_1Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(sply_lbl_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sply_btn_dashbrd)
                .addContainerGap())
        );
        sply_panel_1Layout.setVerticalGroup(
            sply_panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sply_panel_1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(sply_lbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sply_panel_1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sply_btn_dashbrd)
                .addGap(21, 21, 21))
        );

        sply_panel_2.setBackground(new java.awt.Color(255, 255, 204));
        sply_panel_2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 0), new java.awt.Color(255, 204, 0), new java.awt.Color(204, 255, 0), new java.awt.Color(255, 255, 0)));
        sply_panel_2.setName("sply_panel_2"); // NOI18N

        sply_lbl_name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sply_lbl_name.setText("Supplier Name");
        sply_lbl_name.setName("sply_lbl_name"); // NOI18N

        sply_lbl_ID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sply_lbl_ID.setText("Supplier ID");
        sply_lbl_ID.setName("sply_lbl_ID"); // NOI18N

        sply_lbl_mob.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sply_lbl_mob.setText("Mobile No");
        sply_lbl_mob.setName("sply_lbl_mob"); // NOI18N

        sply_lbl_email.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sply_lbl_email.setText("Email");
        sply_lbl_email.setName("sply_lbl_email"); // NOI18N

        sply_lbl_category.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sply_lbl_category.setText("Category");
        sply_lbl_category.setName("sply_lbl_category"); // NOI18N

        sply_lbl_address.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sply_lbl_address.setText("Address");
        sply_lbl_address.setName("sply_lbl_address"); // NOI18N

        sply_txt_id.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sply_txt_id.setName("sply_txt_id"); // NOI18N

        sply_txt_name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sply_txt_name.setName("sply_txt_name"); // NOI18N

        sply_txt_mob.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sply_txt_mob.setName("sply_txt_mob"); // NOI18N

        sply_txt_email.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sply_txt_email.setName("sply_txt_email"); // NOI18N

        sply_dropdown_category.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sply_dropdown_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Undefined", "Electronics", "Grocery", "Pharmacy", "Medical", "Instrument", "others" }));
        sply_dropdown_category.setName("sply_dropdown_category"); // NOI18N

        sply_txta_address.setColumns(20);
        sply_txta_address.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        sply_txta_address.setRows(5);
        sply_txta_address.setName("sply_txta_address"); // NOI18N
        jScrollPane1.setViewportView(sply_txta_address);

        sply_btn_add.setBackground(new java.awt.Color(255, 204, 51));
        sply_btn_add.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sply_btn_add.setText("Add supplier");
        sply_btn_add.setName("sply_btn_add"); // NOI18N
        sply_btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sply_btn_addActionPerformed(evt);
            }
        });

        sply_btn_edit.setBackground(new java.awt.Color(255, 204, 51));
        sply_btn_edit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sply_btn_edit.setText("Edit");
        sply_btn_edit.setName("sply_btn_edit"); // NOI18N

        sply_btn_reset.setBackground(new java.awt.Color(255, 204, 51));
        sply_btn_reset.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sply_btn_reset.setText("Reset");
        sply_btn_reset.setName("sply_btn_reset"); // NOI18N

        sply_btn_delete.setBackground(new java.awt.Color(255, 204, 51));
        sply_btn_delete.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sply_btn_delete.setText("Delete");
        sply_btn_delete.setName("sply_btn_delete"); // NOI18N

        javax.swing.GroupLayout sply_panel_2Layout = new javax.swing.GroupLayout(sply_panel_2);
        sply_panel_2.setLayout(sply_panel_2Layout);
        sply_panel_2Layout.setHorizontalGroup(
            sply_panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sply_panel_2Layout.createSequentialGroup()
                .addGroup(sply_panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sply_panel_2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(sply_panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(sply_panel_2Layout.createSequentialGroup()
                                .addComponent(sply_lbl_ID)
                                .addGap(63, 63, 63)
                                .addComponent(sply_txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sply_panel_2Layout.createSequentialGroup()
                                .addGroup(sply_panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sply_lbl_name)
                                    .addComponent(sply_lbl_mob))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(sply_panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sply_txt_name)
                                    .addComponent(sply_txt_mob, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))))
                        .addGap(167, 167, 167)
                        .addGroup(sply_panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sply_lbl_email)
                            .addComponent(sply_lbl_category)
                            .addComponent(sply_lbl_address)))
                    .addGroup(sply_panel_2Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(sply_btn_add)
                        .addGap(74, 74, 74)
                        .addComponent(sply_btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(sply_btn_delete)))
                .addGroup(sply_panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sply_panel_2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(sply_panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(sply_panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sply_dropdown_category, 0, 118, Short.MAX_VALUE)
                                .addComponent(sply_txt_email)))
                        .addContainerGap(69, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sply_panel_2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sply_btn_reset)
                        .addGap(144, 144, 144))))
        );
        sply_panel_2Layout.setVerticalGroup(
            sply_panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sply_panel_2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(sply_panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sply_lbl_ID)
                    .addComponent(sply_lbl_email)
                    .addComponent(sply_txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sply_txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(sply_panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sply_lbl_name)
                    .addComponent(sply_lbl_category)
                    .addComponent(sply_txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sply_dropdown_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(sply_panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sply_panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sply_lbl_mob)
                        .addComponent(sply_txt_mob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sply_lbl_address))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(sply_panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sply_panel_2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(sply_panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sply_btn_add)
                            .addComponent(sply_btn_edit)
                            .addComponent(sply_btn_delete))
                        .addGap(31, 31, 31))
                    .addGroup(sply_panel_2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(sply_btn_reset)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        sply_txt_id.getAccessibleContext().setAccessibleName("");
        sply_txt_email.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sply_panel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sply_panel_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sply_panel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sply_panel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        sply_panel_1.getAccessibleContext().setAccessibleName("supplier panel 1");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sply_btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sply_btn_addActionPerformed
        // TODO add your handling code here:

        //Add button
        String[] sply_arr = new String[7];
       
        String sply_id = sply_txt_id.getText();
        String sply_name = sply_txt_name.getText();
        String sply_mob = sply_txt_mob.getText();
        String sply_email = sply_txt_email.getText();
        Object[] sply_category = sply_dropdown_category.getSelectedObjects();
        //String sply_category = sply_dropdown_category.getSelectedItem()
        String sply_address = sply_txta_address.getText();

        sply_arr[0] = sply_id;
        sply_arr[1] = sply_name;
        sply_arr[2] = sply_mob;
        sply_arr[3] = sply_email;
        //sply_arr[4] = String.valueOf(sply_category);
        sply_arr[5] = sply_address;
        sply_arr[6] = "\n Records inserted successfully";
        
        
        JOptionPane.showMessageDialog(this, sply_arr);


    }//GEN-LAST:event_sply_btn_addActionPerformed

    private void sply_btn_dashbrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sply_btn_dashbrdActionPerformed
        // TODO add your handling code here:
        dashboard obj = new dashboard();
        obj.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_sply_btn_dashbrdActionPerformed

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
            java.util.logging.Logger.getLogger(Add_supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_supplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sply_btn_add;
    private javax.swing.JButton sply_btn_dashbrd;
    private javax.swing.JButton sply_btn_delete;
    private javax.swing.JButton sply_btn_edit;
    private javax.swing.JButton sply_btn_reset;
    private javax.swing.JComboBox<String> sply_dropdown_category;
    private javax.swing.JLabel sply_lbl_ID;
    private javax.swing.JLabel sply_lbl_address;
    private javax.swing.JLabel sply_lbl_category;
    private javax.swing.JLabel sply_lbl_email;
    private javax.swing.JLabel sply_lbl_mob;
    private javax.swing.JLabel sply_lbl_name;
    private javax.swing.JLabel sply_lbl_title;
    private javax.swing.JPanel sply_panel_1;
    private javax.swing.JPanel sply_panel_2;
    private javax.swing.JTextField sply_txt_email;
    public javax.swing.JTextField sply_txt_id;
    private javax.swing.JTextField sply_txt_mob;
    private javax.swing.JTextField sply_txt_name;
    private javax.swing.JTextArea sply_txta_address;
    // End of variables declaration//GEN-END:variables
}
