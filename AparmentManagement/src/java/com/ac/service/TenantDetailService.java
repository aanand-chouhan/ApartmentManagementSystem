/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ac.service;

import com.ac.bo.TenantDetailBO;
import com.ac.dao.OwnerDetailsDAO;
import com.ac.dto.TenantDetailDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ac
 */
public class TenantDetailService {
    
    
    public int insertTenantDetail(TenantDetailDTO dto){
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
        bo.setOwnerId(dto.getOwnerId());
        return dao.insertTenantDetail(bo);
        
        
    }
    public List<TenantDetailDTO> fetchTenantDetails(long ownerId)throws SQLException, Exception{
    List<TenantDetailBO> bo = null;
    OwnerDetailsDAO dao = null;
    System.out.print("fetchTenantDetails service "+ownerId);
    dao = new OwnerDetailsDAO();
    final List<TenantDetailDTO> listDTO = new ArrayList<TenantDetailDTO>();
    bo = dao.fetchTenantDetails(ownerId);
    bo.forEach((TenantDetailBO tenantBo) ->
    {
    TenantDetailDTO dto = new TenantDetailDTO();
     dto.setTenantName(tenantBo.getTenantName());
     dto.setSurName(tenantBo.getSurName());
     dto.setFlateNo(tenantBo.getFlateNo());
     dto.setFlorNo(tenantBo.getFlorNo());
     listDTO.add(dto);
    });
    
     
    // dto.setDob(bo.getDob());
    // dto.setLanguage(bo.getLanguage());
    // dto.setOwnerId(bo.getOwnerId());
    return listDTO;
    }
}
