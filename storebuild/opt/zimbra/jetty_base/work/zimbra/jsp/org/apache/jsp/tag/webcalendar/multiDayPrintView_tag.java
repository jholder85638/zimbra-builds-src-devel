/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat8
 * Generated at: 2017-12-07 23:24:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.webcalendar;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class multiDayPrintView_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;
private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_1;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("zm:addMonth", com.zimbra.cs.taglib.bean.BeanUtils.class, "addMonth", new Class[] {java.util.Calendar.class, int.class});
  _jspx_fnmap_1= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("zm:getToday", com.zimbra.cs.taglib.bean.BeanUtils.class, "getToday", new Class[] {java.util.TimeZone.class});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(11);
    _jspx_dependants.put("/WEB-INF/tags/flagImage.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/imginfo.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/calendar/dayAppt.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/img.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/calendar/calendarUrl.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/infra/status.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/calendar/multiDay.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/calendar/miniCal.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/infra/handleError.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/infra/skin.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/miniTagImage.tag", Long.valueOf(1512680905000L));
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar;
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
  private java.util.Calendar date;
  private java.util.Calendar endDate;
  private java.lang.String ft;
  private java.lang.String tt;
  private java.lang.String wdays;
  private java.lang.String numdays;
  private java.lang.String view;
  private java.util.TimeZone timezone;
  private java.lang.String checkedCalendars;

  public java.util.Calendar getDate() {
    return this.date;
  }

  public void setDate(java.util.Calendar date) {
    this.date = date;
    jspContext.setAttribute("date", date);
  }

  public java.util.Calendar getEndDate() {
    return this.endDate;
  }

  public void setEndDate(java.util.Calendar endDate) {
    this.endDate = endDate;
    jspContext.setAttribute("endDate", endDate);
  }

  public java.lang.String getFt() {
    return this.ft;
  }

  public void setFt(java.lang.String ft) {
    this.ft = ft;
    jspContext.setAttribute("ft", ft);
  }

  public java.lang.String getTt() {
    return this.tt;
  }

  public void setTt(java.lang.String tt) {
    this.tt = tt;
    jspContext.setAttribute("tt", tt);
  }

  public java.lang.String getWdays() {
    return this.wdays;
  }

  public void setWdays(java.lang.String wdays) {
    this.wdays = wdays;
    jspContext.setAttribute("wdays", wdays);
  }

  public java.lang.String getNumdays() {
    return this.numdays;
  }

  public void setNumdays(java.lang.String numdays) {
    this.numdays = numdays;
    jspContext.setAttribute("numdays", numdays);
  }

  public java.lang.String getView() {
    return this.view;
  }

  public void setView(java.lang.String view) {
    this.view = view;
    jspContext.setAttribute("view", view);
  }

  public java.util.TimeZone getTimezone() {
    return this.timezone;
  }

  public void setTimezone(java.util.TimeZone timezone) {
    this.timezone = timezone;
    jspContext.setAttribute("timezone", timezone);
  }

  public java.lang.String getCheckedCalendars() {
    return this.checkedCalendars;
  }

  public void setCheckedCalendars(java.lang.String checkedCalendars) {
    this.checkedCalendars = checkedCalendars;
    jspContext.setAttribute("checkedCalendars", checkedCalendars);
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
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(config);
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.release();
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
    if( getDate() != null ) 
      _jspx_page_context.setAttribute("date", getDate());
    if( getEndDate() != null ) 
      _jspx_page_context.setAttribute("endDate", getEndDate());
    if( getFt() != null ) 
      _jspx_page_context.setAttribute("ft", getFt());
    if( getTt() != null ) 
      _jspx_page_context.setAttribute("tt", getTt());
    if( getWdays() != null ) 
      _jspx_page_context.setAttribute("wdays", getWdays());
    if( getNumdays() != null ) 
      _jspx_page_context.setAttribute("numdays", getNumdays());
    if( getView() != null ) 
      _jspx_page_context.setAttribute("view", getView());
    if( getTimezone() != null ) 
      _jspx_page_context.setAttribute("timezone", getTimezone());
    if( getCheckedCalendars() != null ) 
      _jspx_page_context.setAttribute("checkedCalendars", getCheckedCalendars());

    try {
      //  app:handleError
      org.apache.jsp.tag.webinfra.handleError_tag _jspx_th_app_005fhandleError_005f0 = (new org.apache.jsp.tag.webinfra.handleError_tag());
      _jsp_instancemanager.newInstance(_jspx_th_app_005fhandleError_005f0);
      _jspx_th_app_005fhandleError_005f0.setJspContext(_jspx_page_context);
      _jspx_th_app_005fhandleError_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      _jspx_th_app_005fhandleError_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_app_005fhandleError_005f0, null));
      _jspx_th_app_005fhandleError_005f0.doTag();
      _jsp_instancemanager.destroyInstance(_jspx_th_app_005fhandleError_005f0);
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("<br>\n<table width=\"98%\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" class=\"zPrintMsgs\" >\n    <tr>\n        <td colspan=\"4\" class='ZhAppContent'>\n            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${multiDay}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write("</td>\n    </tr>\n</table>\n\n<style type=\"text/css\">\n    .zPrintMsgs *{\n        font-size:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mailbox.prefs.defaultPrintFontSize}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write(";\n    }\n</style>\n<SCRIPT TYPE=\"text/javascript\">\n<!--\nfunction zSelectRow(ev,id) {var t = ev.target || ev.srcElement;if (t&&t.nodeName != 'INPUT'){var a = document.getElementById(id); if (a) window.location = a.href;} }\n//-->\n</SCRIPT>");
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

  private boolean _jspx_meth_fmt_005fsetTimeZone_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:setTimeZone
    com.zimbra.cs.taglib.tag.i18n.SetTimeZoneTag _jspx_th_fmt_005fsetTimeZone_005f0 = (new com.zimbra.cs.taglib.tag.i18n.SetTimeZoneTag());
    _jsp_instancemanager.newInstance(_jspx_th_fmt_005fsetTimeZone_005f0);
    _jspx_th_fmt_005fsetTimeZone_005f0.setJspContext(_jspx_page_context);
    _jspx_th_fmt_005fsetTimeZone_005f0.setParent(_jspx_parent);
    // /WEB-INF/tags/calendar/multiDayPrintView.tag(34,4) name = value type = java.lang.Object reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fsetTimeZone_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${timezone}", java.lang.Object.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    _jspx_th_fmt_005fsetTimeZone_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_fmt_005fsetTimeZone_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/tags/calendar/multiDayPrintView.tag(35,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("nextMonthDate");
    // /WEB-INF/tags/calendar/multiDayPrintView.tag(35,4) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/tags/calendar/multiDayPrintView.tag(35,4) '${zm:addMonth(date,  1)}'",_el_expressionfactory.createValueExpression(new org.apache.jasper.el.ELContextWrapper(this.getJspContext().getELContext(),_jspx_fnmap_0),"${zm:addMonth(date,  1)}",java.lang.Object.class)).getValue(this.getJspContext().getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      throw new javax.servlet.jsp.SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_app_005fskin_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  app:skin
    org.apache.jsp.tag.webinfra.skin_tag _jspx_th_app_005fskin_005f0 = (new org.apache.jsp.tag.webinfra.skin_tag());
    _jsp_instancemanager.newInstance(_jspx_th_app_005fskin_005f0);
    _jspx_th_app_005fskin_005f0.setJspContext(_jspx_page_context);
    _jspx_th_app_005fskin_005f0.setParent(_jspx_parent);
    // /WEB-INF/tags/calendar/multiDayPrintView.tag(37,4) name = mailbox type = com.zimbra.cs.taglib.bean.ZMailboxBean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fskin_005f0.setMailbox((com.zimbra.cs.taglib.bean.ZMailboxBean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mailbox}", com.zimbra.cs.taglib.bean.ZMailboxBean.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    _jspx_th_app_005fskin_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_app_005fskin_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/tags/calendar/multiDayPrintView.tag(38,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setVar("multiDay");
    int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
    if (_jspx_eval_c_005fset_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_005fset_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_005fset_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_005fset_005f1.doInitBody();
      }
      do {
        if (_jspx_meth_app_005fmultiDay_005f0(_jspx_th_c_005fset_005f1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_005fset_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_005fset_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.reuse(_jspx_th_c_005fset_005f1);
      throw new javax.servlet.jsp.SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.reuse(_jspx_th_c_005fset_005f1);
    return false;
  }

  private boolean _jspx_meth_app_005fmultiDay_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fset_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  app:multiDay
    org.apache.jsp.tag.webcalendar.multiDay_tag _jspx_th_app_005fmultiDay_005f0 = (new org.apache.jsp.tag.webcalendar.multiDay_tag());
    _jsp_instancemanager.newInstance(_jspx_th_app_005fmultiDay_005f0);
    _jspx_th_app_005fmultiDay_005f0.setJspContext(_jspx_page_context);
    _jspx_th_app_005fmultiDay_005f0.setParent(_jspx_th_c_005fset_005f1);
    // /WEB-INF/tags/calendar/multiDayPrintView.tag(39,8) name = date type = java.util.Calendar reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fmultiDay_005f0.setDate((java.util.Calendar) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${date}", java.util.Calendar.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    // /WEB-INF/tags/calendar/multiDayPrintView.tag(39,8) name = endDate type = java.util.Calendar reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fmultiDay_005f0.setEndDate((java.util.Calendar) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty endDate ? endDate : ''}", java.util.Calendar.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    // /WEB-INF/tags/calendar/multiDayPrintView.tag(39,8) name = ft type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fmultiDay_005f0.setFt((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ft}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    // /WEB-INF/tags/calendar/multiDayPrintView.tag(39,8) name = tt type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fmultiDay_005f0.setTt((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tt}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    // /WEB-INF/tags/calendar/multiDayPrintView.tag(39,8) name = print type = java.lang.Boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fmultiDay_005f0.setPrint((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${true}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    // /WEB-INF/tags/calendar/multiDayPrintView.tag(39,8) name = numdays type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fmultiDay_005f0.setNumdays((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${numdays}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    // /WEB-INF/tags/calendar/multiDayPrintView.tag(39,8) name = wdays type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fmultiDay_005f0.setWdays((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty wdays ? wdays : ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    // /WEB-INF/tags/calendar/multiDayPrintView.tag(39,8) name = view type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fmultiDay_005f0.setView((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${view}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    // /WEB-INF/tags/calendar/multiDayPrintView.tag(39,8) name = timezone type = java.util.TimeZone reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fmultiDay_005f0.setTimezone((java.util.TimeZone) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${timezone}", java.util.TimeZone.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    // /WEB-INF/tags/calendar/multiDayPrintView.tag(39,8) name = checkedCalendars type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fmultiDay_005f0.setCheckedCalendars((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${checkedCalendars}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    // /WEB-INF/tags/calendar/multiDayPrintView.tag(39,8) name = query type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fmultiDay_005f0.setQuery((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.calendarQuery}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    _jspx_th_app_005fmultiDay_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_app_005fmultiDay_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/calendar/multiDayPrintView.tag(43,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.imc eq 'true'}", boolean.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"margin-left: 1%;\">\n    <tr>\n        <td width=\"180\">\n            ");
        if (_jspx_meth_app_005fminiCal_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("</td>\n        <td width=\"10\">\n             &nbsp;\n        </td>\n        <td width=\"180\">\n            ");
        if (_jspx_meth_app_005fminiCal_005f1(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("</td>\n    </tr>\n</table>\n");
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

  private boolean _jspx_meth_app_005fminiCal_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  app:miniCal
    org.apache.jsp.tag.webcalendar.miniCal_tag _jspx_th_app_005fminiCal_005f0 = (new org.apache.jsp.tag.webcalendar.miniCal_tag());
    _jsp_instancemanager.newInstance(_jspx_th_app_005fminiCal_005f0);
    _jspx_th_app_005fminiCal_005f0.setJspContext(_jspx_page_context);
    _jspx_th_app_005fminiCal_005f0.setParent(_jspx_th_c_005fif_005f0);
    // /WEB-INF/tags/calendar/multiDayPrintView.tag(47,12) name = print type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fminiCal_005f0.setPrint((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${true}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    // /WEB-INF/tags/calendar/multiDayPrintView.tag(47,12) name = date type = java.util.Calendar reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fminiCal_005f0.setDate((java.util.Calendar) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty date ? date : zm:getToday(mailbox.prefs.timeZone)}", java.util.Calendar.class, (javax.servlet.jsp.PageContext)this.getJspContext(), _jspx_fnmap_1));
    // /WEB-INF/tags/calendar/multiDayPrintView.tag(47,12) name = checkedCalendars type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fminiCal_005f0.setCheckedCalendars((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${checkedCalendars}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    _jspx_th_app_005fminiCal_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_app_005fminiCal_005f0);
    return false;
  }

  private boolean _jspx_meth_app_005fminiCal_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  app:miniCal
    org.apache.jsp.tag.webcalendar.miniCal_tag _jspx_th_app_005fminiCal_005f1 = (new org.apache.jsp.tag.webcalendar.miniCal_tag());
    _jsp_instancemanager.newInstance(_jspx_th_app_005fminiCal_005f1);
    _jspx_th_app_005fminiCal_005f1.setJspContext(_jspx_page_context);
    _jspx_th_app_005fminiCal_005f1.setParent(_jspx_th_c_005fif_005f0);
    // /WEB-INF/tags/calendar/multiDayPrintView.tag(53,12) name = print type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fminiCal_005f1.setPrint((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${true}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    // /WEB-INF/tags/calendar/multiDayPrintView.tag(53,12) name = date type = java.util.Calendar reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fminiCal_005f1.setDate((java.util.Calendar) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty nextMonthDate ? nextMonthDate : zm:getToday(mailbox.prefs.timeZone)}", java.util.Calendar.class, (javax.servlet.jsp.PageContext)this.getJspContext(), _jspx_fnmap_1));
    // /WEB-INF/tags/calendar/multiDayPrintView.tag(53,12) name = rangeDate type = java.util.Calendar reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fminiCal_005f1.setRangeDate((java.util.Calendar) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty date ? date : zm:getToday(mailbox.prefs.timeZone)}", java.util.Calendar.class, (javax.servlet.jsp.PageContext)this.getJspContext(), _jspx_fnmap_1));
    // /WEB-INF/tags/calendar/multiDayPrintView.tag(53,12) name = checkedCalendars type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fminiCal_005f1.setCheckedCalendars((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${checkedCalendars}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    _jspx_th_app_005fminiCal_005f1.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_app_005fminiCal_005f1);
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
      // /WEB-INF/tags/calendar/multiDayPrintView.tag(33,4) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_zm_005fgetMailbox_005f0.setVar("mailbox");
      _jspx_th_zm_005fgetMailbox_005f0.doTag();
      _jsp_instancemanager.destroyInstance(_jspx_th_zm_005fgetMailbox_005f0);
      if (_jspx_meth_fmt_005fsetTimeZone_005f0(_jspx_parent, _jspx_page_context))
        return;
      if (_jspx_meth_c_005fset_005f0(_jspx_parent, _jspx_page_context))
        return;
      if (_jspx_meth_app_005fskin_005f0(_jspx_parent, _jspx_page_context))
        return;
      if (_jspx_meth_c_005fset_005f1(_jspx_parent, _jspx_page_context))
        return;
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
