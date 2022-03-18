import java.sql.*;

public class Q8{

    public static void main(String[] args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM EmpProject EP JOIN Q8_Employee e on EP.empID = e.id JOIN Q8_Project p  on EP.projectID = p.id ORDER BY empID asc, projectID asc;");
            while(rs.next()){
                System.out.println(
                        "\n" + "Employee ID   : "  + rs.getInt(1) +
                        "\n" + "Employee name : " + rs.getString("e.name") +
                        "\n" + "Project ID    : " + rs.getInt("projectID") +
                        "\n" + "Project name  : " + rs.getString("p.name")
                );
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}