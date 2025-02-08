public class JdbcDemo 
{
    public static void main(String[] args) throws Exception
    {
        DeptDAO dao = new DeptDAO();
        Department dept = dao.getDept(4);
        System.out.println(dept.deptName);
    }
    
}
