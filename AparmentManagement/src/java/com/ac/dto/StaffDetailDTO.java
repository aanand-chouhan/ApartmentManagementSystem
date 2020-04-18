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
public class StaffDetailDTO {
    private String name = null;
    private String surName = null;
    private String email = null;
    private int age = 0;
    private String address = null;
    private long mobileNo = 0L;
    private String workType = null;
    private String workExpreience = null;
    private String password = null;
    private String gender = null;
    private Date dob = null;
    private String pancard = null;
    private long adharcard = 0L;
    private InputStream profile = null;
    
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
    
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }
     
    public void setMobileNo(long mobileNo){
        this.mobileNo = mobileNo;
    }
    public long getMobileNo(){
        return this.mobileNo;
    }
    
    public void setWorkType(String workType){
        this.workType = workType;
    }
    public String getWorkType(){
        return this.workType;
    } 
      
    public void setWorkExpreience(String workExpreience){
        this.workExpreience = workExpreience;
    }
    public String getWorkExpreience(){
        return this.workExpreience;
    } 
    
    public void setPassword(String password){
        this.password = password;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the dob
     */
    public Date getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }

    /**
     * @return the pancard
     */
    public String getPancard() {
        return pancard;
    }

    /**
     * @param pancard the pancard to set
     */
    public void setPancard(String pancard) {
        this.pancard = pancard;
    }

    /**
     * @return the adharcard
     */
    public long getAdharcard() {
        return adharcard;
    }

    /**
     * @param adharcard the adharcard to set
     */
    public void setAdharcard(long adharcard) {
        this.adharcard = adharcard;
    }

    /**
     * @return the image
     */
    public InputStream getProfile() {
        return profile;
    }

    /**
     * @param profile
     */
    public void setProfile(InputStream profile) {
        this.profile = profile;
    }
   
}
