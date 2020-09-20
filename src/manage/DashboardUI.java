package manage;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Client
 */
public class DashboardUI extends javax.swing.JFrame {
    public DashboardUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mall Management System");
        setMinimumSize(new java.awt.Dimension(1000, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 700));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 81));
        jPanel2.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage/malllogo.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 243, 81);

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        jLabel21.setText("<HTML> <BODY> <FONT COLOR=\"ORANGE\">WELCOME  </FONT> TO  <FONT COLOR=\"ORANGE\"> BIG BAZAAR </FONT>  </BODY> </HTML>");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(441, 19, 341, 37);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1000, 81);

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 40)); // NOI18N
        jLabel2.setText("DASHBOARD OF ADMIN");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(252, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(255, 255, 255))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(20, 100, 960, 70);

        jPanel3.setBackground(new java.awt.Color(255, 204, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Manage Stores");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Manage Restaurant Types");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Manage Store Types");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Manage Offers");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Manage Restaurant");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 180, 260, 300);

        jPanel5.setBackground(new java.awt.Color(255, 204, 0));
        jPanel5.setLayout(null);

        jPanel7.setBackground(new java.awt.Color(0, 0, 255,70));
        jPanel7.setPreferredSize(new java.awt.Dimension(180, 180));
        jPanel7.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Blackadder ITC", 0, 25)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Restaurant Types");
        jPanel7.add(jLabel11);
        jLabel11.setBounds(10, 140, 160, 30);

        jPanel5.add(jPanel7);
        jPanel7.setBounds(250, 30, 180, 180);

        jPanel6.setBackground(new java.awt.Color(0, 0, 255,70));
        jPanel6.setPreferredSize(new java.awt.Dimension(180, 180));
        jPanel6.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Blackadder ITC", 0, 25)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Restaurants");
        jPanel6.add(jLabel10);
        jLabel10.setBounds(40, 140, 107, 31);

        jPanel5.add(jPanel6);
        jPanel6.setBounds(30, 30, 180, 180);

        jPanel8.setBackground(new java.awt.Color(0, 0, 255,70));
        jPanel8.setPreferredSize(new java.awt.Dimension(180, 180));
        jPanel8.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Blackadder ITC", 0, 25)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Offers");
        jPanel8.add(jLabel13);
        jLabel13.setBounds(60, 140, 70, 30);

        jPanel5.add(jPanel8);
        jPanel8.setBounds(470, 30, 180, 180);

        jPanel9.setBackground(new java.awt.Color(0, 0, 255,70));
        jPanel9.setPreferredSize(new java.awt.Dimension(180, 180));
        jPanel9.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Blackadder ITC", 0, 25)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Stores");
        jPanel9.add(jLabel17);
        jLabel17.setBounds(50, 140, 70, 31);

        jPanel5.add(jPanel9);
        jPanel9.setBounds(250, 260, 180, 180);

        jPanel10.setBackground(new java.awt.Color(0, 0, 255,70));
        jPanel10.setPreferredSize(new java.awt.Dimension(180, 180));
        jPanel10.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Blackadder ITC", 0, 25)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Store Types");
        jPanel10.add(jLabel15);
        jLabel15.setBounds(40, 140, 110, 31);

        jPanel5.add(jPanel10);
        jPanel10.setBounds(30, 260, 180, 180);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage/restm1.jpg"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(180, 180));
        jPanel5.add(jLabel3);
        jLabel3.setBounds(30, 30, 180, 180);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage/resttypem.jpg"))); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(180, 180));
        jPanel5.add(jLabel4);
        jLabel4.setBounds(250, 30, 180, 180);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage/offerm2.jpg"))); // NOI18N
        jLabel12.setPreferredSize(new java.awt.Dimension(180, 180));
        jPanel5.add(jLabel12);
        jLabel12.setBounds(470, 30, 180, 180);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage/shoptype.jpg"))); // NOI18N
        jLabel14.setPreferredSize(new java.awt.Dimension(180, 180));
        jPanel5.add(jLabel14);
        jLabel14.setBounds(30, 260, 180, 180);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage/zaram.jpg"))); // NOI18N
        jLabel16.setPreferredSize(new java.awt.Dimension(180, 180));
        jPanel5.add(jLabel16);
        jLabel16.setBounds(250, 260, 180, 180);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage/birdpng.png"))); // NOI18N
        jPanel5.add(jLabel19);
        jLabel19.setBounds(610, 250, 49, 40);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage/futurepng.png"))); // NOI18N
        jPanel5.add(jLabel18);
        jLabel18.setBounds(450, 250, 220, 190);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(290, 180, 690, 470);

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage/logpng.png"))); // NOI18N
        jButton1.setText("logout");
        jButton1.setToolTipText("logout");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(80, 540, 110, 40);

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

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        ManageSUI ms=new ManageSUI();
        ms.setVisible(true);
        ms.pack();
        ms.setLocationRelativeTo(null);
        ms.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setForeground(Color.red);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        ManageRestType rt=new ManageRestType();
        rt.setVisible(true);
        rt.pack();
        rt.setLocationRelativeTo(null);
        rt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setForeground(Color.red);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        ManageUI mg=new ManageUI();
        mg.setVisible(true);
        mg.pack();
        mg.setLocationRelativeTo(null);
        mg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);

    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel7.setForeground(Color.red);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel7.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        ManageOffers mo=new ManageOffers();
        mo.setVisible(true);
        mo.pack();
        mo.setLocationRelativeTo(null);
        mo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        jLabel8.setForeground(Color.red);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        jLabel8.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        ManageRest mrst=new ManageRest();
        mrst.setVisible(true);
        mrst.pack();
        mrst.setLocationRelativeTo(null);
        mrst.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        jLabel9.setForeground(Color.red);
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jLabel9.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jLabel9MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int code=JOptionPane.showConfirmDialog(this,"Are you sure you want to LogOut?","Confirm",JOptionPane.YES_NO_OPTION);
        if(code==JOptionPane.YES_OPTION)
        {
            LoginUI lg=new LoginUI();
            lg.setVisible(true);
            lg.pack();
            lg.setLocationRelativeTo(null);
            lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new Color(102,255,255));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_jButton1MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(DashboardUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
