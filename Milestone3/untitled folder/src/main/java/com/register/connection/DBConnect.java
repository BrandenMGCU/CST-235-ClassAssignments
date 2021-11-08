package com.register.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect
{

    public static Connection getConn()
    {
        Connection con = null;
        String loadDriver = "com.mysql.jdbc.Driver";
        String dbURL = "jdbc:mysql://localhost:8889/registration_form";
        String dbUSERNAME = "root";
        String dbPASSWORD = "root";
        try
        {
            Class.forName(loadDriver);
            con = DriverManager.getConnection(dbURL, dbUSERNAME, dbPASSWORD);
        } catch (ClassNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;
    }
}