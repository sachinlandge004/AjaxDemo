/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo;

import dbAccess.DBUtils;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author AMIT
 */
public class DAO {

    public static void saveData(Entity en) {
        Connection con = null;
        try {
            con = DBUtils.getConnection();
            CallableStatement cstmt = con.prepareCall("{call sp_saveData(?,?,?)}");
            cstmt.setInt(1, en.getId());
            cstmt.setString(2, en.getName());
            cstmt.setString(3, en.getCity());

            cstmt.executeQuery();
            if (!con.isClosed()) {
                con.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
