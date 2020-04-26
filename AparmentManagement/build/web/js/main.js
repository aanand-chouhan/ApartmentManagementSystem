    /* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



$(document).ready(function() {
    $('#tenant-info').DataTable();
    
    var pathname =  window.location.search;
    
    let currentUrl = pathname.slice(5);
    //alert(currentUrl);
    if(currentUrl === "view_tenants_details"){
        
    }
    $(".owner-sidebar").find(".side-bar-item").click(function(){
        //alert(pathname);
        setTimeout(function(){
             $(".side-bar-item").removeClass("selected");
            console.log("printing")
            $(this).addClass("selected");
        },1000)
   
})
} );