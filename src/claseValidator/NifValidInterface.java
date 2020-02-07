/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseValidator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Size;

/**
 *
 * @author adminUser
 */

    
    @Target(value = {ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(value = RetentionPolicy.RUNTIME)
//@Repeatable(value = Size.List.class)
@Documented
@Constraint(validatedBy = {ClientesNifValidator.class}) // aqui se indica la clase que realiza la validacion
    public @interface NifValidInterface {
    
        
        public String message();

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};
    
    
    }
    
    
   

