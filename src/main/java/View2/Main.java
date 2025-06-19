package View2;
import DAO.DatabaseConnection;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        // Your code here
        System.out.println("Hello, World!");
        Connection connection = DatabaseConnection.getConnection();
        DatabaseConnection.closeConnection();
    }
}
