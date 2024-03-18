import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseInsertExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase"; // Replace with your database URL
        String username = "your-username"; // Replace with your database username
        String password = "your-password"; // Replace with your database password

        String insertQuery = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(insertQuery)) {

            // Set parameter values for the query
            statement.setInt(1, 1);
            statement.setString(2, "John");
            statement.setInt(3, 25);

            // Execute the insert query
            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Data inserted successfully.");
            } else {
                System.out.println("Data insertion failed.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
