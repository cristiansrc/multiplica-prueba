<%@ page contentType="text/html; charset=UTF-8" %>
 
<%@ include file="./init.jsp" %>
 
<jsp:useBean id="product" type="com.multiplica.prueba.cristiansrc.producto.mvc.domain.Product" scope="request"/>

<portlet:actionURL name="editProduct" var="editProductUrl"/>


<div class="container">
    <p><b>Editar producto</b></p>
</div>

<div class="container">
    <aui:form action="${editProductUrl}">
        <aui:input name="name" type="text" label="Nombre:" value="<%=product.getName()%>"/>
        <aui:input name="description" type="textarea" label="Descripcion:" value="<%=product.getDescription()%>"/>
        <aui:input name="id" type="hidden" value="<%=String.valueOf(product.getId()) %>"/>
        <aui:button name="editProductButton" type="submit" value="Editar producto"/>
    </aui:form>
</div>


