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

package com.multiplica.prueba.cristiansrc.producto.repository.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.multiplica.prueba.cristiansrc.producto.repository.model.ProductDb;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the product db service. This utility wraps <code>com.multiplica.prueba.cristiansrc.producto.repository.service.persistence.impl.ProductDbPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductDbPersistence
 * @generated
 */
public class ProductDbUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(ProductDb productDb) {
		getPersistence().clearCache(productDb);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, ProductDb> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ProductDb> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ProductDb> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ProductDb> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ProductDb> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ProductDb update(ProductDb productDb) {
		return getPersistence().update(productDb);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ProductDb update(
		ProductDb productDb, ServiceContext serviceContext) {

		return getPersistence().update(productDb, serviceContext);
	}

	/**
	 * Returns all the product dbs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching product dbs
	 */
	public static List<ProductDb> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the product dbs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductDbModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of product dbs
	 * @param end the upper bound of the range of product dbs (not inclusive)
	 * @return the range of matching product dbs
	 */
	public static List<ProductDb> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the product dbs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductDbModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of product dbs
	 * @param end the upper bound of the range of product dbs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching product dbs
	 */
	public static List<ProductDb> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ProductDb> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the product dbs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductDbModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of product dbs
	 * @param end the upper bound of the range of product dbs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching product dbs
	 */
	public static List<ProductDb> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ProductDb> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first product db in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching product db
	 * @throws NoSuchProductDbException if a matching product db could not be found
	 */
	public static ProductDb findByUuid_First(
			String uuid, OrderByComparator<ProductDb> orderByComparator)
		throws com.multiplica.prueba.cristiansrc.producto.repository.exception.
			NoSuchProductDbException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first product db in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching product db, or <code>null</code> if a matching product db could not be found
	 */
	public static ProductDb fetchByUuid_First(
		String uuid, OrderByComparator<ProductDb> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last product db in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching product db
	 * @throws NoSuchProductDbException if a matching product db could not be found
	 */
	public static ProductDb findByUuid_Last(
			String uuid, OrderByComparator<ProductDb> orderByComparator)
		throws com.multiplica.prueba.cristiansrc.producto.repository.exception.
			NoSuchProductDbException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last product db in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching product db, or <code>null</code> if a matching product db could not be found
	 */
	public static ProductDb fetchByUuid_Last(
		String uuid, OrderByComparator<ProductDb> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the product dbs before and after the current product db in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current product db
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next product db
	 * @throws NoSuchProductDbException if a product db with the primary key could not be found
	 */
	public static ProductDb[] findByUuid_PrevAndNext(
			long id, String uuid,
			OrderByComparator<ProductDb> orderByComparator)
		throws com.multiplica.prueba.cristiansrc.producto.repository.exception.
			NoSuchProductDbException {

		return getPersistence().findByUuid_PrevAndNext(
			id, uuid, orderByComparator);
	}

	/**
	 * Removes all the product dbs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of product dbs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching product dbs
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the product db in the entity cache if it is enabled.
	 *
	 * @param productDb the product db
	 */
	public static void cacheResult(ProductDb productDb) {
		getPersistence().cacheResult(productDb);
	}

	/**
	 * Caches the product dbs in the entity cache if it is enabled.
	 *
	 * @param productDbs the product dbs
	 */
	public static void cacheResult(List<ProductDb> productDbs) {
		getPersistence().cacheResult(productDbs);
	}

	/**
	 * Creates a new product db with the primary key. Does not add the product db to the database.
	 *
	 * @param id the primary key for the new product db
	 * @return the new product db
	 */
	public static ProductDb create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the product db with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the product db
	 * @return the product db that was removed
	 * @throws NoSuchProductDbException if a product db with the primary key could not be found
	 */
	public static ProductDb remove(long id)
		throws com.multiplica.prueba.cristiansrc.producto.repository.exception.
			NoSuchProductDbException {

		return getPersistence().remove(id);
	}

	public static ProductDb updateImpl(ProductDb productDb) {
		return getPersistence().updateImpl(productDb);
	}

	/**
	 * Returns the product db with the primary key or throws a <code>NoSuchProductDbException</code> if it could not be found.
	 *
	 * @param id the primary key of the product db
	 * @return the product db
	 * @throws NoSuchProductDbException if a product db with the primary key could not be found
	 */
	public static ProductDb findByPrimaryKey(long id)
		throws com.multiplica.prueba.cristiansrc.producto.repository.exception.
			NoSuchProductDbException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the product db with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the product db
	 * @return the product db, or <code>null</code> if a product db with the primary key could not be found
	 */
	public static ProductDb fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the product dbs.
	 *
	 * @return the product dbs
	 */
	public static List<ProductDb> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the product dbs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductDbModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of product dbs
	 * @param end the upper bound of the range of product dbs (not inclusive)
	 * @return the range of product dbs
	 */
	public static List<ProductDb> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the product dbs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductDbModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of product dbs
	 * @param end the upper bound of the range of product dbs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of product dbs
	 */
	public static List<ProductDb> findAll(
		int start, int end, OrderByComparator<ProductDb> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the product dbs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductDbModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of product dbs
	 * @param end the upper bound of the range of product dbs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of product dbs
	 */
	public static List<ProductDb> findAll(
		int start, int end, OrderByComparator<ProductDb> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the product dbs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of product dbs.
	 *
	 * @return the number of product dbs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ProductDbPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ProductDbPersistence, ProductDbPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ProductDbPersistence.class);

		ServiceTracker<ProductDbPersistence, ProductDbPersistence>
			serviceTracker =
				new ServiceTracker<ProductDbPersistence, ProductDbPersistence>(
					bundle.getBundleContext(), ProductDbPersistence.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}