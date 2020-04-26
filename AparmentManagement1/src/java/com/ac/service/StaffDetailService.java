/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ac.service;

import com.ac.bo.StaffDetailBO;
import com.ac.dao.OwnerDetailsDAO;
import com.ac.dto.StaffDetailDTO;

/**
 *
 * @author av
 */
public class StaffDetailService {
    
    public void insertStaffDetail(StaffDetailDTO dto){
        System.out.println("insertStaffDetails() service");
        StaffDetailBO bo = new StaffDetailBO();
        OwnerDetailsDAO dao = new OwnerDetailsDAO();
        bo.setName(dto.getName());
        bo.setSurName(dto.getSurName());
        bo.setEmail(dto.getEmail());
        bo.setAge(dto.getAge());
        bo.setAddress(dto.getAddress());
        bo.setMobileNo(dto.getMobileNo());
        bo.setWorkType(dto.getWorkType());
        bo.setWorkExpreience(dto.getWorkExpreience());
        bo.setPassword(dto.getPassword());
        bo.setGender(dto.getGender());
        bo.setDob(dto.getDob());
        bo.setPancard(dto.getPancard());
        bo.setAdharcard(dto.getAdharcard());
        bo.setProfile(dto.getProfile());
        dao.insertStaffDetail(bo);
    }
}
