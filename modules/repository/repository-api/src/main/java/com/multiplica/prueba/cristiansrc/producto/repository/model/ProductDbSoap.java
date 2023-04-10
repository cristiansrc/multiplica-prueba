/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.multiplica.prueba.cristiansrc.producto.repository.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.multiplica.prueba.cristiansrc.producto.repository.service.http.ProductDbServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class ProductDbSoap implements Serializable {

	public static ProductDbSoap toSoapModel(ProductDb model) {
		ProductDbSoap soapModel = new ProductDbSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId(model.getId());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());

		return soapModel;
	}

	public static ProductDbSoap[] toSoapModels(ProductDb[] models) {
		ProductDbSoap[] soapModels = new ProductDbSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ProductDbSoap[][] toSoapModels(ProductDb[][] models) {
		ProductDbSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ProductDbSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ProductDbSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ProductDbSoap[] toSoapModels(List<ProductDb> models) {
		List<ProductDbSoap> soapModels = new ArrayList<ProductDbSoap>(
			models.size());

		for (ProductDb model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ProductDbSoap[soapModels.size()]);
	}

	public ProductDbSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	private String _uuid;
	private long _id;
	private String _name;
	private String _description;

}