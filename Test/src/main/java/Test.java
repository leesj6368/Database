import java.sql.*;

public class Test {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.202.3:4567/madang?useUnicode=true&characterEncoding=utf8", "leesj", "1234");
            Statement stmt = con.createStatement();

    
        	/*데이터 검색
        	ResultSet rs = stmt.executeQuery("SELECT * FROM Book WHERE BookName LIKE '축%'");
        	*/

            
         	/*데이터 삽입
         	String insertQuery = "INSERT INTO Book (bookid, bookname, publisher) VALUES (5, '데베시', '충북대학교')";
            int rowsInserted = stmt.executeUpdate(insertQuery);
            System.out.println(rowsInserted + " row(s) inserted.");
            ResultSet rs = stmt.executeQuery("SELECT * FROM Book");
            */

            
            /*데이터 삭제
            String deleteQuery = "DELETE FROM Book WHERE BookName LIKE '피%'";
            int rowDeleted = stmt.executeUpdate(deleteQuery);
           	ResultSet rs = stmt.executeQuery("SELECT * FROM Book");
           	*/
            
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "   " + rs.getString(3));
            }

            rs.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}