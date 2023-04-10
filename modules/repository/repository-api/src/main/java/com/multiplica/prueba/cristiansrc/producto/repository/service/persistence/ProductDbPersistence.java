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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.multiplica.prueba.cristiansrc.producto.repository.exception.NoSuchProductDbException;
import com.multiplica.prueba.cristiansrc.producto.repository.model.ProductDb;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the product db service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductDbUtil
 * @generated
 */
@ProviderType
public interface ProductDbPersistence extends BasePersistence<ProductDb> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProductDbUtil} to access the product db persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the product dbs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching product dbs
	 */
	public java.util.List<ProductDb> findByUuid(String uuid);

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
	public java.util.List<ProductDb> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<ProductDb> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProductDb>
			orderByComparator);

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
	public java.util.List<ProductDb> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProductDb>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first product db in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching product db
	 * @throws NoSuchProductDbException if a matching product db could not be found
	 */
	public ProductDb findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ProductDb>
				orderByComparator)
		throws NoSuchProductDbException;

	/**
	 * Returns the first product db in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching product db, or <code>null</code> if a matching product db could not be found
	 */
	public ProductDb fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ProductDb>
			orderByComparator);

	/**
	 * Returns the last product db in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching product db
	 * @throws NoSuchProductDbException if a matching product db could not be found
	 */
	public ProductDb findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ProductDb>
				orderByComparator)
		throws NoSuchProductDbException;

	/**
	 * Returns the last product db in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching product db, or <code>null</code> if a matching product db could not be found
	 */
	public ProductDb fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ProductDb>
			orderByComparator);

	/**
	 * Returns the product dbs before and after the current product db in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current product db
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next product db
	 * @throws NoSuchProductDbException if a product db with the primary key could not be found
	 */
	public ProductDb[] findByUuid_PrevAndNext(
			long id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ProductDb>
				orderByComparator)
		throws NoSuchProductDbException;

	/**
	 * Removes all the product dbs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of product dbs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching product dbs
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the product db in the entity cache if it is enabled.
	 *
	 * @param productDb the product db
	 */
	public void cacheResult(ProductDb productDb);

	/**
	 * Caches the product dbs in the entity cache if it is enabled.
	 *
	 * @param productDbs the product dbs
	 */
	public void cacheResult(java.util.List<ProductDb> productDbs);

	/**
	 * Creates a new product db with the primary key. Does not add the product db to the database.
	 *
	 * @param id the primary key for the new product db
	 * @return the new product db
	 */
	public ProductDb create(long id);

	/**
	 * Removes the product db with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the product db
	 * @return the product db that was removed
	 * @throws NoSuchProductDbException if a product db with the primary key could not be found
	 */
	public ProductDb remove(long id) throws NoSuchProductDbException;

	public ProductDb updateImpl(ProductDb productDb);

	/**
	 * Returns the product db with the primary key or throws a <code>NoSuchProductDbException</code> if it could not be found.
	 *
	 * @param id the primary key of the product db
	 * @return the product db
	 * @throws NoSuchProductDbException if a product db with the primary key could not be found
	 */
	public ProductDb findByPrimaryKey(long id) throws NoSuchProductDbException;

	/**
	 * Returns the product db with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the product db
	 * @return the product db, or <code>null</code> if a product db with the primary key could not be found
	 */
	public ProductDb fetchByPrimaryKey(long id);

	/**
	 * Returns all the product dbs.
	 *
	 * @return the product dbs
	 */
	public java.util.List<ProductDb> findAll();

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
	public java.util.List<ProductDb> findAll(int start, int end);

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
	public java.util.List<ProductDb> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProductDb>
			orderByComparator);

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
	public java.util.List<ProductDb> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProductDb>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the product dbs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of product dbs.
	 *
	 * @return the number of product dbs
	 */
	public int countAll();

}