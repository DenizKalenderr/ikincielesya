
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EsyaIslemleri {
    
    private Connection con = null;
    
    private Statement statement= null;
    
    private PreparedStatement preparedStatement= null; 
    
    public ArrayList<Esya> esyalariGetir() {
        
        ArrayList<Esya> cikti = new  ArrayList<Esya>();
        
        try {
            statement = con.createStatement();
            
            String sorgu = "SELECT * FROM ikincielesya";
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()) {
                
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String fiyat = rs.getString("fiyat");
               String adet = rs.getString("adet");
                
              cikti.add(new Esya(id, ad, fiyat, adet));
              
                
            }
            return cikti;
            
        } catch (SQLException ex) {
            Logger.getLogger(EsyaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null; 
        }
        

        
        
    }
    
    public void esyaSil(int id) {
        
    String sorgu = "Delete from ikincielesya where id = ?";  
    
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
             preparedStatement.setInt(1, id);
             
             preparedStatement.executeUpdate();
             
        } catch (SQLException ex) {
            Logger.getLogger(EsyaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    
   
        
        
    }
    
    public void calisanEkle(String ad, String fiyat, String adet){
        
        String sorgu = "Insert Into ikincielesya (ad, fiyat, adet) VALUES (?, ?, ?)";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, ad);
            
            preparedStatement.setString(2, fiyat);
            
            preparedStatement.setString(3, adet);
            
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(EsyaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    public boolean girisYap(String kullanici_adi, String parola) {
        
        String sorgu = "Select * From adminler where username = ? and password = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, kullanici_adi);
            preparedStatement.setString(2, parola);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            return rs.next();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EsyaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public EsyaIslemleri() {
        
        
        
  String url= "jdbc:mysql://" + database.host + ":" + database.port + "/" + database.db_ismi;  
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadı.");
        }
        
        try {
            con = (Connection) DriverManager.getConnection(url, database.kullanici_adi, database.parola);
            System.out.println("Bağlantı başarılı.");
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı başarısız.");
        }
    }

   
    }

     
    
    
    
    

