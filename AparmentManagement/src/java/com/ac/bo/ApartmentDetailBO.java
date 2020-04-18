/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ac.bo;

import java.io.InputStream;

        /**
 *
 * @author av
 */
public class ApartmentDetailBO {
    
   private String apartmentname = null;
   private String email = null;
   private String address = null;
   private int floors = 0;
   private int startno = 0;
   private int endNo = 0;
   private int totalflat = 0;
   private long contact =0;
   private InputStream image = null;
    
    public void setApartmentName(String apartmentname){
        this.apartmentname = apartmentname;
    }
    public String getApartmentName(){
    return this.apartmentname;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }
    
    public void setFloors(int floors){
        this.floors = floors;
    }
    public int getFloors(){
        return this.floors;
    }
    
    public void setStartNo(int startno){
        this.startno = startno;
    }
    public int getStartNo(){
        return this.startno;
    }
    
    public void setEndNo(int endNo){
        this.endNo = endNo;
    }
    public int getEndNo(){
        return this.endNo;
    }
    
    public void setTotalFlat(int totalflat){
        this.totalflat = totalflat;
    }
     public int getTotalFlat(){
         return this.totalflat;
     }
     public void setContact(long contact){
         this.contact = contact;
     }
     public long getContact(){
         return this.contact;
     }
     public void setImage(InputStream image){
         this.image = image;
     }
     public InputStream getImage(){
         return this.image;
         
     }
}
