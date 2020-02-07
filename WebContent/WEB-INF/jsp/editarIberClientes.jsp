 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:com="http://java.sun.com/jsp/jstl/core"
      xmlns:h="http://java.sun.com/jsf/html"
      xmlns:form = "http://java.sun.com/jsf/html" 
      xmlns:c="http://java.sun.com/jsp/jstl/core"
   
      >
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                     <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
 <title>Web Usuarios </title>
    
    </head>
    <body>
         <h:form  commandName="datosEditar" method="post">
             <h1>Hello Cliente Nº!<com:out value="${id}"></com:out> </h1>
        
        <ol class="breadcrumb">
            <li><a href="<com:url value="/"/>">Lista de Clientes</li></a> &nbsp;&nbsp; >> &nbsp;&nbsp;
            <li class="active">Editar Cliente</li>
            
        </ol>
        
                    <form:errors  path="*" element="div" cssClass="alert alert-danger"></form:errors>

       <form:label path="nombre">Nombre:</form:label>
            <form:input path="nombre"/><br>

                  <form:label path="apellidos">Apellidos:</form:label>
           <form:input path="apellidos"/><br>
              <form:label path="dni" >DNI:</form:label>
           <form:input path="dni"/><br>
                
              <form:label path="correo" >Correo</form:label>
           <form:input path="correo"/><br>
     
                  <form:label path="telefono" >Telefono:</form:label>
           <form:input type="number" path="telefono"/><br>
              <form:label path="direccion" >Dirección:</form:label>
           <form:input path="direccion"/><br>
              <form:label path="cp" >Codigo Postal:</form:label>
           <form:input type="number" path="cp"/><br>
           Edad:
           <form:select path="edad" >
               <form:option value="12">12</form:option>
             <form:option value="13">13</form:option>
             <form:option value="14">14</form:option>
             <form:option value="15">15</form:option>
             <form:option value="16">16</form:option>
             <form:option value="17">17</form:option>
             <form:option value="18">18</form:option>
             <form:option value="19">19</form:option>
               <form:option value="20">20</form:option>
             <form:option value="21">21</form:option>
             <form:option value="22">22</form:option>
             <form:option value="23">23</form:option>
             <form:option value="24">24</form:option>
             <form:option value="25">25</form:option>
             <form:option value="26">26</form:option>
             <form:option value="26">27</form:option>
               <form:option value="28">28</form:option>
             <form:option value="29">29</form:option>
             <form:option value="30">30</form:option>
             <form:option value="31">31</form:option>
             <form:option value="32">32</form:option>
             <form:option value="33">33</form:option>
             <form:option value="34">34</form:option>
             <form:option value="35">35</form:option>
                   <form:option value="36">36</form:option>
             <form:option value="37">37</form:option>
             <form:option value="38">38</form:option>
             <form:option value="39">39</form:option>
             <form:option value="40">40</form:option>
             <form:option value="41">41</form:option>
             <form:option value="42">42</form:option>
                   <form:option value="43">43</form:option>
             <form:option value="44">44</form:option>
             <form:option value="45">45</form:option>
             <form:option value="46">46</form:option>
             <form:option value="47">47</form:option>
             <form:option value="48">48</form:option>
             <form:option value="49">49</form:option>
                   <form:option value="50">50</form:option>
             <form:option value="51">51</form:option>
             <form:option value="52">52</form:option>
             <form:option value="53">53</form:option>
             <form:option value="54">54</form:option>
             <form:option value="55">55</form:option>
             <form:option value="56">56</form:option>
           </form:select><br>
                   <form:button  class="btn btn-success">Enviar</form:button>
        </h:form>
        
    </body>
</html>