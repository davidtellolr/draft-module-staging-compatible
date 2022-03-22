package guestbook.web.portlet;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;
import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition.Scope;

import aQute.bnd.annotation.metatype.Meta;

//@formatter:off
@ExtendedObjectClassDefinition(
      category = "other",
      scope = Scope.PORTLET_INSTANCE
  )
@Meta.OCD(
      id = "guestbook.web.portlet.PreferenciasConfiguracion", 
      localization = "content/Language", 
      name = "preferencias.titulo")
//@formatter:on
public interface PreferenciasConfiguracion {

    //@formatter:off
    @Meta.AD(
        deflt = "0", 
        name="guestbookId",
        required = false
    )
    //@formatter:on
    public Long guestbookId();
}