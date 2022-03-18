import java.sql.*;

public class Q4{
    final static String DRIVER = "com.mysql.cj.jdbc.Driver";
    static int count = 1;
    static boolean flag = false;

    public static void print(){
        System.out.println("\nQuery no " + count);
        System.out.println("----------------------------------------------------");
        count++;
    }

    public static void courseOutput(ResultSet rs) throws Exception{
        print();
        System.out.println("Course no\t Fees\t Course Name ");
        while(rs.next()){
            System.out.println(rs.getInt("c_no") + "\t\t" + rs.getString("fees") +"\t\t" + rs.getString("cname") );
        }
    }

    public static void studentOutput(ResultSet rs) throws Exception{
        print();
        while (rs.next()){
            System.out.println("Roll No : " + rs.getInt("Roll_No"));
            System.out.println("Name    : " + rs.getString("Name"));
            System.out.println("city    : " + rs.getString("city"));
            System.out.println("marks   : " + rs.getString("marks"));
            System.out.println("Course  : " + rs.getString("cname"));
            if (flag)
                System.out.println("fees    : " + rs.getInt("fees"));
            System.out.println();

        }
    }

    public static void main(String[] args){
        try{
            Class.forName(DRIVER);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","");
            Statement stmt = con.createStatement();

            //a> List Student Details enrolled for BBA C.A. course
            ResultSet rs = stmt.executeQuery("SELECT * from Q4_Student join Q4_Course on Q4_Course.c_no = Q4_Student.c_no where Q4_Student.c_no = 51");
            studentOutput(rs);
            // b> List all the course having fees < 20000
            rs = stmt.executeQuery("SELECT * from Q4_Course where fees < 20000");
            courseOutput(rs);

            // c> Display all students living in either Nasik or Pune city
            rs = stmt.executeQuery("SELECT * FROM Q4_student join Q4_Course on Q4_Course.c_no = Q4_Student.c_no where city = 'Nasik' or city = 'Pune' GROUP BY name;");
            studentOutput(rs);

            // d> Display Course detail for student 'Gaurav Sharma'
            rs = stmt.executeQuery("SELECT * FROM Q4_student join Q4_Course on Q4_Course.c_no = Q4_Student.c_no where name = 'Gaurav Sharma';");
            flag = true;
            studentOutput(rs);
            flag = false;

        }catch(Exception e){
            System.out.println(e);
        }

    }
}