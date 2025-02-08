import java.sql.*;

public class Example
{
    public static void main(String[] args)
    {
        try{

           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","madhu");
           System.out.println("Connected to MySQL Successfull.");
           Statement st = conn.createStatement();
           ResultSet rs = st.executeQuery("SELECT * FROM dept");

           while(rs.next())
           {
            System.out.println(rs.getInt(1)+" | "+rs.getString(2));
           }

           st.close(); 
           conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        

        
    }
}