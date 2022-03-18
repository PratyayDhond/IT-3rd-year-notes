import java.sql.*;
import java.time.Year;

public class Q1{

    public static void main(String[] args){
        try {
            String dburl = "jdbc:ucanaccess://D://_3rdYrNotes//IT-3rd-year-notes//6th Sem//Advance Java//1907011//Assignment_02//Q1//Database3.accdb";
            Connection con = DriverManager.getConnection(dburl);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM books");
            while (rs.next()){
                String title = rs.getString(2).replaceAll("<div>","").replaceAll("</div>","");
                String Author = rs.getString(3).replaceAll("<div>","").replaceAll("</div>","");
                String year = rs.getString(4).replaceAll("<div>","").replaceAll("</div>","");
                System.out.println(
                        "\n" + "Book Title  : " + title +
                        "\n" + "Book Author : " + Author +
                        "\n" + "Book Year : " + year
                );
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}