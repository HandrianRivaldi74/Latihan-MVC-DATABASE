/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.handrian.latihanmvcjdbc.database;

import com.mysql.cj.jdbc.MysqlDataSource;
import edu.handrian.latihanmvcjdbc.impl.PelangganDaoImpl;
import edu.handrian.latihanmvcjdbc.service.PelangganDao;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Acer
 * NIM : 10119074
 * NAMA : HANDRIAN RIVALDI
 * KELAS : IF2
 */
public class KingBarbershopDatabase {
    
    private static Connection connection;
    private static PelangganDao pelangganDao;
    
    public static Connection getConnection() throws SQLException{
        if (connection==null) {
            
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/kingsbarbershop");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }
        
        
        
        return connection;
    }    
    
    public static PelangganDao getPelangganDao() throws SQLException{
    
        if (pelangganDao==null){
            pelangganDao = new PelangganDaoImpl(getConnection());
        }
        return pelangganDao;                
    }
            
}
