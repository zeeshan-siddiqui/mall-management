package manage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Zeeshan
 */
public class KeeperList extends javax.swing.JFrame {
    public KeeperList() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        sno = new javax.swing.JTextField();
        oft = new javax.swing.JTextField();
        desc = new javax.swing.JTextField();
        shopn = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ofv = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mall Management System");
        setMinimumSize(new java.awt.Dimension(1000, 400));

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 400));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel1.setText("Shop No.");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(570, 160, 90, 27);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel2.setText("S.No.");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 70, 60, 27);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel3.setText("Offer Title");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(140, 160, 93, 27);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel4.setText("Offer Validity");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(570, 80, 140, 27);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel5.setText("Description");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 250, 110, 27);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        jLabel6.setText("Shop Name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(570, 240, 110, 27);

        sname.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel1.add(sname);
        sname.setBounds(740, 240, 180, 31);

        sno.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel1.add(sno);
        sno.setBounds(280, 70, 160, 31);

        oft.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel1.add(oft);
        oft.setBounds(280, 160, 160, 31);

        desc.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel1.add(desc);
        desc.setBounds(280, 250, 160, 31);

        shopn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel1.add(shopn);
        shopn.setBounds(740, 160, 180, 29);

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.setPreferredSize(new java.awt.Dimension(95, 35));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(280, 320, 95, 35);

        ofv.setDateFormatString("dd-MMM-yyyy");
        ofv.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel1.add(ofv);
        ofv.setBounds(740, 80, 180, 29);

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("clear");
        jButton2.setPreferredSize(new java.awt.Dimension(95, 35));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(460, 320, 95, 35);

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete");
        jButton3.setPreferredSize(new java.awt.Dimension(95, 35));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(630, 320, 95, 35);

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String of1=oft.getText();
        String de=desc.getText();
        
        String shn=shopn.getText();
        String name=sname.getText();
        String snu=null;
        if(validateFields())
        {
            try
            {
                Connection con =MyConnection.getConnection();
                PreparedStatement ps=con.prepareStatement("insert into Offers( S_NO,OFFER_TITLE, DESCRIPTION, OFFER_VALIDITY, SHOP_NO, SHOP_NAME) values(?,?,?,?,?,?)");
               
               if(!(snu=(String.valueOf(getSerialNumber()))).equals("0"))
                { 
                    ps.setString(1,snu); 
                }
                ps.setString(2, of1);
                ps.setString(3, de);
                ps.setString(4, ofv.getDate().toString());
                ps.setString(5, shn);
                ps.setString(6, name);
                 
                if(ps.executeUpdate()>0)
                {
                    JOptionPane.showMessageDialog(this,"Offer Succcessfully Added","success",JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);
                }  
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        sno.setText("");
        oft.setText("");
        desc.setText("");
        ofv.setDate(null);
        shopn.setText("");
        sname.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String sn= sno.getText();
        if(validateFields())
        {
            try
            {
                int code=JOptionPane.showConfirmDialog(this,"Are you sure you want to delete this information?","Confirm",JOptionPane.YES_NO_OPTION);
                if(code==JOptionPane.YES_OPTION)
                {
                    Connection con =MyConnection.getConnection();
                    String sql="Delete From Offers where S_NO ="+sn;
                    PreparedStatement ps=con.prepareStatement(sql);

                    if(ps.executeUpdate()>0)
                    {                        
                        
                        JOptionPane.showMessageDialog(this,"Deletion Successful!!","success",JOptionPane.INFORMATION_MESSAGE);
                        this.setVisible(false);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this,"Incorrect values entered");
                    }
                    
                }

            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(KeeperList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KeeperList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KeeperList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KeeperList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KeeperList().setVisible(true);
            }
        });
    }
    private boolean validateFields()
    {
        if(oft.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(KeeperList.this, "Enter offer title");
            oft.grabFocus();
            return false;
        }
        if(desc.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(KeeperList.this, "Enter Description");
            desc.grabFocus();
            return false;
        }
        if(ofv.getDate()== null)
        {
            JOptionPane.showMessageDialog(KeeperList.this, "Enter date");
            ofv.grabFocus();
            return false;
        }
        return true;
    }
    private int getSerialNumber()
    {
        try
        {
            Connection con =MyConnection.getConnection();
            PreparedStatement ps=con.prepareStatement("select S_NO from offers");
            ResultSet rs=ps.executeQuery();
            int i=1;
           // int sno=1; 
            while(rs.next())
            {
                int sn=Integer.parseInt(rs.getString("S_NO"));
 
                if(sn!=i)
                {
                    return i; 
                }
                i++;
            }
            return i;   
        }
        catch(Exception e)
        {
            System.out.println(e);
            return 0;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField desc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField oft;
    public com.toedter.calendar.JDateChooser ofv;
    public javax.swing.JTextField shopn;
    public javax.swing.JTextField sname;
    public javax.swing.JTextField sno;
    // End of variables declaration//GEN-END:variables

    private String parseString(int serialNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
