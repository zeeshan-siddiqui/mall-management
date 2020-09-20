package manage;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Zeeshan
 */
public class Main extends javax.swing.JFrame {
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        OrIdPass();
    }
    String OrIdPass(){
      Scanner Sc1= null;
		FileInputStream fis=null;
		try
		{
		    FileInputStream FI=new FileInputStream("mkfile.txt");
		    Sc1=new Scanner(FI);
		    
		    // this will read data till the end of data.
                    if(Sc1.hasNext()){
                        jPanel3.setVisible(false);
                        jPanel2.setVisible(true);
		
		    	String data=Sc1.nextLine();
		    	 return(data);
                    }
                    else{
                       jPanel3.setVisible(true);
                       jPanel2.setVisible(false); 
                       return(null);
                    }
		}
		catch(IOException e)
		{
			System.out.println(e);
                        
                        jPanel3.setVisible(true);
                        jPanel2.setVisible(false); 
                        return(null);
		}
          
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        OID = new javax.swing.JTextField();
        Opass = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mall Management System");

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(715, 450));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 0, 0,120));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 0));
        jLabel3.setText("Customers");
        jLabel3.setToolTipText("User");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel2.add(jLabel3);
        jLabel3.setBounds(90, 140, 170, 44);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 0));
        jLabel2.setText("Mall users");
        jLabel2.setToolTipText("Admin");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel2.add(jLabel2);
        jLabel2.setBounds(90, 80, 170, 44);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(70, 20, 200, 44);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(370, 100, 330, 220);

        jPanel3.setBackground(new java.awt.Color(255, 0, 0,120));
        jPanel3.setName(""); // NOI18N
        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Oracle User Id");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(17, 49, 141, 30);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Oracle Password");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(17, 106, 168, 30);

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Enter");
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
        jButton1.setBounds(200, 160, 87, 39);

        OID.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jPanel3.add(OID);
        OID.setBounds(200, 50, 128, 33);

        Opass.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        Opass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpassActionPerformed(evt);
            }
        });
        jPanel3.add(Opass);
        Opass.setBounds(200, 100, 128, 33);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 100, 350, 220);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage/welmalm.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 715, 450);

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setForeground(new Color(51,51,255));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setForeground(new Color(153,255,0));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

            LoginUI lg=new LoginUI();
            lg.setVisible(true);
            lg.pack();
            lg.setLocationRelativeTo(null);
            this.setVisible(false); 
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setForeground(new Color(51,51,255));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setForeground(new Color(153,255,0));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        User us=new User();
        us.setVisible(true);
        us.pack();
        us.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String str=new String();
        if((OID.getText()).isEmpty() || (Opass.getText()).isEmpty()){
            jPanel3.setVisible(true);
            jPanel2.setVisible(false);
            JOptionPane.showMessageDialog(rootPane,"Please Enter Oracle UserName And Oracle Password");
        }
        else{
            try{
                try{

                    FileWriter fw=new FileWriter("mkfile.txt");
                    str=OID.getText();
                    for(int j=0;j<2;j++){
                        for (int i = 0; i < str.length(); i++) {
                            fw.write(str.charAt(i));
                        }
                        fw.write(" ");
                        str=Opass.getText();
                    }
                    System.out.println("Writing successful");
                    fw.close();
                    (MyConnection.getConnection()).createStatement();
                    jPanel2.setVisible(true);
                    jPanel3.setVisible(false);
                }
                catch(Exception e)
                {
                    System.out.println("In File Create >>>  "+ e);
                    JOptionPane.showMessageDialog(rootPane,"Sorry..!! Oracle UserName And Oracle Password is incorrect");

                    jPanel3.setVisible(true);
                    jPanel2.setVisible(false);
                }
            }
            catch(Exception eee){
                JOptionPane.showMessageDialog(rootPane,"Sorry..!! Oracle UserName And Oracle Password is incorrect");

            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void OpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpassActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField OID;
    private javax.swing.JTextField Opass;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
