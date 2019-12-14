/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.info.dao;

import com.info.model.User;
import com.info.other.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Bvek
 */
public class UserDao {

    public User validUser(User user) {
        User user1 = null;
        try {
            Connection con = DbConnection.getDbConnection();
            String qry = "select * from login where UserName=? and Password=? ";
            PreparedStatement pset = con.prepareStatement(qry);
            pset.setString(1, user.getUsername());
            pset.setString(2, user.getPassword());
            ResultSet rs = pset.executeQuery();
            while (rs.next()) {
                user1 = new User();
                user1.setUserId(rs.getInt("UserId"));
                user1.setUsername(rs.getString("UserName"));
                user1.setUsername(rs.getString("Password"));
                return user1;
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;

    }

}
