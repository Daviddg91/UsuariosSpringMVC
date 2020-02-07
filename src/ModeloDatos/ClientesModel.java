/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDatos;

import HibernateUsuarios.hibernateUtilUsuarios;
import claseObjetos.Clientes;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

/**
 *
 * @author Stimp
 */
public class ClientesModel {
    Criteria crit =null;
    
    public List<Clientes> getListaClientes(){
    Session s= hibernateUtilUsuarios.getSessionFactory().openSession();
    List <Clientes> listaClientes = new ArrayList<Clientes>();
    
    try{
    s.beginTransaction();
    crit =s.createCriteria(Clientes.class);
    listaClientes = crit.list();
    }catch(Exception e){
    e.printStackTrace();
    s.getTransaction().rollback();
    }
    return listaClientes;
    }
          public List<Clientes> getListaNameClientes(){
    Session s= hibernateUtilUsuarios.getSessionFactory().openSession();
    List <Clientes> listaClientes = new ArrayList<Clientes>();
    
    try{
    s.beginTransaction();
    //listaClientes = s.createCriteria(Clientes.class).list().sort(c);
    
   Criteria crit =s.createCriteria(Clientes.class);
       Order o= Order.asc("nombre");
       crit.addOrder(o);
       listaClientes= crit.list(); 
   }catch(Exception e){
    e.printStackTrace();
    s.getTransaction().rollback();
    }
    return listaClientes;
    }
                public List<Clientes> getListaApellidosClientes(){
    Session s= hibernateUtilUsuarios.getSessionFactory().openSession();
    List <Clientes> listaClientes = new ArrayList<Clientes>();
    
    try{
    s.beginTransaction();
    //listaClientes = s.createCriteria(Clientes.class).list().sort(c);
    
   Criteria crit =s.createCriteria(Clientes.class);
       Order o= Order.asc("apellidos");
       crit.addOrder(o);
       listaClientes= crit.list(); 
   }catch(Exception e){
    e.printStackTrace();
    s.getTransaction().rollback();
    }
    return listaClientes;
    }
                      public List<Clientes> getListaEdadClientes(){
    Session s= hibernateUtilUsuarios.getSessionFactory().openSession();
    List <Clientes> listaClientes = new ArrayList<Clientes>();
    
    try{
    s.beginTransaction();
    //listaClientes = s.createCriteria(Clientes.class).list().sort(c);
    
   Criteria crit =s.createCriteria(Clientes.class);
       Order o= Order.asc("edad");
       crit.addOrder(o);
       listaClientes= crit.list(); 
   }catch(Exception e){
    e.printStackTrace();
    s.getTransaction().rollback();
    }
    return listaClientes;
    }
       public List<Clientes> getListaCorreoClientes(){
    Session s= hibernateUtilUsuarios.getSessionFactory().openSession();
    List <Clientes> listaClientes = new ArrayList<Clientes>();
    
    try{
    s.beginTransaction();
    //listaClientes = s.createCriteria(Clientes.class).list().sort(c);
    
   Criteria crit =s.createCriteria(Clientes.class);
       Order o= Order.asc("correo");
       crit.addOrder(o);
       listaClientes= crit.list(); 
   }catch(Exception e){
    e.printStackTrace();
    s.getTransaction().rollback();
    }
    return listaClientes;
    }
     public void insertar(Clientes j){
    
       Session s= hibernateUtilUsuarios.getSessionFactory().openSession();
    
    try{
    s.beginTransaction();
    s.save(j);
    s.getTransaction().commit();

    }catch(Exception e){
    e.printStackTrace();
    s.getTransaction().rollback();
    }
    
    }
    public void editar(Clientes j){
    
       Session s= hibernateUtilUsuarios.getSessionFactory().openSession();
    
    try{
    s.getTransaction().begin();
    s.update(j);
    s.getTransaction().commit();

    }catch(Exception e){
    e.printStackTrace();
    s.getTransaction().rollback();
    }
    
    }
     public void borrar(Clientes j){
    
       Session s= hibernateUtilUsuarios.getSessionFactory().openSession();
    
    try{
    s.beginTransaction();
    s.delete(j);
    s.getTransaction().commit();

    }catch(Exception e){
    e.printStackTrace();
    s.getTransaction().rollback();
    }
    
    }
     
     public Clientes getCliente(int id){
     
      Session s= hibernateUtilUsuarios.getSessionFactory().openSession();
      Clientes cliente1=new Clientes();
    try{
    s.beginTransaction();
    cliente1= (Clientes)s.get(Clientes.class,id);
    s.getTransaction().commit();

    }catch(Exception e){
    e.printStackTrace();
    s.getTransaction().rollback();
    }

     
     
     return cliente1;
     }
       public List<String> getListaClientesBuscador(String cadenaBusqueda){
     List<String> listfinal = null ;
      Session s= hibernateUtilUsuarios.getSessionFactory().openSession();
       s.getTransaction().begin();
      Clientes cliente1=new Clientes();
    try{
     
     Query query1= s.createQuery("select r from Clientes r where nombre like :name or apellidos like :name or dni like :name");
   query1.setString("name","%"+ cadenaBusqueda+"%");
  
   listfinal=query1.list();
  
s.getTransaction().commit();
    }catch(Exception e){
    e.printStackTrace();
    s.getTransaction().rollback();
    }

     
     
     return listfinal;
     }  
}
