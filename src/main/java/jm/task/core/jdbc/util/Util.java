package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
public static Connection getConnection() {
    Connection conn = null;
    try {
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mysql",
                "root",
                "12345"
        );
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
    return conn;
}
}