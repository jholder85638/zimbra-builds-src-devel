/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat8
 * Generated at: 2017-12-07 23:24:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.webvoice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class voiceMailViewToolbar_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:escapeXml", org.apache.taglibs.standard.functions.Functions.class, "escapeXml", new Class[] {java.lang.String.class});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("jar:file:/root/.ivy2/cache/zimbra/zm-taglib/jars/zm-taglib-8.7.0.1505720459.jar!/META-INF/tags/currentResultUrl.tag", Long.valueOf(1512680894000L));
    _jspx_dependants.put("jar:file:/root/.ivy2/cache/zimbra/zm-taglib/jars/zm-taglib-8.7.0.1505720459.jar!/META-INF/zm.tld", Long.valueOf(1512680894000L));
    _jspx_dependants.put("/WEB-INF/tags/imginfo.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/img.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/button.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/imgurl.tag", Long.valueOf(1512680905000L));
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

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
  private java.lang.Boolean heard;
  private java.lang.Boolean isPrivate;
  private java.lang.String saveAsUrl;
  private java.lang.String keys;

  public com.zimbra.cs.taglib.tag.SearchContext getContext() {
    return this.context;
  }

  public void setContext(com.zimbra.cs.taglib.tag.SearchContext context) {
    this.context = context;
    jspContext.setAttribute("context", context);
  }

  public java.lang.Boolean getHeard() {
    return this.heard;
  }

  public void setHeard(java.lang.Boolean heard) {
    this.heard = heard;
    jspContext.setAttribute("heard", heard);
  }

  public java.lang.Boolean getIsPrivate() {
    return this.isPrivate;
  }

  public void setIsPrivate(java.lang.Boolean isPrivate) {
    this.isPrivate = isPrivate;
    jspContext.setAttribute("isPrivate", isPrivate);
  }

  public java.lang.String getSaveAsUrl() {
    return this.saveAsUrl;
  }

  public void setSaveAsUrl(java.lang.String saveAsUrl) {
    this.saveAsUrl = saveAsUrl;
    jspContext.setAttribute("saveAsUrl", saveAsUrl);
  }

  public java.lang.String getKeys() {
    return this.keys;
  }

  public void setKeys(java.lang.String keys) {
    this.keys = keys;
    jspContext.setAttribute("keys", keys);
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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(config);
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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
    if( getHeard() != null ) 
      _jspx_page_context.setAttribute("heard", getHeard());
    if( getIsPrivate() != null ) 
      _jspx_page_context.setAttribute("isPrivate", getIsPrivate());
    if( getSaveAsUrl() != null ) 
      _jspx_page_context.setAttribute("saveAsUrl", getSaveAsUrl());
    if( getKeys() != null ) 
      _jspx_page_context.setAttribute("keys", getKeys());

    try {
      //  zm:getMailbox
      com.zimbra.cs.taglib.tag.GetMailboxTag _jspx_th_zm_005fgetMailbox_005f0 = (new com.zimbra.cs.taglib.tag.GetMailboxTag());
      _jsp_instancemanager.newInstance(_jspx_th_zm_005fgetMailbox_005f0);
      _jspx_th_zm_005fgetMailbox_005f0.setJspContext(_jspx_page_context);
      _jspx_th_zm_005fgetMailbox_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(29,0) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_zm_005fgetMailbox_005f0.setVar("mailbox");
      _jspx_th_zm_005fgetMailbox_005f0.doTag();
      com.zimbra.cs.taglib.bean.ZMailboxBean mailbox = null;
      mailbox = (com.zimbra.cs.taglib.bean.ZMailboxBean) _jspx_page_context.findAttribute("mailbox");
      _jsp_instancemanager.destroyInstance(_jspx_th_zm_005fgetMailbox_005f0);
      out.write("<table width=\"100%\" cellspacing=\"0\" class='Tb'>\n\t  <tr valign='middle'>\n\t\t<td class='TbBT'>\n\t\t\t<table cellspacing=\"0\" cellpadding=\"0\" class='Tb'>\n\t\t\t\t<tr>\n\t\t\t\t\t<td nowrap>\n\t\t\t\t\t\t");
      //  zm:currentResultUrl
      org.apache.jsp.tag.meta.com_zimbra_zm.currentResultUrl_tag _jspx_th_zm_005fcurrentResultUrl_005f0 = (new org.apache.jsp.tag.meta.com_zimbra_zm.currentResultUrl_tag());
      _jsp_instancemanager.newInstance(_jspx_th_zm_005fcurrentResultUrl_005f0);
      java.util.HashMap _jspx_th_zm_005fcurrentResultUrl_005f0_aliasMap = new java.util.HashMap();
      _jspx_th_zm_005fcurrentResultUrl_005f0_aliasMap.put("urlVar", "closeurl");
      _jspx_th_zm_005fcurrentResultUrl_005f0.setJspContext(_jspx_page_context, _jspx_th_zm_005fcurrentResultUrl_005f0_aliasMap);
      _jspx_th_zm_005fcurrentResultUrl_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(37,6) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_zm_005fcurrentResultUrl_005f0.setVar("closeurl");
      // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(37,6) name = value type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_zm_005fcurrentResultUrl_005f0.setValue("/h/search");
      // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(37,6) name = index type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_zm_005fcurrentResultUrl_005f0.setIndex((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context.currentItemIndex}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(37,6) name = context type = com.zimbra.cs.taglib.tag.SearchContext reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_zm_005fcurrentResultUrl_005f0.setContext((com.zimbra.cs.taglib.tag.SearchContext) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", com.zimbra.cs.taglib.tag.SearchContext.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      _jspx_th_zm_005fcurrentResultUrl_005f0.doTag();
      _jsp_instancemanager.destroyInstance(_jspx_th_zm_005fcurrentResultUrl_005f0);
      //  zm:currentResultUrl
      org.apache.jsp.tag.meta.com_zimbra_zm.currentResultUrl_tag _jspx_th_zm_005fcurrentResultUrl_005f1 = (new org.apache.jsp.tag.meta.com_zimbra_zm.currentResultUrl_tag());
      _jsp_instancemanager.newInstance(_jspx_th_zm_005fcurrentResultUrl_005f1);
      java.util.HashMap _jspx_th_zm_005fcurrentResultUrl_005f1_aliasMap = new java.util.HashMap();
      _jspx_th_zm_005fcurrentResultUrl_005f1_aliasMap.put("urlVar", "delRedirectUrl");
      _jspx_th_zm_005fcurrentResultUrl_005f1.setJspContext(_jspx_page_context, _jspx_th_zm_005fcurrentResultUrl_005f1_aliasMap);
      _jspx_th_zm_005fcurrentResultUrl_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(38,6) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_zm_005fcurrentResultUrl_005f1.setVar("delRedirectUrl");
      // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(38,6) name = value type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_zm_005fcurrentResultUrl_005f1.setValue("/h/search");
      // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(38,6) name = context type = com.zimbra.cs.taglib.tag.SearchContext reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_zm_005fcurrentResultUrl_005f1.setContext((com.zimbra.cs.taglib.tag.SearchContext) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", com.zimbra.cs.taglib.tag.SearchContext.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      _jspx_th_zm_005fcurrentResultUrl_005f1.doTag();
      _jsp_instancemanager.destroyInstance(_jspx_th_zm_005fcurrentResultUrl_005f1);
      out.write("<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${delRedirectUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("\" name=\"delRedirectUrl\" />\n\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(closeurl)}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), _jspx_fnmap_0));
      out.write('"');
      out.write(' ');
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write('>');
      out.write(' ');
      if (_jspx_meth_app_005fimg_005f0(_jspx_page_context))
        return;
      out.write("<span>&nbsp;");
      if (_jspx_meth_fmt_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("&nbsp;</span></a>\n\t\t\t\t\t</td>\n\t\t\t\t\t<td><div class='vertSep'/></td>\n\t\t\t\t\t");
      if (_jspx_meth_app_005fbutton_005f0(_jspx_page_context))
        return;
      out.write("<td><div class='vertSep'/></td>\n\t\t\t\t\t");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_app_005fbutton_005f1(_jspx_page_context))
        return;
      if (_jspx_meth_app_005fbutton_005f2(_jspx_page_context))
        return;
      out.write("<td><div class='vertSep'/></td>\n\t\t\t\t\t<td><a id=\"IOPDOWNLOAD\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${saveAsUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write('"');
      out.write('>');
      if (_jspx_meth_app_005fimg_005f1(_jspx_page_context))
        return;
      out.write("</a></td>\n\t\t\t\t\t<td><div class='vertSep'/></td>\n\t\t\t\t\t");
      if (_jspx_meth_app_005fbutton_005f3(_jspx_page_context))
        return;
      if (_jspx_meth_app_005fbutton_005f4(_jspx_page_context))
        return;
      out.write("</tr>\n\t\t\t</table>\n\t\t</td>\n");
      out.write("</tr>\n</table>\n\n");
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
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(40,42) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${keys}", boolean.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("id=\"CLOSE_ITEM\"");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      throw new javax.servlet.jsp.SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_app_005fimg_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  app:img
    org.apache.jsp.tag.webimg_tag _jspx_th_app_005fimg_005f0 = (new org.apache.jsp.tag.webimg_tag());
    _jsp_instancemanager.newInstance(_jspx_th_app_005fimg_005f0);
    _jspx_th_app_005fimg_005f0.setJspContext(_jspx_page_context);
    _jspx_th_app_005fimg_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(40,87) name = src type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fimg_005f0.setSrc("common/ImgClose.png");
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(40,87) name = alt type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fimg_005f0.setAlt("close");
    _jspx_th_app_005fimg_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_app_005fimg_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    com.zimbra.cs.taglib.tag.i18n.MessageTag _jspx_th_fmt_005fmessage_005f0 = (com.zimbra.cs.taglib.tag.i18n.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(com.zimbra.cs.taglib.tag.i18n.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(40,148) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f0.setKey("backToVoiceMail");
    int _jspx_eval_fmt_005fmessage_005f0 = _jspx_th_fmt_005fmessage_005f0.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
      throw new javax.servlet.jsp.SkipPageException();
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_app_005fbutton_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  app:button
    org.apache.jsp.tag.webbutton_tag _jspx_th_app_005fbutton_005f0 = (new org.apache.jsp.tag.webbutton_tag());
    _jsp_instancemanager.newInstance(_jspx_th_app_005fbutton_005f0);
    _jspx_th_app_005fbutton_005f0.setJspContext(_jspx_page_context);
    _jspx_th_app_005fbutton_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(43,5) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f0.setId((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${keys ? 'OPDELETE' :''}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(43,5) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f0.setName("actionDelete");
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(43,5) name = src type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f0.setSrc("startup/ImgDelete.png");
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(43,5) name = text type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f0.setText("actionDelete");
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(43,5) name = tooltip type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f0.setTooltip("actionTrashTT");
    _jspx_th_app_005fbutton_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_app_005fbutton_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(45,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("disableMailButtons");
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(45,5) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/tags/voice/voiceMailViewToolbar.tag(45,5) '${(mailbox.features.mail ne true) or isPrivate}'",_el_expressionfactory.createValueExpression(this.getJspContext().getELContext(),"${(mailbox.features.mail ne true) or isPrivate}",java.lang.Object.class)).getValue(this.getJspContext().getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      throw new javax.servlet.jsp.SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_app_005fbutton_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  app:button
    org.apache.jsp.tag.webbutton_tag _jspx_th_app_005fbutton_005f1 = (new org.apache.jsp.tag.webbutton_tag());
    _jsp_instancemanager.newInstance(_jspx_th_app_005fbutton_005f1);
    _jspx_th_app_005fbutton_005f1.setJspContext(_jspx_page_context);
    _jspx_th_app_005fbutton_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(46,5) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f1.setId("OPREPLYBYEMAIL");
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(46,5) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f1.setName("actionReplyByEmail");
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(46,5) name = text type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f1.setText("actionReplyByEmail");
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(46,5) name = src type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f1.setSrc("startup/ImgReply.png");
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(46,5) name = tooltip type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f1.setTooltip("actionReplyByEmailTT");
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(46,5) name = disabled type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f1.setDisabled((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${disableMailButtons}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    _jspx_th_app_005fbutton_005f1.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_app_005fbutton_005f1);
    return false;
  }

  private boolean _jspx_meth_app_005fbutton_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  app:button
    org.apache.jsp.tag.webbutton_tag _jspx_th_app_005fbutton_005f2 = (new org.apache.jsp.tag.webbutton_tag());
    _jsp_instancemanager.newInstance(_jspx_th_app_005fbutton_005f2);
    _jspx_th_app_005fbutton_005f2.setJspContext(_jspx_page_context);
    _jspx_th_app_005fbutton_005f2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(47,5) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f2.setId("OPFORWARDBYEMAIL");
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(47,5) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f2.setName("actionForwardByEmail");
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(47,5) name = text type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f2.setText("actionForwardByEmail");
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(47,5) name = src type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f2.setSrc("startup/ImgForward.png");
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(47,5) name = tooltip type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f2.setTooltip("actionForwardByEmailTT");
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(47,5) name = disabled type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f2.setDisabled((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${disableMailButtons}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    _jspx_th_app_005fbutton_005f2.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_app_005fbutton_005f2);
    return false;
  }

  private boolean _jspx_meth_app_005fimg_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  app:img
    org.apache.jsp.tag.webimg_tag _jspx_th_app_005fimg_005f1 = (new org.apache.jsp.tag.webimg_tag());
    _jsp_instancemanager.newInstance(_jspx_th_app_005fimg_005f1);
    _jspx_th_app_005fimg_005f1.setJspContext(_jspx_page_context);
    _jspx_th_app_005fimg_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(49,49) name = src type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fimg_005f1.setSrc("common/ImgSave.png");
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(49,49) name = altkey type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fimg_005f1.setAltkey("actionDownload");
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(49,49) name = clazz type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fimg_005f1.setClazz((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${isPrivate ? 'ImgDisabled' : ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    _jspx_th_app_005fimg_005f1.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_app_005fimg_005f1);
    return false;
  }

  private boolean _jspx_meth_app_005fbutton_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  app:button
    org.apache.jsp.tag.webbutton_tag _jspx_th_app_005fbutton_005f3 = (new org.apache.jsp.tag.webbutton_tag());
    _jsp_instancemanager.newInstance(_jspx_th_app_005fbutton_005f3);
    _jspx_th_app_005fbutton_005f3.setJspContext(_jspx_page_context);
    _jspx_th_app_005fbutton_005f3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(51,5) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f3.setId("OPHEARD");
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(51,5) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f3.setName("actionMarkHeard");
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(51,5) name = text type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f3.setText("actionMarkHeard");
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(51,5) name = src type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f3.setSrc("voicemail/ImgMarkAsHeard.png");
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(51,5) name = tooltip type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f3.setTooltip("actionMarkHeardTT");
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(51,5) name = disabled type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f3.setDisabled((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${isTrash or heard}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    _jspx_th_app_005fbutton_005f3.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_app_005fbutton_005f3);
    return false;
  }

  private boolean _jspx_meth_app_005fbutton_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  app:button
    org.apache.jsp.tag.webbutton_tag _jspx_th_app_005fbutton_005f4 = (new org.apache.jsp.tag.webbutton_tag());
    _jsp_instancemanager.newInstance(_jspx_th_app_005fbutton_005f4);
    _jspx_th_app_005fbutton_005f4.setJspContext(_jspx_page_context);
    _jspx_th_app_005fbutton_005f4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(52,5) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f4.setId("OPUNHEARD");
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(52,5) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f4.setName("actionMarkUnheard");
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(52,5) name = text type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f4.setText("actionMarkUnheard");
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(52,5) name = src type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f4.setSrc("voicemail/ImgMarkAsUnheard.png");
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(52,5) name = tooltip type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f4.setTooltip("actionMarkUnheardTT");
    // /WEB-INF/tags/voice/voiceMailViewToolbar.tag(52,5) name = disabled type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fbutton_005f4.setDisabled((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${isTrash or not heard}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    _jspx_th_app_005fbutton_005f4.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_app_005fbutton_005f4);
    return false;
  }
}
