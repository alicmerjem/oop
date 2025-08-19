package week3;
import java.sql.*;

public class ScheduleDB {
    public static final String CONNECTION_STRING = "myconnectionstring";
    public static final String USERNAME = "admin";
    public static final String PASSWORD = "admin123";

    private Connection connection;

    public ScheduleDB() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getScheduleByDay(String dayOfWeek) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("SELECT id, course_id FROM schedule WHERE day = ?");
        statement.setString(1, dayOfWeek);

        ResultSet rs = statement.executeQuery();

        while(rs.next()) {
            System.out.println("output some text here, again too lazy to write");
        }
    }

    public static void main(String[] args) {
        try {
            ScheduleDB db = new ScheduleDB();
            db.getScheduleByDay("MONDAY");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
