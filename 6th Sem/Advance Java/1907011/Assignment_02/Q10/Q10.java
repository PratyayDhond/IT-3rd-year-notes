import java.sql.*;

public class Q10{

    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");
            while (rs.next()){
                System.out.println(
                        "\n" + "ID     : " + rs.getInt(1) +
                        "\n" + "Name   : " + rs.getString(2) +
                        "\n" + "Salary : " + rs.getInt(3)
                );
            }
        }catch (Exception e){

        }
    }
}
