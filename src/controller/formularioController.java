/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.usuarios.clasesObjeto.Persona;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Stimp
 */
public class formularioController {
    
         @RequestMapping(value="formulariosEnlace.htm",method=RequestMethod.GET)
    public ModelAndView formularios(){
       
        
           ModelAndView map1=new ModelAndView("formularios","command",new Persona());
      
        
        return map1;
        
       
    }
     @RequestMapping(value="formulariosEnlace.htm",method=RequestMethod.POST)
    public String salidaForm(Persona p1, ModelMap model){
    
        
        model.addAttribute("nombre",p1.getNombre());
         model.addAttribute("apellidos",p1.getApellidos());
        model.addAttribute("edad",p1.getEdad());

    return "exito"; //nombre de la vista a la que se redireccionan los parametros
    
    }
    
    
    
    
    
}
