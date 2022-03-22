package com.liferay.example.poc.internal.exportimport.staged.model.repository;

import com.liferay.example.poc.model.Guestbook;
import com.liferay.example.poc.service.GuestbookLocalService;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.staged.model.repository.StagedModelRepository;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = "model.class.name=com.liferay.example.poc.model.Guestbook", service = StagedModelRepository.class)
public class GuestbookStagedModelRepository implements StagedModelRepository<Guestbook> {

    @Override
    public Guestbook addStagedModel(PortletDataContext portletDataContext, Guestbook stagedModel) throws PortalException {
        long userId = portletDataContext.getUserId(stagedModel.getUserUuid());

        ServiceContext serviceContext = portletDataContext.createServiceContext(stagedModel);

        if (portletDataContext.isDataStrategyMirror()) {
            serviceContext.setUuid(stagedModel.getUuid());
        }

        return _guestbookLocalService.addGuestbook(stagedModel);
    }

    @Override
    public void deleteStagedModel(String uuid, long groupId, String className, String extraData) throws PortalException {
        Guestbook guestbook = _guestbookLocalService.getGuestbookByUuidAndGroupId(uuid, groupId);
        if (guestbook != null) {
            deleteStagedModel(guestbook);
        }
    }

    @Override
    public void deleteStagedModel(Guestbook stagedModel) throws PortalException {
        _guestbookLocalService.deleteGuestbook(stagedModel);

    }

	@Override
	public Guestbook getStagedModel(long entryId) throws PortalException {
		return _guestbookLocalService.getGuestbook(entryId);
	}
    
    @Override
    public void deleteStagedModels(PortletDataContext portletDataContext) throws PortalException {
        System.out.println("deleteStagedModel");
    }

    @Override
    public Guestbook fetchStagedModelByUuidAndGroupId(String uuid, long groupId) {
        return _guestbookLocalService.fetchGuestbookByUuidAndGroupId(uuid, groupId);
    }

    @Override
    public List<Guestbook> fetchStagedModelsByUuidAndCompanyId(String uuid, long companyId) {
        return _guestbookLocalService.getGuestbooksByUuidAndCompanyId(uuid, companyId);
    }

    @Override
    public ExportActionableDynamicQuery getExportActionableDynamicQuery(PortletDataContext portletDataContext) {
        return _guestbookLocalService.getExportActionableDynamicQuery(portletDataContext);
    }

    @Override
    public Guestbook saveStagedModel(Guestbook stagedModel) throws PortalException {
        return _guestbookLocalService.addGuestbook(stagedModel);
    }

    @Override
    public Guestbook updateStagedModel(PortletDataContext portletDataContext, Guestbook stagedModel) throws PortalException {
        return _guestbookLocalService.updateGuestbook(stagedModel);
    }

    @Reference
    private GuestbookLocalService _guestbookLocalService;

}
