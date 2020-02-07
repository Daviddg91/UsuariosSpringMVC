       <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="com" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 

<html>
    


    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                       <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
                           <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
                       <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" >

    </head>
    <body>
            
        
       
        <h1>Nuevo Cliente!</h1>
        
         <ol class="breadcrumb">
            <li><a href="<com:url value="/"/>">Lista de Clientes</li></a> &nbsp;&nbsp; >> &nbsp;&nbsp;
            <li class="active">Insertar Cliente</li>
            
        </ol>
        
           
         <form:form   modelAttribute="Clientes" method="post">
         
             <form:errors  path="*" element="div" cssClass="alert alert-danger"></form:errors>

            <form:label path="nombre">Nombre:</form:label>
            <form:input path="nombre"/><br>
            


                  <form:label path="apellidos">Apellidos:</form:label>
           <form:input path="apellidos"/><br>
              <form:label path="dni" >DNI:</form:label>
           <form:input path="dni"/><br>
                
              <form:label path="correo" >Correo</form:label>
           <form:input type="email" path="correo"/><br>
     
                  <form:label path="telefono" >Telefono:</form:label>
           <form:input type="number" path="telefono"/><br>
              <form:label path="direccion" >Dirección:</form:label>
           <form:input path="direccion"/><br>
              <form:label path="cp" >Codigo Postal:</form:label>
           <form:input type="number" path="cp"/><br>
           Edad:
           <form:select path="edad" >
      <com:forEach var="edade" items="${edades}">
                   <form:option value="${edade}">${edade}</form:option>
                </com:forEach>
         
           </form:select><br>
                   <form:button  class="btn btn-success">Enviar</form:button>
        </form:form>
                 
         
    </body>
</html>
