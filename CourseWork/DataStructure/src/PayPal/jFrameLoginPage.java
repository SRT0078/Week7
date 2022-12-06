/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PayPal;

import javax.swing.JOptionPane;
import java.util.Random;
//import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class jFrameLoginPage extends javax.swing.JFrame {   

    private static String username;
    private static String userpassword;
    private static int ages;
    private static String gender;
    private static String address;
    private static String dob;
    //boolean regist = false;
    
    public jFrameLoginPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField_username = new javax.swing.JTextField();
        jTextField_password = new javax.swing.JTextField();
        jCheckBox = new javax.swing.JCheckBox();
        jBtn_login = new javax.swing.JButton();
        jBtn_singup = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(50, 50, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), null));
        jPanel1.setFocusable(false);

        jTextField_username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_username.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Username/Number/Email", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jTextField_password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_password.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jCheckBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBox.setText(" Check Box");
        jCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jBtn_login.setBackground(new java.awt.Color(51, 51, 255));
        jBtn_login.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jBtn_login.setForeground(new java.awt.Color(255, 255, 255));
        jBtn_login.setText("Log In");
        jBtn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_loginActionPerformed(evt);
            }
        });

        jBtn_singup.setBackground(new java.awt.Color(51, 51, 255));
        jBtn_singup.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jBtn_singup.setForeground(new java.awt.Color(255, 255, 255));
        jBtn_singup.setText("Sing Up");
        jBtn_singup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_singupActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Documents\\Apache NetBeans\\CourseWork\\Image\\paypal logo.png")); // NOI18N

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("****************************            Create a new account                  ***************************");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jBtn_singup, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                                .addComponent(jBtn_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jBtn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jBtn_singup, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //this is the action events of the login page's ok button
    private void jBtn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_loginActionPerformed
        // check the input jtextfield is empty or not and show the message dailog
        if (jTextField_username.getText().isEmpty() && jTextField_password.getText().isEmpty() || jCheckBox.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "The field is empty!!");
        }else if(jTextField_username.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "The username is empty!");
        }else if(jTextField_password.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "The password is empty!");
        }else{
            // using the try catch and find the exception
            try{
                
//                Random random = new Random();
//                int num = random.nextInt();
//                while(100>num && num>15){
//                    if (num>15 && num<100) {
//                        ages = num;
//                        address = "USA";
//                        break;
//                    }
//                }
                
                username = jTextField_username.getText();
                userpassword = jTextField_password.getText();
                
                //display the new users details
                JOptionPane.showMessageDialog(rootPane, "Username: "+username+"\nPassword: "+userpassword+"\nAges: "+ages+"\nGender: "+gender+"\nAddress: "+address+"\nDateOfBirth: "+dob);
                
                
                // set the boolean variable's values
                //this.regist = true;
                jFrameHomePage homepage = new jFrameHomePage();
                homepage.setVisible(true);
                dispose();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(rootPane, "Enter the valid input!");
            }
            //JOptionPane.showMessageDialog(rootPane, "Enter the login button");
        }

//       if(regist==true){
//            //create an object and to the next page
//            NewJFrame jf = new NewJFrame();
//            dispose();
//            jf.setVisible(true);
//        }else{
//            JOptionPane.showMessageDialog(rootPane, "Please register first");
//        }
    }//GEN-LAST:event_jBtn_loginActionPerformed

    //stre the values of ArrayList
    private void jBtn_singupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_singupActionPerformed

        jFrameNewAccount newaccountpage = new jFrameNewAccount();
        newaccountpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtn_singupActionPerformed

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
            java.util.logging.Logger.getLogger(jFrameLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrameLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrameLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrameLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrameLoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_login;
    private javax.swing.JButton jBtn_singup;
    private javax.swing.JCheckBox jCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_password;
    private javax.swing.JTextField jTextField_username;
    // End of variables declaration//GEN-END:variables
}
