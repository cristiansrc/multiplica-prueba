<%@ page contentType="text/html; charset=UTF-8" %>

<%@ include file="./init.jsp" %>


<div class="container">
    <p><b>Nuevo producto</b></p>
</div>
<div class="container">
    <portlet:actionURL name="addProduct" var="addProductUrl"/>

    <aui:form action="${addProductUrl}">
        <aui:input name="name" type="text" label="Nombre:"/>
        <aui:input name="description" type="textarea" label="Descripcion:"/>
        <aui:button name="addProductButton" type="submit" value="Crear producto"/>
    </aui:form>
</div>
