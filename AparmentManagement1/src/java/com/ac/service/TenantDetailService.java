/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ac.service;

import com.ac.bo.TenantDetailBO;
import com.ac.dao.OwnerDetailsDAO;
import com.ac.dto.TenantDetailDTO;

/**
 *
 * @author ac
 */
public class TenantDetailService {
    
    
    public void insertTenantDetail(TenantDetailDTO dto){
        System.out.println("insertTenantDetails() service");
        TenantDetailBO bo = new TenantDetailBO();
        OwnerDetailsDAO dao = new OwnerDetailsDAO();
        bo.setTenantName(dto.getTenantName());
        bo.setSurName(dto.getSurName());
        bo.setEmail(dto.getEmail());
        bo.setAge(dto.getAge());
        bo.setAddress(dto.getAddress());
        bo.setMobileNo(dto.getMobileNo());
        bo.setWorkName(dto.getWorkName());
        bo.setPassword(dto.getPassword());
        bo.setImage(dto.getImage());
        dao.insertTenantDetail(bo);
        
    }
}
