package manage;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class LoginUI extends javax.swing.JFrame {
    public LoginUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
         try
        {
                Connection con = MyConnection.getConnection();
                String cr="create table SIGNUP(FIRSTNAME VARCHAR2(20) NOT NULL, LASTNAME VARCHAR2(20) NOT NULL, USERNAME VARCHAR2(20) PRIMARY KEY, EMAIL VARCHAR2(25) UNIQUE not null, PASSWORD VARCHAR2(15) NOT NULL, MOBILE NUMBER(12) unique not null, DATEOFBIRTH DATE NOT NULL, GENDER VARCHAR2(8) NOT NULL)";
                PreparedStatement ps=con.prepareStatement(cr);
                if(ps.executeUpdate()>0)
                {
                    System.out.println("table created successfully");
                }
        }
        catch(SQLException e)
        {
           // System.out.println();
        }
        try
        {
                Connection con = MyConnection.getConnection();
                String cr="create table StoreType(Store_ID number primary key, Store_name varchar2(30) not null, Description varchar2(30) not null)";
                PreparedStatement ps=con.prepareStatement(cr);
                if(ps.executeUpdate()>0)
                {
                    System.out.println("table created successfully");
                }
        }
        catch(SQLException e)
        {
           // System.out.println();
        }
        try
        {
                Connection con = MyConnection.getConnection(); 
                String cr="create table stores(store_name varchar2(60) not null, description varchar2(60) not null, Floor varchar2(20) not null, Timing varchar2(20) not null, logo blob not null, image blob not null)";
                PreparedStatement ps=con.prepareStatement(cr);
                if(ps.executeUpdate()>0)
                {
                    System.out.println("table created successfully");
                }
        }
        catch(SQLException e)
        {
           // System.out.println();
        }
        try
        {
                Connection con = MyConnection.getConnection();
                String cr="create table offers(S_No Number primary key, Offer_Title varchar2(60) not null, Description varchar2(100) not null, Offer_validity date not null, SHOP_NO VARCHAR2(20) NOT NULL, SHOP_NAME VARCHAR2(30) NOT NULL)";
                PreparedStatement ps=con.prepareStatement(cr);
                if(ps.executeUpdate()>0)
                {
                    System.out.println("table created successfully");
                }
        }
        catch(SQLException e)
        {
           // System.out.println();
        }
        try
        {
                Connection con = MyConnection.getConnection();
                String cr="create table RestType(RestType_ID number unique not null, RestType_name varchar2(40) not null, Description varchar2(40) not null)";
                PreparedStatement ps=con.prepareStatement(cr);
                if(ps.executeUpdate()>0)
                {
                    System.out.println("table created successfully");
                }
        }
        catch(SQLException e)
        {
           // System.out.println();
        }
        try
        {
                Connection con = MyConnection.getConnection();
                String cr="create table Restaurants(Restaurant_name varchar2(40) not null, Description varchar2(40) not null, Floor varchar2(20) not null, Timing varchar2(20) not null, logo Blob not null, image Blob not null)";
                PreparedStatement ps=con.prepareStatement(cr);
                if(ps.executeUpdate()>0)
                {
                    System.out.println("table created successfully");
                }
        }
        catch(SQLException e)
        {
           // System.out.println();
        }
         try
        {
                Connection con = MyConnection.getConnection();
                String cr="create table KEEPSIGN(FIRSTNAME VARCHAR2(20) NOT NULL, LASTNAME VARCHAR2(20) NOT NULL, USERNAME VARCHAR2(20) unique not null, PASSWORD VARCHAR2(15) NOT NULL, CONFIRMPASS VARCHAR2(15) NOT NULL, SHOPNAME VARCHAR2(30) NOT NULL, SHOP_NO VARCHAR2(10) NOT NULL, EMAIL VARCHAR2(25) UNIQUE not null, MOBILE NUMBER(12) unique not null, GENDER VARCHAR2(8) NOT NULL)";
                PreparedStatement ps=con.prepareStatement(cr);
                if(ps.executeUpdate()>0)
                {
                    System.out.println("table created successfully");
                }
        }
        catch(SQLException e)
        {
           // System.out.println();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        juser = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jpass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        hideicon = new javax.swing.JLabel();
        showicon = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        box = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mall Management System");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(715, 450));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 450));
        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage/adminlm.png"))); // NOI18N
        jLabel1.setToolTipText("admin");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(90, 150, 132, 130);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage/16.png"))); // NOI18N
        jLabel3.setToolTipText("Info");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3);
        jLabel3.setBounds(50, 20, 32, 32);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage/18.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 20, 32, 30);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Admin");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(100, 290, 140, 60);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 330, 450);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)), "Login", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 40), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel3.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("user name");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(30, 60, 80, 20);

        juser.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        juser.setForeground(new java.awt.Color(153, 153, 153));
        juser.setText("username");
        juser.setBorder(null);
        juser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                juserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                juserFocusLost(evt);
            }
        });
        jPanel3.add(juser);
        juser.setBounds(30, 90, 230, 30);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Useer Type");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(30, 250, 90, 23);

        jpass.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jpass.setForeground(new java.awt.Color(153, 153, 153));
        jpass.setText("password");
        jpass.setBorder(null);
        jpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jpassFocusLost(evt);
            }
        });
        jPanel3.add(jpass);
        jpass.setBounds(30, 190, 230, 30);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Click here to create a new account");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel3.add(jLabel7);
        jLabel7.setBounds(60, 360, 210, 19);
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(30, 120, 280, 10);
        jPanel3.add(jSeparator2);
        jSeparator2.setBounds(30, 220, 280, 2);

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.setToolTipText("Login");
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
        jPanel3.add(jButton1);
        jButton1.setBounds(40, 320, 250, 30);

        hideicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage/hideicon.png"))); // NOI18N
        hideicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideiconMousePressed(evt);
            }
        });
        jPanel3.add(hideicon);
        hideicon.setBounds(270, 200, 30, 18);

        showicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage/showicon.png"))); // NOI18N
        showicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showiconMousePressed(evt);
            }
        });
        jPanel3.add(showicon);
        showicon.setBounds(270, 200, 30, 20);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Password");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(30, 160, 80, 23);

        box.setBackground(new java.awt.Color(51, 51, 255));
        box.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        box.setForeground(new java.awt.Color(255, 255, 255));
        box.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Shopkeeper" }));
        box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActionPerformed(evt);
            }
        });
        jPanel3.add(box);
        box.setBounds(170, 250, 140, 32);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(360, 20, 330, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
         JOptionPane.showMessageDialog(this,"Developed By: ZEESHAN UDDIN\n"
            +"Class: MCA\n"
            +"Faculty No: 18MCA054\n"
            +"Enrollment No: GL0486\n"
            +"Session: 2019-2020\n"
            +"University: ALIGARH MUSLIM UNIVERSITY, ALIGARH");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void hideiconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideiconMousePressed
        showicon.setVisible(true);
        hideicon.setVisible(false);
        jpass.setEchoChar((char)0);
    }//GEN-LAST:event_hideiconMousePressed

    private void showiconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showiconMousePressed
        showicon.setVisible(false);
        hideicon.setVisible(true);
        jpass.setEchoChar('*');
    }//GEN-LAST:event_showiconMousePressed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new Color(102,255,255));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_jButton1MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel7.setForeground(Color.red);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel7.setForeground(new Color(51,51,255));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          String checkpass=new String();
        try
        { 
            Connection con =MyConnection.getConnection();
            String sql="select password from signup where username='"+juser.getText()+"'";
            //System.out.println(jpass.getText());
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                checkpass=rs.getString(1);
            }else{
                JOptionPane.showMessageDialog(null, "username not found","Login Error",2);
                return;
            }

            if(checkpass.equals(jpass.getText().toString()))
            { 
                    DashboardUI db=new DashboardUI();
                    db.setVisible(true);
                    db.pack();
                    db.setLocationRelativeTo(null);
                    db.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    this.setVisible(false);
                
                JOptionPane.showMessageDialog(null,"Login successful"); 
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid password","Login error",2);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        SignupUI up=new SignupUI();
        up.setVisible(true);
        up.pack();
        up.setLocationRelativeTo(null);
        up.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Main m=new Main();
        m.setVisible(true);
        m.pack();
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActionPerformed
        if(box.getSelectedIndex()==1)
        {
            KeeperLogin kl=new KeeperLogin();
            kl.setVisible(true);
            kl.pack();
            kl.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }//GEN-LAST:event_boxActionPerformed

    private void juserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_juserFocusGained
        if(juser.getText().trim().toLowerCase().equals("username"))
        {
            juser.setText("");
            juser.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_juserFocusGained

    private void juserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_juserFocusLost
        if(juser.getText().trim().equals("") ||
           juser.getText().trim().toLowerCase().equals("username"))
        {
            juser.setText("username");
            juser.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_juserFocusLost

    private void jpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpassFocusGained
        if(jpass.getText().trim().toLowerCase().equals("password"))
        {
            jpass.setText("");
            jpass.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jpassFocusGained

    private void jpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpassFocusLost
        if(jpass.getText().trim().equals("") ||
           jpass.getText().trim().toLowerCase().equals("password"))
        {
            jpass.setText("password");
            jpass.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jpassFocusLost

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
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox box;
    private javax.swing.JLabel hideicon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField jpass;
    private javax.swing.JTextField juser;
    private javax.swing.JLabel showicon;
    // End of variables declaration//GEN-END:variables
}
