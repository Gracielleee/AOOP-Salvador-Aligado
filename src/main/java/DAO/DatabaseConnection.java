package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;

/**
 * @author Gracielle Salvador
 */

/**
 * DatabaseConnection is a utility class that manages the connection to a MySQL database.
 * It reads database credentials from a properties file and provides methods to establish
 * and close the database connection.
 */
public class DatabaseConnection {

    // Static variable to hold the single instance of the database connection
    private static Connection connection = null;

    /**
     * Gets the database connection. If the connection does not already exist,
     * it will be created by loading the database credentials from the properties file.
     *
     * @return the database connection, or null if the connection could not be established
     */
    public static Connection getConnection() {
        // Check if the connection is already established
        if (connection == null) {
            try {
                // Load properties file containing database credentials
                Properties properties = new Properties();
                try (InputStream input = DatabaseConnection.class.getClassLoader().getResourceAsStream("database.properties");) {
                    // Check if the properties file is found
                    if (input == null) {
                        System.out.println("Sorry, unable to find database.properties");
                        return null;
                    }
                    // Load the properties from the file
                    properties.load(input);
                }

                // Retrieve database credentials from the properties file
                String url = properties.getProperty("db.url");
                String username = properties.getProperty("db.username");
                String password = properties.getProperty("db.password");

                // Establish the connection to the database
                connection = DriverManager.getConnection(url, username, password);
                System.out.println("Database connected successfully!");

            } catch (IOException e) {
                // Handle exceptions related to loading the properties file
                e.printStackTrace();
            } catch (SQLException e) {
                // Handle SQL exceptions related to establishing the connection
                e.printStackTrace();
            }
        }
        // Return the established connection
        return connection;
    }

    /**
     * Closes the database connection if it is currently open.
     */
    public static void closeConnection() {
        // Check if the connection is not null
        if (connection != null) {
            try {
                // Close the database connection
                connection.close();
                System.out.println("Database connection closed.");
            } catch (SQLException e) {
                // Handle exceptions related to closing the connection
                e.printStackTrace();
            }
        }
    }
}
