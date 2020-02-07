       <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="com" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    


    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

    </head>
    <body>
             <div class="modal fade" id="myViewModal" role="dialog">
    <div class="modal-dialog">

        
        
        <div class="modal-content ">
            
            
         <div class="modal-header container flexcolumn">
             <div class="d-block">  <h1>Nuevo Cliente!</h1></div>
              <div class="d-block "> 
                  <ol class="breadcrumb">
                      <li><a href="<com:url value="/"/>">Lista de Clientes</li></a> &nbsp;&nbsp; >> &nbsp;&nbsp;
                      <li class="active">Insertar Cliente</li>
                  </ol>
             </div> 
         </div>
                      
            <div class="modal-body">
         <form:form  id="inertarModalForm" modelAttribute="Clientes" method="post">
         
             <form:errors  path="*" element="div" cssClass="alert alert-danger"></form:errors>

            <form:label path="nombre">Nombre:</form:label>
            <form:input path="nombre"/><br>
            


                  <form:label path="apellidos">Apellidos:</form:label>
           <form:input path="apellidos"/><br>
              <form:label path="dni" >DNI:</form:label>
           <form:input path="dni"/><br>
                
              <form:label path="correo" >Correo</form:label>
           <form:input type="email" path="correo"/><br>
     
                  <form:label  path="telefono" >Telefono:</form:label>
           <form:input type="number"  path="telefono"/><br>
              <form:label path="direccion" >Dirección:</form:label>
           <form:input path="direccion"/><br>
              <form:label  path="cp" >Codigo Postal:</form:label>
           <form:input type="number" path="cp"/><br>
           Edad:
           <form:select path="edad" >
               
            
               
                <com:forEach var="edade" items="${edades}">
                   <form:option value="${edade}">${edade}</form:option>
                </com:forEach>
         
               
               
           </form:select><br>
                   <button type="button" class="btn btn-default" data-dismiss="modal">Save</button>
               
                   <form:button onclick="submit();" data-dismiss="modal" class="btn btn-success">Enviar</form:button>
       
         </div>          
                <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
        </div>       
            </div> 
            </div> 
     </form:form>
    </body>
</html>
