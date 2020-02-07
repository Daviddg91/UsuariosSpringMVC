/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usuarios.clasesObjeto;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author Stimp
 */
public class conectorDB {
    
    
    public DriverManagerDataSource conectar(){
        DriverManagerDataSource source = null;
    try{
    source= new DriverManagerDataSource();
    source.setDriverClassName("com.mysql.jdbc.Driver");
    source.setUrl("jdbc:mysql://localhost:3306/usuarios");
    source.setUsername("root");
    source.setPassword("");
    }catch (Exception e){
        e.printStackTrace();
        
    }
    return source;
    }
}
