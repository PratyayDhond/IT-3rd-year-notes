import java.sql.*;

public class Q7{
    final static String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static void main(String[] args){
        try{
            Class.forName(DRIVER);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Supp_Item SI Join Supplier S on SI.Supno = S.Supno JOIN ITEM I on SI.Itemno = I.Itemno;");
            while(rs.next()){
                System.out.println(
                        "\nSupplier id      : " + rs.getInt(1) +
                           "\nSupplier name    : " + rs.getString("sname") +
                           "\nSupplier address : " + rs.getString("supadddess") +
                           "\nItem No          : " + rs.getInt("SI.Itemno") +
                           "\nItem name        : "  + rs.getString("Iname") +
                           "\nitem stock       : " + rs.getInt("stock") +
                           "\nPrice            : Rs. " + rs.getInt("rate") + "/-"
                );
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}