package week3.additional;
import java.sql.*;

public class StudentFetcher {
    private static final String CONNECTION_STRING = "jdbc:mysql://oop.ibu.edu.ba:3306/mtest_db?allowPublicKeyRetrieval=true&useSSL=false";
    private static final String USERNAME = "mtestdb_usr";
    private static final String PASSWORD = "mtest97dbUSR";

    private Connection connection;

    // Constructor opens connection
    public StudentFetcher() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Database connection failed: " + e.getMessage(), e);
        }
    }

    // Fetch students above a certain age
    public void getStudentsAboveAge(int minAge) throws SQLException {
        String query = "SELECT id, name, age FROM students WHERE age > ?";
        PreparedStatement statement = this.connection.prepareStatement(query);
        statement.setInt(1, minAge);

        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getInt("id") + " -> " + rs.getString("name") + " (" + rs.getInt("age") + ")");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        try {
            StudentFetcher db = new StudentFetcher();
            db.getStudentsAboveAge(20); // Example: fetch all students older than 20
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

