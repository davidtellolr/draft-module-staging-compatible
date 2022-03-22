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

package com.liferay.example.poc.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.example.poc.service.http.GuestbookServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class GuestbookSoap implements Serializable {

	public static GuestbookSoap toSoapModel(Guestbook model) {
		GuestbookSoap soapModel = new GuestbookSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setGuestbookId(model.getGuestbookId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setLastPublishDate(model.getLastPublishDate());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setTitulo(model.getTitulo());
		soapModel.setDescripcion(model.getDescripcion());

		return soapModel;
	}

	public static GuestbookSoap[] toSoapModels(Guestbook[] models) {
		GuestbookSoap[] soapModels = new GuestbookSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static GuestbookSoap[][] toSoapModels(Guestbook[][] models) {
		GuestbookSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new GuestbookSoap[models.length][models[0].length];
		}
		else {
			soapModels = new GuestbookSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static GuestbookSoap[] toSoapModels(List<Guestbook> models) {
		List<GuestbookSoap> soapModels = new ArrayList<GuestbookSoap>(
			models.size());

		for (Guestbook model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new GuestbookSoap[soapModels.size()]);
	}

	public GuestbookSoap() {
	}

	public long getPrimaryKey() {
		return _guestbookId;
	}

	public void setPrimaryKey(long pk) {
		setGuestbookId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getGuestbookId() {
		return _guestbookId;
	}

	public void setGuestbookId(long guestbookId) {
		_guestbookId = guestbookId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public Date getLastPublishDate() {
		return _lastPublishDate;
	}

	public void setLastPublishDate(Date lastPublishDate) {
		_lastPublishDate = lastPublishDate;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public String getTitulo() {
		return _titulo;
	}

	public void setTitulo(String titulo) {
		_titulo = titulo;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	private String _uuid;
	private long _guestbookId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _groupId;
	private Date _lastPublishDate;
	private long _userId;
	private String _userName;
	private String _titulo;
	private String _descripcion;

}