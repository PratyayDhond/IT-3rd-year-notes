import java.sql.*;

public class Q5{
    final static String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static void main(String[] args){
    try {
        Class.forName(DRIVER);
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM dochosp join doctor on doctor.dno = Dochosp.dno join hospital on Dochosp.hno = hospital.hno;");
        while (rs.next()){
         System.out.println("Doctor ID        : " + rs.getInt("doctor.dno"));
         System.out.println("Doctor Name      : " + rs.getString("doctor.dname"));
         System.out.println("Doctor Address   : " + rs.getString("doctor.address") + "," + rs.getString("doctor.dcity"));
         System.out.println("Hospital No      : " + rs.getInt("hospital.hno"));
         System.out.println("Hospital Name    : " + rs.getString("hospital.hname"));
         System.out.println("Hospital Address : " + rs.getString("hospital.street") + "," + rs.getString("hospital.hcity"));
         System.out.println("Joining Date     : " + rs.getDate("Date"));
         System.out.println();
        }

    }catch (Exception e){
            System.out.println(e)
            ;
        }
    }
}