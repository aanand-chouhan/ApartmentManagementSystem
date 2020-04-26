/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ac.dao;

import com.ac.bo.ApartmentDetailBO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author av
 */
public class ApartmentDetailDAO {
    private static final String insertApartmentDetail = "INSERT INTO apartmentdetails(apartmentname,totalflat,startno,endNo,floors,image,address,contact,email) VALUES(?,?,?,?,?,?,?,?,?);";
    Connection con = null;
    PreparedStatement  pStmnt = null;
    
    public Connection createConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apartmentmanagementsystem","root","veer");
        }
        catch(ClassNotFoundException | SQLException cnfe ){
            System.out.println("error in connection "+cnfe);
        } 
        return con;
    } 
    
    public void insertApartmentDetail(ApartmentDetailBO bo){
            try{
                con = createConnection();
                pStmnt.setString(1, bo.getApartmentName());
                pStmnt.setString(2, bo.getEmail());
                pStmnt.setString(3, bo.getAddress());
                pStmnt.setInt(4, bo.getStartNo());
                pStmnt.setInt(5, bo.getEndNo());
                pStmnt.setInt(6, bo.getTotalFlat());
                pStmnt.setInt(7, bo.getFloors());
                pStmnt.setLong(8, bo.getContact());
                pStmnt.setBlob(9, bo.getImage());
                pStmnt.executeQuery();
                
            } catch (SQLException se) {
                System.out.println("error in connecton " +se);
         
        }
        
    }
    
    
}
