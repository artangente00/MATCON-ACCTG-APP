
package inventory;

import java.awt.Dimension;
import java.awt.Toolkit;
import static java.lang.ProcessBuilder.Redirect.from;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import static java.util.Date.from;
import java.util.TimeZone;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class tabledraw1 extends javax.swing.JFrame {
    int val;
    double diff;
    String operation;
    
    Connection connec = null;
    PreparedStatement stm = null;
    ResultSet rs = null; 
    //public String sql1;
    //public String sql2;
    //public String sql3;

    
    public tabledraw1() {
        initComponents();
        showtable();
        
    }
public void showtable()
{
    try{
           String sql= "SELECT * FROM withdrawal ORDER BY Date DESC";
          Class.forName("com.mysql.jdbc.Driver"); 
           connec=DriverManager.getConnection("jdbc:mysql://localhost/project","root","");
           stm=connec.prepareStatement(sql);
           rs=stm.executeQuery();
          
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
     
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
       
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        start = new javax.swing.JTextField();
        end = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItemCode", "Description", "Qty", "UOM", "Date", "Department", "StoredLocation", "Cost", "MRIS", "Purpose", "WDWQty", "TotalQty", "Custodian"
            }
        ));
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setMinWidth(150);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(4).setMinWidth(100);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(6).setMinWidth(150);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(150);
        }

        jButton1.setBackground(new java.awt.Color(0, 102, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WithdrawalTable");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 255, 255));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 102, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Office Supplies", "Laboratory Chemicals", "IT Peripherals", "Repairs and Maintenance", "Factory Consumables", "Chemicals and Additives", "Oils and Lubricants", "Tires, Flaps, Inner Tubes", "Miscellaneous", "Building and Structures", "Warehouse and Tanks", "Water Canal", "Water Sewage and Drainage", "Residential Houses", "Mill Machineries and Equipment", "Mill other assets", "Office Furnitures and fixtures", "Office Tools and Equipment", "House Furnitures and Fixtures", "Communication System", "Cane Hauling Equipments", "Road Equipments", "Farm Equipments", "Laboratory Equipments", "Factory Tools" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "ISD", "ELECTRICAL", "MILL & BOILER", "MAINTENANCE", "HR", "CANE SUPPLY", "ACCOUNTING", "PLD", "SAFETY", "QA", " " }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        start.setBackground(new java.awt.Color(204, 255, 255));
        start.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        start.setText("0000/00/00 00:00:00 AM");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        end.setBackground(new java.awt.Color(204, 255, 255));
        end.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        end.setText("0000/00/00 00:00:00 PM");
        end.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(204, 255, 255));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Total Withdrawal Amount:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Total Withdrawal QTY:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("GL Account");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Department");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(148, 148, 148)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(195, 195, 195)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(633, 633, 633))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(start)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(end)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(292, 292, 292))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(end, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Menu wdr=new Menu();
       wdr.setVisible(true);
       this.dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      String itemcode=(String) jComboBox1.getSelectedItem();
      String dprt=(String) jComboBox2.getSelectedItem();
      String startdt=start.getText();
      String enddt=end.getText();
     // Date d = new Date();
     // SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"+" "+"hh:mm:ss a");
      //DateFormat apiFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
      //apiFormat.setTimeZone(TimeZone.getTimeZone("EST"));
    
      //String dd = sdf.format(d);

      //String sql1;
      //String sql2;
        
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection connec = DriverManager.getConnection("jdbc:mysql://localhost/project","root",""); 
                //String sql1="SELECT * FROM `withdrawal` WHERE GLAcct='"+itemcode+"' && Department='"+dprt+"' || Date>='"+startdt+"' && Date<='"+enddt+"'";
                //String sql2="SELECT * FROM `withdrawal` WHERE GLAcct='"+itemcode+"' && Department='"+dprt+"' && Date>='"+startdt+"' && Date<='"+enddt+"'";
                //String sql3 = (sql1 || sql2);
                //PreparedStatement stm = connec.prepareStatement(sql1);
                //ResultSet rs = stm.executeQuery();
                
                //filter GLAcct
                //if(itemcode.equals(jComboBox1.getSelectedItem()))
                //{
                //String sql1="SELECT * FROM `withdrawal` WHERE GLAcct='"+itemcode+"'";
                //PreparedStatement stm = connec.prepareStatement(sql1);
                //ResultSet rs = stm.executeQuery();
                //jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                //}
                
                //filter Dept
                //if(dprt.equals((String) jComboBox2.getSelectedItem()))
                //{
                //String sql1="SELECT * FROM `withdrawal` WHERE Department='"+dprt+"'";
                //PreparedStatement stm = connec.prepareStatement(sql1);
                //ResultSet rs = stm.executeQuery();
                //jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                //}
                
                
                //filter GLAcct and Date
               // else if(itemcode.equals("Office Supplies") || itemcode.equals("Laboratory Chemicals") || itemcode.equals("IT Peripherals") || itemcode.equals("Repairs and Maintenance") || itemcode.equals("Chemicals and Additives") || (itemcode.equals("Factory Consumables") && startdt.equals(start.getText()) && enddt.equals(end.getText()))
                //|| itemcode.equals("Tires, Flaps, Inner Tubes") || itemcode.equals("Miscellaneous") || itemcode.equals("Building and Structures") || itemcode.equals("Warehouse and Tanks") || itemcode.equals("Water Canal")
               // || itemcode.equals("Water Sewage and Drainage") || itemcode.equals("Residential Houses") || itemcode.equals("Mill Machineries and Equipment") || itemcode.equals("Mill other assets")
                //|| itemcode.equals("Office Furnitures and fixtures") || itemcode.equals("Office Tools and Equipment") || itemcode.equals("House Furnitures and Fixtures") || itemcode.equals("Communication System")
               // || itemcode.equals("Cane Hauling Equipments") || itemcode.equals("Road Equipments") || itemcode.equals("Farm Equipments") || itemcode.equals("Laboratory Equipments") || itemcode.equals("Factory Tools"))
                //{
                //String sql1="SELECT * FROM `withdrawal` WHERE GLAcct='"+itemcode+"' && Date>='"+startdt+"' && Date<='"+enddt+"'";
               //// PreparedStatement stm = connec.prepareStatement(sql1);
               // ResultSet rs = stm.executeQuery();
               // jTable1.setModel(DbUtils.resultSetToTableModel(rs));
               // }
                
                //filter Date
               // else if(startdt.equals(start.getText()) && enddt.equals(end.getText()))
               //{
                //String sql1="SELECT * FROM `withdrawal` WHERE Date>='"+startdt+"' && Date<='"+enddt+"'";
               // PreparedStatement stm = connec.prepareStatement(sql1);
               // ResultSet rs = stm.executeQuery();
                //jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                //}
                
                
                
                //Filter Dept or GLAcct
               if((itemcode.equals(jComboBox1.getSelectedItem())) || (dprt.equals(jComboBox2.getSelectedItem()))){
               String sql1="SELECT * FROM `withdrawal` WHERE GLAcct='"+itemcode+"' || Department='"+dprt+"'";
               PreparedStatement stm = connec.prepareStatement(sql1);
               ResultSet rs = stm.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                }
               //Filter Dept and GLAcct
               else if((itemcode.equals(jComboBox1.getSelectedItem())) && (dprt.equals(jComboBox2.getSelectedItem()))){
               String sql1="SELECT * FROM `withdrawal` WHERE GLAcct='"+itemcode+"' && Department='"+dprt+"'";
               PreparedStatement stm = connec.prepareStatement(sql1);
               ResultSet rs = stm.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                }
               
               
                
                

       
    
            }catch (Exception e){
               JOptionPane.showMessageDialog(null, e);
            }   
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void endActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        int numrow = jTable1.getRowCount();
       
        double tot = 0;
        for(int i=0; i<numrow; i++){
            Double val = Double.valueOf(jTable1.getValueAt(i, 9).toString());
            tot += val;
        }
        jTextField2.setText(Double.toString(tot));
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
         int numrow = jTable1.getRowCount();
       
        double tot = 0;
        for(int i=0; i<numrow; i++){
            Double val = Double.valueOf(jTable1.getValueAt(i, 8).toString());
            tot += val;
        }
        jTextField1.setText(Double.toString(tot));
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startActionPerformed

    
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
            java.util.logging.Logger.getLogger(tabledraw1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabledraw1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabledraw1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabledraw1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabledraw1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField end;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField start;
    // End of variables declaration//GEN-END:variables
}
