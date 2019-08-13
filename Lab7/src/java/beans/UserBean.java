
package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.Serializable;

public class UserBean implements Serializable {
    
    public int result;
    Statement st;
    Statement stmt;
    int i;
   
    public boolean login(String uname, String pword){
            
            //connectToDb();
             boolean ch = false;
             
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab7", "root", "");
            PreparedStatement pst = conn.prepareStatement("Select * from users where uname=? and pword=?");

            pst.setString(1,uname);
            pst.setString(2,pword);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                ch = true;
            } else {
                ch = false;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }        
            return ch;
    }
}
    
   /* public void adduser(String fname, String lname, String email, String number, String uname,String password) {
        
        connectToDb();
        String query = "INSERT INTO user(FirstName,LastName,Email,ContactNumber,Username,Password) VALUES('"+fname+"','"+lname+"','"+email+"','"+number+"','"+uname+"','"+password+"')";
        try {

            st.executeUpdate(query);
           
        } catch (SQLException ex) {  
            
        }        
    }
    
    private void connectToDb() {
        
        String driver = "com.mysql.jdbc.Driver";
        //String url="jdbc:mysql://localhost:3306/library";
         String url="jdbc:mysql://localhost:3306/Lab7";
        try {
            
            Class.forName(driver);            
            Connection con=DriverManager.getConnection(url,"root","");
            
            st = con.createStatement();
            
        } catch (ClassNotFoundException | SQLException ex) {
            
        }
    }    
    
}
*/