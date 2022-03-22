<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@ include file="/init.jsp" %>
 
<liferay-portlet:actionURL portletConfiguration="<%=true%>" var="configurationActionURL" />
 
<liferay-portlet:renderURL portletConfiguration="<%=true%>" var="configurationRenderURL" />
 
<aui:form action="<%=configurationActionURL%>" method="post" name="fm">
    <aui:input name="<%=Constants.CMD%>" type="hidden" value="<%=Constants.UPDATE%>" />
    <aui:input name="redirect" type="hidden" value="<%=configurationRenderURL%>" />
    
     <%
	    String guestbookId = portletPreferences.getValue("guestbookId", "0");
	   
	 %>
    
    <aui:fieldset>
        <aui:input label="guestbookId" name="guestbookId" value="<%=guestbookId%>" />
    </aui:fieldset>
 
    <aui:button-row>
        <aui:button type="submit"></aui:button>
    </aui:button-row>
</aui:form>