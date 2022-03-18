import java.sql.*;

public class Q6{
    final static String DRIVER = "com.mysql.cj.jdbc.Driver";
    static int count = 1;
        public static void print(){
        System.out.println("\nQuery no " + count);
        System.out.println("----------------------------------------------------");
        count++;
    }

    public static void main(String[] args){
        try {
            Class.forName(DRIVER);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","");
            Statement stmt = con.createStatement();

            //a> Insert Row In Doctor Tablle
            print();
            try {
                stmt.executeUpdate("INSERT INTO Q6_Doctor VALUES (1501,'Dr. Deshpande','Nagpur')");
                System.out.println("Values inserted into tables successfully");
            }catch (Exception e){
                System.out.println("Values inserted into tables successfully");
            }

            //b> Find names of patient who are treated by ‘Dr. Deshpande'
            print();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Q6_Patient Where opdno = 1501;");
            while (rs.next()){
                System.out.println("\nName    : " + rs.getString("pat_name") +
                                   "\nAddress : " + rs.getString("addr") +
                                   "\nDisease : " + rs.getString("disease").toUpperCase()
                        );
            }

            //c> Display names of doctors who live in ‘Pune’ city.
            print();
            rs = stmt.executeQuery("SELECT * FROM Q6_Doctor Where dcity = 'Pune'");
            while(rs.next()){
                System.out.println("\n" +
                        "doctor no.  : " + rs.getInt("dno") +
                        "\ndoctor name : " + rs.getString("dname") +
                        "\ndoctor city : " + rs.getString("dcity")
                        );
            }

            // 4>Count number of patients suffering from cancer
            print();
            rs = stmt.executeQuery("SELECT COUNT(*) as Count FROM Q6_Patient WHERE disease = 'cancer';");
            rs.next();
            System.out.println("No. of cancer patients: " + rs.getInt("Count"));


            //  5> Add 'Discharge Date' Column to patient table
            print();
            try{
                stmt.executeUpdate("ALTER TABLE Q6_Student ADD COLUMN Discharge_Date DATE");
                System.out.println("Column 'Discharge Date' Added Successfully");
            }catch (Exception e){
                System.out.println("Column 'Discharge Date' Already Exists");
            }

            //  6> Display total no. of patients treated by each doctor
            print();
            rs = stmt.executeQuery("SELECT Q6_Doctor.dname, COUNT(*) as Count FROM Q6_Patient JOIN Q6_Doctor where Q6_Patient.opdno = Q6_Doctor.dno GROUP BY Q6_Patient.opdno ;");
            while(rs.next()){
                System.out.println("\nName : " + rs.getString("dname"));
                System.out.println("No. of Patients : " + rs.getString("Count"));
            }
        }catch (Exception e) {
            System.out.println(e);
        }    
    }
}
