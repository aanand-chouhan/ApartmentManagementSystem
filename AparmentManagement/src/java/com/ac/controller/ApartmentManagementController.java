/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ac.controller;

import com.ac.dao.OwnerDetailsDAO;
import com.ac.dto.ApartmentDetailDTO;
import com.ac.service.OwnerDetailService;
import com.ac.dto.OwnerDetailsDTO;
import com.ac.dto.StaffDetailDTO;
import com.ac.dto.TenantDetailDTO;
import com.ac.service.ApartmentDetailService;
import com.ac.service.StaffDetailService;
import com.ac.service.TenantDetailService;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Base64;
import java.util.List;
import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author av
 */
public class ApartmentManagementController extends HttpServlet{
    private static String STATUS;
    public ApartmentManagementController(){
        System.out.println("ApartmentManagementController()");
    }
    
    @Override
    public void init(){
        System.out.println("init()");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("doGet() controller");
        //To change body of generated methods, choose Tools | Templates.
        doPost(req, res); 
    }
    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
       System.out.println("doPost() controller"); 
      
       String path = null;
       RequestDispatcher rd ;
       path = req.getParameter("CMD");
       System.out.print("path "+path);
       if(path != null && !path.equalsIgnoreCase("")){
        /*if(path.equalsIgnoreCase("/")){
             RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
                rd.forward(req, res);
        }*/
       if(path.equalsIgnoreCase("owner_registration_form")){
           boolean result = false;
            System.out.println("path "+path);
            String name = req.getParameter("name");
            String surname = req.getParameter("surname");
            String email = req.getParameter("email");
            int age = Integer.parseInt(req.getParameter("age"));
            long mobileNo = Long.parseLong(req.getParameter("number"));
            String gender = req.getParameter("gender");
            String address = req.getParameter("address");
            long adharcard = Long.parseLong(req.getParameter("adharcard"));
            Date dob = Date.valueOf(req.getParameter("dob"));
            String pancard = req.getParameter("pancard");
            String pwd= req.getParameter("pwd");
           // String[]  language = req.getPString pwd= req.getParameter("pwd");arameterValues("language");
            // List list = Arrays.asList(names);
            String language = req.getParameter("language");
//             image = req.getParameter("image");
            System.out.println("email "+email);
            System.out.println("pwd "+pwd);
            OwnerDetailsDTO dto = new OwnerDetailsDTO();
            dto.setAddress(address);
            dto.setAdharcard(adharcard);
            dto.setDob(dob);
            dto.setAge(age);
            dto.setEmail(email);
            dto.setGender(gender);
            dto.setMobileNo(mobileNo);
            dto.setName(name);
            dto.setPancard(pancard);
            dto.setPwd(pwd);
            dto.setSurName(surname);
            dto.setLanguage(language);
            OwnerDetailService service = new OwnerDetailService();
            result = service.insertOwnerDetails(dto);
            if(result){
                rd = req.getRequestDispatcher("login.jsp");
                req.setAttribute("STATUS","SUCCESS");
                rd.forward(req, res);
            }
            else{
                 rd = req.getRequestDispatcher("registration.jsp");
                 req.setAttribute("STATUS","FAILED");
                 rd.forward(req, res);
            }
                               
       }//owner_registration_form end
       
       else if(path.equalsIgnoreCase("login_form")){
           boolean result =false;
           System.out.println("path "+path);
           String email = req.getParameter("email");
           String password = req.getParameter("pwd");
           OwnerDetailsDAO dao =new OwnerDetailsDAO();
           HttpSession session =null;
           rd = null;
           System.out.println("email "+email);
           System.out.println("password "+password);
            if((email != null && !email.equals(""))&&(password != null && !password.equals(""))){
                 result = dao.validateOwner(email, password);
                 System.out.println("Result 1"+result);
            }

            if(result){               
               try{
                OwnerDetailService service = new OwnerDetailService();
                OwnerDetailsDTO dto = service.fetchOwnerDetails(email,password);
                session =  req.getSession();
                session.setAttribute("currentUserName", dto.getName());
                System.out.println("dto.getName() "+dto.getName());
                session.setAttribute("currentUserEmail", email);
                session.setAttribute("currentUserPassword", password);
                rd = req.getRequestDispatcher("ownerDashboard.jsp");
               }catch(Exception e){
                   System.out.println(e);
               }
               finally{
               rd.forward(req, res);
               }
                
            }
            else{
               rd = req.getRequestDispatcher("login.jsp");
               req.setAttribute("STATUS","FAILED");
               rd.forward(req, res);
           }
       }
       else if(path.equalsIgnoreCase("apartment_registration")){
           boolean result = false;
           System.out.println("path "+path);
           String apartmentName = req.getParameter("apartmentName");
           int startNo = Integer.parseInt(req.getParameter("startNo"));
           String email = req.getParameter("email");
           String address = req.getParameter("address");
           int flateEndNo = Integer.parseInt(req.getParameter("flateEndNo"));
           int totalflat = Integer.parseInt(req.getParameter("totalflat"));
           long contact = Long.parseLong(req.getParameter("contact"));
           int floors = Integer.parseInt(req.getParameter("floors"));
           Part flatesImage = req.getPart("flatesImage");
          // File file = new File(flatesImage);
          //System.out.print(" img "+flatesImage);
            InputStream io = null;
           if(flatesImage != null){
               io = flatesImage.getInputStream();
           }
          
           
           ApartmentDetailDTO dto = new ApartmentDetailDTO();
           dto.setAddress(address);
           dto.setApartmentName(apartmentName);
           dto.setContact(contact);
           dto.setEmail(email);
           dto.setEndNo(flateEndNo);
           dto.setFloors(floors);
           dto.setImage(io);
           dto.setStartNo(startNo);
           dto.setTotalFlat(totalflat);
           ApartmentDetailService service = new ApartmentDetailService();
           System.out.println("email "+email);
           System.out.println("apartmentName "+apartmentName);
           result = service.insertApartmentDetail(dto);
           if((email != null)&&(apartmentName != null)){
               
                 System.out.println("Result "+result);
            }

            if(result){
                rd = req.getRequestDispatcher("apartmentRegistration.jsp");
                 req.setAttribute("STATUS","SUCCESS");
                rd.forward(req, res);
            }
            else{
               rd = req.getRequestDispatcher("apartmentRegistration.jsp");
               req.setAttribute("STATUS","FAILED");
               rd.forward(req, res);
           }
           }
           
  
           
       else if(path.equalsIgnoreCase("tenant_registration")){
           System.out.println("controller Tenant info");
           String tenantName = req.getParameter("tenantName");
           String surName = req.getParameter("surName");
           String email = req.getParameter("email");
           int age = Integer.parseInt(req.getParameter("age"));
           String address = req.getParameter("address");
           long mobileNo = Long.parseLong(req.getParameter("mobileNo"));
           String workName = req.getParameter("workName");
           String password = req.getParameter("password");
           Part image = req.getPart("profileImage");
           InputStream io = null;
           if(image != null){
               io = image.getInputStream();
           }
           
           TenantDetailDTO dto = new TenantDetailDTO();
           dto.setTenantName(tenantName);
           dto.setSurName(surName);
           dto.setEmail(email);
           dto.setAge(age);
           dto.setAddress(address);
           dto.setMobileNo(mobileNo);
           dto.setWorkName(workName);
           dto.setPassword(password);
           dto.setImage(io);
           TenantDetailService service = new TenantDetailService();
           service.insertTenantDetail(dto);
       }
       
       
       
       
       else if(path.equalsIgnoreCase("Staff_registration")){
           System.out.println("controller staff info");
           String name = req.getParameter("name");
           String surName = req.getParameter("surName");
           String email = req.getParameter("email");
           int age = Integer.parseInt(req.getParameter("age"));
           String address = req.getParameter("address");
           long mobileNo = Long.parseLong(req.getParameter("mobileNo"));
           String workType =req.getParameter("workType");
           String workExperience = req.getParameter("workExperience");
           String password = req.getParameter("password");
           String gender = req.getParameter("gender");
           Date dob = Date.valueOf(req.getParameter("dob"));
           String pancard = req.getParameter("pancard");
           long adharcard = Long.parseLong(req.getParameter("adharcard"));
           Part profile = req.getPart("profile");
           InputStream io = null;
           if(profile != null){
               io = profile.getInputStream();
           }
                  
           StaffDetailDTO dto = new StaffDetailDTO();
           dto.setName(name);
           dto.setSurName(surName);
           dto.setEmail(email);
           dto.setAge(age);
           dto.setAddress(address);
           dto.setMobileNo(mobileNo);
           dto.setWorkType(workType);
           dto.setWorkExpreience(workExperience);
           dto.setPassword(password);
           dto.setGender(gender);
           dto.setDob(dob);
           dto.setPancard(pancard);
           dto.setAdharcard(adharcard);
           dto.setProfile(io);
           StaffDetailService service = new StaffDetailService();
           service.insertStaffDetail(dto);
           
       }
       else if(path.equalsIgnoreCase("view_owner_details")){
           HttpSession session;
           String email;
           String pwd ;
           OwnerDetailService service ;
           OwnerDetailsDTO dto ;
           
           session =  req.getSession();
           service = new OwnerDetailService();
           email =(String)session.getAttribute("currentUserEmail");
           pwd = (String)session.getAttribute("currentUserPassword");
           rd = req.getRequestDispatcher("ownerDetails.jsp");
           try{
             dto = service.fetchOwnerDetails(email, pwd);
             System.out.println(dto.getEmail());
             
             ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            byte[] buffer = new byte[4096];
            int bytesRead = -1;

            while ((bytesRead = dto.getOwnerProfile().read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = outputStream.toByteArray();
            String base64Image = Base64.getEncoder().encodeToString(imageBytes);
            //dto.setOwnerProfile(base64Image);
               
             req.setAttribute("ownerDetails", dto);
             req.setAttribute("ownerProfile", base64Image);
           }catch(SQLException se){
               System.out.println(se);
               rd = req.getRequestDispatcher("ownerDashboard");
               req.setAttribute(STATUS, "SQLError");
               rd.forward(req, res);
           }finally{
               rd.forward(req, res);
           }
       }
     }//apartmentRegistration
    }
    
    }
     
