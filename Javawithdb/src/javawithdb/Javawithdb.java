/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javawithdb;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author D2A
 */
public class Javawithdb {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1/Penjualan";
    static final String USER ="root";
    static final String PASS = "";
    
    
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        connect();
        insert();
        show();
        
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
    
    public static void show (){
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
    
    public static void insert(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan Kode Barang: ");
    String kode_brg = sc.nextLine();
    System.out.print("Masukan Nama Barang: ");
    String nama_brg = sc.nextLine();
    System.out.print("Masukan Satuan: ");
    String satuan = sc.nextLine();
    System.out.print("Masukan stok barang: ");
    int stok_brg = sc.nextInt();
    System.out.print("Masukan minimal Barang: ");
    int stok_min = sc.nextInt();
    
    try{
        Class.forName("JDBC_DRIVER");
         conn = DriverManager.getConnection(DB_URL,USER,PASS);
         stmt = conn.createStatement();
         
         String sql = "INSERT INTO barang (kd_brg,nm_brg,satuan,stok_brg,stok_min) Values (?,?,?,?,?)";
         PreparedStatement pa = conn.prepareStatement(sql);
         
         pa.setString(1, kode_brg);
         pa.setString(2, nama_brg);
         pa.setString(3, satuan);
         pa.setInt(4, stok_brg);
         pa.setInt(5, stok_min);
         pa.execute();
         stmt.close();
         conn.close();
         
    }catch(Exception e){
        e.printStackTrace();
    }
    
    
    }
}
