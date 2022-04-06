    import java.sql.*;

    class Main{

        public static void main(String args[]) throws Exception{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable","root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM odd21");
            System.out.println("Name\t\t\t" + "Course Code \t" + "\tTime\t");
            while(rs.next()){
                System.out.println(rs.getString(1).toUpperCase() + "\t" + rs.getString(2) + "\t\t" + rs.getString(3));
            }
        }

    }




