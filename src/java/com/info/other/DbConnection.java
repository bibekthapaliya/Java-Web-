/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.info.other;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Bvek
 */
public class DbConnection {
    
    public static Connection getDbConnection(){
    
    try{
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/record","root","");
      
        return con;
        
    }catch(Exception e){
        
        e.printStackTrace();
    
   }
    return null;
     
    }
    
    
    
    
}
