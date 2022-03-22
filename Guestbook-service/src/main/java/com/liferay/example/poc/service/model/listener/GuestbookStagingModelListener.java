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

package com.liferay.example.poc.service.model.listener;

import com.liferay.example.poc.model.Guestbook;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.staging.model.listener.StagingModelListener;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, service = ModelListener.class)
public class GuestbookStagingModelListener extends BaseModelListener<Guestbook> {

	@Override
	public void onAfterCreate(Guestbook blogsEntry)
		throws ModelListenerException {

		_stagingModelListener.onAfterCreate(blogsEntry);
	}

	@Override
	public void onAfterRemove(Guestbook blogsEntry)
		throws ModelListenerException {

		_stagingModelListener.onAfterRemove(blogsEntry);
	}

	@Override
	public void onAfterUpdate(Guestbook blogsEntry)
		throws ModelListenerException {

		_stagingModelListener.onAfterUpdate(blogsEntry);
	}

	@Reference
	private StagingModelListener<Guestbook> _stagingModelListener;

}