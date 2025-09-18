package examprep.one.database;
import java.sql.*;

public class DB {
    private static final String CONNECTION_STRING = "jdbc:mysql://oop.ibu.edu.ba:3306/oopgroup1";
    private static final String USERNAME = "oopuser";
    private static final String PASSWORD = "ooppassWD";

    private Connection connection;

    public DB() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public void getUsers(String name, int id) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM users WHERE name = ? AND id > ?");
        statement.setString(1, name);
        statement.setInt(2, id);

        ResultSet rs = statement.executeQuery();

        while(rs.next()) {
            System.out.println(rs.getInt("id") + rs.getString("name"));
        }


        rs.close();
        statement.close();
    }
}
