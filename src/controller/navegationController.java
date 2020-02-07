/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Stimp
 */

@Controller
public class navegationController {
    
    /* Aqui creamos la peticion uniendo la VIEW con la REFERENCIA AL DISPATCHER*/
    @RequestMapping("prueba.htm")
    public ModelAndView prueba(){
       
        
           ModelAndView map1=new ModelAndView();
        map1.setViewName("prueba");
        
        
        return map1;
        
        
     
    
    }
     @RequestMapping("paginaEnlace.htm")
    public ModelAndView enlace(){
       
        
           ModelAndView map1=new ModelAndView();
        map1.setViewName("enlace");
        
        
        return map1;
        
       
    }
     @RequestMapping("formulariosEnlace.htm")
    public ModelAndView formularios(){
       
        
           ModelAndView map1=new ModelAndView();
        map1.setViewName("formularios");
        
        
        return map1;
        
       
    }



  @RequestMapping("peticionesEnlace.htm")
    public ModelAndView peticionMethod(HttpServletRequest rqest){
       
        
           ModelAndView map1=new ModelAndView();
        map1.setViewName("peticiones");
        
        
        
        String parId=rqest.getParameter("id");
                String parId2=rqest.getParameter("id2");

                map1.addObject("id", parId);
                map1.addObject("id2", parId2);
        return map1;
        
        
     
    
    }


}