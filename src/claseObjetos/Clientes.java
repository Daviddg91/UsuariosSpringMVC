package claseObjetos;
// Generated 05-nov-2018 4:55:16 by Hibernate Tools 4.3.1

import claseValidator.NifValidInterface;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
//import javax.validation.executable.ExecutableValidator;
import javax.validation.metadata.BeanDescriptor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;






/**
 * Clientes generated by hbm2java
 */
public class Clientes  implements java.io.Serializable{



   
     private Integer id;
     @NotEmpty (message="El nombre no puede quedar vacio")
     private String nombre;
      @NotEmpty (message="El nombre no puede quedar vacio")
     private String apellidos;
       @NotNull (message="La edad no puede quedar vacia")
       @Min (value=18, message="La Edad minima para registrarse es de 18 años")
       @Max (value=100, message="La Edad maxima para registrarse es de 100 años")
     private int edad;
        @NotEmpty (message="El nombre no puede quedar vacio")
     private String direccion;
       
       
       @NifValidInterface (message="El dni no esta regulado")
       @Size (min=9,max=9, message="Introduzca un dni de 9 digitos ")
       @NotEmpty (message="El dni no puede quedar vacio")
     private String dni;
     //  @Pattern(regexp="^(0|[1-9][0-9]*)$", message="Introduzca numeros en el Codigo postal") 
       @Range(min = 1000,max = 999999, message="Introduzca un Codigo Postal correcto") 
        @NotNull (message="El Codigo Postal no puede quedar vacio")

     private int cp;
       
      // @Pattern(regexp = "[0-9]+", message = "holaholaholas")
       @Range(min = 100000000,max = 999999999, message="Introduzca un Telefono correcto") 
         @NotNull (message="El telefono no puede quedar vacio")
     private int telefono;
     @Email(message="Escriba un email valido")
     @NotEmpty (message="El correo no puede quedar vacio")
     private String correo;
     private String cadenaBusqueda;
    public Clientes() {
    }

    public Clientes(String nombre, String apellidos, int edad, String direccion, String dni, int cp, int telefono, String correo) {
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.edad = edad;
       this.direccion = direccion;
       this.dni = dni;
       this.cp = cp;
       this.telefono = telefono;
       this.correo = correo;
    }

    public void setCadenaBusqueda(String cadenaBusqueda) {
        this.cadenaBusqueda = cadenaBusqueda;
    }

    public String getCadenaBusqueda() {
        return cadenaBusqueda;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getEdad() {
        return this.edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public int getCp() {
        
        return this.cp;
   
        
    }
    
    public void setCp(int cp) {
 
        this.cp = cp;
    }
    public int getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }

 




}


