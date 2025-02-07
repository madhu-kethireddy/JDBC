import java.sql.*;

public class JavaJdbcRunner
{
    public static void main(String []a){
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String pass = "madhu";

        String query = "select * from dept where deptno in (5, 4, 1, 3)";
        try{
            
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conn = DriverManager.getConnection(url,user,pass);
           Statement st = conn.createStatement();
           ResultSet rs = st.executeQuery(query);
           while (rs.next()) {
                String result = rs.getInt("deptno") + " | "+rs.getString("deptname");
                System.out.println(result);
           }
           st.close();
           conn.close();

        }catch(Exception e){
            e.printStackTrace();
        }
        

    }
}