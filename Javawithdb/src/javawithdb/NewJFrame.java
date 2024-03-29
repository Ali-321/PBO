/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package latihan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author D2A
 */
public class NewJFrame extends javax.swing.JFrame {

    
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        
        initComponents();
    }
    
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1/Penjualan";
    static final String USER ="root";
    static final String PASS = "";
    static Scanner sc = new Scanner(System.in);
    
    
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtStokMin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNamaBrg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSatuan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtStokBrg = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kode Barang");

        txtKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKode(evt);
            }
        });

        jLabel2.setText("Nama Barang");

        txtStokMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStokMin(evt);
            }
        });

        jLabel3.setText("Satuan");

        txtNamaBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaBrg(evt);
            }
        });

        jLabel4.setText("Stok Barang");

        txtSatuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSatuan(evt);
            }
        });

        jLabel5.setText("Stok Minimal");

        txtStokBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStokBrg(evt);
            }
        });

        jButton1.setText("Simpan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpan(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "Kode Barang", "Nama Barang", "Satuan", "Stok Barang ", "Stok Minimal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtStokBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(5, 5, 5))
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(jLabel5))
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtStokMin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNamaBrg, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNamaBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStokMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStokBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(44, 44, 44)
                        .addComponent(jButton1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpan
        // TODO add your handling code here:
        String kode = txtKode.getText().toString().trim();
        int stok = Integer.parseInt(txtStokBrg.getText());
        String nama = txtNamaBrg.getText();
        String satuan = txtSatuan.getText().toString().trim();
        int stok_min = Integer.parseInt(txtStokMin.getText());
        
        insert(kode,nama,satuan,stok,stok_min);
        tampilkan();
        JOptionPane.showMessageDialog(null,"Kode Barang "+kode);
        
    }//GEN-LAST:event_btnSimpan

    private void txtKode(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKode
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKode

    private void txtNamaBrg(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaBrg
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaBrg

    private void txtSatuan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSatuan
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSatuan

    private void txtStokMin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStokMin
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStokMin

    private void txtStokBrg(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStokBrg
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStokBrg

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        connect();
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    
      public static void connect(){
    try{
        Class.forName(JDBC_DRIVER);
        conn = DriverManager.getConnection(DB_URL,USER,PASS);
    }catch(Exception e){
        System.out.println("tidak melakukan koneksi");
        e.printStackTrace();
    }
    }
      
    public static void tampilkan(){
        try{
            Class.forName(JDBC_DRIVER);
            stmt = conn.createStatement();
            
            rs = stmt.executeQuery("select * from barang");
            int i = 1;
            while(rs.next()){
                System.out.println("Data ke - "+i++);
                System.out.println("Kode Barang: "+rs.getString("kd_brg"));
                System.out.println("Nama Barang: "+rs.getString("nm_brg"));
                System.out.println("Satuan : "+rs.getString("satuan"));
                System.out.println("Stok Barang : "+rs.getString("stok_brg"));
                System.out.println("Stok Minimal: "+rs.getString("stok_min"));
                
            }
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }  
      
      
      
   public static void insert(String kode,String nama,String satuan,int stok,int stokMin){
   

    try{
        Class.forName(JDBC_DRIVER);
         conn = DriverManager.getConnection(DB_URL,USER,PASS);
         stmt = conn.createStatement();
         
         String sql = "INSERT INTO barang (kd_brg,nm_brg,satuan,stok_brg,stok_min) VALUES (?, ?, ?, ?, ?)";
         PreparedStatement pa = conn.prepareStatement(sql);
         
         pa.setString(1, kode);
         pa.setString(2, nama);
         pa.setString(3, satuan);
         pa.setInt(4, stok);
         pa.setInt(5, stokMin);
         pa.execute();

       
         
    }catch(Exception e){
        e.printStackTrace();
    }
    
    
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNamaBrg;
    private javax.swing.JTextField txtSatuan;
    private javax.swing.JTextField txtStokBrg;
    private javax.swing.JTextField txtStokMin;
    // End of variables declaration//GEN-END:variables
}
