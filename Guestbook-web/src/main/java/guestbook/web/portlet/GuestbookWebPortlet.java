package guestbook.web.portlet;

import com.liferay.example.poc.model.Guestbook;
import com.liferay.example.poc.service.GuestbookLocalService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.CompanyLocalService;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;

import java.io.IOException;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import guestbook.web.constants.GuestbookWebPortletKeys;

/**
 * @author EXAJITOR01
 */
//@formatter:off
@Component(
        immediate = true, 
        property = { 
                "com.liferay.portlet.display-category=category.sample", 
                "com.liferay.portlet.header-portlet-css=/css/main.css",
                "com.liferay.portlet.instanceable=true", 
                "javax.portlet.display-name=GuestbookWeb", 
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/view.jsp",
                "javax.portlet.name=" + GuestbookWebPortletKeys.GUESTBOOKWEB,
                "javax.portlet.resource-bundle=content.Language", 
                "javax.portlet.security-role-ref=power-user,user",
                "com.liferay.portlet.preferences-company-wide=true",
                "com.liferay.portlet.preferences-owned-by-group=true",
                "com.liferay.portlet.preferences-unique-per-layout=false",
                "com.liferay.portlet.scopeable=true"
                }, 
        service = Portlet.class
        )
//@formatter:on
public class GuestbookWebPortlet extends MVCPortlet {

    @Activate
    public void createDummyData() {
        long guestbookId = 100;

//        Guestbook guestbook = _guestbookLocalService.fetchGuestbook(guestbookId);
//        if (guestbook == null) {
//            try {
//                Company company = _companyLocalService.getCompanyByMx(PropsUtil.get(PropsKeys.COMPANY_DEFAULT_WEB_ID));
//                Group group = _groupLocalService.getGroup(company.getCompanyId(), "Guest");
//                long userId = _userLocalService.getUserIdByScreenName(company.getCompanyId(), "test");
//                User user = _userLocalService.getUser(userId);
//
//                guestbook = _guestbookLocalService.createGuestbook(guestbookId);
//                guestbook.setTitulo("Dummy title test");
//                guestbook.setDescripcion("Dummy descripcion test");
//                guestbook.setCompanyId(company.getCompanyId());
//                guestbook.setGroupId(group.getGroupId());
//                guestbook.setUserId(userId);
//                guestbook.setUserName(user.getFullName());
//
//                _guestbookLocalService.addGuestbook(guestbook);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            guestbook.setTitulo("Dummy title test 1");
//
//            _guestbookLocalService.addGuestbook(guestbook);
//        }
    }

    @Override
    public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

        List<Guestbook> guestbookList = _guestbookLocalService.getGuestbooks(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
        renderRequest.setAttribute("guestbookList", guestbookList);

        super.render(renderRequest, renderResponse);
    }

    @Reference
    private GuestbookLocalService _guestbookLocalService;

    @Reference
    private CompanyLocalService _companyLocalService;

    @Reference
    private GroupLocalService _groupLocalService;

    @Reference
    private UserLocalService _userLocalService;
}