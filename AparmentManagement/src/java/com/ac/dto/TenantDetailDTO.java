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
    private long ownerId = 0;
    private String pancard = null;
    private long adharcard = 0;
    private String gender = null;
    private int flateNo = 0;
    private int florNo = 0;
    private int tenantId = 0;
    
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

    /**
     * @return the ownerId
     */
    public long getOwnerId() {
        return ownerId;
    }

    /**
     * @param ownerId the ownerId to set
     */
    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
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
     * @return the flateNo
     */
    public int getFlateNo() {
        return flateNo;
    }

    /**
     * @param flateNo the flateNo to set
     */
    public void setFlateNo(int flateNo) {
        this.flateNo = flateNo;
    }

    /**
     * @return the florNo
     */
    public int getFlorNo() {
        return florNo;
    }

    /**
     * @param florNo the florNo to set
     */
    public void setFlorNo(int florNo) {
        this.florNo = florNo;
    }

    /**
     * @return the tenantId
     */
    public int getTenantId() {
        return tenantId;
    }

    /**
     * @param tenantId the tenantId to set
     */
    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }
    
}
