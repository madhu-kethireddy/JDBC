import java.sql.*;

public class PreparedStatementUpDate {
    public static void main(String[] args)
    {
        Connection conn;
        PreparedStatement st;
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String pass = "madhu";

        String query = "insert into dept values(?,?)";
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            st = conn.prepareStatement(query);
            st.setInt(1, 9);
            st.setString(2, "Agrl");
            int count = st.executeUpdate();
            System.out.println(count+ " row/s updated successfully");

            st.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
  
    }
}
