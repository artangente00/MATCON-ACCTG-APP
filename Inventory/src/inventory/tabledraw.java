
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


public class tabledraw extends javax.swing.JFrame {
    int val;
    double diff;
    String operation;
    
    Connection connec = null;
    PreparedStatement stm = null;
    ResultSet rs = null; 
    //public String sql1;
    //public String sql2;
    //public String sql3;

    
    public tabledraw() {
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
                if(itemcode.equals("Office Supplies") || itemcode.equals("Laboratory Chemicals") || itemcode.equals("IT Peripherals") || itemcode.equals("Repairs and Maintenance") || itemcode.equals("Chemicals and Additives") || itemcode.equals("Factory Consumables")
                || itemcode.equals("Tires, Flaps, Inner Tubes") || itemcode.equals("Oils and Lubricants") || itemcode.equals("Miscellaneous") || itemcode.equals("Building and Structures") || itemcode.equals("Warehouse and Tanks") || itemcode.equals("Water Canal")
                || itemcode.equals("Water Sewage and Drainage") || itemcode.equals("Residential Houses") || itemcode.equals("Mill Machineries and Equipment") || itemcode.equals("Mill other assets")
                || itemcode.equals("Office Furnitures and fixtures") || itemcode.equals("Office Tools and Equipment") || itemcode.equals("House Furnitures and Fixtures") || itemcode.equals("Communication System")
                || itemcode.equals("Cane Hauling Equipments") || itemcode.equals("Road Equipments") || itemcode.equals("Farm Equipments") || itemcode.equals("Laboratory Equipments") || itemcode.equals("Factory Tools"))
                {
                String sql1="SELECT * FROM `withdrawal` WHERE GLAcct='"+itemcode+"'";
                PreparedStatement stm = connec.prepareStatement(sql1);
                ResultSet rs = stm.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                }
                
                //filter GLAcct and Date
                else if((itemcode.equals("Office Supplies") || itemcode.equals("Laboratory Chemicals") || itemcode.equals("IT Peripherals") || itemcode.equals("Repairs and Maintenance") || itemcode.equals("Chemicals and Additives") || itemcode.equals("Factory Consumables")
                || itemcode.equals("Tires, Flaps, Inner Tubes") || itemcode.equals("Oils and Lubricants") || itemcode.equals("Miscellaneous") || itemcode.equals("Building and Structures") || itemcode.equals("Warehouse and Tanks") || itemcode.equals("Water Canal")
                || itemcode.equals("Water Sewage and Drainage") || itemcode.equals("Residential Houses") || itemcode.equals("Mill Machineries and Equipment") || itemcode.equals("Mill other assets") || itemcode.equals("Office Furnitures and fixtures") || itemcode.equals("Office Tools and Equipment") 
                || itemcode.equals("House Furnitures and Fixtures") || itemcode.equals("Communication System") || itemcode.equals("Cane Hauling Equipments") || itemcode.equals("Road Equipments") || itemcode.equals("Farm Equipments") || itemcode.equals("Laboratory Equipments") || itemcode.equals("Factory Tools")) && (startdt.equals(start.getText()) && enddt.equals(end.getText())))
                {
                String sql1="SELECT * FROM `withdrawal` WHERE GLAcct='"+itemcode+"' && Date>='"+startdt+"' && Date<='"+enddt+"'";
                PreparedStatement stm = connec.prepareStatement(sql1);
                ResultSet rs = stm.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                }
                
                //filter Dept
                else if(dprt.equals("ISD") || dprt.equals("ELECTRICAL") || dprt.equals("MILL & BOILER") || dprt.equals("MAINTENANCE") || dprt.equals("HR") || dprt.equals("CANE SUPPLY") || dprt.equals("ACCOUNTING")
                 || dprt.equals("PLD") || dprt.equals("SAFETY") || dprt.equals("QA"))
                {
                String sql1="SELECT * FROM `withdrawal` WHERE Department='"+dprt+"'";
                PreparedStatement stm = connec.prepareStatement(sql1);
                ResultSet rs = stm.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                }

                //filter Dept and Date
                else if((dprt.equals("ISD") || dprt.equals("ELECTRICAL") || dprt.equals("MILL & BOILER") || dprt.equals("MAINTENANCE") || dprt.equals("HR") || dprt.equals("CANE SUPPLY") || dprt.equals("ACCOUNTING")
                 || dprt.equals("PLD") || dprt.equals("SAFETY") || dprt.equals("QA"))&& (startdt.equals(start.getText()) && enddt.equals(end.getText())))
                {
                String sql1="SELECT * FROM `withdrawal` WHERE Department='"+dprt+"' && Date>='"+startdt+"' && Date<='"+enddt+"'";
                PreparedStatement stm = connec.prepareStatement(sql1);
                ResultSet rs = stm.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                }
                
                //filter Date
                else if(startdt.equals(start.getText()) && enddt.equals(end.getText()))
                {
                String sql1="SELECT * FROM `withdrawal` WHERE Date>='"+startdt+"' && Date<='"+enddt+"'";
                PreparedStatement stm = connec.prepareStatement(sql1);
                ResultSet rs = stm.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                }
                
                
                
                //Filter Dept and GLAcct
                if((itemcode.equals("Office Supplies") && dprt.equals("ISD")) || (itemcode.equals("Office Supplies") && dprt.equals("ELECTRICAL")) || (itemcode.equals("Office Supplies") && dprt.equals("MILL & BOILER"))
                 || (itemcode.equals("Office Supplies") && dprt.equals("MAINTENANCE")) || (itemcode.equals("Office Supplies") && dprt.equals("HR")) || (itemcode.equals("Office Supplies") && dprt.equals("CANE SUPPLY"))
                 || (itemcode.equals("Office Supplies") && dprt.equals("ACCOUNTING")) || (itemcode.equals("Office Supplies") && dprt.equals("PLD")) || (itemcode.equals("Office Supplies") && dprt.equals("SAFETY"))
                 || (itemcode.equals("Office Supplies") && dprt.equals("QA")) || (itemcode.equals("Laboratory Chemicals") && dprt.equals("ISD")) || (itemcode.equals("Laboratory Chemicals") && dprt.equals("ELECTRICAL"))
                 || (itemcode.equals("Laboratory Chemicals") && dprt.equals("MILL & BOILER")) || (itemcode.equals("Laboratory Chemicals") && dprt.equals("MAINTENANCE")) || (itemcode.equals("Laboratory Chemicals") && dprt.equals("HR"))
                 || (itemcode.equals("Laboratory Chemicals") && dprt.equals("CANE SUPPLY")) || (itemcode.equals("Laboratory Chemicals") && dprt.equals("ACCOUNTING")) || (itemcode.equals("Laboratory Chemicals") && dprt.equals("PLD"))
                 || (itemcode.equals("Laboratory Chemicals") && dprt.equals("SAFETY")) || (itemcode.equals("Laboratory Chemicals") && dprt.equals("QA")) || (itemcode.equals("IT Peripherals") && dprt.equals("ISD"))
                 || (itemcode.equals("IT Peripherals") && dprt.equals("ELECTRICAL")) || (itemcode.equals("IT Peripherals") && dprt.equals("MILL & BOILER")) || (itemcode.equals("IT Peripherals") && dprt.equals("MAINTENANCE"))
                 || (itemcode.equals("IT Peripherals") && dprt.equals("HR")) || (itemcode.equals("IT Peripherals") && dprt.equals("CANE SUPPLY")) || (itemcode.equals("IT Peripherals") && dprt.equals("ACCOUNTING"))
                 || (itemcode.equals("IT Peripherals") && dprt.equals("PLD")) || (itemcode.equals("IT Peripherals") && dprt.equals("SAFETY")) || (itemcode.equals("IT Peripherals") && dprt.equals("QA"))
                 || (itemcode.equals("Repairs and Maintenance") && dprt.equals("ISD")) || (itemcode.equals("Repairs and Maintenance") && dprt.equals("ELECTRICAL")) || (itemcode.equals("Repairs and Maintenance") && dprt.equals("MILL & BOILER"))
                 || (itemcode.equals("Repairs and Maintenance") && dprt.equals("MAINTENANCE")) || (itemcode.equals("Repairs and Maintenance") && dprt.equals("HR")) || (itemcode.equals("Repairs and Maintenance") && dprt.equals("CANE SUPPLY"))
                 || (itemcode.equals("Repairs and Maintenance") && dprt.equals("PLD")) || (itemcode.equals("Repairs and Maintenance") && dprt.equals("SAFETY")) || (itemcode.equals("Repairs and Maintenance") && dprt.equals("QA"))
                 || (itemcode.equals("Factory Consumables") && dprt.equals("ISD")) || (itemcode.equals("Factory Consumables") && dprt.equals("ELECTRICAL")) || (itemcode.equals("Factory Consumables") && dprt.equals("MILL & BOILER"))
                 || (itemcode.equals("Factory Consumables") && dprt.equals("MAINTENANCE")) || (itemcode.equals("Factory Consumables") && dprt.equals("HR")) || (itemcode.equals("Factory Consumables") && dprt.equals("CANE SUPPLY"))
                 || (itemcode.equals("Factory Consumables") && dprt.equals("ACCOUNTING")) || (itemcode.equals("Factory Consumables") && dprt.equals("PLD")) || (itemcode.equals("Factory Consumables") && dprt.equals("SAFETY"))
                 || (itemcode.equals("Factory Consumables") && dprt.equals("QA")) || (itemcode.equals("Chemicals and Additives") && dprt.equals("ISD")) || (itemcode.equals("Chemicals and Additives") && dprt.equals("ELECTRICAL"))
                 || (itemcode.equals("Chemicals and Additives") && dprt.equals("MILL & BOILER")) || (itemcode.equals("Chemicals and Additives") && dprt.equals("MAINTENANCE")) || (itemcode.equals("Chemicals and Additives") && dprt.equals("HR"))
                 || (itemcode.equals("Chemicals and Additives") && dprt.equals("CANE SUPPLY")) || (itemcode.equals("Chemicals and Additives") && dprt.equals("ACCOUNTING")) || (itemcode.equals("Chemicals and Additives") && dprt.equals("PLD"))
                 || (itemcode.equals("Chemicals and Additives") && dprt.equals("SAFETY")) || (itemcode.equals("Chemicals and Additives") && dprt.equals("QA")) || (itemcode.equals("Oils and Lubricants") && dprt.equals("ISD"))
                 || (itemcode.equals("Oils and Lubricants") && dprt.equals("ELECTRICAL")) || (itemcode.equals("Oils and Lubricants") && dprt.equals("MILL & BOILER")) || (itemcode.equals("Oils and Lubricants") && dprt.equals("MAINTENANCE"))
                 || (itemcode.equals("Oils and Lubricants") && dprt.equals("HR")) || (itemcode.equals("Oils and Lubricants") && dprt.equals("CANE SUPPLY")) || (itemcode.equals("Oils and Lubricants") && dprt.equals("ACCOUNTING"))
                 || (itemcode.equals("Oils and Lubricants") && dprt.equals("PLD")) || (itemcode.equals("Oils and Lubricants") && dprt.equals("SAFETY")) || (itemcode.equals("Oils and Lubricants") && dprt.equals("QA"))
                 || (itemcode.equals("Tires, Flaps, Inner Tubes") && dprt.equals("ISD")) || (itemcode.equals("Tires, Flaps, Inner Tubes") && dprt.equals("ELECTRICAL")) || (itemcode.equals("Tires, Flaps, Inner Tubes") && dprt.equals("MILL & BOILER"))
                 || (itemcode.equals("Tires, Flaps, Inner Tubes") && dprt.equals("MAINTENANCE")) || (itemcode.equals("Tires, Flaps, Inner Tubes") && dprt.equals("HR")) || (itemcode.equals("Tires, Flaps, Inner Tubes") && dprt.equals("CANE SUPPLY"))
                 || (itemcode.equals("Tires, Flaps, Inner Tubes") && dprt.equals("ACCOUNTING")) || (itemcode.equals("Tires, Flaps, Inner Tubes") && dprt.equals("PLD")) || (itemcode.equals("Tires, Flaps, Inner Tubes") && dprt.equals("SAFETY")) 
                 || (itemcode.equals("Tires, Flaps, Inner Tubes") && dprt.equals("QA")) || (itemcode.equals("Miscellaneous") && dprt.equals("ISD")) || (itemcode.equals("Miscellaneous") && dprt.equals("ELECTRICAL")) || (itemcode.equals("Miscellaneous") && dprt.equals("MILL & BOILER"))
                 || (itemcode.equals("Miscellaneous") && dprt.equals("MAINTENANCE")) || (itemcode.equals("Miscellaneous") && dprt.equals("HR")) || (itemcode.equals("Miscellaneous") && dprt.equals("CANE SUPPLY")) || (itemcode.equals("Miscellaneous") && dprt.equals("ACCOUNTING"))
                 || (itemcode.equals("Miscellaneous") && dprt.equals("PLD")) || (itemcode.equals("Miscellaneous") && dprt.equals("SAFETY")) || (itemcode.equals("Miscellaneous") && dprt.equals("QA")) || (itemcode.equals("Building and Structures") && dprt.equals("ISD"))
                 || (itemcode.equals("Building and Structures") && dprt.equals("ELECTRICAL")) || (itemcode.equals("Building and Structures") && dprt.equals("MILL & BOILER")) || (itemcode.equals("Building and Structures") && dprt.equals("MAINTENANCE"))
                 || (itemcode.equals("Building and Structures") && dprt.equals("HR")) || (itemcode.equals("Building and Structures") && dprt.equals("CANE SUPPLY")) || (itemcode.equals("Building and Structures") && dprt.equals("ACCOUNTING"))
                 || (itemcode.equals("Building and Structures") && dprt.equals("PLD")) || (itemcode.equals("Building and Structures") && dprt.equals("SAFETY")) || (itemcode.equals("Building and Structures") && dprt.equals("QA"))
                 || (itemcode.equals("Warehouse and Tanks") && dprt.equals("ISD")) || (itemcode.equals("Warehouse and Tanks") && dprt.equals("ELECTRICAL")) || (itemcode.equals("Warehouse and Tanks") && dprt.equals("MILL & BOILER"))
                 || (itemcode.equals("Warehouse and Tanks") && dprt.equals("MAINTENANCE")) || (itemcode.equals("Warehouse and Tanks") && dprt.equals("HR")) || (itemcode.equals("Warehouse and Tanks") && dprt.equals("CANE SUPPLY"))
                 || (itemcode.equals("Warehouse and Tanks") && dprt.equals("ACCOUNTING")) || (itemcode.equals("Warehouse and Tanks") && dprt.equals("PLD")) || (itemcode.equals("Warehouse and Tanks") && dprt.equals("SAFETY"))
                 || (itemcode.equals("Warehouse and Tanks") && dprt.equals("QA")) || (itemcode.equals("Water Canal") && dprt.equals("ISD")) || (itemcode.equals("Water Canal") && dprt.equals("ELECTRICAL")) || (itemcode.equals("Water Canal") && dprt.equals("MILL & BOILER"))
                 || (itemcode.equals("Water Canal") && dprt.equals("MAINTENANCE")) || (itemcode.equals("Water Canal") && dprt.equals("HR")) || (itemcode.equals("Water Canal") && dprt.equals("CANE SUPPLY")) || (itemcode.equals("Water Canal") && dprt.equals("ACCOUNTING"))
                 || (itemcode.equals("Water Canal") && dprt.equals("PLD")) || (itemcode.equals("Water Canal") && dprt.equals("SAFETY")) || (itemcode.equals("Water Canal") && dprt.equals("QA")) || (itemcode.equals("Water Sewage and Drainage") && dprt.equals("ISD"))
                 || (itemcode.equals("Water Sewage and Drainage") && dprt.equals("ELECTRICAL")) || (itemcode.equals("Water Sewage and Drainage") && dprt.equals("MILL & BOILER")) || (itemcode.equals("Water Sewage and Drainage") && dprt.equals("MAINTENANCE"))
                 || (itemcode.equals("Water Sewage and Drainage") && dprt.equals("HR")) || (itemcode.equals("Water Sewage and Drainage") && dprt.equals("CANE SUPPLY")) || (itemcode.equals("Water Sewage and Drainage") && dprt.equals("ACCOUNTING"))
                 || (itemcode.equals("Water Sewage and Drainage") && dprt.equals("PLD")) || (itemcode.equals("Water Sewage and Drainage") && dprt.equals("SAFETY")) || (itemcode.equals("Water Sewage and Drainage") && dprt.equals("QA"))
                 || (itemcode.equals("Residential Houses") && dprt.equals("ISD")) || (itemcode.equals("Residential Houses") && dprt.equals("ELECTRICAL")) || (itemcode.equals("Residential Houses") && dprt.equals("MILL & BOILER"))
                 || (itemcode.equals("Residential Houses") && dprt.equals("MAINTENANCE")) || (itemcode.equals("Residential Houses") && dprt.equals("HR")) || (itemcode.equals("Residential Houses") && dprt.equals("CANE SUPPLY")) || (itemcode.equals("Residential Houses") && dprt.equals("ACCOUNTING"))
                 || (itemcode.equals("Residential Houses") && dprt.equals("PLD")) || (itemcode.equals("Residential Houses") && dprt.equals("SAFETY")) || (itemcode.equals("Residential Houses") && dprt.equals("QA")) || (itemcode.equals("Mill Machineries and Equipment") && dprt.equals("ISD"))
                 || (itemcode.equals("Mill Machineries and Equipment") && dprt.equals("ELECTRICAL")) || (itemcode.equals("Mill Machineries and Equipment") && dprt.equals("MILL & BOILER")) || (itemcode.equals("Mill Machineries and Equipment") && dprt.equals("MAINTENANCE"))
                 || (itemcode.equals("Mill Machineries and Equipment") && dprt.equals("HR")) || (itemcode.equals("Mill Machineries and Equipment") && dprt.equals("CANE SUPPLY")) || (itemcode.equals("Mill Machineries and Equipment") && dprt.equals("ACCOUNTING"))
                 || (itemcode.equals("Mill Machineries and Equipment") && dprt.equals("PLD")) || (itemcode.equals("Mill Machineries and Equipment") && dprt.equals("SAFETY")) || (itemcode.equals("Mill Machineries and Equipment") && dprt.equals("QA"))
                 || (itemcode.equals("Mill other assets") && dprt.equals("ISD")) || (itemcode.equals("Mill other assets") && dprt.equals("ELECTRICAL")) || (itemcode.equals("Mill other assets") && dprt.equals("MILL & BOILER")) || (itemcode.equals("Mill other assets") && dprt.equals("MAINTENANCE"))
                 || (itemcode.equals("Mill other assets") && dprt.equals("HR")) || (itemcode.equals("Mill other assets") && dprt.equals("CANE SUPPLY")) || (itemcode.equals("Mill other assets") && dprt.equals("ACCOUNTING")) || (itemcode.equals("Mill other assets") && dprt.equals("PLD"))
                 || (itemcode.equals("Mill other assets") && dprt.equals("SAFETY")) || (itemcode.equals("Mill other assets") && dprt.equals("QA")) || (itemcode.equals("Office Furnitures and fixtures") && dprt.equals("ISD")) || (itemcode.equals("Office Furnitures and fixtures") && dprt.equals("ELECTRICAL"))
                 || (itemcode.equals("Office Furnitures and fixtures") && dprt.equals("MILL & BOILER")) || (itemcode.equals("Office Furnitures and fixtures") && dprt.equals("MAINTENANCE")) || (itemcode.equals("Office Furnitures and fixtures") && dprt.equals("HR"))
                 || (itemcode.equals("Office Furnitures and fixtures") && dprt.equals("CANE SUPPLY")) || (itemcode.equals("Office Furnitures and fixtures") && dprt.equals("ACCOUNTING")) || (itemcode.equals("Office Furnitures and fixtures") && dprt.equals("PLD"))
                 || (itemcode.equals("Office Furnitures and fixtures") && dprt.equals("SAFETY")) || (itemcode.equals("Office Furnitures and fixtures") && dprt.equals("QA")) || (itemcode.equals("Office Tools and Equipment") && dprt.equals("ISD")) || (itemcode.equals("Office Tools and Equipment") && dprt.equals("ELECTRICAL"))
                 || (itemcode.equals("Office Tools and Equipment") && dprt.equals("MILL & BOILER")) || (itemcode.equals("Office Tools and Equipment") && dprt.equals("MAINTENANCE")) || (itemcode.equals("Office Tools and Equipment") && dprt.equals("HR")) || (itemcode.equals("Office Tools and Equipment") && dprt.equals("CANE SUPPLY"))
                 || (itemcode.equals("Office Tools and Equipment") && dprt.equals("ACCOUNTING")) || (itemcode.equals("Office Tools and Equipment") && dprt.equals("PLD")) || (itemcode.equals("Office Tools and Equipment") && dprt.equals("SAFETY")) || (itemcode.equals("Office Tools and Equipment") && dprt.equals("QA"))
                 || (itemcode.equals("House Furnitures and Fixtures") && dprt.equals("ISD")) || (itemcode.equals("House Furnitures and Fixtures") && dprt.equals("ELECTRICAL")) || (itemcode.equals("House Furnitures and Fixtures") && dprt.equals("MILL & BOILER")) || (itemcode.equals("House Furnitures and Fixtures") && dprt.equals("MAINTENANCE"))
                 || (itemcode.equals("House Furnitures and Fixtures") && dprt.equals("HR")) || (itemcode.equals("House Furnitures and Fixtures") && dprt.equals("CANE SUPPLY")) || (itemcode.equals("House Furnitures and Fixtures") && dprt.equals("ACCOUNTING")) || (itemcode.equals("House Furnitures and Fixtures") && dprt.equals("PLD"))
                 || (itemcode.equals("House Furnitures and Fixtures") && dprt.equals("SAFETY")) || (itemcode.equals("House Furnitures and Fixtures") && dprt.equals("QA")) || (itemcode.equals("Communication System") && dprt.equals("ISD")) || (itemcode.equals("Communication System") && dprt.equals("ELECTRICAL"))
                 || (itemcode.equals("Communication System") && dprt.equals("MILL & BOILER")) || (itemcode.equals("Communication System") && dprt.equals("MAINTENANCE")) || (itemcode.equals("Communication System") && dprt.equals("HR")) || (itemcode.equals("Communication System") && dprt.equals("CANE SUPPLY")) || (itemcode.equals("Communication System") && dprt.equals("ACCOUNTING"))
                 || (itemcode.equals("Communication System") && dprt.equals("PLD")) || (itemcode.equals("Communication System") && dprt.equals("SAFETY")) || (itemcode.equals("Communication System") && dprt.equals("QA")) || (itemcode.equals("Cane Hauling Equipments") && dprt.equals("ISD")) || (itemcode.equals("Cane Hauling Equipments") && dprt.equals("ELECTRICAL"))
                 || (itemcode.equals("Cane Hauling Equipments") && dprt.equals("MILL & BOILER")) || (itemcode.equals("Cane Hauling Equipments") && dprt.equals("MAINTENANCE")) || (itemcode.equals("Cane Hauling Equipments") && dprt.equals("HR")) || (itemcode.equals("Cane Hauling Equipments") && dprt.equals("CANE SUPPLY"))
                 || (itemcode.equals("Cane Hauling Equipments") && dprt.equals("ACCOUNTING")) || (itemcode.equals("Cane Hauling Equipments") && dprt.equals("PLD")) || (itemcode.equals("Cane Hauling Equipments") && dprt.equals("SAFETY")) || (itemcode.equals("Cane Hauling Equipments") && dprt.equals("QA"))
                 || (itemcode.equals("Road Equipments") && dprt.equals("ISD")) || (itemcode.equals("Road Equipments") && dprt.equals("ELECTRICAL")) || (itemcode.equals("Road Equipments") && dprt.equals("MILL & BOILER")) || (itemcode.equals("Road Equipments") && dprt.equals("MAINTENANCE")) || (itemcode.equals("Road Equipments") && dprt.equals("HR"))
                 || (itemcode.equals("Road Equipments") && dprt.equals("CANE SUPPLY")) || (itemcode.equals("Road Equipments") && dprt.equals("ACCOUNTING")) || (itemcode.equals("Road Equipments") && dprt.equals("PLD")) || (itemcode.equals("Road Equipments") && dprt.equals("SAFETY"))
                 || (itemcode.equals("Road Equipments") && dprt.equals("QA")) || (itemcode.equals("Farm Equipments") && dprt.equals("ISD")) || (itemcode.equals("Farm Equipments") && dprt.equals("ELECTRICAL")) || (itemcode.equals("Farm Equipments") && dprt.equals("MILL & BOILER")) || (itemcode.equals("Farm Equipments") && dprt.equals("MAINTENANCE"))
                 || (itemcode.equals("Farm Equipments") && dprt.equals("HR")) || (itemcode.equals("Farm Equipments") && dprt.equals("CANE SUPPLY")) || (itemcode.equals("Farm Equipments") && dprt.equals("ACCOUNTING")) || (itemcode.equals("Farm Equipments") && dprt.equals("PLD")) || (itemcode.equals("Farm Equipments") && dprt.equals("SAFETY"))
                 || (itemcode.equals("Farm Equipments") && dprt.equals("QA")) || (itemcode.equals("Laboratory Equipments") && dprt.equals("ISD")) || (itemcode.equals("Laboratory Equipments") && dprt.equals("ELECTRICAL")) || (itemcode.equals("Laboratory Equipments") && dprt.equals("MILL & BOILER")) || (itemcode.equals("Laboratory Equipments") && dprt.equals("MAINTENANCE"))
                 || (itemcode.equals("Laboratory Equipments") && dprt.equals("HR")) || (itemcode.equals("Laboratory Equipments") && dprt.equals("CANE SUPPLY")) || (itemcode.equals("Laboratory Equipments") && dprt.equals("ACCOUNTING")) || (itemcode.equals("Laboratory Equipments") && dprt.equals("PLD")) || (itemcode.equals("Laboratory Equipments") && dprt.equals("SAFETY"))
                 || (itemcode.equals("Laboratory Equipments") && dprt.equals("QA")) || (itemcode.equals("Factory Tools") && dprt.equals("ISD")) || (itemcode.equals("Factory Tools") && dprt.equals("ELECTRICAL")) || (itemcode.equals("Factory Tools") && dprt.equals("MILL & BOILER")) || (itemcode.equals("Factory Tools") && dprt.equals("MAINTENANCE"))
                 || (itemcode.equals("Factory Tools") && dprt.equals("HR")) || (itemcode.equals("Factory Tools") && dprt.equals("CANE SUPPLY")) || (itemcode.equals("Factory Tools") && dprt.equals("ACCOUNTING")) || (itemcode.equals("Factory Tools") && dprt.equals("PLD")) || (itemcode.equals("Factory Tools") && dprt.equals("SAFETY"))
                 || (itemcode.equals("Factory Tools") && dprt.equals("QA"))){
               String sql1="SELECT * FROM `withdrawal` WHERE GLAcct='"+itemcode+"' && Department='"+dprt+"'";
               PreparedStatement stm = connec.prepareStatement(sql1);
               ResultSet rs = stm.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                }
               
               //filter All
               else if ((itemcode.equals("Office Supplies") || itemcode.equals("Laboratory Chemicals") || itemcode.equals("IT Peripherals") || itemcode.equals("Repairs and Maintenance") || itemcode.equals("Chemicals and Additives") || itemcode.equals("Factory Consumables")
                || itemcode.equals("Tires, Flaps, Inner Tubes") || itemcode.equals("Oils and Lubricants") || itemcode.equals("Miscellaneous") || itemcode.equals("Building and Structures") || itemcode.equals("Warehouse and Tanks") || itemcode.equals("Water Canal")
                || itemcode.equals("Water Sewage and Drainage") || itemcode.equals("Residential Houses") || itemcode.equals("Mill Machineries and Equipment") || itemcode.equals("Mill other assets")
                || itemcode.equals("Office Furnitures and fixtures") || itemcode.equals("Office Tools and Equipment") || itemcode.equals("House Furnitures and Fixtures") || itemcode.equals("Communication System")
                || itemcode.equals("Cane Hauling Equipments") || itemcode.equals("Road Equipments") || itemcode.equals("Farm Equipments") || itemcode.equals("Laboratory Equipments") || itemcode.equals("Factory Tools"))
                && (dprt.equals("ISD") || dprt.equals("ELECTRICAL") || dprt.equals("MILL & BOILER") || dprt.equals("MAINTENANCE") || dprt.equals("HR") || dprt.equals("CANE SUPPLY") || dprt.equals("ACCOUNTING")
                 || dprt.equals("PLD") || dprt.equals("SAFETY") || dprt.equals("QA")) && (startdt.equals(start.getText()) && enddt.equals(end.getText())))
                {
                String sql1="SELECT * FROM `withdrawal` WHERE GLAcct='"+itemcode+"' && Department='"+dprt+"' && Date>='"+startdt+"' && Date<='"+enddt+"'";
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
            java.util.logging.Logger.getLogger(tabledraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabledraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabledraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabledraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabledraw().setVisible(true);
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
