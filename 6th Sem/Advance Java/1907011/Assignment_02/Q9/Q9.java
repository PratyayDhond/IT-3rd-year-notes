import java.sql.*;

public class Q9{

    public static void main(String[] args){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Po p Join Q9_Item i on P_no = i.I_no Join Q9_Supplier s on i.supplierKey = s.S_no");
            while(rs.next()){
                System.out.println(
                        "\n" + "Item No.         : " + rs.getInt("I_no") +
                        "\n" + "Item Name        : " + rs.getString("I_name") +
                        "\n" + "Item Quantity    : " + rs.getInt("I_qty") +
                        "\n" + "Supplier No.     : " + rs.getInt("S_no") +
                        "\n" + "Supplier Name    : " + rs.getString("S_Name") +
                        "\n" + "Supplier Address : " + rs.getString("S_addr") +
                        "\n" + "Supply Date      : " + rs.getDate("P_Date")
                );
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
