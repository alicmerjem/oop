package revision.tasks.databaseandmethods;
import java.sql.*;

public class ScheduleDB {
    private static final String CONNECTION_STRING = "connectionstring";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";

    private Connection connection;

    public ScheduleDB() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
    
    public void ScheduleByDay(String dayOfWeek) throws SQLException {
        String query = "SELECT id, course_id FROM schedule WHERE day_of_week = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, dayOfWeek);

        ResultSet rs = statement.executeQuery();

        while(rs.next()) {
            System.out.println(rs.getInt("id") + " -> " + rs.getString("course_id"));
        }
    }

    public static void main(String[] args) {
        try {
            ScheduleDB db = new ScheduleDB();
            db.ScheduleByDay("monday");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
