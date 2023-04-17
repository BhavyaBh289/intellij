import java.sql.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java";
        String user = "root";
        String pass = "";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name: ");
        String Name = sc.nextLine();
        System.out.println("Enter Department: ");
        String Department = sc.nextLine();
        System.out.println("Enter Employee ID : ");
        int ID = sc.nextInt();

        try {
            Connection cn = DriverManager.getConnection(url,user,pass);
            Statement stmt = cn.createStatement();
            stmt.executeUpdate("insert into t1 VALUES('" +Name +"' , '"+  ID + "' , '"+ Department+"')");
            System.out.println("record inserted successfully");

            ResultSet rs = stmt.executeQuery("select * from t1");

            System.out.println("Here are all the records");
            while(rs.next()) {
                System.out.println("Name: "+rs.getString(1));
                System.out.println("ID: "+rs.getInt(2));
                System.out.println("Department: "+rs.getString(3));
            }

            System.out.println("Delete Record......");

            stmt.executeUpdate("delete from t1 where ID=1");
            System.out.println("record deleted successfully");
            ResultSet results = stmt.executeQuery("select * from t1");
            System.out.println("Here are all the records after earlier was deleted");
            while(results.next()) {
                System.out.println("Name: "+results.getString(1));
                System.out.println("ID: "+results.getInt(2));
                System.out.println("Department: "+results.getString(3));
            }


            cn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
