package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Util {
    private static String dbURL = "jdbc:postgresql:mem:test;INIT=RUNSCRIPT FROM 'classpath.sql'";
    private static String dbUsername = "SA";
    private static String dbPassword = "";

    public static Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}

