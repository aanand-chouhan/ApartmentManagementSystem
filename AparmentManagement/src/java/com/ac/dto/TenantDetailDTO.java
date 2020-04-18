/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ac.dto;

import java.io.InputStream;

/**
 *
 * @author av
 */
public class TenantDetailDTO {
    private String tenantName = null;
    private String surName = null;
    private String email = null;
    private int age = 0;
    private String address = null;
    private long mobileNo = 0;
    private String workName = null;
    private String password=null;
    private InputStream image = null;
    
    public void setTenantName(String tenantName){
        this.tenantName = tenantName;
    }
    public String getTenantName(){
        return this.tenantName;
    }
    
    public void setSurName(String surName){
        this.surName = surName;
    }
    public String getSurName(){
        return  this.surName;
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
    
    public void setWorkName(String workName){
        this.workName = workName;
    }
    public String getWorkName(){
        return this.workName;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }

    /**
     * @return the image
     */
    public InputStream getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(InputStream image) {
        this.image = image;
    }
    
}
