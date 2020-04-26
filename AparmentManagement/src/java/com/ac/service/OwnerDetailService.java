/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ac.service;

import com.ac.dao.OwnerDetailsDAO;
import com.ac.bo.OwnerDetailsBO;
import com.ac.dto.OwnerDetailsDTO;
import java.sql.SQLException;
import java.util.logging.*;
/**
 *
 * @author av
 */
public class OwnerDetailService {
     private final static Logger LOG =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
    public boolean insertOwnerDetails(OwnerDetailsDTO dto){
        System.out.println("insertOwnerDetails() service");
        OwnerDetailsBO bo = new OwnerDetailsBO();
        OwnerDetailsDAO dao = new OwnerDetailsDAO();
        bo.setName(dto.getName());
        bo.setAddress(dto.getAddress());
        bo.setAdharcard(dto.getAdharcard());
        bo.setAge(dto.getAge());
        bo.setDob(dto.getDob());
        bo.setEmail(dto.getEmail());
        bo.setGender(dto.getGender());
        bo.setMobileNo(dto.getMobileNo());
        bo.setPancard(dto.getPancard());
        bo.setSurName(dto.getSurName());
        bo.setPwd(dto.getPwd());
        bo.setLanguage(dto.getLanguage());
        return dao.insertOwnerDetail(bo);
        
        
    }

    public boolean validateOwner(String email, String pwd) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  public OwnerDetailsDTO fetchOwnerDetails(String email, String pwd)throws SQLException,Exception{
      OwnerDetailsDTO ownerDetailDTO = null;
      OwnerDetailsDAO ownerDetailDAO = null;
      OwnerDetailsBO ownerDetailBO = null;
      
      ownerDetailDTO = new OwnerDetailsDTO();
      ownerDetailDAO = new OwnerDetailsDAO();
           
     ownerDetailBO =  ownerDetailDAO.fetchOwnerDetails(email, pwd);
      LOG.log(Level.INFO, "fetchOwnerDetails");
      LOG.log(Level.INFO, "ownerDetailBO.getName " +ownerDetailBO.getName());
     ownerDetailDTO.setName(ownerDetailBO.getName());
     ownerDetailDTO.setSurName(ownerDetailBO.getSurName());
     ownerDetailDTO.setEmail(ownerDetailBO.getEmail());
     ownerDetailDTO.setAge(ownerDetailBO.getAge());
     ownerDetailDTO.setAddress(ownerDetailBO.getAddress());
     ownerDetailDTO.setMobileNo(ownerDetailBO.getMobileNo());
     ownerDetailDTO.setGender(ownerDetailBO.getGender());
     ownerDetailDTO.setPwd(ownerDetailBO.getPwd());
     ownerDetailDTO.setAdharcard(ownerDetailBO.getAdharcard());
     ownerDetailDTO.setPancard(ownerDetailBO.getPancard());
     ownerDetailDTO.setDob(ownerDetailBO.getDob());
     ownerDetailDTO.setLanguage(ownerDetailBO.getLanguage());
     ownerDetailDTO.setOwnerProfile(ownerDetailBO.getOwnerProfile());
     ownerDetailDTO.setOwnerId(ownerDetailBO.getOwnerId());
     return ownerDetailDTO; 
  }
    
} 