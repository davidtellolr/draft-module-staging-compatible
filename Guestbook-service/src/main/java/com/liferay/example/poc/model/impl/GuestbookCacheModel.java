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

package com.liferay.example.poc.model.impl;

import com.liferay.example.poc.model.Guestbook;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Guestbook in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class GuestbookCacheModel
	implements CacheModel<Guestbook>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof GuestbookCacheModel)) {
			return false;
		}

		GuestbookCacheModel guestbookCacheModel = (GuestbookCacheModel)object;

		if (guestbookId == guestbookCacheModel.guestbookId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, guestbookId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", guestbookId=");
		sb.append(guestbookId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", lastPublishDate=");
		sb.append(lastPublishDate);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", titulo=");
		sb.append(titulo);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Guestbook toEntityModel() {
		GuestbookImpl guestbookImpl = new GuestbookImpl();

		if (uuid == null) {
			guestbookImpl.setUuid("");
		}
		else {
			guestbookImpl.setUuid(uuid);
		}

		guestbookImpl.setGuestbookId(guestbookId);
		guestbookImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			guestbookImpl.setCreateDate(null);
		}
		else {
			guestbookImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			guestbookImpl.setModifiedDate(null);
		}
		else {
			guestbookImpl.setModifiedDate(new Date(modifiedDate));
		}

		guestbookImpl.setGroupId(groupId);

		if (lastPublishDate == Long.MIN_VALUE) {
			guestbookImpl.setLastPublishDate(null);
		}
		else {
			guestbookImpl.setLastPublishDate(new Date(lastPublishDate));
		}

		guestbookImpl.setUserId(userId);

		if (userName == null) {
			guestbookImpl.setUserName("");
		}
		else {
			guestbookImpl.setUserName(userName);
		}

		if (titulo == null) {
			guestbookImpl.setTitulo("");
		}
		else {
			guestbookImpl.setTitulo(titulo);
		}

		if (descripcion == null) {
			guestbookImpl.setDescripcion("");
		}
		else {
			guestbookImpl.setDescripcion(descripcion);
		}

		guestbookImpl.resetOriginalValues();

		return guestbookImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		guestbookId = objectInput.readLong();

		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		groupId = objectInput.readLong();
		lastPublishDate = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		titulo = objectInput.readUTF();
		descripcion = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(guestbookId);

		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(groupId);
		objectOutput.writeLong(lastPublishDate);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		if (titulo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(titulo);
		}

		if (descripcion == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descripcion);
		}
	}

	public String uuid;
	public long guestbookId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long groupId;
	public long lastPublishDate;
	public long userId;
	public String userName;
	public String titulo;
	public String descripcion;

}