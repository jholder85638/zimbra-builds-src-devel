/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat8
 * Generated at: 2017-12-07 23:24:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.webrest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class restCalendarViewBottomToolbar_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;
private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_1;
private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_2;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("zm:getCanonicalId", com.zimbra.cs.taglib.bean.BeanUtils.class, "getCanonicalId", new Class[] {java.util.TimeZone.class});
  _jspx_fnmap_1= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("zm:cook", com.zimbra.cs.taglib.bean.BeanUtils.class, "cook", new Class[] {java.lang.String.class});
  _jspx_fnmap_2= org.apache.jasper.runtime.ProtectedFunctionMapper.getInstance();
  _jspx_fnmap_2.mapFunction("fn:escapeXml", org.apache.taglibs.standard.functions.Functions.class, "escapeXml", new Class[] {java.lang.String.class});
  _jspx_fnmap_2.mapFunction("fn:startsWith", org.apache.taglibs.standard.functions.Functions.class, "startsWith", new Class[] {java.lang.String.class, java.lang.String.class});
  _jspx_fnmap_2.mapFunction("zm:getCanonicalId", com.zimbra.cs.taglib.bean.BeanUtils.class, "getCanonicalId", new Class[] {java.util.TimeZone.class});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/tags/imginfo.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/img.tag", Long.valueOf(1512680905000L));
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fvar_005fscope_005fkey_005fbundle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
  private java.util.TimeZone timezone;

  public java.util.TimeZone getTimezone() {
    return this.timezone;
  }

  public void setTimezone(java.util.TimeZone timezone) {
    this.timezone = timezone;
    jspContext.setAttribute("timezone", timezone);
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
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fvar_005fscope_005fkey_005fbundle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(config);
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fvar_005fscope_005fkey_005fbundle_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
    if( getTimezone() != null ) 
      _jspx_page_context.setAttribute("timezone", getTimezone());

    try {
      if (_jspx_meth_fmt_005fsetBundle_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_fmt_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("<table width=\"100%\" cellspacing=\"0\" class='Tb'>\n    <tr>\n        <td align=\"left\" class=\"TbBt\">\n            ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("</td>\n        <td align='right' class='ZhCalTimeZone'>\n            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(fn:startsWith(timezoneStr,\"???\") ? (zm:getCanonicalId(timezone)) : timezoneStr)}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), _jspx_fnmap_2));
      out.write("</td>\n    </tr>\n</table>\n");
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

  private boolean _jspx_meth_fmt_005fsetBundle_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:setBundle
    com.zimbra.cs.taglib.tag.i18n.SetBundleTag _jspx_th_fmt_005fsetBundle_005f0 = (new com.zimbra.cs.taglib.tag.i18n.SetBundleTag());
    _jsp_instancemanager.newInstance(_jspx_th_fmt_005fsetBundle_005f0);
    _jspx_th_fmt_005fsetBundle_005f0.setJspContext(_jspx_page_context);
    _jspx_th_fmt_005fsetBundle_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/rest/restCalendarViewBottomToolbar.tag(25,0) name = basename type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fsetBundle_005f0.setBasename("/messages/TzMsg");
    // /WEB-INF/tags/rest/restCalendarViewBottomToolbar.tag(25,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fsetBundle_005f0.setVar("TzMsg");
    // /WEB-INF/tags/rest/restCalendarViewBottomToolbar.tag(25,0) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fsetBundle_005f0.setScope("request");
    _jspx_th_fmt_005fsetBundle_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_fmt_005fsetBundle_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    com.zimbra.cs.taglib.tag.i18n.MessageTag _jspx_th_fmt_005fmessage_005f0 = (com.zimbra.cs.taglib.tag.i18n.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fvar_005fscope_005fkey_005fbundle_005fnobody.get(com.zimbra.cs.taglib.tag.i18n.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/rest/restCalendarViewBottomToolbar.tag(26,0) name = bundle type = java.util.ResourceBundle reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f0.setBundle((java.util.ResourceBundle) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${TzMsg}", java.util.ResourceBundle.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    // /WEB-INF/tags/rest/restCalendarViewBottomToolbar.tag(26,0) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f0.setKey((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${zm:getCanonicalId(timezone)}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), _jspx_fnmap_0));
    // /WEB-INF/tags/rest/restCalendarViewBottomToolbar.tag(26,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f0.setVar("timezoneStr");
    // /WEB-INF/tags/rest/restCalendarViewBottomToolbar.tag(26,0) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f0.setScope("request");
    int _jspx_eval_fmt_005fmessage_005f0 = _jspx_th_fmt_005fmessage_005f0.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fvar_005fscope_005fkey_005fbundle_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
      throw new javax.servlet.jsp.SkipPageException();
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fvar_005fscope_005fkey_005fbundle_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/rest/restCalendarViewBottomToolbar.tag(32,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty requestScope.zimbra_target_item_name}", boolean.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<a href=\"/home/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${zm:cook(${requestScope.zimbra_target_account_name})}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), _jspx_fnmap_1));
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${zm:cook(${requestScope.zimbra_target_item_path})}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), _jspx_fnmap_1));
        out.write(".ics\">\n                    ");
        if (_jspx_meth_app_005fimg_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("<span style='padding-left:5px'>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${zm:cook(requestScope.zimbra_target_item_name)}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), _jspx_fnmap_1));
        out.write(".ics</span></a>\n            ");
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

  private boolean _jspx_meth_app_005fimg_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  app:img
    org.apache.jsp.tag.webimg_tag _jspx_th_app_005fimg_005f0 = (new org.apache.jsp.tag.webimg_tag());
    _jsp_instancemanager.newInstance(_jspx_th_app_005fimg_005f0);
    _jspx_th_app_005fimg_005f0.setJspContext(_jspx_page_context);
    _jspx_th_app_005fimg_005f0.setParent(_jspx_th_c_005fif_005f0);
    // /WEB-INF/tags/rest/restCalendarViewBottomToolbar.tag(34,20) name = src type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fimg_005f0.setSrc("startup/ImgCalendarApp.png");
    // /WEB-INF/tags/rest/restCalendarViewBottomToolbar.tag(34,20) name = alt type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fimg_005f0.setAlt("ics");
    _jspx_th_app_005fimg_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_app_005fimg_005f0);
    return false;
  }
}
