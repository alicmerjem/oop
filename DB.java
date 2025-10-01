package additional.done.task5;
import java.sql.*;

public class DB {
    private static final String CONNECTION_STRING =
            "jdbc:mysql://oop.ibu.edu.ba:3306/oopgroup1?allowPublicKeyRetrieval=true";
    private static final String USERNAME = "oopuser";
    private static final String PASSWORD = "ooppassWD";

    private Connection connection;

    public DB() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
            System.out.println("Connected to the database successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getUsers(String name, int id) throws SQLException {
        String query = "SELECT id, name FROM users WHERE name <> ? AND id <= ?";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setInt(2, id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int userId = rs.getInt("id");
                String userName = rs.getString("name");
                System.out.println(userId + " - " + userName);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}