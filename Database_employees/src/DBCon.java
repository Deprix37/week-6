import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBCon {
    public static final String DB_URL = "jdbc:mysql://localhost/employees";
    public static final String DB_USER ="root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connect = null;

        String prInsertSql = "INSERT INTO emp (emp_name, emp_position, emp_salary) VALUES (?,?,?)";
        String sql = "SELECT * FROM employees";

        try {

            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            PreparedStatement pr = connect.prepareStatement(prInsertSql);
            pr.setInt(3,27000);
            pr.setString(1,"Ahmet Elbüz");
            pr.setString(2,"Software Developer");
            pr.executeUpdate();

            pr.close();
            connect.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
