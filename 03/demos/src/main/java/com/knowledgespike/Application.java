package com.knowledgespike;

import java.sql.*;
import java.time.LocalDate;



public class Application {

    static String url = "jdbc:mysql://localhost:3306/loboticket";
    static String userName = "loboticket";
    static String password = "p4ssw0rd";

    public static void main(String[] args) throws SQLException {
        try(Connection conn = DriverManager.getConnection(url, userName, password)) {

            System.out.println(conn);
        }
    }

}
