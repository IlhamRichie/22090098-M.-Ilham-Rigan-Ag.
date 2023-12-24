/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorycashiering;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CashierManagement extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement pst1 = null;
    ResultSet rs = null;

    public CashierManagement() {
        initComponents();
        this.setLocationRelativeTo(null);

//        displayproducts();
        displayTransaction();
        dispProNamePrice();
//        productDetailsCombobox();
//        comboSql();
    }

//    public void displayproducts() {
//        DefaultTableModel producttable = (DefaultTableModel) productPriceTbl.getModel();
//        int count = 0;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management_system", "root", "")) {
//                Statement stmt = con.createStatement();
//
//                ResultSet datas = stmt.executeQuery("SELECT * FROM `inventory`");
//                while (datas.next()) {
//                    count = 1;
//                    producttable.addRow(new Object[]{datas.getString("ProductName"), datas.getString("BuyingPrice"), "Php " + datas.getString("SellingPrice") + ".00", datas.getString("quantity"), datas.getString("UnitOfMeasure"), datas.getString("description")});
//                }
//            }
//        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }
    
    
    public void dispProNamePrice() {
        DefaultTableModel priceproducttable = (DefaultTableModel) productPriceTbl.getModel();
        int count = 0;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management_system", "root", "")) {
                Statement stmt = con.createStatement();

                ResultSet datas = stmt.executeQuery("SELECT * FROM `inventory`");
                while (datas.next()) {
                    count = 1;
                    priceproducttable.addRow(new Object[]{datas.getString("ProductName"), datas.getString("SellingPrice"), datas.getString("quantity")});
                }
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

//    private void comboSql() {
//        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management_system", "root", "")) {
//            Class.forName("com.mysql.jdbc.Driver");
//
//            String proName = (String) productscombobox.getSelectedItem();
//            String sql = "SELECT `ProductName`FROM `inventory`";
////            String sql = "SELECT * FROM `inventory` ";
//            pst = con.prepareStatement(sql);
//            pst.setString(1, proName);
//            rs = pst.executeQuery();
//
//            while (rs.next()) {
//                String price = rs.getString("SellingPrice");
//                this.priceField.setText(price);
//
//            }
////            float pricee = Float.parseFloat(rs.getString(5));
////            priceField.setText(Float.toString(pricee).trim());
////            if (rs.next()) {
////                String price = rs.getString("SellingPrice");
////                this.priceField.setText(price);
////            }
//
//        } catch (Exception e) {
//
//        }
//
//    }
    public void displayTransaction() {
        DefaultTableModel cashierTransactionModel = (DefaultTableModel) sellDetailsTables.getModel();
        
        String cashierTransact = (String) this.cashierIdField.getText();

        int count = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management_system", "root", "")) {
                Statement stmt = con.createStatement();
                ResultSet transactdata = stmt.executeQuery("SELECT * FROM `ctransactions`WHERE `UserID` = '" + cashierTransact +"'");

//                ResultSet datas = stmt.executeQuery("SELECT a.TransactionDate, a.UserID, b.ProductName, a.TypeOfTransaction, b.Quantity, a.Quantity AS \"Added Quantity\" FROM stransactions a, inventory b WHERE a.STransactionID=b.InventoryID;");
                while (transactdata.next()) {
                    count = 0;
                    cashierTransactionModel.addRow(new Object[]{transactdata.getString("CTransactionID"), transactdata.getString("productName"), transactdata.getString("quantity"), transactdata.getString("totalAmount"), transactdata.getString("UserID"), transactdata.getString("Date")});
                }
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        logOutBtn = new javax.swing.JButton();
        cashierTransactionBtn = new javax.swing.JButton();
        sellProBtn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        cashierSellBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        totalAmountField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        productquantityfield = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        proNameField = new javax.swing.JTextField();
        resetBtn = new javax.swing.JButton();
        availQuantiField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sellDetailsTables = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        datesoldlabel = new javax.swing.JLabel();
        productnamelabel = new javax.swing.JLabel();
        productquantitylabel = new javax.swing.JLabel();
        producttotallabel = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        title3 = new javax.swing.JLabel();
        sellCashierProBtn = new javax.swing.JPanel();
        logOutBtn1 = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        sellCashierBtn = new javax.swing.JButton();
        refreshSellDetailsBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        productPriceTbl = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        cashierNameField = new javax.swing.JTextField();
        cashierIdField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 153, 255));
        jTabbedPane1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Untitled design(21).png"))); // NOI18N
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 570, 630));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 840, 660));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(0, 153, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logOutBtn.setBackground(new java.awt.Color(0, 153, 255));
        logOutBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        logOutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logOutBtn.setText("Log Out");
        logOutBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        logOutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutBtnMouseClicked(evt);
            }
        });
        jPanel9.add(logOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 390, 60));

        cashierTransactionBtn.setBackground(new java.awt.Color(0, 153, 255));
        cashierTransactionBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cashierTransactionBtn.setForeground(new java.awt.Color(255, 255, 255));
        cashierTransactionBtn.setText("Beranda");
        cashierTransactionBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        cashierTransactionBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cashierTransactionBtnMouseClicked(evt);
            }
        });
        jPanel9.add(cashierTransactionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 390, 60));

        sellProBtn.setBackground(new java.awt.Color(0, 153, 255));
        sellProBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sellProBtn.setForeground(new java.awt.Color(255, 255, 255));
        sellProBtn.setText("Jual Produk");
        sellProBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        sellProBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellProBtnMouseClicked(evt);
            }
        });
        jPanel9.add(sellProBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 390, 60));

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 470, 670));

        jPanel7.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 670, 730));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Home", jPanel4);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Kasir UMKM");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 200, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(0, 153, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cashierSellBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cashierSellBtn.setForeground(new java.awt.Color(0, 153, 255));
        cashierSellBtn.setText("JUAL");
        cashierSellBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cashierSellBtnMouseClicked(evt);
            }
        });
        jPanel11.add(cashierSellBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 220, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Total Rp.");
        jPanel11.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 70, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Quantity:");
        jPanel11.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        jPanel11.add(totalAmountField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 230, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("Product Name:");
        jPanel11.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        productquantityfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productquantityfieldActionPerformed(evt);
            }
        });
        productquantityfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                productquantityfieldKeyReleased(evt);
            }
        });
        jPanel11.add(productquantityfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 230, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Harga Rp.");
        jPanel11.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 70, -1));
        jPanel11.add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 230, 30));
        jPanel11.add(proNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 230, 30));

        resetBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        resetBtn.setForeground(new java.awt.Color(0, 153, 255));
        resetBtn.setText("Reset");
        resetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetBtnMouseClicked(evt);
            }
        });
        jPanel11.add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 220, 30));
        jPanel11.add(availQuantiField, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 80, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Stok Tersedia :");
        jPanel11.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 110, -1));

        sellDetailsTables.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Transaksi", "Nama Produk", "Jumlah", "Jumlah Total", "ID Pengguna", "Tanggal"
            }
        ));
        sellDetailsTables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellDetailsTablesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sellDetailsTables);

        jPanel12.setBackground(new java.awt.Color(0, 153, 255));
        jPanel12.setForeground(new java.awt.Color(153, 0, 0));

        title.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        title.setForeground(java.awt.Color.white);
        title.setText("KASIR UMKM INDONESIA");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        datesoldlabel.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N

        productnamelabel.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N

        productquantitylabel.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N

        producttotallabel.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N

        title1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        title1.setForeground(java.awt.Color.white);
        title1.setText("Tegal, Jawa Tengah, Indonesia");
        title1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        title2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        title2.setForeground(java.awt.Color.white);
        title2.setText("AYO DUKUNG TERUS PELAKU USAHA MIKRO KECIL DAN MENENGAH");
        title2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        title3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        title3.setForeground(java.awt.Color.white);
        title3.setText("Selamat Berbelanja");
        title3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title1)
                .addGap(120, 120, 120))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 48, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(title2)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(datesoldlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                        .addComponent(productnamelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(productquantitylabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(producttotallabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(48, 48, 48))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(title))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(title3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(datesoldlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(productnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(productquantitylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(producttotallabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(title3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        sellCashierProBtn.setBackground(new java.awt.Color(153, 0, 51));
        sellCashierProBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logOutBtn1.setText("Log Out");
        logOutBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutBtn1MouseClicked(evt);
            }
        });
        logOutBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtn1ActionPerformed(evt);
            }
        });
        sellCashierProBtn.add(logOutBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 180, 30));

        homeBtn.setText("Beranda");
        homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBtnMouseClicked(evt);
            }
        });
        sellCashierProBtn.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 180, 30));

        sellCashierBtn.setText("Penjualan Produk");
        sellCashierBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellCashierBtnMouseClicked(evt);
            }
        });
        sellCashierProBtn.add(sellCashierBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 180, 30));

        refreshSellDetailsBtn.setBackground(new java.awt.Color(0, 153, 255));
        refreshSellDetailsBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        refreshSellDetailsBtn.setForeground(new java.awt.Color(255, 255, 255));
        refreshSellDetailsBtn.setText("Lihat Transaksi Anda");
        refreshSellDetailsBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        refreshSellDetailsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshSellDetailsBtnMouseClicked(evt);
            }
        });
        refreshSellDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshSellDetailsBtnActionPerformed(evt);
            }
        });

        productPriceTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produk", "Harga", "Barang Tersedia"
            }
        ));
        productPriceTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productPriceTblMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(productPriceTbl);

        jPanel16.setBackground(new java.awt.Color(0, 153, 255));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Pilih Produk di bagian kiri");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(refreshSellDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sellCashierProBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
                                .addComponent(jScrollPane1)))))
                .addGap(0, 60, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(refreshSellDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sellCashierProBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 129, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Penjualan Produk", jPanel6);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1400, 730));

        jPanel5.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistem Manajemen Kasir");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(296, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 900, 50));

        jPanel17.setBackground(new java.awt.Color(0, 153, 255));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cashierNameField.setFont(new java.awt.Font("Courier New", 3, 14)); // NOI18N
        jPanel17.add(cashierNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 246, 30));

        jPanel2.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 310, 50));

        cashierIdField.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        cashierIdField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));
        jPanel2.add(cashierIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 50, 50));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("ID Anda :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 23));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 770));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutBtnMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Are you sure to logout?", "Warning", JOptionPane.YES_NO_OPTION);
        if (a == JOptionPane.YES_OPTION) {
            new LoginPage().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.getRootFrame().dispose();
        }
    }//GEN-LAST:event_logOutBtnMouseClicked

    private void cashierTransactionBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cashierTransactionBtnMouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_cashierTransactionBtnMouseClicked

    private void sellProBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellProBtnMouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_sellProBtnMouseClicked

    private void productPriceTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productPriceTblMouseClicked
        DefaultTableModel priceproducttable = (DefaultTableModel) productPriceTbl.getModel();

        String proName = (String) priceproducttable.getValueAt(productPriceTbl.getSelectedRow(), 0);
        String price = (String) priceproducttable.getValueAt(productPriceTbl.getSelectedRow(), 1);
        String quanti = (String) priceproducttable.getValueAt(productPriceTbl.getSelectedRow(), 2);

        this.proNameField.setText(proName);
        this.proNameField.setEditable(false);
        this.priceField.setText(price);
        this.priceField.setEditable(false);
        this.availQuantiField.setText(quanti);
        this.availQuantiField.setEditable(false);
    }//GEN-LAST:event_productPriceTblMouseClicked

    private void refreshSellDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshSellDetailsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshSellDetailsBtnActionPerformed

    private void refreshSellDetailsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshSellDetailsBtnMouseClicked
        DefaultTableModel priceproducttable = (DefaultTableModel) productPriceTbl.getModel();
        int priceCount = 0;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management_system", "root", "")) {
                Statement stmt = con.createStatement();

                ResultSet datas = stmt.executeQuery("SELECT * FROM `inventory`");

                while (priceproducttable.getRowCount() > 0) {
                    priceproducttable.removeRow(0);
                }
                while (datas.next()) {
                    priceCount = 1;
                    priceproducttable.addRow(new Object[]{datas.getString("ProductName"),datas.getString("SellingPrice"), datas.getString("quantity")});
                }
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }

        DefaultTableModel cashierTransactionModel = (DefaultTableModel) sellDetailsTables.getModel();
        String cashierTransact = (String) this.cashierIdField.getText();

        int count = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management_system", "root", "")) {
                Statement stmt = con.createStatement();
                ResultSet sellData = stmt.executeQuery("SELECT `CTransactionID`, `productName`, `Quantity`, `totalAmount`, `UserID`, `Date` FROM `ctransactions` WHERE `UserID` = '" + cashierTransact +"'");
                //                ResultSet newData = stmt.executeQuery("SELECT a.TransactionDate, a.UserID, b.ProductName, a.TypeOfTransaction, b.Quantity, a.Quantity AS \"Added Quantity\" FROM stransactions a, inventory b WHERE a.STransactionID=b.InventoryID;");
                while (cashierTransactionModel.getRowCount() > 0) {
                    cashierTransactionModel.removeRow(0);
                }

                while (sellData.next()) {
                    count = 0;
                    cashierTransactionModel.addRow(new Object[]{sellData.getString("CTransactionId"),sellData.getString("productName"),sellData.getString("quantity"),  "Rp" + sellData.getString("totalAmount") + ".00", sellData.getString("userID"), sellData.getString("date")});

                }
            }

        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_refreshSellDetailsBtnMouseClicked

    private void sellCashierBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellCashierBtnMouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_sellCashierBtnMouseClicked

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
         jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_homeBtnMouseClicked

    private void logOutBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutBtn1MouseClicked
        
        int a = JOptionPane.showConfirmDialog(null, "Are you sure to logout?", "Warning", JOptionPane.YES_NO_OPTION);
        if (a == JOptionPane.YES_OPTION) {
            new LoginPage().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.getRootFrame().dispose();
        }
    }//GEN-LAST:event_logOutBtn1MouseClicked

    private void sellDetailsTablesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellDetailsTablesMouseClicked

    }//GEN-LAST:event_sellDetailsTablesMouseClicked

    private void resetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetBtnMouseClicked
        if (evt.getSource() == resetBtn) {
            this.proNameField.setText(null);
            this.totalAmountField.setText(null);
            this.productquantityfield.setText(null);
            this.priceField.setText(null);
            this.availQuantiField.setText(null);
        }
    }//GEN-LAST:event_resetBtnMouseClicked

    private void productquantityfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productquantityfieldKeyReleased
        if (this.productquantityfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Input Quantity", "Alert", JOptionPane.ERROR_MESSAGE);
            this.totalAmountField.setText(null);

        } else {

            try {
                int inputQuantity = Integer.parseInt(this.productquantityfield.getText());
                int proPrice = Integer.parseInt(this.priceField.getText());

                int total = inputQuantity * proPrice;

                this.totalAmountField.setText(Integer.toString(total));

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_productquantityfieldKeyReleased

    private void productquantityfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productquantityfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productquantityfieldActionPerformed

    private void cashierSellBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cashierSellBtnMouseClicked

        //        DefaultTableModel cahiersTableModel = (DefaultTableModel) sellDetailsTables.getModel();
        if ((this.proNameField.getText().isEmpty()) || this.productquantityfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Choose a product...", "Alert", JOptionPane.ERROR_MESSAGE);

        } else if (Integer.parseInt(availQuantiField.getText()) <= 10) {
            JOptionPane.showMessageDialog(null, "Low Inventory. Not enough quantity ", "Alert", JOptionPane.ERROR_MESSAGE);

        } else {
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter orderDate = DateTimeFormatter.ofPattern("E, MMM dd yyyy");

            String newOrderDate = myDateObj.format(orderDate);

            String productname = this.proNameField.getText();
            String amount = this.totalAmountField.getText();
            String quantity = this.productquantityfield.getText();
            String cashierAccountId = cashierIdField.getText();

            this.title.setText("Kasir UMKM GO-UMKM");
            this.datesoldlabel.setText("Tanggal: " + myDateObj.format(orderDate));
            this.productnamelabel.setText("Nama Produk: " + (String) this.proNameField.getText());
            this.productquantitylabel.setText("Kuantitas: " + Integer.parseInt(this.productquantityfield.getText()) + " pack/s");
            this.producttotallabel.setText("Total: Rp" + Integer.parseInt(this.totalAmountField.getText()) + ".00");
            //from here
            try {
                DefaultTableModel cahiersTableModel = (DefaultTableModel) sellDetailsTables.getModel();
                Class.forName("com.mysql.jdbc.Driver");
                String productName = this.proNameField.getText();
                try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/management_system", "root", "")) {
                    Statement stmt = con.createStatement();
                    String query1 = "INSERT INTO `CTransactions`(`productName`, `Quantity`, `totalAmount`, `UserID`, Date) VALUES" + "('" + productname + "','" + quantity + "','" + amount + "','" + cashierAccountId + "','" + newOrderDate + "')";
                    stmt.executeUpdate(query1);

                    int count;
                    ResultSet data = stmt.executeQuery("SELECT * FROM `inventory` WHERE ProductName = '" + productName + "'");
                    if (data.next()) {
                        int qnty = Integer.parseInt(data.getString("Quantity")) - Integer.parseInt(this.productquantityfield.getText());
                        System.out.println(productName);
                        System.out.println(data.getString("Quantity"));
                        System.out.println(qnty);
                        String newQnty = Integer.toString(qnty);
                        String query2 = "UPDATE `inventory` SET `Quantity`='" + newQnty + "' WHERE ProductName= '" + productName + "'";
                        stmt.executeUpdate(query2);
                    }

                    ResultSet newData = stmt.executeQuery("SELECT * FROM `CTransactions`");
                    while (newData.next()) {
                        count = 0;
                        cahiersTableModel.removeRow(count);
                        cahiersTableModel.addRow(new Object[]{newData.getString("CTransactionID"), newData.getString("productName"), newData.getString("Quantity"),"Rp" + newData.getString("totalAmount") + ".00", newData.getString("userID"), newData.getString("date")});
                    }
                    con.close();
                }
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e);
            }
            this.proNameField.setText(null);
            this.totalAmountField.setText(null);
            this.productquantityfield.setText(null);
            this.priceField.setText(null);
            this.availQuantiField.setText(null);

        }
    }//GEN-LAST:event_cashierSellBtnMouseClicked

    private void logOutBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logOutBtn1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CashierManagement.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierManagement.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierManagement.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierManagement.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availQuantiField;
    public javax.swing.JTextField cashierIdField;
    public javax.swing.JTextField cashierNameField;
    private javax.swing.JButton cashierSellBtn;
    private javax.swing.JButton cashierTransactionBtn;
    private javax.swing.JLabel datesoldlabel;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JButton logOutBtn1;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField proNameField;
    private javax.swing.JTable productPriceTbl;
    private javax.swing.JLabel productnamelabel;
    private javax.swing.JTextField productquantityfield;
    private javax.swing.JLabel productquantitylabel;
    private javax.swing.JLabel producttotallabel;
    private javax.swing.JButton refreshSellDetailsBtn;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton sellCashierBtn;
    private javax.swing.JPanel sellCashierProBtn;
    private javax.swing.JTable sellDetailsTables;
    private javax.swing.JButton sellProBtn;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JTextField totalAmountField;
    // End of variables declaration//GEN-END:variables
}
