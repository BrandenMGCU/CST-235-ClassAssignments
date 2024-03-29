package com.register.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.register.bean.RegisterBean;
import com.register.connection.DBConnect;

public class RegisterDao {
    public String Regiterindb(RegisterBean bean) {
        Connection con = DBConnect.getConn();
        String sql = "insert into user_register(Id,Name,Email,UserName,Address,PhoneNumber,Password) values (NULL,?,?,?,?,?,?) ";
        int i = 0;
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, bean.getName());
            preparedStatement.setString(2, bean.getEMail());
            preparedStatement.setString(3, bean.getUserName());
            preparedStatement.setString(4, bean.getAddress());
            preparedStatement.setString(5, bean.getPhoneNumber());
            preparedStatement.setString(6, bean.getPassword());

            i = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (i != 0) {
            return "User is registered";
        } else {
            return "Error!!!!";
        }
    }
}