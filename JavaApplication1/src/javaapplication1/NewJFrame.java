/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;


import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Lenovo
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        showTable();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        txtSatuan = new javax.swing.JTextField();
        txtNamaBrg = new javax.swing.JTextField();
        txtStokBrg = new javax.swing.JTextField();
        txtStokMin = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBrg = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        jLabel1.setText("Kode Barang");

        jLabel2.setText("Satuan");

        jLabel3.setText("Nama Barang");

        jLabel4.setText("Stok Barang");

        jLabel5.setText("Stok Minimal");

        txtKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeActionPerformed(evt);
            }
        });

        txtSatuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSatuanActionPerformed(evt);
            }
        });

        txtNamaBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaBrgActionPerformed(evt);
            }
        });

        txtStokBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStokBrgActionPerformed(evt);
            }
        });

        txtStokMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStokMinActionPerformed(evt);
            }
        });

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblBrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Kode Barang", "Nama Barang", "Satuan", "Stok Barang", "Stok Minimal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBrg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBrgMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBrg);

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel6.setText("* Klik diluar table jika ingin me-reset kolom formulir barang");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtKode, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtSatuan)
                            .addComponent(txtNamaBrg)
                            .addComponent(txtStokBrg, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtStokMin)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnInsert)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 39, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNamaBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStokBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStokMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInsert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete)
                            .addComponent(btnUpdate))))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeActionPerformed

    private void txtSatuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSatuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSatuanActionPerformed

    private void txtNamaBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaBrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaBrgActionPerformed

    private void txtStokBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStokBrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStokBrgActionPerformed

    private void txtStokMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStokMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStokMinActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        // TODO add your handling code here:
         String kode = txtKode.getText().toString().trim();
           int stok = Integer.parseInt(txtStokBrg.getText());
            String nama = txtNamaBrg.getText();
            String satuan = txtSatuan.getText().toString().trim();
            int stok_min = Integer.parseInt(txtStokMin.getText());
        if(isSame(kode)){
   
          
            Update(kode,nama,satuan,stok,stok_min);
            showTable();
    
        }else{
                 JOptionPane.showMessageDialog(null,"kode barang "+kode+" tidak ada di dalam database !!");
      
        }
       
      
       
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String kode = txtKode.getText().toString().trim();
        if(isSame(kode)){
              delete(kode);
              showTable();
        }else{
              JOptionPane.showMessageDialog(null,"kode barang "+kode+" tidak ada di dalam database !!");   
        }
       
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
      
        
        String kode = txtKode.getText().toString();
      
         if(isSame(kode)){
                 JOptionPane.showMessageDialog(null,"kode barang "+kode+" sudah ada di dalam database");
           
             
         }else{
         
                int stok = Integer.parseInt(txtStokBrg.getText());
                 String nama = txtNamaBrg.getText();
                 String satuan = txtSatuan.getText().toString().trim();
                   int stok_min = Integer.parseInt(txtStokMin.getText());
                   insert(kode,nama,satuan,stok,stok_min);
                    showTable();   
        
         }
        
       
    }//GEN-LAST:event_btnInsertActionPerformed

    private void tblBrgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBrgMouseClicked
        // TODO add your handling code here:
        
        if(tblBrg.getRowSelectionAllowed() == true){
             btnInsert.setEnabled(false);
            DefaultTableModel model = (DefaultTableModel) tblBrg.getModel();
            String kode = model.getValueAt(tblBrg.getSelectedRow(),1).toString();
            String nama = model.getValueAt(tblBrg.getSelectedRow(),2).toString();
            String satuan = model.getValueAt(tblBrg.getSelectedRow(),3).toString();
            String stok = model.getValueAt(tblBrg.getSelectedRow(),4).toString();
            String stokMin = model.getValueAt(tblBrg.getSelectedRow(),5).toString();

            // set To text Field

            txtKode.setText(kode);
            txtNamaBrg.setText(nama);
            txtSatuan.setText(satuan);
            txtStokBrg.setText(stok);
            txtStokMin.setText(stokMin);
        }
       
        
      
        
           
        
       
        
        
    }//GEN-LAST:event_tblBrgMouseClicked

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseExited

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
         if(tblBrg.getRowSelectionAllowed() == true){
             btnInsert.setEnabled(true);
            // set To text Field
            txtKode.setText("");
            txtNamaBrg.setText("");
            txtSatuan.setText("");
            txtStokBrg.setText("");
            txtStokMin.setText("");
          
        }
       
        
    }//GEN-LAST:event_formMouseClicked
    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        connect();
        
     

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
    
    public void showTable(){
    
        
            try{
                Class.forName(JDBC_DRIVER);
                 conn = DriverManager.getConnection(DB_URL,USER,PASS);
                 stmt = conn.createStatement();
                 
                    
                 String query = "SELECT * FROM barang   ";
                 rs =  stmt.executeQuery(query);
                 
                 DefaultTableModel model = (DefaultTableModel) tblBrg.getModel();
                 model.setRowCount(0);
                 while(rs.next()){
                     model.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
                 }
                 
                 

            }catch(Exception e){
                e.printStackTrace();
            }
    
    
    }
    
    
     public void Update(String kode,String nama,String satuan,int stok,int stokMin){
   

            try{
                Class.forName(JDBC_DRIVER);
                 conn = DriverManager.getConnection(DB_URL,USER,PASS);
                 stmt = conn.createStatement();

                 String sql = "UPDATE barang SET  nm_brg = ?, satuan = ?, stok_brg = ?, stok_min = ?  WHERE kd_brg = ?";
                 PreparedStatement pa = conn.prepareStatement(sql);

                
                 pa.setString(1, nama);
                 pa.setString(2, satuan);
                 pa.setInt(3, stok);
                 pa.setInt(4, stokMin);
                 pa.setString(5, kode);      
                 pa.executeUpdate();



            }catch(Exception e){
                e.printStackTrace();
            }
    
    
    }
     
      
     public void delete(String kode){
   

            try{
                Class.forName(JDBC_DRIVER);
                 conn = DriverManager.getConnection(DB_URL,USER,PASS);
                 stmt = conn.createStatement();

                  String sql = "DELETE FROM barang WHERE kd_brg = ?";
                    PreparedStatement pa = conn.prepareStatement(sql);

                  pa.setString(1,kode);
                   pa.executeUpdate();


            }catch(Exception e){
                e.printStackTrace();
            }
    
    
    }
     
     public boolean isSame(String kode){
       boolean temp = false;
         try{
                Class.forName(JDBC_DRIVER);
                 conn = DriverManager.getConnection(DB_URL,USER,PASS);
                 stmt = conn.createStatement();

                  String sql = "SELECT kd_brg FROM barang";
                  rs = stmt.executeQuery(sql);
                     
                  // searching of data 
                  while(rs.next()){                 
                      if(rs.getString("kd_brg").equals(kode)){
                          temp=true;
                      }          
                  }
                  
                  
            }catch(Exception e){
                e.printStackTrace();
            }
            
         return temp;
         
     }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBrg;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNamaBrg;
    private javax.swing.JTextField txtSatuan;
    private javax.swing.JTextField txtStokBrg;
    private javax.swing.JTextField txtStokMin;
    // End of variables declaration//GEN-END:variables
}