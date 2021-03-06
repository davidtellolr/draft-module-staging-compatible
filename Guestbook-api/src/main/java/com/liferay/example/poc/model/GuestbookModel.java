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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.LocaleException;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.LocalizedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedGroupedModel;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Guestbook service. Represents a row in the &quot;dxp_guestbook_guestbook&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.example.poc.model.impl.GuestbookModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.example.poc.model.impl.GuestbookImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Guestbook
 * @generated
 */
@ProviderType
public interface GuestbookModel
	extends BaseModel<Guestbook>, LocalizedModel, ShardedModel,
			StagedGroupedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a guestbook model instance should use the {@link Guestbook} interface instead.
	 */

	/**
	 * Returns the primary key of this guestbook.
	 *
	 * @return the primary key of this guestbook
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this guestbook.
	 *
	 * @param primaryKey the primary key of this guestbook
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this guestbook.
	 *
	 * @return the uuid of this guestbook
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this guestbook.
	 *
	 * @param uuid the uuid of this guestbook
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the guestbook ID of this guestbook.
	 *
	 * @return the guestbook ID of this guestbook
	 */
	public long getGuestbookId();

	/**
	 * Sets the guestbook ID of this guestbook.
	 *
	 * @param guestbookId the guestbook ID of this guestbook
	 */
	public void setGuestbookId(long guestbookId);

	/**
	 * Returns the company ID of this guestbook.
	 *
	 * @return the company ID of this guestbook
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this guestbook.
	 *
	 * @param companyId the company ID of this guestbook
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this guestbook.
	 *
	 * @return the create date of this guestbook
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this guestbook.
	 *
	 * @param createDate the create date of this guestbook
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this guestbook.
	 *
	 * @return the modified date of this guestbook
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this guestbook.
	 *
	 * @param modifiedDate the modified date of this guestbook
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the group ID of this guestbook.
	 *
	 * @return the group ID of this guestbook
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this guestbook.
	 *
	 * @param groupId the group ID of this guestbook
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the last publish date of this guestbook.
	 *
	 * @return the last publish date of this guestbook
	 */
	@Override
	public Date getLastPublishDate();

	/**
	 * Sets the last publish date of this guestbook.
	 *
	 * @param lastPublishDate the last publish date of this guestbook
	 */
	@Override
	public void setLastPublishDate(Date lastPublishDate);

	/**
	 * Returns the user ID of this guestbook.
	 *
	 * @return the user ID of this guestbook
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this guestbook.
	 *
	 * @param userId the user ID of this guestbook
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this guestbook.
	 *
	 * @return the user uuid of this guestbook
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this guestbook.
	 *
	 * @param userUuid the user uuid of this guestbook
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this guestbook.
	 *
	 * @return the user name of this guestbook
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this guestbook.
	 *
	 * @param userName the user name of this guestbook
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the titulo of this guestbook.
	 *
	 * @return the titulo of this guestbook
	 */
	public String getTitulo();

	/**
	 * Returns the localized titulo of this guestbook in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized titulo of this guestbook
	 */
	@AutoEscape
	public String getTitulo(Locale locale);

	/**
	 * Returns the localized titulo of this guestbook in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized titulo of this guestbook. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getTitulo(Locale locale, boolean useDefault);

	/**
	 * Returns the localized titulo of this guestbook in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized titulo of this guestbook
	 */
	@AutoEscape
	public String getTitulo(String languageId);

	/**
	 * Returns the localized titulo of this guestbook in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized titulo of this guestbook
	 */
	@AutoEscape
	public String getTitulo(String languageId, boolean useDefault);

	@AutoEscape
	public String getTituloCurrentLanguageId();

	@AutoEscape
	public String getTituloCurrentValue();

	/**
	 * Returns a map of the locales and localized titulos of this guestbook.
	 *
	 * @return the locales and localized titulos of this guestbook
	 */
	public Map<Locale, String> getTituloMap();

	/**
	 * Sets the titulo of this guestbook.
	 *
	 * @param titulo the titulo of this guestbook
	 */
	public void setTitulo(String titulo);

	/**
	 * Sets the localized titulo of this guestbook in the language.
	 *
	 * @param titulo the localized titulo of this guestbook
	 * @param locale the locale of the language
	 */
	public void setTitulo(String titulo, Locale locale);

	/**
	 * Sets the localized titulo of this guestbook in the language, and sets the default locale.
	 *
	 * @param titulo the localized titulo of this guestbook
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setTitulo(String titulo, Locale locale, Locale defaultLocale);

	public void setTituloCurrentLanguageId(String languageId);

	/**
	 * Sets the localized titulos of this guestbook from the map of locales and localized titulos.
	 *
	 * @param tituloMap the locales and localized titulos of this guestbook
	 */
	public void setTituloMap(Map<Locale, String> tituloMap);

	/**
	 * Sets the localized titulos of this guestbook from the map of locales and localized titulos, and sets the default locale.
	 *
	 * @param tituloMap the locales and localized titulos of this guestbook
	 * @param defaultLocale the default locale
	 */
	public void setTituloMap(
		Map<Locale, String> tituloMap, Locale defaultLocale);

	/**
	 * Returns the descripcion of this guestbook.
	 *
	 * @return the descripcion of this guestbook
	 */
	public String getDescripcion();

	/**
	 * Returns the localized descripcion of this guestbook in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized descripcion of this guestbook
	 */
	@AutoEscape
	public String getDescripcion(Locale locale);

	/**
	 * Returns the localized descripcion of this guestbook in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized descripcion of this guestbook. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getDescripcion(Locale locale, boolean useDefault);

	/**
	 * Returns the localized descripcion of this guestbook in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized descripcion of this guestbook
	 */
	@AutoEscape
	public String getDescripcion(String languageId);

	/**
	 * Returns the localized descripcion of this guestbook in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized descripcion of this guestbook
	 */
	@AutoEscape
	public String getDescripcion(String languageId, boolean useDefault);

	@AutoEscape
	public String getDescripcionCurrentLanguageId();

	@AutoEscape
	public String getDescripcionCurrentValue();

	/**
	 * Returns a map of the locales and localized descripcions of this guestbook.
	 *
	 * @return the locales and localized descripcions of this guestbook
	 */
	public Map<Locale, String> getDescripcionMap();

	/**
	 * Sets the descripcion of this guestbook.
	 *
	 * @param descripcion the descripcion of this guestbook
	 */
	public void setDescripcion(String descripcion);

	/**
	 * Sets the localized descripcion of this guestbook in the language.
	 *
	 * @param descripcion the localized descripcion of this guestbook
	 * @param locale the locale of the language
	 */
	public void setDescripcion(String descripcion, Locale locale);

	/**
	 * Sets the localized descripcion of this guestbook in the language, and sets the default locale.
	 *
	 * @param descripcion the localized descripcion of this guestbook
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setDescripcion(
		String descripcion, Locale locale, Locale defaultLocale);

	public void setDescripcionCurrentLanguageId(String languageId);

	/**
	 * Sets the localized descripcions of this guestbook from the map of locales and localized descripcions.
	 *
	 * @param descripcionMap the locales and localized descripcions of this guestbook
	 */
	public void setDescripcionMap(Map<Locale, String> descripcionMap);

	/**
	 * Sets the localized descripcions of this guestbook from the map of locales and localized descripcions, and sets the default locale.
	 *
	 * @param descripcionMap the locales and localized descripcions of this guestbook
	 * @param defaultLocale the default locale
	 */
	public void setDescripcionMap(
		Map<Locale, String> descripcionMap, Locale defaultLocale);

	@Override
	public String[] getAvailableLanguageIds();

	@Override
	public String getDefaultLanguageId();

	@Override
	public void prepareLocalizedFieldsForImport() throws LocaleException;

	@Override
	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
		throws LocaleException;

}