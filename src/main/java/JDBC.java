import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {

    static String daneZBazy;

    public static void main(String[] args) {




        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ksiegarnia ?user=root");
            Class.forName("com.mysql.jdbc.Driver");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select * FROM klienci");

            while (rs.next()) {
                wyswietlDaneZBazy(rs);
            }

            conn.close();
        }

        catch(Exception ex) { }

    }
    static void wyswietlDaneZBazy(ResultSet rs){
        try{
            daneZBazy = rs.getString(1);
            System.out.println("\n" + daneZBazy + " ");
            daneZBazy = rs.getString(2);
            System.out.println(daneZBazy + " ");
            daneZBazy = rs.getString(3);
            System.out.println(daneZBazy);
        }
        catch(Exception e) {}
    }

}