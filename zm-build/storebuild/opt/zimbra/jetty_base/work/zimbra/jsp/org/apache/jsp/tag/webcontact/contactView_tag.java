/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat8
 * Generated at: 2017-12-14 21:09:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.webcontact;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contactView_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(58);
    _jspx_dependants.put("/WEB-INF/tags/contact/contactFolder.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/infra/handleViewError.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("jar:file:/root/.ivy2/cache/zimbra/zm-taglib/jars/zm-taglib-8.7.0.1505720459.jar!/META-INF/tags/prevItemUrl.tag", Long.valueOf(1512680894000L));
    _jspx_dependants.put("/WEB-INF/tags/imginfo.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/button.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/overview/overviewFolder.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/infra/skin.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/compose/yuiInclude.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/task/taskFolderTree.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/task/taskFolder.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/briefcase/briefcaseFolder.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/infra/status.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/overview/overviewTag.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/contact/contactJobInfo.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/notebook/notebookFolder.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("jar:file:/root/.ivy2/cache/zimbra/zm-taglib/jars/zm-taglib-8.7.0.1505720459.jar!/META-INF/tags/nextItemUrl.tag", Long.valueOf(1512680894000L));
    _jspx_dependants.put("/WEB-INF/tags/infra/appStatusArea.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/overview/tagTree.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/infra/tagOptions.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/ads.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/voice/voiceFolderTree.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/spellcheck.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("jar:file:/root/.ivy2/cache/zimbra/zm-taglib/jars/zm-taglib-8.7.0.1505720459.jar!/META-INF/tags/currentResultUrl.tag", Long.valueOf(1512680894000L));
    _jspx_dependants.put("/WEB-INF/tags/overview/overviewSearchFolder.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/notebook/notebookFolderTree.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/overview/searchFolderTree.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("jar:file:/root/.ivy2/cache/zimbra/zm-taglib/jars/zm-taglib-8.7.0.1505720459.jar!/META-INF/zm.tld", Long.valueOf(1512680894000L));
    _jspx_dependants.put("/WEB-INF/tags/img.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/infra/appTopUser.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/infra/view.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/contact/contactAddress.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/calendar/calendarUrl.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/imgurl.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/ruby.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/contact/doContactFolderTree.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/head.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/contact/contactToolbar.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/infra/appTop.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/voice/doVoiceFolderTree.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/voice/voiceFolder.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/calendar/miniCal.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/contact/contactPhone.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/contact/myCardFolder.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/footer.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/calendar/calendarFolderTree.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/contact/displayContact.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/contact/contactFolderTree.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/contact/contactSectionInfo.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/contact/contactDisplayName.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/calendar/calendarFolder.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/overview/overviewTree.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/infra/appTabs.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/overview/folderTree.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/overview/doFolderTree.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/contact/contactEmail.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/contact/contactIM.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/briefcase/briefcaseFolderTree.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/infra/handleError.tag", Long.valueOf(1512680905000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.servlet.jsp.JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public void setJspContext(javax.servlet.jsp.JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public javax.servlet.jsp.JspContext getJspContext() {
    return this.jspContext;
  }
  private com.zimbra.cs.taglib.tag.SearchContext context;

  public com.zimbra.cs.taglib.tag.SearchContext getContext() {
    return this.context;
  }

  public void setContext(com.zimbra.cs.taglib.tag.SearchContext context) {
    this.context = context;
    jspContext.setAttribute("context", context);
  }

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  private void _jspInit(javax.servlet.ServletConfig config) {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(config);
  }

  public void _jspDestroy() {
  }

  public void doTag() throws javax.servlet.jsp.JspException, java.io.IOException {
    javax.servlet.jsp.PageContext _jspx_page_context = (javax.servlet.jsp.PageContext)jspContext;
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest) _jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse) _jspx_page_context.getResponse();
    javax.servlet.http.HttpSession session = _jspx_page_context.getSession();
    javax.servlet.ServletContext application = _jspx_page_context.getServletContext();
    javax.servlet.ServletConfig config = _jspx_page_context.getServletConfig();
    javax.servlet.jsp.JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,jspContext);
    if( getContext() != null ) 
      _jspx_page_context.setAttribute("context", getContext());

    try {
      //  app:handleError
      org.apache.jsp.tag.webinfra.handleError_tag _jspx_th_app_005fhandleError_005f0 = (new org.apache.jsp.tag.webinfra.handleError_tag());
      _jsp_instancemanager.newInstance(_jspx_th_app_005fhandleError_005f0);
      _jspx_th_app_005fhandleError_005f0.setJspContext(_jspx_page_context);
      _jspx_th_app_005fhandleError_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      _jspx_th_app_005fhandleError_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_app_005fhandleError_005f0, null));
      _jspx_th_app_005fhandleError_005f0.doTag();
      _jsp_instancemanager.destroyInstance(_jspx_th_app_005fhandleError_005f0);
      //  app:view
      org.apache.jsp.tag.webinfra.view_tag _jspx_th_app_005fview_005f0 = (new org.apache.jsp.tag.webinfra.view_tag());
      _jsp_instancemanager.newInstance(_jspx_th_app_005fview_005f0);
      _jspx_th_app_005fview_005f0.setJspContext(_jspx_page_context);
      _jspx_th_app_005fview_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/contact/contactView.tag(31,0) name = mailbox type = com.zimbra.cs.taglib.bean.ZMailboxBean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_app_005fview_005f0.setMailbox((com.zimbra.cs.taglib.bean.ZMailboxBean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mailbox}", com.zimbra.cs.taglib.bean.ZMailboxBean.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      // /WEB-INF/tags/contact/contactView.tag(31,0) name = title type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_app_005fview_005f0.setTitle((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contact.displayFileAs}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      // /WEB-INF/tags/contact/contactView.tag(31,0) name = selected type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_app_005fview_005f0.setSelected("contacts");
      // /WEB-INF/tags/contact/contactView.tag(31,0) name = contacts type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_app_005fview_005f0.setContacts("true");
      // /WEB-INF/tags/contact/contactView.tag(31,0) name = tags type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_app_005fview_005f0.setTags("true");
      // /WEB-INF/tags/contact/contactView.tag(31,0) name = context type = com.zimbra.cs.taglib.tag.SearchContext reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_app_005fview_005f0.setContext((com.zimbra.cs.taglib.tag.SearchContext) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", com.zimbra.cs.taglib.tag.SearchContext.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      // /WEB-INF/tags/contact/contactView.tag(31,0) name = keys type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_app_005fview_005f0.setKeys("true");
      _jspx_th_app_005fview_005f0.setJspBody(new Helper( 1, _jspx_page_context, _jspx_th_app_005fview_005f0, null));
      _jspx_th_app_005fview_005f0.doTag();
      _jsp_instancemanager.destroyInstance(_jspx_th_app_005fview_005f0);
    } catch( java.lang.Throwable t ) {
      if( t instanceof javax.servlet.jsp.SkipPageException )
          throw (javax.servlet.jsp.SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof java.lang.IllegalStateException )
          throw (java.lang.IllegalStateException) t;
      if( t instanceof javax.servlet.jsp.JspException )
          throw (javax.servlet.jsp.JspException) t;
      throw new javax.servlet.jsp.JspException(t);
    } finally {
      jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
    }
  }

  private boolean _jspx_meth_app_005fcontactToolbar_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  app:contactToolbar
    org.apache.jsp.tag.webcontact.contactToolbar_tag _jspx_th_app_005fcontactToolbar_005f0 = (new org.apache.jsp.tag.webcontact.contactToolbar_tag());
    _jsp_instancemanager.newInstance(_jspx_th_app_005fcontactToolbar_005f0);
    _jspx_th_app_005fcontactToolbar_005f0.setJspContext(_jspx_page_context);
    _jspx_th_app_005fcontactToolbar_005f0.setParent(_jspx_parent);
    // /WEB-INF/tags/contact/contactView.tag(37,20) name = context type = com.zimbra.cs.taglib.tag.SearchContext reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fcontactToolbar_005f0.setContext((com.zimbra.cs.taglib.tag.SearchContext) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", com.zimbra.cs.taglib.tag.SearchContext.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    // /WEB-INF/tags/contact/contactView.tag(37,20) name = cursor type = com.zimbra.cs.taglib.bean.NextPrevItemBean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fcontactToolbar_005f0.setCursor((com.zimbra.cs.taglib.bean.NextPrevItemBean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cursor}", com.zimbra.cs.taglib.bean.NextPrevItemBean.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    // /WEB-INF/tags/contact/contactView.tag(37,20) name = keys type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fcontactToolbar_005f0.setKeys("true");
    // /WEB-INF/tags/contact/contactView.tag(37,20) name = closeurl type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fcontactToolbar_005f0.setCloseurl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${closeUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    _jspx_th_app_005fcontactToolbar_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_app_005fcontactToolbar_005f0);
    return false;
  }

  private boolean _jspx_meth_app_005fdisplayContact_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  app:displayContact
    org.apache.jsp.tag.webcontact.displayContact_tag _jspx_th_app_005fdisplayContact_005f0 = (new org.apache.jsp.tag.webcontact.displayContact_tag());
    _jsp_instancemanager.newInstance(_jspx_th_app_005fdisplayContact_005f0);
    _jspx_th_app_005fdisplayContact_005f0.setJspContext(_jspx_page_context);
    _jspx_th_app_005fdisplayContact_005f0.setParent(_jspx_parent);
    // /WEB-INF/tags/contact/contactView.tag(42,24) name = contact type = com.zimbra.cs.taglib.bean.ZContactBean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fdisplayContact_005f0.setContact((com.zimbra.cs.taglib.bean.ZContactBean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contact}", com.zimbra.cs.taglib.bean.ZContactBean.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    _jspx_th_app_005fdisplayContact_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_app_005fdisplayContact_005f0);
    return false;
  }

  private boolean _jspx_meth_app_005fcontactToolbar_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  app:contactToolbar
    org.apache.jsp.tag.webcontact.contactToolbar_tag _jspx_th_app_005fcontactToolbar_005f1 = (new org.apache.jsp.tag.webcontact.contactToolbar_tag());
    _jsp_instancemanager.newInstance(_jspx_th_app_005fcontactToolbar_005f1);
    _jspx_th_app_005fcontactToolbar_005f1.setJspContext(_jspx_page_context);
    _jspx_th_app_005fcontactToolbar_005f1.setParent(_jspx_parent);
    // /WEB-INF/tags/contact/contactView.tag(47,20) name = context type = com.zimbra.cs.taglib.tag.SearchContext reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fcontactToolbar_005f1.setContext((com.zimbra.cs.taglib.tag.SearchContext) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", com.zimbra.cs.taglib.tag.SearchContext.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    // /WEB-INF/tags/contact/contactView.tag(47,20) name = cursor type = com.zimbra.cs.taglib.bean.NextPrevItemBean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fcontactToolbar_005f1.setCursor((com.zimbra.cs.taglib.bean.NextPrevItemBean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cursor}", com.zimbra.cs.taglib.bean.NextPrevItemBean.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    // /WEB-INF/tags/contact/contactView.tag(47,20) name = keys type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fcontactToolbar_005f1.setKeys("false");
    // /WEB-INF/tags/contact/contactView.tag(47,20) name = closeurl type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fcontactToolbar_005f1.setCloseurl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${closeUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    _jspx_th_app_005fcontactToolbar_005f1.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_app_005fcontactToolbar_005f1);
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, javax.servlet.jsp.JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public void invoke0( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      //  zm:getMailbox
      com.zimbra.cs.taglib.tag.GetMailboxTag _jspx_th_zm_005fgetMailbox_005f0 = (new com.zimbra.cs.taglib.tag.GetMailboxTag());
      _jsp_instancemanager.newInstance(_jspx_th_zm_005fgetMailbox_005f0);
      _jspx_th_zm_005fgetMailbox_005f0.setJspContext(_jspx_page_context);
      _jspx_th_zm_005fgetMailbox_005f0.setParent(_jspx_parent);
      // /WEB-INF/tags/contact/contactView.tag(25,4) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_zm_005fgetMailbox_005f0.setVar("mailbox");
      _jspx_th_zm_005fgetMailbox_005f0.doTag();
      _jsp_instancemanager.destroyInstance(_jspx_th_zm_005fgetMailbox_005f0);
      //  zm:getContact
      com.zimbra.cs.taglib.tag.contact.GetContactTag _jspx_th_zm_005fgetContact_005f0 = (new com.zimbra.cs.taglib.tag.contact.GetContactTag());
      _jsp_instancemanager.newInstance(_jspx_th_zm_005fgetContact_005f0);
      _jspx_th_zm_005fgetContact_005f0.setJspContext(_jspx_page_context);
      _jspx_th_zm_005fgetContact_005f0.setParent(_jspx_parent);
      // /WEB-INF/tags/contact/contactView.tag(26,4) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_zm_005fgetContact_005f0.setId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty param.id ? context.currentItem.id : param.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      // /WEB-INF/tags/contact/contactView.tag(26,4) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_zm_005fgetContact_005f0.setVar("contact");
      _jspx_th_zm_005fgetContact_005f0.doTag();
      _jsp_instancemanager.destroyInstance(_jspx_th_zm_005fgetContact_005f0);
      //  zm:currentResultUrl
      org.apache.jsp.tag.meta.com_zimbra_zm.currentResultUrl_tag _jspx_th_zm_005fcurrentResultUrl_005f0 = (new org.apache.jsp.tag.meta.com_zimbra_zm.currentResultUrl_tag());
      _jsp_instancemanager.newInstance(_jspx_th_zm_005fcurrentResultUrl_005f0);
      java.util.HashMap _jspx_th_zm_005fcurrentResultUrl_005f0_aliasMap = new java.util.HashMap();
      _jspx_th_zm_005fcurrentResultUrl_005f0_aliasMap.put("urlVar", "closeUrl");
      _jspx_th_zm_005fcurrentResultUrl_005f0.setJspContext(_jspx_page_context, _jspx_th_zm_005fcurrentResultUrl_005f0_aliasMap);
      _jspx_th_zm_005fcurrentResultUrl_005f0.setParent(_jspx_parent);
      // /WEB-INF/tags/contact/contactView.tag(27,4) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_zm_005fcurrentResultUrl_005f0.setVar("closeUrl");
      // /WEB-INF/tags/contact/contactView.tag(27,4) name = value type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_zm_005fcurrentResultUrl_005f0.setValue("/h/search");
      // /WEB-INF/tags/contact/contactView.tag(27,4) name = context type = com.zimbra.cs.taglib.tag.SearchContext reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_zm_005fcurrentResultUrl_005f0.setContext((com.zimbra.cs.taglib.tag.SearchContext) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", com.zimbra.cs.taglib.tag.SearchContext.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      _jspx_th_zm_005fcurrentResultUrl_005f0.doTag();
      _jsp_instancemanager.destroyInstance(_jspx_th_zm_005fcurrentResultUrl_005f0);
      //  zm:computeNextPrevItem
      com.zimbra.cs.taglib.tag.ComputeNextPrevItemTag _jspx_th_zm_005fcomputeNextPrevItem_005f0 = (new com.zimbra.cs.taglib.tag.ComputeNextPrevItemTag());
      _jsp_instancemanager.newInstance(_jspx_th_zm_005fcomputeNextPrevItem_005f0);
      _jspx_th_zm_005fcomputeNextPrevItem_005f0.setJspContext(_jspx_page_context);
      _jspx_th_zm_005fcomputeNextPrevItem_005f0.setParent(_jspx_parent);
      // /WEB-INF/tags/contact/contactView.tag(28,4) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_zm_005fcomputeNextPrevItem_005f0.setVar("cursor");
      // /WEB-INF/tags/contact/contactView.tag(28,4) name = searchResult type = com.zimbra.cs.taglib.bean.ZSearchResultBean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_zm_005fcomputeNextPrevItem_005f0.setSearchResult((com.zimbra.cs.taglib.bean.ZSearchResultBean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context.searchResult}", com.zimbra.cs.taglib.bean.ZSearchResultBean.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      // /WEB-INF/tags/contact/contactView.tag(28,4) name = index type = int reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_zm_005fcomputeNextPrevItem_005f0.setIndex(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context.currentItemIndex}", int.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null)).intValue());
      _jspx_th_zm_005fcomputeNextPrevItem_005f0.doTag();
      _jsp_instancemanager.destroyInstance(_jspx_th_zm_005fcomputeNextPrevItem_005f0);
      return;
    }
    public void invoke1( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      //  zm:currentResultUrl
      org.apache.jsp.tag.meta.com_zimbra_zm.currentResultUrl_tag _jspx_th_zm_005fcurrentResultUrl_005f1 = (new org.apache.jsp.tag.meta.com_zimbra_zm.currentResultUrl_tag());
      _jsp_instancemanager.newInstance(_jspx_th_zm_005fcurrentResultUrl_005f1);
      java.util.HashMap _jspx_th_zm_005fcurrentResultUrl_005f1_aliasMap = new java.util.HashMap();
      _jspx_th_zm_005fcurrentResultUrl_005f1_aliasMap.put("urlVar", "currentUrl");
      _jspx_th_zm_005fcurrentResultUrl_005f1.setJspContext(_jspx_page_context, _jspx_th_zm_005fcurrentResultUrl_005f1_aliasMap);
      _jspx_th_zm_005fcurrentResultUrl_005f1.setParent(_jspx_parent);
      // /WEB-INF/tags/contact/contactView.tag(32,4) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_zm_005fcurrentResultUrl_005f1.setVar("currentUrl");
      // /WEB-INF/tags/contact/contactView.tag(32,4) name = value type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_zm_005fcurrentResultUrl_005f1.setValue("search");
      // /WEB-INF/tags/contact/contactView.tag(32,4) null
      _jspx_th_zm_005fcurrentResultUrl_005f1.setDynamicAttribute(null, "action", "view");
      // /WEB-INF/tags/contact/contactView.tag(32,4) name = context type = com.zimbra.cs.taglib.tag.SearchContext reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_zm_005fcurrentResultUrl_005f1.setContext((com.zimbra.cs.taglib.tag.SearchContext) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", com.zimbra.cs.taglib.tag.SearchContext.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      _jspx_th_zm_005fcurrentResultUrl_005f1.doTag();
      _jsp_instancemanager.destroyInstance(_jspx_th_zm_005fcurrentResultUrl_005f1);
      out.write("<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("\" method=\"post\">\n        <table width=100% cellpadding=\"0\" cellspacing=\"0\">\n            <tr>\n                <td class='TbTop'>\n                    ");
      if (_jspx_meth_app_005fcontactToolbar_005f0(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            </tr>\n            <tr>\n                <td class='ZhAppViewContent'>\n                        ");
      if (_jspx_meth_app_005fdisplayContact_005f0(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            </tr>\n            <tr>\n                <td class='TbBottom'>\n                    ");
      if (_jspx_meth_app_005fcontactToolbar_005f1(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\n            </tr>\n            </table>\n        <input type=\"hidden\" name=\"doContactListViewAction\" value=\"1\"/>\n        <input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contact.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("\"/>\n    </form>\n");
      return;
    }
    public void invoke( java.io.Writer writer )
      throws javax.servlet.jsp.JspException
    {
      javax.servlet.jsp.JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        Object _jspx_saved_JspContext = this.jspContext.getELContext().getContext(javax.servlet.jsp.JspContext.class);
        this.jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
          case 1:
            invoke1( out );
            break;
        }
        jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,_jspx_saved_JspContext);
      }
      catch( java.lang.Throwable e ) {
        if (e instanceof javax.servlet.jsp.SkipPageException)
            throw (javax.servlet.jsp.SkipPageException) e;
        throw new javax.servlet.jsp.JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
