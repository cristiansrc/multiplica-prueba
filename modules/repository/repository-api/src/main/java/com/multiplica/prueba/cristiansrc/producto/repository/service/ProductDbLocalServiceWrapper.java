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

package com.multiplica.prueba.cristiansrc.producto.repository.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProductDbLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProductDbLocalService
 * @generated
 */
public class ProductDbLocalServiceWrapper
	implements ProductDbLocalService, ServiceWrapper<ProductDbLocalService> {

	public ProductDbLocalServiceWrapper(
		ProductDbLocalService productDbLocalService) {

		_productDbLocalService = productDbLocalService;
	}

	/**
	 * Adds the product db to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductDbLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productDb the product db
	 * @return the product db that was added
	 */
	@Override
	public com.multiplica.prueba.cristiansrc.producto.repository.model.ProductDb
		addProductDb(
			com.multiplica.prueba.cristiansrc.producto.repository.model.
				ProductDb productDb) {

		return _productDbLocalService.addProductDb(productDb);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productDbLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new product db with the primary key. Does not add the product db to the database.
	 *
	 * @param id the primary key for the new product db
	 * @return the new product db
	 */
	@Override
	public com.multiplica.prueba.cristiansrc.producto.repository.model.ProductDb
		createProductDb(long id) {

		return _productDbLocalService.createProductDb(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productDbLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the product db with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductDbLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the product db
	 * @return the product db that was removed
	 * @throws PortalException if a product db with the primary key could not be found
	 */
	@Override
	public com.multiplica.prueba.cristiansrc.producto.repository.model.ProductDb
			deleteProductDb(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productDbLocalService.deleteProductDb(id);
	}

	/**
	 * Deletes the product db from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductDbLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productDb the product db
	 * @return the product db that was removed
	 */
	@Override
	public com.multiplica.prueba.cristiansrc.producto.repository.model.ProductDb
		deleteProductDb(
			com.multiplica.prueba.cristiansrc.producto.repository.model.
				ProductDb productDb) {

		return _productDbLocalService.deleteProductDb(productDb);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _productDbLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _productDbLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.multiplica.prueba.cristiansrc.producto.repository.model.impl.ProductDbModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _productDbLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.multiplica.prueba.cristiansrc.producto.repository.model.impl.ProductDbModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _productDbLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _productDbLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _productDbLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.multiplica.prueba.cristiansrc.producto.repository.model.ProductDb
		fetchProductDb(long id) {

		return _productDbLocalService.fetchProductDb(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _productDbLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _productDbLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _productDbLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productDbLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the product db with the primary key.
	 *
	 * @param id the primary key of the product db
	 * @return the product db
	 * @throws PortalException if a product db with the primary key could not be found
	 */
	@Override
	public com.multiplica.prueba.cristiansrc.producto.repository.model.ProductDb
			getProductDb(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _productDbLocalService.getProductDb(id);
	}

	/**
	 * Returns a range of all the product dbs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.multiplica.prueba.cristiansrc.producto.repository.model.impl.ProductDbModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of product dbs
	 * @param end the upper bound of the range of product dbs (not inclusive)
	 * @return the range of product dbs
	 */
	@Override
	public java.util.List
		<com.multiplica.prueba.cristiansrc.producto.repository.model.ProductDb>
			getProductDbs(int start, int end) {

		return _productDbLocalService.getProductDbs(start, end);
	}

	/**
	 * Returns the number of product dbs.
	 *
	 * @return the number of product dbs
	 */
	@Override
	public int getProductDbsCount() {
		return _productDbLocalService.getProductDbsCount();
	}

	/**
	 * Updates the product db in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ProductDbLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param productDb the product db
	 * @return the product db that was updated
	 */
	@Override
	public com.multiplica.prueba.cristiansrc.producto.repository.model.ProductDb
		updateProductDb(
			com.multiplica.prueba.cristiansrc.producto.repository.model.
				ProductDb productDb) {

		return _productDbLocalService.updateProductDb(productDb);
	}

	@Override
	public ProductDbLocalService getWrappedService() {
		return _productDbLocalService;
	}

	@Override
	public void setWrappedService(ProductDbLocalService productDbLocalService) {
		_productDbLocalService = productDbLocalService;
	}

	private ProductDbLocalService _productDbLocalService;

}