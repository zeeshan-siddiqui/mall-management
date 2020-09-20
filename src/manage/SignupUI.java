package manage;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;

/**
 *
 * @author Client
 */
public class SignupUI extends javax.swing.JFrame {
    public SignupUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        ButtonGroup bg=new ButtonGroup();
        bg.add(Mal);
        bg.add(Femal);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        Mal = new javax.swing.JRadioButton();
        Femal = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        unlab = new javax.swing.JLabel();
        elab = new javax.swing.JLabel();
        Bdate = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mall Management System");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 700));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Sign up");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(329, 59, 96, 40);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("First Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(260, 145, 80, 23);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Last Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(261, 191, 79, 23);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("User Name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(256, 234, 83, 23);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Email");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(298, 281, 41, 23);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Password");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(267, 327, 72, 23);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("Mobile");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(286, 370, 53, 23);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("Date Of Birth");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(242, 414, 97, 23);

        lname.setBackground(new java.awt.Color(230, 230, 230));
        lname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lname.setForeground(new java.awt.Color(20, 20, 20));
        lname.setBorder(null);
        lname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lnameFocusLost(evt);
            }
        });
        jPanel1.add(lname);
        lname.setBounds(377, 188, 149, 24);

        fname.setBackground(new java.awt.Color(230, 230, 230));
        fname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fname.setForeground(new java.awt.Color(20, 20, 20));
        fname.setBorder(null);
        fname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fnameFocusLost(evt);
            }
        });
        jPanel1.add(fname);
        fname.setBounds(377, 142, 149, 24);

        uname.setBackground(new java.awt.Color(230, 230, 230));
        uname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        uname.setForeground(new java.awt.Color(20, 20, 20));
        uname.setBorder(null);
        uname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                unameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                unameFocusLost(evt);
            }
        });
        uname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                unameKeyReleased(evt);
            }
        });
        jPanel1.add(uname);
        uname.setBounds(377, 231, 149, 24);

        mobile.setBackground(new java.awt.Color(230, 230, 230));
        mobile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mobile.setForeground(new java.awt.Color(20, 20, 20));
        mobile.setBorder(null);
        mobile.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mobileFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mobileFocusLost(evt);
            }
        });
        mobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mobileKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobileKeyTyped(evt);
            }
        });
        jPanel1.add(mobile);
        mobile.setBounds(377, 367, 149, 24);

        email.setBackground(new java.awt.Color(230, 230, 230));
        email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        email.setForeground(new java.awt.Color(20, 20, 20));
        email.setBorder(null);
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });
        jPanel1.add(email);
        email.setBounds(377, 278, 149, 24);

        pass.setBackground(new java.awt.Color(230, 230, 230));
        pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pass.setForeground(new java.awt.Color(20, 20, 20));
        pass.setBorder(null);
        pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFocusLost(evt);
            }
        });
        jPanel1.add(pass);
        pass.setBounds(377, 324, 149, 24);

        Mal.setBackground(new java.awt.Color(255, 255, 255));
        Mal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Mal.setText("Male");
        jPanel1.add(Mal);
        Mal.setBounds(377, 457, 80, 29);

        Femal.setBackground(new java.awt.Color(255, 255, 255));
        Femal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Femal.setText("Female");
        jPanel1.add(Femal);
        Femal.setBounds(459, 457, 80, 29);

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Sign up");
        jButton3.setToolTipText("Sign up");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(270, 510, 250, 40);

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setText(">>Already Have an Account? Login!");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        jPanel1.add(jLabel12);
        jLabel12.setBounds(290, 620, 220, 19);
        jPanel1.add(unlab);
        unlab.setBounds(380, 260, 150, 14);
        jPanel1.add(elab);
        elab.setBounds(380, 304, 150, 20);

        Bdate.setForeground(new java.awt.Color(20, 20, 20));
        Bdate.setDateFormatString("dd-MMM-yyyy");
        Bdate.setFocusCycleRoot(true);
        Bdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Bdate.setPreferredSize(new java.awt.Dimension(149, 24));
        jPanel1.add(Bdate);
        Bdate.setBounds(380, 410, 149, 24);

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage/adminlm.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 44)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Admin");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel14))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel14)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 230, 700);

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 255));
        jLabel13.setText("Gender");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(284, 457, 55, 23);

        jButton4.setBackground(new java.awt.Color(51, 51, 255));
        jButton4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Clear");
        jButton4.setToolTipText("Sign up");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(270, 570, 250, 40);

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

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        LoginUI lg=new LoginUI();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setBackground(new Color(102,255,255));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_jButton3MouseExited

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        jLabel12.setForeground(Color.red);
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        jLabel12.setForeground(new Color(51,51,255));
    }//GEN-LAST:event_jLabel12MouseExited

    private void fnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnameFocusGained
        Border juser_Border=BorderFactory.createMatteBorder(2,4,2,2, new Color(200,200,200));
        fname.setBorder(juser_Border);
    }//GEN-LAST:event_fnameFocusGained

    private void fnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnameFocusLost
        fname.setBorder(null);
    }//GEN-LAST:event_fnameFocusLost

    private void lnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lnameFocusGained
        Border juser_Border=BorderFactory.createMatteBorder(2,4,2,2, new Color(200,200,200));
        lname.setBorder(juser_Border);
    }//GEN-LAST:event_lnameFocusGained

    private void lnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lnameFocusLost
        lname.setBorder(null);
    }//GEN-LAST:event_lnameFocusLost

    private void unameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unameFocusGained
        Border juser_Border=BorderFactory.createMatteBorder(2,4,2,2, new Color(200,200,200));
        uname.setBorder(juser_Border);
    }//GEN-LAST:event_unameFocusGained

    private void unameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unameFocusLost
        uname.setBorder(null);
    }//GEN-LAST:event_unameFocusLost

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
         Border juser_Border=BorderFactory.createMatteBorder(2,4,2,2, new Color(200,200,200));
          email.setBorder(juser_Border);
    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        email.setBorder(null);
    }//GEN-LAST:event_emailFocusLost

    private void passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusGained
         Border juser_Border=BorderFactory.createMatteBorder(2,4,2,2, new Color(200,200,200));
        pass.setBorder(juser_Border);
    }//GEN-LAST:event_passFocusGained

    private void passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusLost
        pass.setBorder(null);
    }//GEN-LAST:event_passFocusLost

    private void mobileFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobileFocusGained
         Border juser_Border=BorderFactory.createMatteBorder(2,4,2,2, new Color(200,200,200));
        mobile.setBorder(juser_Border);
    }//GEN-LAST:event_mobileFocusGained

    private void mobileFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobileFocusLost
        mobile.setBorder(null);
    }//GEN-LAST:event_mobileFocusLost

    private void BdateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BdateFocusGained
         Border juser_Border=BorderFactory.createMatteBorder(2,4,2,2, new Color(200,200,200));
        Bdate.setBorder(juser_Border);
    }//GEN-LAST:event_BdateFocusGained

    private void BdateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BdateFocusLost
        Bdate.setBorder(null);
    }//GEN-LAST:event_BdateFocusLost

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            String fn=fname.getText();
            String ln=lname.getText();
            String un=uname.getText();
            String em=email.getText();
            String pa=pass.getText();
            String mo=mobile.getText();
         
           String gen=null;
            if(Mal.isSelected())
            {
                gen="Male";
            }
            if(Femal.isSelected())
            {
                gen="Female";
            }
               
        if(validateFields())
        {
        try
        {  
            Connection con =MyConnection.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into SIGNUP values(?,?,?,?,?,?,?,?)");
            ps.setString(1,fn);
            ps.setString(2,ln);
            ps.setString(3,un);
            ps.setString(4,em);
            ps.setString(5,pa);
            ps.setString(6,mo);
            ps.setString(7,Bdate.getDate().toString());
            ps.setString(8,gen);
           
            if(!Pattern.matches("^[a-zA-Z0-9]{5,30}@[a-zA-Z]{0,10}.[a-zA-Z]{0,3}$", em))
            {
                JOptionPane.showMessageDialog(null,"Enter a valid email","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                if(valPassword(pa))
                {
                    ps.executeUpdate();
                    LoginUI lg=new LoginUI();
                    lg.setVisible(true);
                    lg.pack();
                    lg.setLocationRelativeTo(null);
                    lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    this.setVisible(false);
                    JOptionPane.showMessageDialog(null,"successfull registered");
                }
                else
                {
                    String msg="<html><body>password must contain atleast 8 character<br/>atleast 1 uppercase<br/>atleast 1 lowercase<br/>atleast 1 digit</body></html>";
                    JOptionPane.showMessageDialog(this,msg,"Error",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            }
        catch(Exception e)
        {
           System.out.println(e);
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void unameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unameKeyReleased
        String PATTERN="^[a-zA-Z0-9]{0,30}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(uname.getText());
        if(!match.matches())
        {
            unlab.setText("naming is incorrect");
        }
        else
        {
            unlab.setText(null);
        }
    }//GEN-LAST:event_unameKeyReleased

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
        String PATTERN="^[a-zA-Z0-9]{5,30}@[a-zA-Z]{0,10}.[a-zA-Z]{0,3}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(email.getText());
        if(!match.matches())
        {
            elab.setText("email is incorrect");
        }
        else
        {
            elab.setText(null);
        }
    }//GEN-LAST:event_emailKeyReleased

    private void mobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileKeyTyped
        if(!Character.isDigit(evt.getKeyChar()))
        {
            evt.consume();
        }
    }//GEN-LAST:event_mobileKeyTyped

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jButton4.setBackground(new Color(102,255,255));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        jButton4.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        fname.setText("");
        lname.setText("");
        uname.setText("");
        email.setText("");
        pass.setText("");
        mobile.setText("");
        Bdate.setDate(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void mobileKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileKeyPressed
        String mobilenum=mobile.getText();
        int length = mobilenum.length();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
            if(length<10)
            {
                mobile.setEditable(true);
            }
            else
            {
                mobile.setEditable(false);
            }
        }
        else
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                mobile.setEditable(true);
            }
            else
            {
                mobile.setEditable(false);
            }
        }
    }//GEN-LAST:event_mobileKeyPressed

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
            java.util.logging.Logger.getLogger(SignupUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupUI().setVisible(true);
            }
        });
    }
    
     private boolean validateFields()
     {
        if(fname.getText().trim().isEmpty())
        {
            
            JOptionPane.showMessageDialog(SignupUI.this, "Enter first name");
            fname.grabFocus();
            return false;
        }
        if(lname.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(SignupUI.this, "Enter last name");
            lname.grabFocus();
            return false;
        }
        if(uname.getText().trim().isEmpty())
        { 
            JOptionPane.showMessageDialog(SignupUI.this, "Enter user name");
            uname.grabFocus();
            return false;
        }
        if(email.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(SignupUI.this, "Enter your email");
            email.grabFocus();
            return false;
        }
        if(pass.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(SignupUI.this, "Enter your password ");
            pass.grabFocus();
            return false;
        }
        if(mobile.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(SignupUI.this, "Enter mobile number");
            mobile.grabFocus();
            return false;
        }
        try
        {
            
           if(Bdate.getDate().toString().isEmpty())
           { 
                JOptionPane.showMessageDialog(SignupUI.this, "Enter Birth date","Error",JOptionPane.ERROR_MESSAGE);
                Bdate.grabFocus();
                return false;
           } 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return true;
    }
     
     public static boolean valPassword(String password)
     {
         if(password.length()>7)
         {
             if(checkPass(password))
             {
                 return true;
             }
             else
             {
                 return false;
             }
         }
         else
         {
             return false;
         }
         
     }
     public static boolean checkPass(String password)
     {
         boolean num=false;
         boolean upper=false;
         boolean lower=false;
         char c;
         for(int i=0; i<password.length(); i++)
         {
             c=password.charAt(i);
             if(Character.isDigit(c))
             {
                 num=true;
             }
             else if(Character.isUpperCase(c))
             {
                 upper=true;
             }
             else if(Character.isLowerCase(c))
             {
                 lower=true;
             }
             if(num && upper && lower)
             {
                 return true;
             }
         }
         return false;
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Bdate;
    private javax.swing.JRadioButton Femal;
    private javax.swing.JRadioButton Mal;
    private javax.swing.JLabel elab;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField mobile;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField uname;
    private javax.swing.JLabel unlab;
    // End of variables declaration//GEN-END:variables
}
