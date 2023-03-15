import java.sql.*;


public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java";
        String user = "root";
        String pass = "";
        int id = 5;
        String name="test";
        int calss=10;
        String dep="b-tech";

        try {
            Connection cn = DriverManager.getConnection(url,user,pass);
            Statement stmt = cn.createStatement();
//            stmt.executeUpdate(
//                    "insert into t1 VALUES('" +id +"' , '"+  name + "' , '"+ calss+"','"  + dep + "')");
            ResultSet rs = stmt.executeQuery("select * from t1");

            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3) + "  "
                        + rs.getString(4)) ;
            cn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}