import java.sql.*;

class Q2{
    final static String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static void main(String[] args){
        try{
            Class.forName(DRIVER);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT STUDENT.RollNo, STUDENT.Name, STUDENT.Date_of_birth, Student.Gender, Student.Branch_Code, BRANCH.BRANCH_NAME FROM STUDENT INNER JOIN BRANCH on STUDENT.Branch_Code = BRANCH.BRANCH_CODE; ");
            while (rs.next()){
                  System.out.println("ID            : " + rs.getInt(1));
                  System.out.println("Name          : " + rs.getString("Name"));
                  System.out.println("Branch        : " + rs.getString("BRANCH_NAME"));
                  System.out.println("Branch Code   : " + rs.getInt("Branch_Code"));
                  System.out.println("Date of Birth : " + rs.getDate("Date_of_birth"));
                  int gender = rs.getInt("Gender");
                  System.out.println("Gender        : " + ((gender == 0) ? "Male" : "Female"));
                  System.out.println();
            }
        }catch(Exception e){
            System.out.println("Exception: " + e);
        }
    }
}