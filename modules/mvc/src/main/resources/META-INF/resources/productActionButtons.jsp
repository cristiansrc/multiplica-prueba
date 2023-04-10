<%@ include file="./init.jsp" %>

<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.taglib.search.ResultRow" %>
<%@ page import="com.multiplica.prueba.cristiansrc.producto.mvc.domain.Product" %>

<%
    final ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
    final Product product = (Product) row.getObject();
%>

<portlet:actionURL name="displayProductEdition" var="displayProductEditionUrl">
    <portlet:param name="id" value="<%=String.valueOf(product.getId())%>"/>
</portlet:actionURL>

<portlet:actionURL name="deleteProduct" var="deleteProductUrl">
    <portlet:param name="id" value="<%=String.valueOf(product.getId())%>"/>
</portlet:actionURL>

<liferay-ui:icon-menu>
    <liferay-ui:icon image="edit" message="Editar" url="<%=displayProductEditionUrl%>"/>
    <liferay-ui:icon image="delete" message="Eliminar" url="<%=deleteProductUrl%>"/>
</liferay-ui:icon-menu>




