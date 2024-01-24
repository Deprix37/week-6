import java.sql.*;

public class DBConn {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER ="root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connect = null;
        //Statement st = null;
       /* String sql = "SELECT * FROM student";
        String insertSql = "INSERT INTO student (student_name, student_class) VALUES ('Damla',4)";
        String prSql = "INSERT INTO student (student_name, student_class) VALUES (?,?)";
        String update = "INSERT INTO student (student_name, student_class) VALUES (?,?)";*/
        //String stSql = "UPDATE student SET student_name='Mahmut Çetindağ' WHERE student_id=1";
        //String prSql = "UPDATE student SET student_name= ? WHERE student_id=?";
        String stSql = "DELETE FROM student WHERE student_id = 4";
        String prSql = "DELETE FROM student WHERE student_id = ?";

        try {
            connect = DriverManager.getConnection(DB_URL , DB_USER, DB_PASSWORD);
            Statement st = connect.createStatement();
            st.executeUpdate(stSql);
            PreparedStatement pr = connect.prepareStatement(prSql);
            pr.setInt(1,3);
            //pr.setInt(2,1);
            //pr.setString(1,"Mahmut Mustafa");
            pr.executeUpdate();


            //st = connect.createStatement();
            //System.out.println(st.executeUpdate(insertSql));

           /* PreparedStatement prSt = connect.prepareStatement(prSql);
            prSt.setString(1, "Ahmet");
            prSt.setInt(2,5);
            prSt.executeUpdate();
            prSt.close();*/
            st.close();
            connect.close();
            pr.close();




        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
