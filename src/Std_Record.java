import java.sql.*;
import java.util.Scanner;

public class Std_Record {

   static Connection con;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Step 1: Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Connection
            String mysqlURL = "jdbc:mysql://localhost:3306/advjava";
            String username = "root";
            String password = "root";

            con = DriverManager.getConnection(mysqlURL, username, password);

            String choice;

            do {
                System.out.println("\nEnter Student Details");

                System.out.print("Enter ID: ");
                int id = sc.nextInt();

                System.out.print("Enter Name: ");
                String name = sc.next();

                System.out.print("Enter Age: ");
                int age = sc.nextInt();

                insertData(id, name, age);

                System.out.print("Do you want to insert more records? (yes/no): ");
                choice = sc.next();

            } while (choice.equalsIgnoreCase("yes"));

            con.close();
            sc.close();
            System.out.println("Program Ended.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void insertData(int id, String name, int age) {

        try {
            PreparedStatement stmt =
                    con.prepareStatement("INSERT INTO students VALUES (?, ?, ?)");

            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setInt(3, age);

            int count = stmt.executeUpdate();
            System.out.println(count + " Record Inserted!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
