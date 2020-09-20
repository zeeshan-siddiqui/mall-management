package manage;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Zeeshan
 */
class myTableCellRenderer implements TableCellRenderer
{
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return(Component) value;
    }
    
}
public class ManageSUI extends javax.swing.JFrame {
    ShowStoreData srd=new ShowStoreData();
    /**
     * Creates new form ManageSUI
     */
    public ManageSUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        DefaultTableModel model= (DefaultTableModel) strData.getModel();
        strData.setModel(model);
        strData.setRowHeight(120);
        
        strData.getColumn("Logo").setCellRenderer(new myTableCellRenderer());
        strData.getColumn("Image").setCellRenderer(new myTableCellRenderer());
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        strData.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        strData.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        strData.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        strData.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        strData.getTableHeader().setFont(new Font("Times new Roman",Font.BOLD,48));
        
       
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
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        strData = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        sname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mall Management System");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage/malllogo.png"))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        jLabel21.setText("<HTML> <BODY> <FONT COLOR=\"ORANGE\">WELCOME  </FONT> TO  <FONT COLOR=\"ORANGE\"> BIG BAZAAR </FONT>  </BODY> </HTML>");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1000, 81);

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));
        jPanel4.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel2.setText("manage stores details");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(238, 8, 480, 44);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage/18.png"))); // NOI18N
        jLabel12.setToolTipText("Back to Dashbooard");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel12);
        jLabel12.setBounds(10, 10, 40, 40);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(20, 100, 960, 70);

        jPanel5.setBackground(new java.awt.Color(255, 204, 0));
        jPanel5.setLayout(null);

        jButton5.setBackground(new java.awt.Color(51, 51, 255));
        jButton5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Add new Stores");
        jButton5.setToolTipText("Add stores");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5);
        jButton5.setBounds(380, 10, 210, 30);

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Display");
        jButton3.setToolTipText("Display");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setPreferredSize(new java.awt.Dimension(95, 32));
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
        jPanel5.add(jButton3);
        jButton3.setBounds(340, 410, 95, 32);

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete");
        jButton2.setToolTipText("Delete");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPreferredSize(new java.awt.Dimension(95, 32));
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
        jPanel5.add(jButton2);
        jButton2.setBounds(790, 410, 95, 32);

        strData.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        strData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Store Name", "Description", "Floor", "Timing", "Logo", "Image"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        strData.getTableHeader().setReorderingAllowed(false);
        strData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                strDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(strData);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 940, 330);

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
        jPanel5.add(jButton1);
        jButton1.setBounds(10, 420, 110, 40);

        sname.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        sname.setPreferredSize(new java.awt.Dimension(240, 32));
        jPanel5.add(sname);
        sname.setBounds(506, 410, 240, 32);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(20, 180, 960, 470);

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

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new Color(102,255,255));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_jButton1MouseExited

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

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        DashboardUI db=new DashboardUI();
        db.setVisible(true);
        db.pack();
        db.setLocationRelativeTo(null);
        db.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        jButton5.setBackground(new Color(102,255,255));
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        jButton5.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        AddStr str=new AddStr();
        str.setVisible(true);
        str.pack();
        str.setLocationRelativeTo(null);
        str.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setBackground(new Color(102,255,255));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel model = (DefaultTableModel) strData.getModel();
        int rows = model.getRowCount();
        if (rows > 0)
        {
            for (int i = 0; i < rows; i++)
            {
                model.removeRow(0);
            }
        }
        try
        {
            Connection con =MyConnection.getConnection();
            PreparedStatement ps=con.prepareStatement("select * from stores order by store_name");
            ResultSet rs=ps.executeQuery();
                
            while(rs.next())
            {
                               
                String stName = rs.getString("Store_Name");
                String desc = rs.getString("Description");
                String floor = rs.getString("Floor");
                String time = rs.getString("Timing");
                Blob log = rs.getBlob("logo");
                Blob img = rs.getBlob("image");
                                                             
                InputStream fin1 = log.getBinaryStream();  
                InputStream fin2 = img.getBinaryStream();
                
                BufferedImage logImg = ImageIO.read(fin1);
                BufferedImage imgImg = ImageIO.read(fin2);
                
                ImageIcon icon1=new ImageIcon(logImg);
                Image logoIc=icon1.getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH);
                
                ImageIcon icon2=new ImageIcon(imgImg);
                Image imgIc=icon2.getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH);
                
                JLabel logolabel = new JLabel();
                JLabel imglabel = new JLabel(); 
                
                logolabel.setIcon(new ImageIcon(logoIc));
                imglabel.setIcon(new ImageIcon(imgIc));
                model.addRow(new Object[] {stName, desc, floor, time, logolabel, imglabel});
            }
        }
        catch(Exception e) 
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(new Color(102,255,255));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(new Color(51,51,255));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String st= sname.getText();
        if(validateFields())
        {
            try
            {
                int code=JOptionPane.showConfirmDialog(this,"Are you sure you want to delete this information?","Confirm",JOptionPane.YES_NO_OPTION);
                if(code==JOptionPane.YES_OPTION)
                {
                    Connection con =MyConnection.getConnection();
                    String sql="Delete From stores where STORE_NAME ='"+st+"' ";
                    PreparedStatement ps=con.prepareStatement(sql);

                    if(ps.executeUpdate()>0)
                    {
                        JOptionPane.showMessageDialog(this,"Deletion Successful!!","success",JOptionPane.INFORMATION_MESSAGE);
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void strDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_strDataMouseClicked
        int index = strData.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel)strData.getModel();
        
        String stname = model.getValueAt(index, 0).toString();
        sname.setText(stname);
        
    }//GEN-LAST:event_strDataMouseClicked

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
            java.util.logging.Logger.getLogger(ManageSUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageSUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageSUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageSUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageSUI().setVisible(true);
            }
        });
    }
    
    private boolean validateFields()
     {
        if(sname.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(ManageSUI.this, "Enter store Name");
            sname.grabFocus();
            return false;
        }
        
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField sname;
    private javax.swing.JTable strData;
    // End of variables declaration//GEN-END:variables
}
