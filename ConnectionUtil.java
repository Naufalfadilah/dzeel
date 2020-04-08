/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.uts.npm104;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author User
 */
public class ConnectionUtil {
    public static Connection connection;
    static{
        MysqlDataSource ds = new MysqlDataSource();
        ds.setServerName("jdbc:mysql://localhost:3306/bengkel");
        ds.setDatabaseName("bengkel");
        ds.setUser("root");
        ds.setPassword("");
        try{
            connection = ds.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionUtil.class.getName()).log(level.SEVERE, null, ex);
        }
    }
    
    public static Connection getConnection(){
        return connection;
    }
    
}