<%@taglib prefix="com" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<property name="requestContextAttribute" value="rc"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
	
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    	

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web Usuarios </title>
                       <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
                      
                       <script src="https://unpkg.com/ionicons@4.4.4/dist/ionicons.js"></script>
                       
                       <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" >
               
                           <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>




                       
                      
                      <script type="text/javascript">
     
  
     
    function AllTrianDown(){
     
       $("[id*=triangulo]").removeClass("rot180");

      
}
    
    function llamadaNombre(elem){
       
       AllTrianDown();
        var id = $(elem).attr("id");
        
      $("#"+id).addClass("rot180");
      
       var list2=null;
             $.ajax({
            type : "GET",
            url : "/Usuarios/iberClientesEnlace?ordenar=nombre",
           data: {val: list2},
            success : function(result) {
                $('#tablebody').html("");
                  $.each(result,function(key, val) {
                       editar="<a href='/Usuarios/editarIberClientes?id="+val.id+"' class='btn btn-success' <span class='glyphicon glyphicon-search'></span> editar </a>" ;
                       eliminar="<a href='/Usuarios/eliminarIberClientes?id="+val.id+"' class='btn btn-success' <span class='glyphicon glyphicon-trash'></span> eliminar </a>";
            var htmlrow ="<tr>"+"<td>" + val.id + "</td>"+"<td>" + val.nombre + "</td>"+"<td>" + val.apellidos + "</td>"+"<td>" + val.dni + "</td>"+"<td>" + val.correo + "</td>"+"<td>" + val.telefono + "</td>"+"<td>" + val.direccion + "</td>"+"<td>" + val.cp + "</td>"+"<td>" + val.edad + "</td>"+"<td>" + editar + "</td>"+"<td>" + eliminar + "</td>"+"</tr>";         
             $('#tablebody').append(htmlrow);
        })
                
            }
        })   
    
   }
     function llamadaApellidos(elem){
       
       AllTrianDown();
      var id = $(elem).attr("id");
       
 $("#"+id).addClass("rot180");      
      
       var list2=null;
             $.ajax({
            type : "GET",
            url : "/Usuarios/iberClientesEnlace?ordenar=apellidos",
           data: {val: list2},
            success : function(result) {
                $('#tablebody').html("");
                  $.each(result,function(key, val) {
                         editar="<a href='/Usuarios/editarIberClientes?id='"+val.id+ " ' class='btn btn-success' > <span class='glyphicon glyphicon-search'></span> editar </a>" ;
                       eliminar="<a href='/Usuarios/eliminarIberClientes?id="+val.id+"' class='btn btn-success' <span class='glyphicon glyphicon-trash'></span> eliminar </a>";
            var htmlrow ="<tr>"+"<td>" + val.id + "</td>"+"<td>" + val.nombre + "</td>"+"<td>" + val.apellidos + "</td>"+"<td>" + val.dni + "</td>"+"<td>" + val.correo + "</td>"+"<td>" + val.telefono + "</td>"+"<td>" + val.direccion + "</td>"+"<td>" + val.cp + "</td>"+"<td>" + val.edad + "</td>"+"<td>" + editar + "</td>"+"<td>" + eliminar + "</td>"+"</tr>";         
             $('#tablebody').append(htmlrow);
        })
                
              
            }
        })   
    
   }
    function llamadaCorreo(elem){
       
       AllTrianDown();
          var id = $(elem).attr("id");
        
 $("#"+id).addClass("rot180");   
 
       var list2=null;
             $.ajax({
            type : "GET",
            url : "/Usuarios/iberClientesEnlace?ordenar=correo",
           data: {val: list2},
            success : function(result) {
                $('#tablebody').html("");
                  $.each(result,function(key, val) {
                       editar="<a href='/Usuarios/editarIberClientes?id="+val.id+"' class='btn btn-success' <span class='glyphicon glyphicon-search'></span> editar </a>" ;
                       eliminar="<a href='/Usuarios/eliminarIberClientes?id="+val.id+"' class='btn btn-success' <span class='glyphicon glyphicon-trash'></span> eliminar </a>";
            var htmlrow ="<tr>"+"<td>" + val.id + "</td>"+"<td>" + val.nombre + "</td>"+"<td>" + val.apellidos + "</td>"+"<td>" + val.dni + "</td>"+"<td>" + val.correo + "</td>"+"<td>" + val.telefono + "</td>"+"<td>" + val.direccion + "</td>"+"<td>" + val.cp + "</td>"+"<td>" + val.edad + "</td>"+"<td>" + editar + "</td>"+"<td>" + eliminar + "</td>"+"</tr>";         
             $('#tablebody').append(htmlrow);
        })
                
           
            }
        })   
    
   }
    function llamadaEdad(elem){
       
       AllTrianDown();
          var id = $(elem).attr("id");
      
        
      $("#"+id).addClass("rot180");
      
       var list2=null;
             $.ajax({
            type : "GET",
            url : "/Usuarios/iberClientesEnlace?ordenar=edad",
           data: {val: list2},
            success : function(result) {
                $('#tablebody').html("");
                  $.each(result,function(key, val) {
                       editar="<a href='/Usuarios/editarIberClientes?id="+val.id+"' class='btn btn-success' <span class='glyphicon glyphicon-search'></span> editar </a>" ;
                       eliminar="<a href='/Usuarios/eliminarIberClientes?id="+val.id+"' class='btn btn-success' <span class='glyphicon glyphicon-trash'></span> eliminar </a>";
            var htmlrow ="<tr>"+"<td>" + val.id + "</td>"+"<td>" + val.nombre + "</td>"+"<td>" + val.apellidos + "</td>"+"<td>" + val.dni + "</td>"+"<td>" + val.correo + "</td>"+"<td>" + val.telefono + "</td>"+"<td>" + val.direccion + "</td>"+"<td>" + val.cp + "</td>"+"<td>" + val.edad + "</td>"+"<td>" + editar + "</td>"+"<td>" + eliminar + "</td>"+"</tr>";         
             $('#tablebody').append(htmlrow);
        })
                
          
            }
        })   
    
   }
</script>
         
             <style>
               /* Styles for wrapping the search box */

.main {
    width: 70%;
    margin: 50px auto;
}

#buscboton{
   min-height:38px;
   height: 0%;
   min-width: 90px;
    margin-left:30.5%;
}






.has-search .form-control-feedback {
    right: initial;
    left: 0;
    color: #ccc;
}

.has-search .form-control {
    padding-right: 12px;
    padding-left: 34px;
}  
        .rot180 {
	-webkit-transform: rotate(180deg);
	-moz-transform: rotate(180deg);
	rotation: 180deg;
        }
           .rot0 {
	-webkit-transform: rotate(0deg);
	-moz-transform: rotate(0deg);
	rotation: 0deg;
        }
.triangulo  {
 cursor:pointer;
 color:green;
 margin-left: 3.4%;
}
#buscresult{
    text-align: left;
    
}
#spantri {
  display: flex;
  
  
   justify-content:space-between;
  align-content: space-around;
  
}
#padrebusc{
     
   display: flex;

   
}
#buscresult a {
    min-width:100px;
    max-width:20%;
    max-height:20%;
}

#buscresult a {
    
    display: flex;
   justify-content: center;
   align-items: center;
    
}
 body a {
    
    display: flex;
   justify-content: center;
   align-items: center;
    
}
.flexcolumn{
     display: flex;
  flex-direction: column;
    
    
}
             </style>  
             <script type="text/javascript">
function bloquea(){
    
/*
     setTimeout(function(){
        document.getElementById('myForm').submit();
    }, 2000);
 */
}
function ordenarNombre(){
    
    location.href("http://localhost:8080/Usuarios/insertarIberClientes");
    
    
}
function submint(){
      $("#inputbusqueda").val("");
        document.getElementById('myForm').submit();

}
function clickBusqueda(){
    
    
      $("#inputbusqueda").val("");
       

}

$(document).ready(function() {
 $( "#inputbusqueda" ).focusout(function() {
      
  $("#inputbusqueda").val("Buscar...");
  });
  
  
  $('#myViewModal').change(
    function() {
        $.validator.unobtrusive.parse("#inertarModalForm");
});
  
  
});



</script>
    </head>
    
    
                     <form:errors  path="*" element="div" cssClass="alert alert-danger"></form:errors>

        <h1>Pantalla de Clientes</h1><br>
             <ol class="breadcrumb">
            <li class="active "><a href="<com:url value="/"/>">Lista de Clientes</li></a> &nbsp;&nbsp; >> &nbsp;&nbsp;
       
            
        </ol>
            
                     <div class="main">
  
  <!-- Actual search box -->
  <form:form action="${rc.getContextPatch()}" modelAttribute="Clientes" id="myForm" >
  

  
  
    <div id="padrebusc" class="container col-sm-10 col-md-10 col-lg-10 col-xl-10">
        <div >
               
                    <div  class="form-group has-feedback has-search" >
                        <form:input path="cadenaBusqueda" size="160"  id="inputbusqueda"  onclick="clickBusqueda()" cssClass="glyphicon glyphicon-search form-control-feedback form-control " value="Buscar..." />
                       </div>
       </div>
        <div>
            <form:button id="buscboton" class="btn btn-success" ><p><ion-icon name="search"></ion-icon>Buscar</p></form:button>
        </div>
    
    </div>      
   
       
   
  
</div>
  
 
         </form:form>   
        <table id="buscresult" class="table table-bordered table-striped table-hover">
            <thead>
          <tr>
            <th>ID</th>
   
            <th ><div id="spantri"><div>Nombre</div><div class="triangulo" onclick="llamadaNombre(this)" id="triangulo1">&#x25BC;</div></div></th>

           

            <th><div id="spantri"><div>Apellidos</div><div class="triangulo" onclick="llamadaApellidos(this)" id="triangulo2">&#x25BC;</div></div></th>
            <th>DNI</th>

                        <th><div id="spantri"><div>Correo</div><div class="triangulo" onclick="llamadaCorreo(this)" id="triangulo3">&#x25BC;</div></div></th>

            <th>Telefono</th>
            <th>Direccion</th>
            <th>CP</th>
                        <th><div id="spantri"><div>Edad</div><div class="triangulo" onclick="llamadaEdad(this)" id="triangulo4">&#x25BC;</div></div></th>
            <th>Editar</th>
            <th>Eliminar</th>
            
          </tr>
             
            </thead>
         
       
    <tbody id="tablebody">
         <com:forEach items="${list}" var="obj">
            <tr>
                <td><com:out value="${obj.id}"></com:out>
                </td>
                <td><com:out value="${obj.nombre}"></com:out>
                </td>
                <td><com:out value="${obj.apellidos}"></com:out>
                </td>
                <td><com:out value="${obj.dni}"></com:out>
                </td>
                <td><com:out value="${obj.correo}"></com:out>
                </td>
                <td><com:out value="${obj.telefono}"></com:out>
                </td>
                <td><com:out value="${obj.direccion}"></com:out>
                </td>
                <td><com:out value="${obj.cp}"></com:out>
                </td>
                <td><com:out value="${obj.edad}"></com:out>
                </td>
                <td> <a href="<com:url value="/editarIberClientes?id=${obj.id}"/>" class="btn btn-success"/><ion-icon name="sync"></ion-icon>editar</a></td>
                <td> <a href="<com:url value="/eliminarIberClientes?id=${obj.id}"/>" class="btn btn-success"/><ion-icon name="trash"></ion-icon>eliminar</a></td>

            </tr>
            
        </com:forEach>
        </tbody>
         </table>

        
         <div class="container">
                <div class="row">
                    <p>
                        <a href="<com:url value="/insertarIberClientes"/>" class="btn btn-success"/><ion-icon name="add"></ion-icon>Ingresar Clientes</a>
                         <a href="" data-toggle="modal" data-target="#myViewModal" class=" btn btn-success"/><ion-icon name="add"></ion-icon>Ingresar Clientes Modal</a>
                   
 
 </p>
                    </br>
             
                 </div>
        </div>
          
                     <%@include file="insertarIberClientesModal1.jsp" %>

</html>

       
      