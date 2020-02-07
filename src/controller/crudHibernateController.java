/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import claseObjetos.Clientes;
import ModeloDatos.ClientesModel;
import java.util.ArrayList;
import java.util.List;
//import static javax.servlet.SessionTrackingMode.URL;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;





@Controller

public class crudHibernateController   {


     public crudHibernateController() {

       
    }
     String orden;
 
 //VIsualizar ordenar por campos
          @RequestMapping(value="/iberClientesEnlace")
          @ResponseBody
    public List clientesListadosModelView(@ModelAttribute(value="Clientes") Clientes c,@RequestParam(value="ordenar")String ordenar,org.springframework.ui.Model m){
       ClientesModel list1=new ClientesModel();
       Clientes c1= new Clientes();
  ClientesModel cmodel=new ClientesModel();
              
     List<Clientes> list2 = null;
      
      if(ordenar.equals("nombre")){
         list2=list1.getListaNameClientes();
      m.addAttribute("list",list1.getListaNameClientes()); 
    }else if(ordenar.equals("apellidos")){
        list2=list1.getListaApellidosClientes();  
        m.addAttribute("list",list1.getListaApellidosClientes());

     }else if(ordenar.equals("correo")){
    list2=list1.getListaCorreoClientes();
          m.addAttribute("list",list1.getListaCorreoClientes()); 

     }else if(ordenar.equals("edad")){
         list2=list1.getListaEdadClientes();
          m.addAttribute("list",list1.getListaEdadClientes()); 
}
      
       m.addAttribute("Clientes", c1);        
      
      return list2 ;
    }
    //Visualizar 
    @RequestMapping(method=RequestMethod.GET)
    public String clientesListaModelView(@ModelAttribute(value="Clientes") Clientes c,org.springframework.ui.Model m){
       ClientesModel list1=new ClientesModel();
       Clientes c1= new Clientes();
  ClientesModel cmodel=new ClientesModel();
        
      m.addAttribute("Clientes", c1);

      m.addAttribute("list",list1.getListaClientes()); 

      
      /*
      Aqui añado las propiedades de la ventana modal
      */
      
      
      ArrayList<String> intEdades = new ArrayList<String>();
      
       for (int i = 18; i < 100; i++) {   
             intEdades.add(Integer.toString(i));
       }
      
      
  
      
      
      m.addAttribute("edades", intEdades);
         ModelAndView map1=new ModelAndView();
      
      
        return "iberClientesVista";
    }
  
    
   
    //Buscador
     @RequestMapping(method=RequestMethod.POST)
    public String clientesListaModelViewBuscador(@ModelAttribute(value="Clientes") Clientes c,org.springframework.ui.Model m){
       ClientesModel list1=new ClientesModel();
     
   
      m.addAttribute("list",list1.getListaClientesBuscador(c.getCadenaBusqueda()));    
        
        return "iberClientesVista";
    }
    
    
    @RequestMapping
    public ModelAndView visualizarClientes(){
       ClientesModel list1=new ClientesModel();
        ModelAndView map1=new ModelAndView();
     
      map1.setViewName("iberClientesVista");
          
        
        return map1;
    }
  //eliminar
    
      @RequestMapping(value="/eliminarIberClientes",method=RequestMethod.GET)
    public String eliminarClientes(@RequestParam(value="id")int id, org.springframework.ui.Model m ){
       ClientesModel cmodel=new ClientesModel();
       Clientes c1=new Clientes();
        c1=cmodel.getCliente(id);
        cmodel.borrar(c1);
          
        
        return "redirect:iberClientesEnlace";
    }
//insertar 
    
    
    
          @RequestMapping(value="/insertarIberClientes",method=RequestMethod.GET)
    public ModelAndView  crearNavigation( org.springframework.ui.Model m ){
       
      ArrayList<String> intEdades = new ArrayList<String>();
      
       for (int i = 18; i < 100; i++) {   
             intEdades.add(Integer.toString(i));
       }
      
      Clientes c1= new Clientes();
  ClientesModel cmodel=new ClientesModel();
      
      m.addAttribute("Clientes", c1);
      m.addAttribute("edades", intEdades);
         ModelAndView map1=new ModelAndView();
      map1.setViewName("insertarIberClientes");
     
        
        return map1;
    }   
    
    
        @RequestMapping(value="/insertarIberClientes",method=RequestMethod.POST)
    public ModelAndView insertarIberClientes( @ModelAttribute(value="Clientes") @Valid Clientes c,BindingResult result){
     ModelAndView map1=new ModelAndView();
     
        if(result.hasErrors()){
          
              map1.setViewName("insertarIberClientes");
            }else{

               Clientes c2 =new Clientes();
              c2.setNombre(c.getNombre());
              c2.setApellidos(c.getApellidos());
              c2.setDni(c.getDni());
              c2.setDireccion(c.getDireccion());
              c2.setTelefono(c.getTelefono());
              c2.setCorreo(c.getCorreo());
              c2.setEdad(c.getEdad());
              c2.setCp(c.getCp());
ClientesModel model= new ClientesModel();
model.insertar(c2);
                    map1.setViewName("redirect:/iberClientesEnlace");
                    
            }

        return map1;
    }
        
       

    
    //editar
    
    @RequestMapping(value="/editarIberClientes",method=RequestMethod.GET)
    public ModelAndView editarVisualizar(@RequestParam(value="id")int id, org.springframework.ui.Model m ){
      
        ModelAndView map1=new ModelAndView();
      map1.setViewName("editarIberClientes");

      Clientes c1= new Clientes();
  ClientesModel cmodel=new ClientesModel();
      c1=cmodel.getCliente(id);
      
      m.addAttribute("datosEditar", c1);
      m.addAttribute("id", id);
        
        return map1;
    }
       @RequestMapping(value="/editarIberClientes",method=RequestMethod.POST)
    public ModelAndView editarIberClientes(@ModelAttribute (value="datosEditar")@Valid Clientes c,BindingResult result, org.springframework.ui.Model m ){
    
         ModelAndView map1=new ModelAndView();
        ClientesModel model= new ClientesModel();
     Clientes c2=new Clientes();
     c2 =model.getCliente(c.getId());
     
     if(result.hasErrors()){
           m.addAttribute("id", c.getId());
              map1.setViewName("editarIberClientes");
            }else{
      
    c2.setNombre(c.getNombre());
    c2.setApellidos(c.getApellidos());
    c2.setDireccion(c.getDireccion());
    c2.setDni(c.getDni());
    c2.setEdad(c.getEdad());
    c2.setCorreo(c.getCorreo());
    c2.setTelefono(c.getTelefono());
    c2.setCp(c.getCp());
    model.editar(c2);
    
            map1.setViewName("redirect:/");
    
     }
    
        return map1;
    

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
