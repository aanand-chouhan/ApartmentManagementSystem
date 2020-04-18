/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ac.bo;

import java.io.InputStream;
import java.sql.Date;



/**
 *
 * @author av
 */
public class OwnerDetailsBO {
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
    private InputStream ownerProfile = null;
    
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

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
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
     * @return the mobileNo
     */
    public long getMobileNo() {
        return mobileNo;
    }

    /**
     * @param mobileNo the mobileNo to set
     */
    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
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
     * @return the pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * @param pwd the pwd to set
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
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
     
   public void setLanguage(String language){
       this.language=language;
   }
   public String getLanguage(){
       return this.language;
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
