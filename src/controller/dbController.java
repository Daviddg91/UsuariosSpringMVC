/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.usuarios.clasesObjeto.Persona;
import com.usuarios.clasesObjeto.conectorDB;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Stimp
 */
@Controller
public class dbController {
    
    private JdbcTemplate jdbc;

    public dbController() {
        
        conectorDB con= new conectorDB();
        this.jdbc=new JdbcTemplate(con.conectar());
    }
    
        @RequestMapping(value="databaseEnlace.htm")
    public ModelAndView formularios(){
         ModelAndView map1=new ModelAndView("datos");
         
        String sql="SELECT * FROM CLIENTES;";
       List consultaLista= this.jdbc.queryForList(sql);
        
        
          
           map1.addObject("consultaLista",consultaLista);
           return map1;
        
       
    }
    
    
    
     
    
    
    
    
}
