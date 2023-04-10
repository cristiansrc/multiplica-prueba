<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/init.jsp" %>


<div class="container">

	<portlet:actionURL name="addDisplayProduct" var="addDisplayProductUrl"/>

	<aui:form action="${addDisplayProductUrl}">
		<aui:button name="addDisplayProductButton" type="submit" value="Crear producto"/>
	</aui:form>
</div>
<div class="container">
		<jsp:useBean id="products" type="java.util.List<com.multiplica.prueba.cristiansrc.producto.mvc.domain.Product>" scope="request"/>

		<liferay-ui:search-container emptyResultsMessage="No has creado ningún producto.">
		    <liferay-ui:search-container-results results="${products}"/>

		    <liferay-ui:search-container-row className="com.multiplica.prueba.cristiansrc.producto.mvc.domain.Product" modelVar="product">
				<liferay-ui:search-container-column-text name="Id" property="id"/>
		        <liferay-ui:search-container-column-text name="Nombre" property="name"/>
				<liferay-ui:search-container-column-text name="Descripcion" property="description"/>
				<liferay-ui:search-container-column-jsp name="" path="/productActionButtons.jsp"/>
		    </liferay-ui:search-container-row>

		    <liferay-ui:search-iterator/>
		</liferay-ui:search-container>


</div>
