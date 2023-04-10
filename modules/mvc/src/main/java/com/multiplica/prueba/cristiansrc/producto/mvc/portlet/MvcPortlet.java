package com.multiplica.prueba.cristiansrc.producto.mvc.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.multiplica.prueba.cristiansrc.producto.mvc.constants.MvcPortletKeys;
import com.multiplica.prueba.cristiansrc.producto.mvc.domain.Product;
import com.multiplica.prueba.cristiansrc.producto.mvc.mapping.ProductMapping;
import com.multiplica.prueba.cristiansrc.producto.repository.model.ProductDb;
import com.multiplica.prueba.cristiansrc.producto.repository.service.ProductDbLocalServiceUtil;

import java.io.IOException;
import java.util.List;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;



/**
 * @author crist
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Mvc",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + MvcPortletKeys.MVC,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class MvcPortlet extends MVCPortlet {

	@Override
	public void render(RenderRequest request, RenderResponse response) throws IOException, PortletException {
		
		List<Product> products = ProductMapping.dbToListProduct(ProductDbLocalServiceUtil.getProductDbs(-1, -1));
		request.setAttribute("products", products);
		
		super.render(request, response);
	}

	@ProcessAction(name = "addProduct")
	public void addProduct(ActionRequest request, ActionResponse response) {
		
		ProductDb productDb = ProductDbLocalServiceUtil.createProductDb(
				CounterLocalServiceUtil.increment(ProductDb.class.getName())
				);
		
		productDb.setName(ParamUtil.getString(request, "name"));
		productDb.setDescription(ParamUtil.getString(request, "description"));
		ProductDbLocalServiceUtil.addProductDb(productDb);
		
		response.setRenderParameter("mvcPath", "/view.jsp");

	}

	@ProcessAction(name = "displayProductEdition")
	public void displayProductEdition(ActionRequest request, ActionResponse response) throws IOException, PortletException, PortalException {
		final String id = request.getParameter("id");
		final Product product = ProductMapping.dbToProduct(ProductDbLocalServiceUtil.getProductDb(Long.valueOf(id)));
		request.setAttribute("product", product);
		response.setRenderParameter("mvcPath", "/productEdit.jsp");
	}
	
	@ProcessAction(name = "addDisplayProduct")
	public void displayProductNew(ActionRequest request, ActionResponse response) throws IOException, PortletException, PortalException {
		response.setRenderParameter("mvcPath", "/productNew.jsp");
	}
	
	
	@ProcessAction(name = "editProduct")
	public void editProduct(ActionRequest request, ActionResponse response) throws IOException, PortletException, PortalException {
		ProductDb productDb = ProductDbLocalServiceUtil.getProductDb(Long.valueOf(request.getParameter("id")));
		productDb.setName(request.getParameter("name"));
		productDb.setDescription(request.getParameter("description"));
		
		ProductDbLocalServiceUtil.updateProductDb(productDb);
		
		response.setRenderParameter("mvcPath", "/view.jsp");
	}
	
	@ProcessAction(name = "deleteProduct")
	public void deleteProduct(ActionRequest request, ActionResponse response) throws IOException, PortletException, PortalException {
		ProductDbLocalServiceUtil.deleteProductDb(Long.valueOf(request.getParameter("id")));
		
		response.setRenderParameter("mvcPath", "/view.jsp");
	}
	
}