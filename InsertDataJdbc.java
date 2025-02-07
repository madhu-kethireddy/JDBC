import java.sql.*;

public class InsertDataJdbc
{
    public static void main(String []a){

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String pass = "madhu";
        int dno = 8;
        String dname = "Aiml";

        String query = "insert into dept(deptno, deptname) values("+dno+",'"+dname+"')";
        try{
            
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conn = DriverManager.getConnection(url,user,pass);
           Statement st = conn.createStatement();
           int count = st.executeUpdate(query);
           System.out.println(count + " row/s updated");
           st.close();
           conn.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    
    }
}

