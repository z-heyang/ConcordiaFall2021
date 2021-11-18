package ca.concordia.cejv416.fall2021.Class_18;

import java.sql.*;

public class MySqlSelectExample {

    public static void main(String[] args) throws SQLException {

        String db = "jdbc:mysql://localhost/sales";
        String db_user  = "root";
        String db_pass = "p4ssword";

        String selectStatement = "SELECT * FROM sales;";

        Connection conn = DriverManager.getConnection(db, db_user, db_pass);
        Statement stmt = conn.createStatement();
        ResultSet  rs = stmt.executeQuery(selectStatement);





    }

}
