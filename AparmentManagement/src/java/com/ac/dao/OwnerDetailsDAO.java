/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ac.dao;

import com.ac.bo.ApartmentDetailBO;
import com.ac.bo.OwnerDetailsBO;
import com.ac.bo.StaffDetailBO;
import com.ac.bo.TenantDetailBO;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author av
 */
public class OwnerDetailsDAO{
    private static final String insertOwnerDetail = "INSERT INTO `ownerdetails`(NAME,surName,email,age,address,mobileNo,gender,PASSWORD,adharcard,pancard,dob,Language,image) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);";
    private static final String validateOwner = "SELECT id FROM `ownerdetails` WHERE email=? AND PASSWORD=?";
    private static final String insertApartmentDetail = "INSERT INTO apartmentdetails(apartmentname,totalflat,startno,endNo,floors,image,address,contact,email) VALUES(?,?,?,?,?,?,?,?,?);";
    private static final String insertTenantDetail ="INSERT INTO tenantdetails(tenantName,surName,email,age,address,mobileNo,workName,PASSWORD,image) VALUES(?,?,?,?,?,?,?,?,?);";
    private static final String insertStaffDetail ="INSERT INTO staffdetails(NAME,surName,email,age,address,mobileNo,workType,workExperience,PASSWORD,gender,dob,pancard,adharcard,profile) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
    private static final String getOwnerDetails = "SELECT * FROM `ownerdetails`  WHERE email LIKE ? AND PASSWORD LIKE ?;";
    Connection con =null;
    PreparedStatement pStmnt = null;
    
   public Connection createConnection (){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apartmentmanagementsystem","root","");
        }
        catch(ClassNotFoundException | SQLException cnfe ){
            System.out.println("error in connection "+cnfe);
        } 
        return con;
    }
   
   public boolean insertOwnerDetail(OwnerDetailsBO bo){
       try{
            System.out.println("insertOwnerDetail()");
           con = createConnection();
           pStmnt = con.prepareStatement(insertOwnerDetail);
           pStmnt.setString(1, bo.getName());
           pStmnt.setString(2, bo.getSurName());
           pStmnt.setString(3, bo.getEmail());
           pStmnt.setInt(4, bo.getAge());
           pStmnt.setString(5,bo.getAddress());
           pStmnt.setLong(6, bo.getMobileNo());
           pStmnt.setString(7, bo.getGender());
           pStmnt.setString(8, bo.getPwd());
           pStmnt.setLong(9, bo.getAdharcard());
           pStmnt.setString(10, bo.getPancard());
           pStmnt.setDate(11, bo.getDob());
           pStmnt.setString(12, bo.getLanguage());
           pStmnt.setBlob(13, bo.getOwnerProfile());
           int result = pStmnt.executeUpdate();
           if(result==1){
               return true;
           
           }
               
           
       }
       catch(SQLException se){
        System.out.println("error in connection "+se);
       } 
        return false;    
   }
   public boolean validateOwner(String email , String pwd){
       con = createConnection();
       try{
        pStmnt = con.prepareStatement(validateOwner);
        pStmnt.setString(1, email);
        pStmnt.setString(2, pwd);
           ResultSet rs = pStmnt.executeQuery();
          return rs.next();
       }
       catch(SQLException se){
        System.out.println("error in connection "+se);
       } 
       return false;
   }
   
    public boolean insertApartmentDetail(ApartmentDetailBO bo){
            try{
                 System.out.println("insertApartmentDetail()");
                 con = createConnection();
                 pStmnt = con.prepareStatement(insertApartmentDetail);
                pStmnt.setString(1, bo.getApartmentName());
                pStmnt.setInt(2, bo.getTotalFlat());
                pStmnt.setInt(3, bo.getStartNo());
                pStmnt.setInt(4, bo.getEndNo());
                 pStmnt.setInt(5, bo.getFloors());
                 pStmnt.setBlob(6, bo.getImage());
                 pStmnt.setString(7, bo.getAddress());  
                pStmnt.setLong(8, bo.getContact());
                 pStmnt.setString(9, bo.getEmail());
               int result = pStmnt.executeUpdate();
                if(result==1){
                   return true;
                }else
                    return false;
            } catch (SQLException se) {
                System.out.println("error in connecton " +se);        
        }
        return false;
        
    }
   
    
    public void insertTenantDetail(TenantDetailBO bo){
        try{
            System.out.print("DAO tenant");
            con = createConnection();
            pStmnt = con.prepareStatement(insertTenantDetail);
            pStmnt.setString(1, bo.getTenantName());
            pStmnt.setString(2, bo.getSurName());
            pStmnt.setString(3, bo.getEmail());
            pStmnt.setInt(4, bo.getAge());
            pStmnt.setString(5, bo.getAddress());
            pStmnt.setLong(6, bo.getMobileNo());
            pStmnt.setString(7, bo.getWorkName());
            pStmnt.setString(8, bo.getPassword());
            pStmnt.setBlob(9, bo.getImage());
            pStmnt.executeUpdate();
        }
        catch(SQLException se){
            System.out.println("error in connection " +se);
        }
    }

    public void insertStaffDetail(StaffDetailBO bo){
        try{
            System.out.println("DAO  staff");
            con = createConnection();
            pStmnt = con.prepareStatement(insertStaffDetail);
            pStmnt.setString(1, bo.getName());
            pStmnt.setString(2, bo.getSurName());
            pStmnt.setString(3, bo.getEmail());
            pStmnt.setInt(4, bo.getAge());
            pStmnt.setString(5, bo.getAddress());
            pStmnt.setLong(6, bo.getMobileNo());
            pStmnt.setString(7, bo.getWorkType());
            pStmnt.setString(8, bo.getWorkExpreience());
            pStmnt.setString(9, bo.getPassword());
            pStmnt.setString(10, bo.getGender());
            pStmnt.setDate(11, bo.getDob());
            pStmnt.setString(12, bo.getPancard());
            pStmnt.setLong(13, bo.getAdharcard());
            pStmnt.setBlob(14, bo.getProfile());
            pStmnt.executeUpdate();
        }
        catch(SQLException se){
            System.out.println("error in connection" +se);
        }
    }
    public void insertApartmentDetail(TenantDetailBO bo)  {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public OwnerDetailsBO fetchOwnerDetails(String email , String pwd) throws SQLException{
        ResultSet rs=null;
        con = createConnection();
        pStmnt = con.prepareStatement(getOwnerDetails);
        pStmnt.setString(1, email);
        pStmnt.setString(2, pwd);
        rs = pStmnt.executeQuery(); 
        OwnerDetailsBO bo =null;
        System.out.print("DAO fetch owner before if");
        if(rs.next()){
            bo = new OwnerDetailsBO();
            System.out.print("DAO fetch owner inside if");
            bo.setName(rs.getString(2));
            bo.setSurName(rs.getString(3));
            bo.setEmail(rs.getString(4));
            bo.setAge(rs.getInt(5));
            bo.setAddress(rs.getString(6));
            bo.setMobileNo(rs.getLong(7));
            bo.setGender(rs.getString(8));
            bo.setPwd(rs.getString(9));
            bo.setAdharcard(rs.getLong(10));
            bo.setPancard(rs.getString(11));
            bo.setDob(rs.getDate(12));
            bo.setLanguage(rs.getString(13)); 
            // Image retrieving
           // Blob blob;
            //blob = rs.getBlob(13);
            //InputStream inputStream = blob.getBinaryStream();
            bo.setOwnerProfile(rs.getBinaryStream(13));
        }
        return bo;   
    }
   
}
