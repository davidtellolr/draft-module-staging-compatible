package guestbook.web.portlet;

import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.liferay.portal.kernel.util.ParamUtil;

import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;

import aQute.bnd.annotation.metatype.Configurable;
import guestbook.web.constants.GuestbookWebPortletKeys;

//@formatter:off
@Component(
        configurationPid = "guestbook.web.portlet.PreferenciasConfiguracion",
        immediate = true,
        property = "javax.portlet.name=" + GuestbookWebPortletKeys.GUESTBOOKWEB,
        service = ConfigurationAction.class
    )
//@formatter:on
public class PreferenciasAction extends DefaultConfigurationAction {

    private volatile PreferenciasConfiguracion preferencias;

    @Override
    public void processAction(PortletConfig portletConfig, ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
        String guestbookId = ParamUtil.getString(actionRequest, "guestbookId");
        setPreference(actionRequest, "guestbookId", guestbookId);

        super.processAction(portletConfig, actionRequest, actionResponse);
    }

    @Activate
    @Modified
    protected void activate(Map<String, Object> properties) {
        preferencias = Configurable.createConfigurable(PreferenciasConfiguracion.class, properties);
    }
}
