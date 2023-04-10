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

import com.liferay.portal.kernel.exception.PortalException;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for ProductDb. This utility wraps
 * <code>com.multiplica.prueba.cristiansrc.producto.repository.service.impl.ProductDbLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ProductDbLocalService
 * @generated
 */
public class ProductDbLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.multiplica.prueba.cristiansrc.producto.repository.service.impl.ProductDbLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static
		com.multiplica.prueba.cristiansrc.producto.repository.model.ProductDb
			addProductDb(
				com.multiplica.prueba.cristiansrc.producto.repository.model.
					ProductDb productDb) {

		return getService().addProductDb(productDb);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new product db with the primary key. Does not add the product db to the database.
	 *
	 * @param id the primary key for the new product db
	 * @return the new product db
	 */
	public static
		com.multiplica.prueba.cristiansrc.producto.repository.model.ProductDb
			createProductDb(long id) {

		return getService().createProductDb(id);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	public static
		com.multiplica.prueba.cristiansrc.producto.repository.model.ProductDb
				deleteProductDb(long id)
			throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteProductDb(id);
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
	public static
		com.multiplica.prueba.cristiansrc.producto.repository.model.ProductDb
			deleteProductDb(
				com.multiplica.prueba.cristiansrc.producto.repository.model.
					ProductDb productDb) {

		return getService().deleteProductDb(productDb);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static
		com.multiplica.prueba.cristiansrc.producto.repository.model.ProductDb
			fetchProductDb(long id) {

		return getService().fetchProductDb(id);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the product db with the primary key.
	 *
	 * @param id the primary key of the product db
	 * @return the product db
	 * @throws PortalException if a product db with the primary key could not be found
	 */
	public static
		com.multiplica.prueba.cristiansrc.producto.repository.model.ProductDb
				getProductDb(long id)
			throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getProductDb(id);
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
	public static java.util.List
		<com.multiplica.prueba.cristiansrc.producto.repository.model.ProductDb>
			getProductDbs(int start, int end) {

		return getService().getProductDbs(start, end);
	}

	/**
	 * Returns the number of product dbs.
	 *
	 * @return the number of product dbs
	 */
	public static int getProductDbsCount() {
		return getService().getProductDbsCount();
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
	public static
		com.multiplica.prueba.cristiansrc.producto.repository.model.ProductDb
			updateProductDb(
				com.multiplica.prueba.cristiansrc.producto.repository.model.
					ProductDb productDb) {

		return getService().updateProductDb(productDb);
	}

	public static ProductDbLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ProductDbLocalService, ProductDbLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ProductDbLocalService.class);

		ServiceTracker<ProductDbLocalService, ProductDbLocalService>
			serviceTracker =
				new ServiceTracker
					<ProductDbLocalService, ProductDbLocalService>(
						bundle.getBundleContext(), ProductDbLocalService.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

	public static 
		com.multiplica.prueba.cristiansrc.producto.repository.model.ProductDb 
			getSaveProductDb(long id) {
		
		try {
			return getService().getProductDb(id);
		} catch (PortalException e) {
			return null;
		}
		
	}
	
	public static 
	boolean 
		deleteSaveProductDb(long id) {
	
		try {
			deleteProductDb(id);
			return true;
		} catch (PortalException e) {
			return false;
		}
		
	}
	

}