import java.sql.*;

public class Q3{
    static int count = 1;
    public static void output(ResultSet rs, String str) {
        System.out.println("Query No. " + count);
        System.out.println("------------------------------------------------");
        try {
            while(rs.next()){
                if(str.equals("null"))
                System.out.println(rs.getString("null"));
                else
                System.out.println(rs.getString("Name"));


            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            count++;
            System.out.println();
        }
    }

    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT null FROM Employee;");
            output(rs, "null");
            rs = stmt.executeQuery("SELECT Name FROM Employee;");
            output(rs, "name");
            rs = stmt.executeQuery("SELECT Name FROM Employee WHERE Salary = null;");
            output(rs, "name");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}