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

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Guestbook}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Guestbook
 * @generated
 */
public class GuestbookWrapper
	extends BaseModelWrapper<Guestbook>
	implements Guestbook, ModelWrapper<Guestbook> {

	public GuestbookWrapper(Guestbook guestbook) {
		super(guestbook);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("guestbookId", getGuestbookId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("groupId", getGroupId());
		attributes.put("lastPublishDate", getLastPublishDate());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("titulo", getTitulo());
		attributes.put("descripcion", getDescripcion());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long guestbookId = (Long)attributes.get("guestbookId");

		if (guestbookId != null) {
			setGuestbookId(guestbookId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Date lastPublishDate = (Date)attributes.get("lastPublishDate");

		if (lastPublishDate != null) {
			setLastPublishDate(lastPublishDate);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		String titulo = (String)attributes.get("titulo");

		if (titulo != null) {
			setTitulo(titulo);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}
	}

	@Override
	public String[] getAvailableLanguageIds() {
		return model.getAvailableLanguageIds();
	}

	/**
	 * Returns the company ID of this guestbook.
	 *
	 * @return the company ID of this guestbook
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this guestbook.
	 *
	 * @return the create date of this guestbook
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	@Override
	public String getDefaultLanguageId() {
		return model.getDefaultLanguageId();
	}

	/**
	 * Returns the descripcion of this guestbook.
	 *
	 * @return the descripcion of this guestbook
	 */
	@Override
	public String getDescripcion() {
		return model.getDescripcion();
	}

	/**
	 * Returns the localized descripcion of this guestbook in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized descripcion of this guestbook
	 */
	@Override
	public String getDescripcion(java.util.Locale locale) {
		return model.getDescripcion(locale);
	}

	/**
	 * Returns the localized descripcion of this guestbook in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized descripcion of this guestbook. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@Override
	public String getDescripcion(java.util.Locale locale, boolean useDefault) {
		return model.getDescripcion(locale, useDefault);
	}

	/**
	 * Returns the localized descripcion of this guestbook in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized descripcion of this guestbook
	 */
	@Override
	public String getDescripcion(String languageId) {
		return model.getDescripcion(languageId);
	}

	/**
	 * Returns the localized descripcion of this guestbook in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized descripcion of this guestbook
	 */
	@Override
	public String getDescripcion(String languageId, boolean useDefault) {
		return model.getDescripcion(languageId, useDefault);
	}

	@Override
	public String getDescripcionCurrentLanguageId() {
		return model.getDescripcionCurrentLanguageId();
	}

	@Override
	public String getDescripcionCurrentValue() {
		return model.getDescripcionCurrentValue();
	}

	/**
	 * Returns a map of the locales and localized descripcions of this guestbook.
	 *
	 * @return the locales and localized descripcions of this guestbook
	 */
	@Override
	public Map<java.util.Locale, String> getDescripcionMap() {
		return model.getDescripcionMap();
	}

	/**
	 * Returns the group ID of this guestbook.
	 *
	 * @return the group ID of this guestbook
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the guestbook ID of this guestbook.
	 *
	 * @return the guestbook ID of this guestbook
	 */
	@Override
	public long getGuestbookId() {
		return model.getGuestbookId();
	}

	/**
	 * Returns the last publish date of this guestbook.
	 *
	 * @return the last publish date of this guestbook
	 */
	@Override
	public Date getLastPublishDate() {
		return model.getLastPublishDate();
	}

	/**
	 * Returns the modified date of this guestbook.
	 *
	 * @return the modified date of this guestbook
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this guestbook.
	 *
	 * @return the primary key of this guestbook
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the titulo of this guestbook.
	 *
	 * @return the titulo of this guestbook
	 */
	@Override
	public String getTitulo() {
		return model.getTitulo();
	}

	/**
	 * Returns the localized titulo of this guestbook in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized titulo of this guestbook
	 */
	@Override
	public String getTitulo(java.util.Locale locale) {
		return model.getTitulo(locale);
	}

	/**
	 * Returns the localized titulo of this guestbook in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized titulo of this guestbook. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@Override
	public String getTitulo(java.util.Locale locale, boolean useDefault) {
		return model.getTitulo(locale, useDefault);
	}

	/**
	 * Returns the localized titulo of this guestbook in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized titulo of this guestbook
	 */
	@Override
	public String getTitulo(String languageId) {
		return model.getTitulo(languageId);
	}

	/**
	 * Returns the localized titulo of this guestbook in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized titulo of this guestbook
	 */
	@Override
	public String getTitulo(String languageId, boolean useDefault) {
		return model.getTitulo(languageId, useDefault);
	}

	@Override
	public String getTituloCurrentLanguageId() {
		return model.getTituloCurrentLanguageId();
	}

	@Override
	public String getTituloCurrentValue() {
		return model.getTituloCurrentValue();
	}

	/**
	 * Returns a map of the locales and localized titulos of this guestbook.
	 *
	 * @return the locales and localized titulos of this guestbook
	 */
	@Override
	public Map<java.util.Locale, String> getTituloMap() {
		return model.getTituloMap();
	}

	/**
	 * Returns the user ID of this guestbook.
	 *
	 * @return the user ID of this guestbook
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this guestbook.
	 *
	 * @return the user name of this guestbook
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this guestbook.
	 *
	 * @return the user uuid of this guestbook
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this guestbook.
	 *
	 * @return the uuid of this guestbook
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	@Override
	public void prepareLocalizedFieldsForImport()
		throws com.liferay.portal.kernel.exception.LocaleException {

		model.prepareLocalizedFieldsForImport();
	}

	@Override
	public void prepareLocalizedFieldsForImport(
			java.util.Locale defaultImportLocale)
		throws com.liferay.portal.kernel.exception.LocaleException {

		model.prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	/**
	 * Sets the company ID of this guestbook.
	 *
	 * @param companyId the company ID of this guestbook
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this guestbook.
	 *
	 * @param createDate the create date of this guestbook
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the descripcion of this guestbook.
	 *
	 * @param descripcion the descripcion of this guestbook
	 */
	@Override
	public void setDescripcion(String descripcion) {
		model.setDescripcion(descripcion);
	}

	/**
	 * Sets the localized descripcion of this guestbook in the language.
	 *
	 * @param descripcion the localized descripcion of this guestbook
	 * @param locale the locale of the language
	 */
	@Override
	public void setDescripcion(String descripcion, java.util.Locale locale) {
		model.setDescripcion(descripcion, locale);
	}

	/**
	 * Sets the localized descripcion of this guestbook in the language, and sets the default locale.
	 *
	 * @param descripcion the localized descripcion of this guestbook
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setDescripcion(
		String descripcion, java.util.Locale locale,
		java.util.Locale defaultLocale) {

		model.setDescripcion(descripcion, locale, defaultLocale);
	}

	@Override
	public void setDescripcionCurrentLanguageId(String languageId) {
		model.setDescripcionCurrentLanguageId(languageId);
	}

	/**
	 * Sets the localized descripcions of this guestbook from the map of locales and localized descripcions.
	 *
	 * @param descripcionMap the locales and localized descripcions of this guestbook
	 */
	@Override
	public void setDescripcionMap(
		Map<java.util.Locale, String> descripcionMap) {

		model.setDescripcionMap(descripcionMap);
	}

	/**
	 * Sets the localized descripcions of this guestbook from the map of locales and localized descripcions, and sets the default locale.
	 *
	 * @param descripcionMap the locales and localized descripcions of this guestbook
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setDescripcionMap(
		Map<java.util.Locale, String> descripcionMap,
		java.util.Locale defaultLocale) {

		model.setDescripcionMap(descripcionMap, defaultLocale);
	}

	/**
	 * Sets the group ID of this guestbook.
	 *
	 * @param groupId the group ID of this guestbook
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the guestbook ID of this guestbook.
	 *
	 * @param guestbookId the guestbook ID of this guestbook
	 */
	@Override
	public void setGuestbookId(long guestbookId) {
		model.setGuestbookId(guestbookId);
	}

	/**
	 * Sets the last publish date of this guestbook.
	 *
	 * @param lastPublishDate the last publish date of this guestbook
	 */
	@Override
	public void setLastPublishDate(Date lastPublishDate) {
		model.setLastPublishDate(lastPublishDate);
	}

	/**
	 * Sets the modified date of this guestbook.
	 *
	 * @param modifiedDate the modified date of this guestbook
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this guestbook.
	 *
	 * @param primaryKey the primary key of this guestbook
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the titulo of this guestbook.
	 *
	 * @param titulo the titulo of this guestbook
	 */
	@Override
	public void setTitulo(String titulo) {
		model.setTitulo(titulo);
	}

	/**
	 * Sets the localized titulo of this guestbook in the language.
	 *
	 * @param titulo the localized titulo of this guestbook
	 * @param locale the locale of the language
	 */
	@Override
	public void setTitulo(String titulo, java.util.Locale locale) {
		model.setTitulo(titulo, locale);
	}

	/**
	 * Sets the localized titulo of this guestbook in the language, and sets the default locale.
	 *
	 * @param titulo the localized titulo of this guestbook
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setTitulo(
		String titulo, java.util.Locale locale,
		java.util.Locale defaultLocale) {

		model.setTitulo(titulo, locale, defaultLocale);
	}

	@Override
	public void setTituloCurrentLanguageId(String languageId) {
		model.setTituloCurrentLanguageId(languageId);
	}

	/**
	 * Sets the localized titulos of this guestbook from the map of locales and localized titulos.
	 *
	 * @param tituloMap the locales and localized titulos of this guestbook
	 */
	@Override
	public void setTituloMap(Map<java.util.Locale, String> tituloMap) {
		model.setTituloMap(tituloMap);
	}

	/**
	 * Sets the localized titulos of this guestbook from the map of locales and localized titulos, and sets the default locale.
	 *
	 * @param tituloMap the locales and localized titulos of this guestbook
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setTituloMap(
		Map<java.util.Locale, String> tituloMap,
		java.util.Locale defaultLocale) {

		model.setTituloMap(tituloMap, defaultLocale);
	}

	/**
	 * Sets the user ID of this guestbook.
	 *
	 * @param userId the user ID of this guestbook
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this guestbook.
	 *
	 * @param userName the user name of this guestbook
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this guestbook.
	 *
	 * @param userUuid the user uuid of this guestbook
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this guestbook.
	 *
	 * @param uuid the uuid of this guestbook
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected GuestbookWrapper wrap(Guestbook guestbook) {
		return new GuestbookWrapper(guestbook);
	}

}