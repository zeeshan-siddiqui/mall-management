package manage;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Zeeshan
 */
public class User extends javax.swing.JFrame {
    int OTP;
    public User() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        mobile = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        votp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        textsender = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mall Management System");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(715, 450));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 450));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Customers");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(70, 310, 220, 60);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage/usersm.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(70, 80, 226, 180);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage/18.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 20, 32, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 350, 490);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)), "Login", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 40), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel3.setLayout(null);
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(30, 190, 280, 2);
        jPanel3.add(jSeparator2);
        jSeparator2.setBounds(30, 280, 280, 2);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Name");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(30, 120, 45, 23);

        txtname.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtname.setForeground(new java.awt.Color(153, 153, 153));
        txtname.setText("name");
        txtname.setBorder(null);
        txtname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnameFocusLost(evt);
            }
        });
        jPanel3.add(txtname);
        txtname.setBounds(30, 160, 230, 25);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Mobile");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(30, 210, 54, 23);

        mobile.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        mobile.setForeground(new java.awt.Color(153, 153, 153));
        mobile.setText("mobile");
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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobileKeyTyped(evt);
            }
        });
        jPanel3.add(mobile);
        mobile.setBounds(30, 250, 160, 25);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Verify OTP");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(30, 300, 100, 30);
        jPanel3.add(jSeparator3);
        jSeparator3.setBounds(30, 380, 280, 2);

        votp.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        votp.setForeground(new java.awt.Color(153, 153, 153));
        votp.setText("OTP");
        votp.setBorder(null);
        votp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                votpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                votpFocusLost(evt);
            }
        });
        jPanel3.add(votp);
        votp.setBounds(30, 350, 140, 25);

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 19)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Send OTP");
        jButton1.setToolTipText("Send OTP");
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
        jButton1.setBounds(200, 240, 120, 33);

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 19)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Verify");
        jButton2.setToolTipText("Verify");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(200, 340, 120, 33);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sender");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(70, 60, 58, 26);

        textsender.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        textsender.setForeground(new java.awt.Color(255, 255, 255));
        textsender.setText("txtlcl");
        jPanel3.add(textsender);
        textsender.setBounds(220, 60, 50, 26);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(370, 20, 330, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileKeyTyped
        if(!Character.isDigit(evt.getKeyChar()))
        {
            evt.consume();
        }
    }//GEN-LAST:event_mobileKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(validateFields())
        {
        try {
			// Construct data
		String apiKey = "apikey=" + "+b9iZzyKM54-OA8Z0uBJrn09aNtHxVJmpjNANGzNhJ";
                Random rand=new Random();
                OTP = rand.nextInt(999999);
                String name=txtname.getText();
                String message = "&message=" + "Hey "+name+" Your OTP is "+OTP;
		String sender = "&sender=" +textsender.getText();
		String numbers = "&numbers=" +mobile.getText();
			
			// Send data
		HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
		String data = apiKey + numbers + message + sender;
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
		conn.getOutputStream().write(data.getBytes("UTF-8"));
		final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		final StringBuffer stringBuffer = new StringBuffer();
		String line;
		while ((line = rd.readLine()) != null) {
			stringBuffer.append(line);
                    //JOptionPane.showMessageDialog(null, "message"+line);
		}
		rd.close();
                JOptionPane.showMessageDialog(null, "OTP sent successfully","Successful",2);
			
			//return stringBuffer.toString();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error SMS "+e);
			//return "Error "+e;
                        JOptionPane.showMessageDialog(null, "Error"+e);
		}
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(Integer.parseInt(votp.getText())==OTP)
        {
            UserView uv=new UserView();
            uv.setVisible(true);
            uv.pack();
            uv.setLocationRelativeTo(null);
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "Your Welcome");
            //JOptionPane.showMessageDialog(null, "You are login successfully","successful",2);
        } 
        else
        {
            JOptionPane.showMessageDialog(null, "OTP is wrong","Error",2);
        }
//        String VOTP=votp.getText();
//        if(VOTP.equals("652225"))
//        {
//            UserView uv=new UserView();
//            uv.setVisible(true);
//            uv.pack();
//            uv.setLocationRelativeTo(null);
//            this.setVisible(false);
//            JOptionPane.showMessageDialog(null, "Your Welcome");
//        }
//        else
//        {
//            JOptionPane.showMessageDialog(null, "OTP is wrong","Error",2);
//        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Main m=new Main();
        m.setVisible(true);
        m.pack();
        m.setLocationRelativeTo(null);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new Color(102,255,255));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(new Color(102,255,255));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_jButton2MouseExited

    private void txtnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusGained
        if(txtname.getText().trim().toLowerCase().equals("name"))
        {
            txtname.setText("");
            txtname.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtnameFocusGained

    private void txtnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusLost
        if(txtname.getText().trim().equals("") ||
           txtname.getText().trim().toLowerCase().equals("name"))
        {
            txtname.setText("name");
            txtname.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtnameFocusLost

    private void mobileFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobileFocusGained
        if(mobile.getText().trim().toLowerCase().equals("mobile"))
        {
            mobile.setText("");
            mobile.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_mobileFocusGained

    private void mobileFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobileFocusLost
        if(mobile.getText().trim().equals("") ||
           mobile.getText().trim().toLowerCase().equals("mobile"))
        {
            mobile.setText("mobile");
            mobile.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_mobileFocusLost

    private void votpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_votpFocusGained
        if(votp.getText().trim().toUpperCase().equals("OTP"))
        {
            votp.setText("");
            votp.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_votpFocusGained

    private void votpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_votpFocusLost
        if(votp.getText().trim().equals("") ||
           votp.getText().trim().toUpperCase().equals("OTP"))
        {
            votp.setText("OTP");
            votp.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_votpFocusLost

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }
    
    private boolean validateFields()
    {
        if(txtname.getText().trim().toLowerCase().equals("name"))
        {
            JOptionPane.showMessageDialog(User.this, "Enter your Name");
            txtname.grabFocus();
            return false;
        }
        if(mobile.getText().trim().toLowerCase().equals("mobile"))
        {
            JOptionPane.showMessageDialog(User.this, "Enter mobile number");
            mobile.grabFocus();
            return false;
        }
        
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField mobile;
    private javax.swing.JLabel textsender;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField votp;
    // End of variables declaration//GEN-END:variables
}
