/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat8
 * Generated at: 2017-12-07 23:24:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.webvoice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class doVoiceFolderTree_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/tags/imginfo.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/img.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/infra/status.tag", Long.valueOf(1512680905000L));
    _jspx_dependants.put("/WEB-INF/tags/voice/voiceFolder.tag", Long.valueOf(1512680905000L));
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
  private java.lang.String parentid;
  private java.lang.String skiproot;
  private java.lang.String skipsystem;
  private java.lang.String skiptopsearch;
  private java.lang.String skiptrash;
  private com.zimbra.cs.taglib.bean.ZFolderBean parentfolder;

  public java.lang.String getParentid() {
    return this.parentid;
  }

  public void setParentid(java.lang.String parentid) {
    this.parentid = parentid;
    jspContext.setAttribute("parentid", parentid);
  }

  public java.lang.String getSkiproot() {
    return this.skiproot;
  }

  public void setSkiproot(java.lang.String skiproot) {
    this.skiproot = skiproot;
    jspContext.setAttribute("skiproot", skiproot);
  }

  public java.lang.String getSkipsystem() {
    return this.skipsystem;
  }

  public void setSkipsystem(java.lang.String skipsystem) {
    this.skipsystem = skipsystem;
    jspContext.setAttribute("skipsystem", skipsystem);
  }

  public java.lang.String getSkiptopsearch() {
    return this.skiptopsearch;
  }

  public void setSkiptopsearch(java.lang.String skiptopsearch) {
    this.skiptopsearch = skiptopsearch;
    jspContext.setAttribute("skiptopsearch", skiptopsearch);
  }

  public java.lang.String getSkiptrash() {
    return this.skiptrash;
  }

  public void setSkiptrash(java.lang.String skiptrash) {
    this.skiptrash = skiptrash;
    jspContext.setAttribute("skiptrash", skiptrash);
  }

  public com.zimbra.cs.taglib.bean.ZFolderBean getParentfolder() {
    return this.parentfolder;
  }

  public void setParentfolder(com.zimbra.cs.taglib.bean.ZFolderBean parentfolder) {
    this.parentfolder = parentfolder;
    jspContext.setAttribute("parentfolder", parentfolder);
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
    if( getParentid() != null ) 
      _jspx_page_context.setAttribute("parentid", getParentid());
    if( getSkiproot() != null ) 
      _jspx_page_context.setAttribute("skiproot", getSkiproot());
    if( getSkipsystem() != null ) 
      _jspx_page_context.setAttribute("skipsystem", getSkipsystem());
    if( getSkiptopsearch() != null ) 
      _jspx_page_context.setAttribute("skiptopsearch", getSkiptopsearch());
    if( getSkiptrash() != null ) 
      _jspx_page_context.setAttribute("skiptrash", getSkiptrash());
    if( getParentfolder() != null ) 
      _jspx_page_context.setAttribute("parentfolder", getParentfolder());

    try {
      //  app:handleError
      org.apache.jsp.tag.webinfra.handleError_tag _jspx_th_app_005fhandleError_005f0 = (new org.apache.jsp.tag.webinfra.handleError_tag());
      _jsp_instancemanager.newInstance(_jspx_th_app_005fhandleError_005f0);
      _jspx_th_app_005fhandleError_005f0.setJspContext(_jspx_page_context);
      _jspx_th_app_005fhandleError_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      _jspx_th_app_005fhandleError_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_app_005fhandleError_005f0, null));
      _jspx_th_app_005fhandleError_005f0.doTag();
      _jsp_instancemanager.destroyInstance(_jspx_th_app_005fhandleError_005f0);
      //  zm:forEachFolder
      com.zimbra.cs.taglib.tag.ForEachFolderTag _jspx_th_zm_005fforEachFolder_005f0 = (new com.zimbra.cs.taglib.tag.ForEachFolderTag());
      _jsp_instancemanager.newInstance(_jspx_th_zm_005fforEachFolder_005f0);
      _jspx_th_zm_005fforEachFolder_005f0.setJspContext(_jspx_page_context);
      _jspx_th_zm_005fforEachFolder_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) this ));      // /WEB-INF/tags/voice/doVoiceFolderTree.tag(34,0) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_zm_005fforEachFolder_005f0.setVar("folder");
      // /WEB-INF/tags/voice/doVoiceFolderTree.tag(34,0) name = skiproot type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_zm_005fforEachFolder_005f0.setSkiproot(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${skiproot}", boolean.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null)).booleanValue());
      // /WEB-INF/tags/voice/doVoiceFolderTree.tag(34,0) name = parentfolder type = com.zimbra.cs.taglib.bean.ZFolderBean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_zm_005fforEachFolder_005f0.setParentfolder((com.zimbra.cs.taglib.bean.ZFolderBean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${parentfolder}", com.zimbra.cs.taglib.bean.ZFolderBean.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      // /WEB-INF/tags/voice/doVoiceFolderTree.tag(34,0) name = skipsystem type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_zm_005fforEachFolder_005f0.setSkipsystem(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${skipsystem}", boolean.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null)).booleanValue());
      // /WEB-INF/tags/voice/doVoiceFolderTree.tag(34,0) name = expanded type = java.util.Map reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_zm_005fforEachFolder_005f0.setExpanded((java.util.Map) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.expanded}", java.util.Map.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
      // /WEB-INF/tags/voice/doVoiceFolderTree.tag(34,0) name = skiptopsearch type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_zm_005fforEachFolder_005f0.setSkiptopsearch(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${skiptopsearch}", boolean.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null)).booleanValue());
      // /WEB-INF/tags/voice/doVoiceFolderTree.tag(34,0) name = skiptrash type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_zm_005fforEachFolder_005f0.setSkiptrash(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${skiptrash}", boolean.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null)).booleanValue());
      _jspx_th_zm_005fforEachFolder_005f0.setJspBody(new Helper( 1, _jspx_page_context, _jspx_th_zm_005fforEachFolder_005f0, null));
      _jspx_th_zm_005fforEachFolder_005f0.doTag();
      _jsp_instancemanager.destroyInstance(_jspx_th_zm_005fforEachFolder_005f0);
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

  private boolean _jspx_meth_app_005fvoiceFolder_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  app:voiceFolder
    org.apache.jsp.tag.webvoice.voiceFolder_tag _jspx_th_app_005fvoiceFolder_005f0 = (new org.apache.jsp.tag.webvoice.voiceFolder_tag());
    _jsp_instancemanager.newInstance(_jspx_th_app_005fvoiceFolder_005f0);
    _jspx_th_app_005fvoiceFolder_005f0.setJspContext(_jspx_page_context);
    _jspx_th_app_005fvoiceFolder_005f0.setParent(_jspx_parent);
    // /WEB-INF/tags/voice/doVoiceFolderTree.tag(35,4) name = folder type = com.zimbra.cs.taglib.bean.ZFolderBean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_app_005fvoiceFolder_005f0.setFolder((com.zimbra.cs.taglib.bean.ZFolderBean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${folder}", com.zimbra.cs.taglib.bean.ZFolderBean.class, (javax.servlet.jsp.PageContext)this.getJspContext(), null));
    _jspx_th_app_005fvoiceFolder_005f0.doTag();
    _jsp_instancemanager.destroyInstance(_jspx_th_app_005fvoiceFolder_005f0);
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
      // /WEB-INF/tags/voice/doVoiceFolderTree.tag(31,4) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_zm_005fgetMailbox_005f0.setVar("mailbox");
      _jspx_th_zm_005fgetMailbox_005f0.doTag();
      _jsp_instancemanager.destroyInstance(_jspx_th_zm_005fgetMailbox_005f0);
      return;
    }
    public void invoke1( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      if (_jspx_meth_app_005fvoiceFolder_005f0(_jspx_parent, _jspx_page_context))
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
