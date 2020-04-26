/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ac.service;

import com.ac.dto.ApartmentDetailDTO;
import com.ac.bo.ApartmentDetailBO; 
import com.ac.dao.OwnerDetailsDAO;

/**
 *
 * @author av
 */
public class ApartmentDetailService {
    
    public boolean insertApartmentDetail(ApartmentDetailDTO dto){
        System.out.println("insertApartmentDetails()  service");
        ApartmentDetailBO bo = new ApartmentDetailBO();
        OwnerDetailsDAO dao = new OwnerDetailsDAO();
        bo.setApartmentName(dto.getApartmentName());
        bo.setEmail(dto.getEmail());
        bo.setAddress(dto.getAddress());
        bo.setStartNo(dto.getStartNo());
        bo.setEndNo(dto.getEndNo());
        bo.setTotalFlat(dto.getTotalFlat());
        bo.setFloors(dto.getFloors());
        bo.setContact(dto.getContact());
        bo.setImage(dto.getImage());
        return dao.insertApartmentDetail(bo);      
        
    }
}
