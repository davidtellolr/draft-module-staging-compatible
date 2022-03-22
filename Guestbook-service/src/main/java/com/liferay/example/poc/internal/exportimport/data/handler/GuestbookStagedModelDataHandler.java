package com.liferay.example.poc.internal.exportimport.data.handler;

import com.liferay.example.poc.model.Guestbook;
import com.liferay.example.poc.service.GuestbookLocalService;
import com.liferay.exportimport.kernel.lar.BaseStagedModelDataHandler;
import com.liferay.exportimport.kernel.lar.ExportImportPathUtil;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.xml.Element;

import java.util.List;
import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, service = StagedModelDataHandler.class)
public class GuestbookStagedModelDataHandler extends BaseStagedModelDataHandler<Guestbook> {

    public static final String[] CLASS_NAMES = { Guestbook.class.getName() };

    @Override
    public String getDisplayName(Guestbook entry) {
        return entry.getTitulo();
    }

    @Override
    public void deleteStagedModel(String uuid, long groupId, String className, String extraData) throws PortalException {
        Guestbook guestbook = _guestbookLocalService.fetchGuestbookByUuidAndGroupId(uuid, groupId);
        if (guestbook != null) {
            deleteStagedModel(guestbook);
        }
    }

    @Override
    public void deleteStagedModel(Guestbook stagedModel) throws PortalException {
        _guestbookLocalService.deleteGuestbook(stagedModel);

    }

    @Override
    public List<Guestbook> fetchStagedModelsByUuidAndCompanyId(String uuid, long companyId) {
        return _guestbookLocalService.getGuestbooksByUuidAndCompanyId(uuid, companyId);
    }

    @Override
    public String[] getClassNames() {
        return CLASS_NAMES;
    }

    @Override
    protected void doExportStagedModel(PortletDataContext portletDataContext, Guestbook stagedModel) throws Exception {

        Element entryElement = portletDataContext.getExportDataElement(stagedModel);

        portletDataContext.addClassedModel(entryElement, ExportImportPathUtil.getModelPath(stagedModel), stagedModel);

    }

    @Override
    protected void doImportStagedModel(PortletDataContext portletDataContext, Guestbook stagedModel) throws Exception {

        ServiceContext serviceContext = portletDataContext.createServiceContext(stagedModel);

        Guestbook importedEntry = null;
        
        stagedModel.setGroupId(portletDataContext.getScopeGroupId());
        
        if (portletDataContext.isDataStrategyMirror()) {
            // Dummy code

            Guestbook existingEntry = _guestbookLocalService.fetchGuestbookByUuidAndGroupId(stagedModel.getUuid(), portletDataContext.getScopeGroupId());

            if (existingEntry == null) {

                serviceContext.setUuid(stagedModel.getUuid());
                importedEntry = _guestbookLocalService.addGuestbook(stagedModel);
            } else {
                importedEntry = _guestbookLocalService.updateGuestbook(stagedModel);
            }
        } else {
            importedEntry = _guestbookLocalService.addGuestbook(stagedModel);
        }

        portletDataContext.importClassedModel(stagedModel, importedEntry);

    }

    @Override
    protected void doImportMissingReference(PortletDataContext portletDataContext, String uuid, long groupId, long entryId) throws Exception {

        Guestbook existingEntry = fetchMissingReference(uuid, groupId);

        if (existingEntry == null) {
            return;
        }

        Map<Long, Long> entryIds = (Map<Long, Long>) portletDataContext.getNewPrimaryKeysMap(Guestbook.class);

        entryIds.put(entryId, existingEntry.getGuestbookId());
    }

    protected GuestbookLocalService getGuestbookLocalService() {
        return _guestbookLocalService;
    }

    @Reference(unbind = "-")
    protected void setGuestbookLocalService(GuestbookLocalService guestbookLocalService) {

        _guestbookLocalService = guestbookLocalService;
    }

    private GuestbookLocalService _guestbookLocalService;

}
