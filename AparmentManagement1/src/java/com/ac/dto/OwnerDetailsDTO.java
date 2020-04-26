/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ac.dto;

import java.io.InputStream;
import java.sql.Date;

/**
 *
 * @author av
 */
public class OwnerDetailsDTO {
    private String name = null;
    private String surName = null;
    private String email = null;
    private int age = 0;
    private String gender = null;
    private long mobileNo = 0;
    private String address = null;
    private long adharcard = 0;
    private String pancard = null;
    private String pwd = null;
    private Date dob = null;
    private String language = null;
    private InputStream ownerProfile =null;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    
    public void setSurName(String surName){
            this.surName = surName;
    }
    public String getSurName(){
        return this.surName;
    }
    
    
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return this.gender;
    }
    
    public void setMobileNo(long mobileNo){
        this.mobileNo = mobileNo;
    }
    public long getMobileNo(){
        return this.mobileNo;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }
    
    public void setAdharcard(long adharcard){
        this.adharcard = adharcard;
    }
    public long getAdharcard(){
        return this.adharcard;
    }
    
    public void setPancard(String pancard){
        this.pancard = pancard;
    }
    public String getPancard(){
        return this.pancard;
    }
    
    public void setPwd(String pwd){
        this.pwd = pwd;
    }
    public String getPwd(){
        return this.pwd;
    }
    
    public void setDob(Date dob){
        this.dob = dob;
    }
    public Date getDob(){
        return this.dob;
    }
    
    public void setLanguage(String language){
        this.language = language;
    }
    public String getLanguage(){
        return this.language;
    }
     

    public boolean validateOwner(String email, String pwd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the ownerProfile
     */
    public InputStream getOwnerProfile() {
        return ownerProfile;
    }

    /**
     * @param ownerProfile the ownerProfile to set
     */
    public void setOwnerProfile(InputStream ownerProfile) {
        this.ownerProfile = ownerProfile;
    }
}
