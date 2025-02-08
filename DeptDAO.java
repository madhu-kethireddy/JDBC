import java.sql.*;
public class DeptDAO {

    public Department getDept(int deptId) throws Exception
    {
        Department dep = new Department();
        dep.deptId = deptId;
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String pass = "madhu";
        String query = "select deptname from dept where deptno="+deptId;

        Connection conn = DriverManager.getConnection(url, user, pass);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        String dname = rs.getString(1);
        dep.deptName = dname;
        return dep;
    }

}
