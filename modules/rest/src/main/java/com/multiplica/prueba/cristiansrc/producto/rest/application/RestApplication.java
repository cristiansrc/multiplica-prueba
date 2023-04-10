package com.multiplica.prueba.cristiansrc.producto.rest.application;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.multiplica.prueba.cristiansrc.producto.repository.model.ProductDb;
import com.multiplica.prueba.cristiansrc.producto.repository.service.ProductDbLocalServiceUtil;
import com.multiplica.prueba.cristiansrc.producto.rest.application.domain.GeneralResponse;
import com.multiplica.prueba.cristiansrc.producto.rest.application.domain.Product;
import com.multiplica.prueba.cristiansrc.producto.rest.application.domain.ResponseGeneric;
import com.multiplica.prueba.cristiansrc.producto.rest.application.mapping.ProductMapping;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;


/**
 * @author crist
 */
@Component(
	property = {
		JaxrsWhiteboardConstants.JAX_RS_APPLICATION_BASE + "=/product",
		JaxrsWhiteboardConstants.JAX_RS_NAME + "=Greetings.Rest"
	},
	service = Application.class
)
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RestApplication extends Application {

	public Set<Object> getSingletons() {
		return Collections.<Object>singleton(this);
	}

	@GET
	public Response getProducts() {	
		
		GeneralResponse<List<Product>> generalResponse = new GeneralResponse<>();
		generalResponse.setData(ProductMapping.dbToListProduct(ProductDbLocalServiceUtil.getProductDbs(-1, -1)));
		
		return Response
			      .status(Response.Status.OK)
			      .entity(generalResponse)
			      .build();
	}
	
	@GET
	@Path("/{id}")
	public Response getProducts(@PathParam("id") Long id) {
		Status responseStatus = Response.Status.OK;
		
		ProductDb productDb = ProductDbLocalServiceUtil.getSaveProductDb(id);
		
		GeneralResponse<Product> generalResponse = new GeneralResponse<Product>();
		
		
		if(productDb == null) {
			responseStatus = Response.Status.CONFLICT;
			generalResponse.getResponseInfo().setCode(responseStatus.getStatusCode());
			generalResponse.getResponseInfo().setDetail("El producto no se encontro");
			
		} else {
			generalResponse.setData(ProductMapping.dbToProduct(productDb));
			
		}
		
		return Response
			      .status(responseStatus)
			      .entity(generalResponse)
			      .build(); 
		
	}
	
	@POST
	public Response addProduct(Product product) {
		
		ProductDb productDb = ProductDbLocalServiceUtil.createProductDb(
				CounterLocalServiceUtil.increment(ProductDb.class.getName())
				);
		
		productDb.setName(product.getName());
		productDb.setDescription(product.getDescription());
		
		ProductDbLocalServiceUtil.addProductDb(productDb);
		GeneralResponse<Product> generalResponse = new GeneralResponse<Product>();
		
		return Response
			      .status(Response.Status.OK)
			      .entity(generalResponse)
			      .build();
	}
	
	@PUT
	public Response editProduct(Product product) {
		GeneralResponse<Product> generalResponse = new GeneralResponse<Product>();
		Status responseStatus = Response.Status.OK;
	
		ProductDb productDb = ProductDbLocalServiceUtil.getSaveProductDb(product.getId());
		
		if(productDb == null) {
			responseStatus = Response.Status.NOT_FOUND;
			generalResponse.getResponseInfo().setCode(responseStatus.getStatusCode());
			generalResponse.getResponseInfo().setDetail("Producto no encontrado");
		} else {
			productDb.setName(product.getName());
			productDb.setDescription(product.getDescription());
			
			ProductDbLocalServiceUtil.updateProductDb(productDb);
		}
		
		
		return Response
			      .status(responseStatus)
			      .entity(generalResponse)
			      .build();
	}
	
	
	@DELETE
	@Path("/{id}")
	public Response deleteProduct(@PathParam("id") Long id) {
		Status responseStatus = Response.Status.OK;
		boolean delete = ProductDbLocalServiceUtil.deleteSaveProductDb(id);
		
		GeneralResponse<Product> generalResponse = new GeneralResponse<Product>();
		
		if(!delete) {
			responseStatus = Response.Status.CONFLICT;
			generalResponse.getResponseInfo().setCode(responseStatus.getStatusCode());
			generalResponse.getResponseInfo().setDetail("El producto no se pudo eliminar");
		}
		
		return Response
			      .status(responseStatus)
			      .entity(generalResponse)
			      .build(); 
		
	}

}