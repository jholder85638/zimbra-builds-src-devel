/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat8
 * Generated at: 2017-12-14 21:09:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.webcompose;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class yuiInclude_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/tags/spellcheck.tag", Long.valueOf(1512680905000L));
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

    try {
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../yui/2.7.0/assets/skins/sam/skin.css\" />\n<style type=\"text/css\" media=\"screen\">\n    .yui-skin-sam .yui-toolbar-container .yui-toolbar-spellcheck span.yui-toolbar-icon {\n        background-image: url( ../yui/spellcheck/img/ImgSpellCheck.gif );\n        background-position: 1px 0px;\n        top: 1px;\n        left: 4px;\n    }\n    .yui-skin-sam .yui-toolbar-container .yui-toolbar-spellcheck-selected span.yui-toolbar-icon {\n        background-image: url( ../yui/spellcheck/img/ImgSpellCheck.gif );\n        background-position: 1px 0px;\n        top: 1px;\n        left: 4px;\n    }\n    .yui-spellcheck-list {\n        cursor: pointer;\n    }\n    .yui-skin-sam .yui-editor-panel .yui-spellcheck-list li {\n        padding-left: 5px;\n    }\n</style>\n\n<script type=\"text/javascript\" src=\"../yui/2.7.0/yahoo-dom-event/yahoo-dom-event.js\"></script>\n<script type=\"text/javascript\" src=\"../yui/2.7.0/animation/animation-min.js\"></script>\n<script type=\"text/javascript\" src=\"../yui/2.7.0/element/element-min.js\"></script>\n");
      out.write("<!-- Needed for Menus, Buttons and Overlays used in the Toolbar -->\n<script type=\"text/javascript\" src=\"../yui/2.7.0/container/container_core-min.js\"></script>\n<script type=\"text/javascript\" src=\"../yui/2.7.0/menu/menu-min.js\"></script>\n<script type=\"text/javascript\" src=\"../yui/2.7.0/button/button-min.js\"></script>\n<!-- Source file for Rich Text Editor-->\n<script type=\"text/javascript\" src=\"../yui/2.7.0/editor/editor-min.js\"></script>\n");
      if (_jspx_meth_app_005fspellcheck_005f0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_app_005fspellcheck_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  app:spellcheck
    org.apache.jsp.tag.webspellcheck_tag _jspx_th_app_005fspellcheck_005f0 = (new org.apache.jsp.tag.webspellcheck_tag());
    _jsp_instancemanager.newInstance(_jspx_th_app_005fspellcheck_005f0);
    _jspx_th_app_005fspellcheck_005f0.setJspContext(_jspx_page_context);
    _jspx_th_app_005fspellcheck_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));    _jspx_th_app_005fspellcheck_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_app_005fspellcheck_005f0);
    return false;
  }
}
