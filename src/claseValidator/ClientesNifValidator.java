/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseValidator;

import java.lang.annotation.Annotation;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author adminUser
 */
public class ClientesNifValidator implements ConstraintValidator<Annotation, String > {

    @Override
    public void initialize(Annotation a) {
    }

    @Override
    public boolean isValid(String t, ConstraintValidatorContext cvc) {
    
        CalculaNif nif=new CalculaNif();
          
     
           return nif.validarDni(t);
    }
     public class CalculaNif {

    private final String letrasNif = "TRWAGMYFPDXBNJZSQVHLCKE";
   
 
    public boolean validarDni(String nif) {
        String numerosDni="";
       if(isvalido(nif)){
        nif = nif.toUpperCase();
         numerosDni= nif.substring(0,8);
         
    }else{
     return false;
     }
       String letraDni=Character.toString(nif.charAt(8));
       
       String letraCalc=Character.toString(calculaLetra(numerosDni));
       
     if(letraDni.equals(letraCalc)){
            return true;
     }else{
     return false;
     }
    }

    
    public boolean isvalido(String nif) {
        if(nif.equals("")){
            return false;
        
        }
        String letra2= nif.substring(0, 8);
        
       if(nif.isEmpty() || nif.length()>9){
        return false;
        }else if(!Character.isDigit(letra2.charAt(0))){
           
           return false;
       }else if(!Character.isAlphabetic(nif.charAt(8))){
           
           return false;
       }else{ 
           return true;
        }
        
    }

    private char calculaLetra(String aux) {
        return letrasNif.charAt(Integer.parseInt(aux) % 23);
    }

}
}
