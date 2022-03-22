package com.liferay.example.poc.internal.exportimport.data.handler;

import com.liferay.changeset.model.ChangesetCollection;
import com.liferay.changeset.service.ChangesetCollectionLocalService;
import com.liferay.changeset.service.ChangesetEntryLocalService;
import com.liferay.example.poc.constants.GuestbookPortletKeys;
import com.liferay.example.poc.model.Guestbook;
import com.liferay.example.poc.service.GuestbookLocalService;
import com.liferay.exportimport.kernel.lar.BasePortletDataHandler;
import com.liferay.exportimport.kernel.lar.ExportImportDateUtil;
import com.liferay.exportimport.kernel.lar.ExportImportHelper;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.PortletDataHandler;
import com.liferay.exportimport.kernel.lar.PortletDataHandlerBoolean;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.exportimport.kernel.staging.Staging;
import com.liferay.exportimport.kernel.staging.constants.StagingConstants;
import com.liferay.exportimport.portlet.data.handler.helper.PortletDataHandlerHelper;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.xml.Element;

import java.util.List;

import javax.portlet.PortletPreferences;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = { "javax.portlet.name=" + GuestbookPortletKeys.GUESTBOOKWEB }, service = { GuestbookPortletDataHandler.class,
        PortletDataHandler.class })
public class GuestbookPortletDataHandler extends BasePortletDataHandler {

    public static final String NAMESPACE = "Guestbook";
    public static final String SCHEMA_VERSION = "1.0.0";

    @Activate
    protected void activate() {
        setDataPortletPreferences("configId");
        setDeletionSystemEventStagedModelTypes(new StagedModelType(Guestbook.class));
        setExportControls(new PortletDataHandlerBoolean(NAMESPACE, "entries", true, false, null, Guestbook.class.getName()));
        setStagingControls(getExportControls());
    }

    @Override
    public boolean isConfigurationEnabled() {
        return true;
    }

    @Override
    protected String doExportData(final PortletDataContext portletDataContext, String portletId, PortletPreferences portletPreferences) throws Exception {

        Element rootElement = addExportDataRootElement(portletDataContext);

        if (!portletDataContext.getBooleanParameter(NAMESPACE, "entries")) {
            return getExportDataRootElementString(rootElement);
        }

        // portletDataContext.addPortletPermissions(BookmarksConstants.RESOURCE_NAME); -> No resource name exist

        rootElement.addAttribute("group-id", String.valueOf(portletDataContext.getScopeGroupId()));

        ActionableDynamicQuery entryActionableDynamicQuery = _guestbookLocalService.getExportActionableDynamicQuery(portletDataContext);

        entryActionableDynamicQuery.performActions();

        return getExportDataRootElementString(rootElement);
    }

    @Override
    protected PortletPreferences doImportData(PortletDataContext portletDataContext, String portletId, PortletPreferences portletPreferences, String data)
            throws Exception {

        if (!portletDataContext.getBooleanParameter(NAMESPACE, "entries")) {
            return null;
        }

        // portletDataContext.importPortletPermissions(BookmarksConstants.RESOURCE_NAME); -> No resource name exist

        Element entriesElement = portletDataContext.getImportDataGroupElement(Guestbook.class);

        List<Element> entryElements = entriesElement.elements();

        for (Element entryElement : entryElements) {
            StagedModelDataHandlerUtil.importStagedModel(portletDataContext, entryElement);
        }

        return null;
    }

    @Override
    protected void doPrepareManifestSummary(PortletDataContext portletDataContext, PortletPreferences portletPreferences) throws Exception {
        if (ExportImportDateUtil.isRangeFromLastPublishDate(portletDataContext)) {

            _staging.populateLastPublishDateCounts(portletDataContext, new StagedModelType[] { new StagedModelType(Guestbook.class.getName()) });

            return;
        }

        ActionableDynamicQuery entryExportActionableDynamicQuery = _guestbookLocalService.getExportActionableDynamicQuery(portletDataContext);

        entryExportActionableDynamicQuery.performCount();

        _populateGuestbookLastPublishDateCounts(portletDataContext);
    }

    private void _populateGuestbookLastPublishDateCounts(PortletDataContext portletDataContext) throws Exception {
        ManifestSummary manifestSummary = portletDataContext.getManifestSummary();

        StagedModelType articleStagedModelType = new StagedModelType(Guestbook.class);

        long modelAdditionCount = manifestSummary.getModelAdditionCount(articleStagedModelType);

        ChangesetCollection changesetCollection = _changesetCollectionLocalService.fetchChangesetCollection(portletDataContext.getScopeGroupId(),
                StagingConstants.RANGE_FROM_LAST_PUBLISH_DATE_CHANGESET_NAME);

        if (changesetCollection != null) {
            modelAdditionCount = _changesetEntryLocalService.getChangesetEntriesCount(changesetCollection.getChangesetCollectionId(),
                    _portal.getClassNameId(Guestbook.class));

            manifestSummary.addModelAdditionCount(articleStagedModelType, modelAdditionCount);
        }

        long modelDeletionCount = _exportImportHelper.getModelDeletionCount(portletDataContext, articleStagedModelType);

        manifestSummary.addModelDeletionCount(articleStagedModelType, modelDeletionCount);
    }

    @Override
    public String getSchemaVersion() {
        return SCHEMA_VERSION;
    }

    @Override
    public boolean validateSchemaVersion(String schemaVersion) {
        return _portletDataHandlerHelper.validateSchemaVersion(schemaVersion, getSchemaVersion());
    }

    @Reference
    private GuestbookLocalService _guestbookLocalService;

    @Reference
    private Staging _staging;

    @Reference
    private PortletDataHandlerHelper _portletDataHandlerHelper;

    @Reference
    private ChangesetCollectionLocalService _changesetCollectionLocalService;

    @Reference
    private ChangesetEntryLocalService _changesetEntryLocalService;

    @Reference
    private ExportImportHelper _exportImportHelper;

    @Reference
    private Portal _portal;

}
