/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat8
 * Generated at: 2017-12-14 21:09:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.webvoice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class callListViewToolbar_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(9);
    _jspx_dependants.put("/WEB-INF/tags/searchPageOffset.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("jar:file:/root/.ivy2/cache/zimbra/zm-taglib/jars/zm-taglib-8.7.0.1505720459.jar!/META-INF/tags/currentResultUrl.tag", Long.valueOf(1512680894000L));
    _jspx_dependants.put("jar:file:/root/.ivy2/cache/zimbra/zm-taglib/jars/zm-taglib-8.7.0.1505720459.jar!/META-INF/tags/nextResultUrl.tag", Long.valueOf(1512680894000L));
    _jspx_dependants.put("jar:file:/root/.ivy2/cache/zimbra/zm-taglib/jars/zm-taglib-8.7.0.1505720459.jar!/META-INF/tags/prevResultUrl.tag", Long.valueOf(1512680894000L));
    _jspx_dependants.put("jar:file:/root/.ivy2/cache/zimbra/zm-taglib/jars/zm-taglib-8.7.0.1505720459.jar!/META-INF/zm.tld", Long.valueOf(1512680894000L));
    _jspx_dependants.put("/WEB-INF/tags/imginfo.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/img.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/searchPageLeft.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/searchPageRight.tag", Long.valueOf(1512680905000L));
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

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
  private java.lang.String keys;

  public com.zimbra.cs.taglib.tag.SearchContext getContext() {
    return this.context;
  }

  public void setContext(com.zimbra.cs.taglib.tag.SearchContext context) {
    this.context = context;
    jspContext.setAttribute("context", context);
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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(config);
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest_005fnobody.release();
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
    if( getKeys() != null ) 
      _jspx_page_context.setAttribute("keys", getKeys());

    try {
      out.write("<table width=100% cellspacing=0 cellpadding=0 class='Tb'>\n    <tr valign=\"middle\">\n        <td class='TbBt'>\n            <table cellspacing=0 cellpadding=0 class='Tb'>\n                <td nowrap>\n                    ");
      //  zm:currentResultUrl
      org.apache.jsp.tag.meta.com_zimbra_zm.currentResultUrl_tag _jspx_th_zm_005fcurrentResultUrl_005f0 = (new org.apache.jsp.tag.meta.com_zimbra_zm.currentResultUrl_tag());
      _jsp_instancemanager.newInstance(_jspx_th_zm_005fcurrentResultUrl_005f0);
      java.util.HashMap _jspx_th_zm_005fcurrentResultUrl_005f0_aliasMap = new java.util.HashMap();
      _jspx_th_zm_005fcurrentResultUrl_005f0_aliasMap.put("urlVar", "refreshUrl");
      _jspx_th_zm_005fcurrentResultUrl_005f0.setJspContext(_jspx_page_context, _jspx_th_zm_005fcurrentResultUrl_005f0_aliasMap);
      _jspx_th_zm_005fcurrentResultUrl_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/voice/callListViewToolbar.tag(31,20) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_zm_005fcurrentResultUrl_005f0.setVar("refreshUrl");
      // /WEB-INF/tags/voice/callListViewToolbar.tag(31,20) name = value type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_zm_005fcurrentResultUrl_005f0.setValue("/h/search");
      // /WEB-INF/tags/voice/callListViewToolbar.tag(31,20) name = context type = com.zimbra.cs.taglib.tag.SearchContext reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_zm_005fcurrentResultUrl_005f0.setContext((com.zimbra.cs.taglib.tag.SearchContext) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", com.zimbra.cs.taglib.tag.SearchContext.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      // /WEB-INF/tags/voice/callListViewToolbar.tag(31,20) name = refresh type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_zm_005fcurrentResultUrl_005f0.setRefresh("true");
      _jspx_th_zm_005fcurrentResultUrl_005f0.doTag();
      _jsp_instancemanager.destroyInstance(_jspx_th_zm_005fcurrentResultUrl_005f0);
      out.write("<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${refreshUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      out.write('"');
      out.write('>');
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_app_005fimg_005f0(_jspx_page_context))
        return;
      out.write("<span>");
      if (_jspx_meth_fmt_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("</span></a>\n                </td>\n                <td><div class='vertSep'></div></td>\n                <td nowrap>\n\t\t\t\t\t");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
          // /WEB-INF/tags/voice/callListViewToolbar.tag(37,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context.searchResult.size > 0}", boolean.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null)).booleanValue());
          int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
          if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              //  zm:currentResultUrl
              org.apache.jsp.tag.meta.com_zimbra_zm.currentResultUrl_tag _jspx_th_zm_005fcurrentResultUrl_005f1 = (new org.apache.jsp.tag.meta.com_zimbra_zm.currentResultUrl_tag());
              _jsp_instancemanager.newInstance(_jspx_th_zm_005fcurrentResultUrl_005f1);
              java.util.HashMap _jspx_th_zm_005fcurrentResultUrl_005f1_aliasMap = new java.util.HashMap();
              _jspx_th_zm_005fcurrentResultUrl_005f1_aliasMap.put("urlVar", "refreshUrl");
              _jspx_th_zm_005fcurrentResultUrl_005f1.setJspContext(_jspx_page_context, _jspx_th_zm_005fcurrentResultUrl_005f1_aliasMap);
              _jspx_th_zm_005fcurrentResultUrl_005f1.setParent(_jspx_th_c_005fwhen_005f0);
              // /WEB-INF/tags/voice/callListViewToolbar.tag(38,7) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
              _jspx_th_zm_005fcurrentResultUrl_005f1.setVar("refreshUrl");
              // /WEB-INF/tags/voice/callListViewToolbar.tag(38,7) name = value type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
              _jspx_th_zm_005fcurrentResultUrl_005f1.setValue("/h/printcalls");
              // /WEB-INF/tags/voice/callListViewToolbar.tag(38,7) name = context type = com.zimbra.cs.taglib.tag.SearchContext reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
              _jspx_th_zm_005fcurrentResultUrl_005f1.setContext((com.zimbra.cs.taglib.tag.SearchContext) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", com.zimbra.cs.taglib.tag.SearchContext.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
              // /WEB-INF/tags/voice/callListViewToolbar.tag(38,7) name = refresh type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
              _jspx_th_zm_005fcurrentResultUrl_005f1.setRefresh("true");
              _jspx_th_zm_005fcurrentResultUrl_005f1.doTag();
              _jsp_instancemanager.destroyInstance(_jspx_th_zm_005fcurrentResultUrl_005f1);
              out.write("<a id=\"OPPRINT\" target=\"_blank\" href=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${refreshUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
              out.write('"');
              out.write('>');
              if (_jspx_meth_app_005fimg_005f1(_jspx_th_c_005fwhen_005f0, _jspx_page_context))
                return;
              out.write("</a>\n\t\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
            throw new javax.servlet.jsp.SkipPageException();
          }
          _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return;
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
        throw new javax.servlet.jsp.SkipPageException();
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      out.write("</td>\n                ");
      out.write("</table>\n        </td>\n        <td nowrap align=right>\n            ");
      if (_jspx_meth_app_005fsearchPageLeft_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_app_005fsearchPageOffset_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_app_005fsearchPageRight_005f0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/voice/callListViewToolbar.tag(32,44) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${keys}", boolean.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest_005fnobody.reuse(_jspx_th_c_005fif_005f0);
      throw new javax.servlet.jsp.SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest_005fnobody.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_app_005fimg_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  app:img
    org.apache.jsp.tag.webimg_tag _jspx_th_app_005fimg_005f0 = (new org.apache.jsp.tag.webimg_tag());
    _jsp_instancemanager.newInstance(_jspx_th_app_005fimg_005f0);
    _jspx_th_app_005fimg_005f0.setJspContext(_jspx_page_context);
    _jspx_th_app_005fimg_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/voice/callListViewToolbar.tag(32,72) name = src type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fimg_005f0.setSrc("startup/ImgRefresh.png");
    // /WEB-INF/tags/voice/callListViewToolbar.tag(32,72) name = altkey type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fimg_005f0.setAltkey("getCalls");
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
    _jspx_th_fmt_005fmessage_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/voice/callListViewToolbar.tag(32,135) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f0.setKey("getCalls");
    int _jspx_eval_fmt_005fmessage_005f0 = _jspx_th_fmt_005fmessage_005f0.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
      throw new javax.servlet.jsp.SkipPageException();
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_app_005fimg_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  app:img
    org.apache.jsp.tag.webimg_tag _jspx_th_app_005fimg_005f1 = (new org.apache.jsp.tag.webimg_tag());
    _jsp_instancemanager.newInstance(_jspx_th_app_005fimg_005f1);
    _jspx_th_app_005fimg_005f1.setJspContext(_jspx_page_context);
    _jspx_th_app_005fimg_005f1.setParent(_jspx_th_c_005fwhen_005f0);
    // /WEB-INF/tags/voice/callListViewToolbar.tag(39,60) name = src type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fimg_005f1.setSrc("startup/ImgPrint.png");
    // /WEB-INF/tags/voice/callListViewToolbar.tag(39,60) name = altkey type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fimg_005f1.setAltkey("actionPrint");
    _jspx_th_app_005fimg_005f1.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_app_005fimg_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('<');
        out.write('a');
        out.write('>');
        if (_jspx_meth_app_005fimg_005f2(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
          return true;
        out.write("</a>\n\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      throw new javax.servlet.jsp.SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }

  private boolean _jspx_meth_app_005fimg_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  app:img
    org.apache.jsp.tag.webimg_tag _jspx_th_app_005fimg_005f2 = (new org.apache.jsp.tag.webimg_tag());
    _jsp_instancemanager.newInstance(_jspx_th_app_005fimg_005f2);
    _jspx_th_app_005fimg_005f2.setJspContext(_jspx_page_context);
    _jspx_th_app_005fimg_005f2.setParent(_jspx_th_c_005fotherwise_005f0);
    // /WEB-INF/tags/voice/callListViewToolbar.tag(43,10) name = src type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fimg_005f2.setSrc("startup/ImgPrint.png");
    // /WEB-INF/tags/voice/callListViewToolbar.tag(43,10) name = altkey type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fimg_005f2.setAltkey("actionPrint");
    // /WEB-INF/tags/voice/callListViewToolbar.tag(43,10) name = clazz type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fimg_005f2.setClazz("ImgDisabled");
    _jspx_th_app_005fimg_005f2.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_app_005fimg_005f2);
    return false;
  }

  private boolean _jspx_meth_app_005fsearchPageLeft_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  app:searchPageLeft
    org.apache.jsp.tag.websearchPageLeft_tag _jspx_th_app_005fsearchPageLeft_005f0 = (new org.apache.jsp.tag.websearchPageLeft_tag());
    _jsp_instancemanager.newInstance(_jspx_th_app_005fsearchPageLeft_005f0);
    _jspx_th_app_005fsearchPageLeft_005f0.setJspContext(_jspx_page_context);
    _jspx_th_app_005fsearchPageLeft_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/voice/callListViewToolbar.tag(58,12) name = keys type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fsearchPageLeft_005f0.setKeys((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${keys}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    // /WEB-INF/tags/voice/callListViewToolbar.tag(58,12) name = context type = com.zimbra.cs.taglib.tag.SearchContext reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fsearchPageLeft_005f0.setContext((com.zimbra.cs.taglib.tag.SearchContext) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", com.zimbra.cs.taglib.tag.SearchContext.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    // /WEB-INF/tags/voice/callListViewToolbar.tag(58,12) name = urlTarget type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fsearchPageLeft_005f0.setUrlTarget("/h/search");
    _jspx_th_app_005fsearchPageLeft_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_app_005fsearchPageLeft_005f0);
    return false;
  }

  private boolean _jspx_meth_app_005fsearchPageOffset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  app:searchPageOffset
    org.apache.jsp.tag.websearchPageOffset_tag _jspx_th_app_005fsearchPageOffset_005f0 = (new org.apache.jsp.tag.websearchPageOffset_tag());
    _jsp_instancemanager.newInstance(_jspx_th_app_005fsearchPageOffset_005f0);
    _jspx_th_app_005fsearchPageOffset_005f0.setJspContext(_jspx_page_context);
    _jspx_th_app_005fsearchPageOffset_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/voice/callListViewToolbar.tag(59,12) name = searchResult type = com.zimbra.cs.taglib.bean.ZSearchResultBean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fsearchPageOffset_005f0.setSearchResult((com.zimbra.cs.taglib.bean.ZSearchResultBean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context.searchResult}", com.zimbra.cs.taglib.bean.ZSearchResultBean.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    _jspx_th_app_005fsearchPageOffset_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_app_005fsearchPageOffset_005f0);
    return false;
  }

  private boolean _jspx_meth_app_005fsearchPageRight_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  app:searchPageRight
    org.apache.jsp.tag.websearchPageRight_tag _jspx_th_app_005fsearchPageRight_005f0 = (new org.apache.jsp.tag.websearchPageRight_tag());
    _jsp_instancemanager.newInstance(_jspx_th_app_005fsearchPageRight_005f0);
    _jspx_th_app_005fsearchPageRight_005f0.setJspContext(_jspx_page_context);
    _jspx_th_app_005fsearchPageRight_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    // /WEB-INF/tags/voice/callListViewToolbar.tag(60,12) name = keys type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fsearchPageRight_005f0.setKeys((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${keys}", java.lang.String.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    // /WEB-INF/tags/voice/callListViewToolbar.tag(60,12) name = context type = com.zimbra.cs.taglib.tag.SearchContext reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fsearchPageRight_005f0.setContext((com.zimbra.cs.taglib.tag.SearchContext) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", com.zimbra.cs.taglib.tag.SearchContext.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    // /WEB-INF/tags/voice/callListViewToolbar.tag(60,12) name = urlTarget type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fsearchPageRight_005f0.setUrlTarget("/h/search");
    _jspx_th_app_005fsearchPageRight_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_app_005fsearchPageRight_005f0);
    return false;
  }
}