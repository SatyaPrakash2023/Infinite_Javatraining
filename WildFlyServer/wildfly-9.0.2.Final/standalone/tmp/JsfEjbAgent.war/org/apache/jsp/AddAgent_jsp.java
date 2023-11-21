package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddAgent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ff_005fview;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fform;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005finputText_0026_005fvalue_005fid_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh_005fcommandButton_0026_005fvalue_005faction_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ff_005fview = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fform = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005finputText_0026_005fvalue_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fh_005fcommandButton_0026_005fvalue_005faction_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ff_005fview.release();
    _005fjspx_005ftagPool_005fh_005fform.release();
    _005fjspx_005ftagPool_005fh_005finputText_0026_005fvalue_005fid_005fnobody.release();
    _005fjspx_005ftagPool_005fh_005fcommandButton_0026_005fvalue_005faction_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      response.addHeader("X-Powered-By", "JSP/2.2");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      if (_jspx_meth_f_005fview_005f0(_jspx_page_context))
        return;
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_f_005fview_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:view
    com.sun.faces.taglib.jsf_core.ViewTag _jspx_th_f_005fview_005f0 = (com.sun.faces.taglib.jsf_core.ViewTag)_jsp_instancemanager.newInstance(com.sun.faces.taglib.jsf_core.ViewTag.class);
    _jspx_th_f_005fview_005f0.setPageContext(_jspx_page_context);
    _jspx_th_f_005fview_005f0.setParent(null);
    _jspx_th_f_005fview_005f0.setJspId("jsp_1766590375_0");
    int _jspx_eval_f_005fview_005f0 = _jspx_th_f_005fview_005f0.doStartTag();
    if (_jspx_eval_f_005fview_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_f_005fview_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_f_005fview_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_f_005fview_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("<html>\r\n");
        out.write("    <head>\r\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
        out.write("        <title>JSP Page</title>\r\n");
        out.write("    </head>\r\n");
        out.write("    <body>\r\n");
        out.write("        ");
        if (_jspx_meth_h_005fform_005f0(_jspx_th_f_005fview_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    </body>\r\n");
        out.write("</html>\r\n");
        int evalDoAfterBody = _jspx_th_f_005fview_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_f_005fview_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_f_005fview_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_f_005fview_005f0.release();
      _jsp_instancemanager.destroyInstance(_jspx_th_f_005fview_005f0);
      return true;
    }
    _jspx_th_f_005fview_005f0.release();
    _jsp_instancemanager.destroyInstance(_jspx_th_f_005fview_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005fform_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_005fview_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    com.sun.faces.taglib.html_basic.FormTag _jspx_th_h_005fform_005f0 = (com.sun.faces.taglib.html_basic.FormTag)_jsp_instancemanager.newInstance(com.sun.faces.taglib.html_basic.FormTag.class);
    _jspx_th_h_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_005fview_005f0);
    _jspx_th_h_005fform_005f0.setJspId("jsp_1766590375_1");
    int _jspx_eval_h_005fform_005f0 = _jspx_th_h_005fform_005f0.doStartTag();
    if (_jspx_eval_h_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_005fform_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                <h2 style=\"text-align: center\" class=\"col-sm-4\">Edit Your Record</h2>\r\n");
        out.write("            <hr/>\r\n");
        out.write("Agent Name\r\n");
        out.write("                    ");
        if (_jspx_meth_h_005finputText_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" <br/>\r\n");
        out.write("Agent City \r\n");
        out.write("                    ");
        if (_jspx_meth_h_005finputText_005f1(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" <br/>                    \r\n");
        out.write("Agent Gender \r\n");
        out.write("                    ");
        if (_jspx_meth_h_005finputText_005f2(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" <br/>\r\n");
        out.write("Agent MaritialStatus\r\n");
        out.write("                    ");
        if (_jspx_meth_h_005finputText_005f3(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write(" <br/>\r\n");
        out.write("\r\n");
        out.write("                    ");
        if (_jspx_meth_h_005fcommandButton_005f0(_jspx_th_h_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        \r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_h_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_h_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005fform_005f0.release();
      _jsp_instancemanager.destroyInstance(_jspx_th_h_005fform_005f0);
      return true;
    }
    _jspx_th_h_005fform_005f0.release();
    _jsp_instancemanager.destroyInstance(_jspx_th_h_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005finputText_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_005finputText_005f0 = (com.sun.faces.taglib.html_basic.InputTextTag)_jsp_instancemanager.newInstance(com.sun.faces.taglib.html_basic.InputTextTag.class);
    _jspx_th_h_005finputText_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005finputText_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /AddAgent.jsp(18,20) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005finputText_005f0.setId("name");
    // /AddAgent.jsp(18,20) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005finputText_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/AddAgent.jsp(18,20) '#{agent.name}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{agent.name}",java.lang.Object.class)));
    _jspx_th_h_005finputText_005f0.setJspId("jsp_1766590375_2");
    int _jspx_eval_h_005finputText_005f0 = _jspx_th_h_005finputText_005f0.doStartTag();
    if (_jspx_th_h_005finputText_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005finputText_005f0.release();
      _jsp_instancemanager.destroyInstance(_jspx_th_h_005finputText_005f0);
      return true;
    }
    _jspx_th_h_005finputText_005f0.release();
    _jsp_instancemanager.destroyInstance(_jspx_th_h_005finputText_005f0);
    return false;
  }

  private boolean _jspx_meth_h_005finputText_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_005finputText_005f1 = (com.sun.faces.taglib.html_basic.InputTextTag)_jsp_instancemanager.newInstance(com.sun.faces.taglib.html_basic.InputTextTag.class);
    _jspx_th_h_005finputText_005f1.setPageContext(_jspx_page_context);
    _jspx_th_h_005finputText_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /AddAgent.jsp(20,20) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005finputText_005f1.setId("gender");
    // /AddAgent.jsp(20,20) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005finputText_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/AddAgent.jsp(20,20) '#{agent.city}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{agent.city}",java.lang.Object.class)));
    _jspx_th_h_005finputText_005f1.setJspId("jsp_1766590375_3");
    int _jspx_eval_h_005finputText_005f1 = _jspx_th_h_005finputText_005f1.doStartTag();
    if (_jspx_th_h_005finputText_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005finputText_005f1.release();
      _jsp_instancemanager.destroyInstance(_jspx_th_h_005finputText_005f1);
      return true;
    }
    _jspx_th_h_005finputText_005f1.release();
    _jsp_instancemanager.destroyInstance(_jspx_th_h_005finputText_005f1);
    return false;
  }

  private boolean _jspx_meth_h_005finputText_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_005finputText_005f2 = (com.sun.faces.taglib.html_basic.InputTextTag)_jsp_instancemanager.newInstance(com.sun.faces.taglib.html_basic.InputTextTag.class);
    _jspx_th_h_005finputText_005f2.setPageContext(_jspx_page_context);
    _jspx_th_h_005finputText_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /AddAgent.jsp(22,20) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005finputText_005f2.setId("dept");
    // /AddAgent.jsp(22,20) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005finputText_005f2.setValue(new org.apache.jasper.el.JspValueExpression("/AddAgent.jsp(22,20) '#{agent.gender}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{agent.gender}",java.lang.Object.class)));
    _jspx_th_h_005finputText_005f2.setJspId("jsp_1766590375_4");
    int _jspx_eval_h_005finputText_005f2 = _jspx_th_h_005finputText_005f2.doStartTag();
    if (_jspx_th_h_005finputText_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005finputText_005f2.release();
      _jsp_instancemanager.destroyInstance(_jspx_th_h_005finputText_005f2);
      return true;
    }
    _jspx_th_h_005finputText_005f2.release();
    _jsp_instancemanager.destroyInstance(_jspx_th_h_005finputText_005f2);
    return false;
  }

  private boolean _jspx_meth_h_005finputText_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_005finputText_005f3 = (com.sun.faces.taglib.html_basic.InputTextTag)_jsp_instancemanager.newInstance(com.sun.faces.taglib.html_basic.InputTextTag.class);
    _jspx_th_h_005finputText_005f3.setPageContext(_jspx_page_context);
    _jspx_th_h_005finputText_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /AddAgent.jsp(24,20) name = id type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_h_005finputText_005f3.setId("desig");
    // /AddAgent.jsp(24,20) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005finputText_005f3.setValue(new org.apache.jasper.el.JspValueExpression("/AddAgent.jsp(24,20) '#{agent.maritalStatus}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"#{agent.maritalStatus}",java.lang.Object.class)));
    _jspx_th_h_005finputText_005f3.setJspId("jsp_1766590375_5");
    int _jspx_eval_h_005finputText_005f3 = _jspx_th_h_005finputText_005f3.doStartTag();
    if (_jspx_th_h_005finputText_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005finputText_005f3.release();
      _jsp_instancemanager.destroyInstance(_jspx_th_h_005finputText_005f3);
      return true;
    }
    _jspx_th_h_005finputText_005f3.release();
    _jsp_instancemanager.destroyInstance(_jspx_th_h_005finputText_005f3);
    return false;
  }

  private boolean _jspx_meth_h_005fcommandButton_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_h_005fcommandButton_005f0 = (com.sun.faces.taglib.html_basic.CommandButtonTag)_jsp_instancemanager.newInstance(com.sun.faces.taglib.html_basic.CommandButtonTag.class);
    _jspx_th_h_005fcommandButton_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h_005fcommandButton_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_005fform_005f0);
    // /AddAgent.jsp(26,20) name = value type = javax.el.ValueExpression reqTime = false required = false fragment = false deferredValue = true deferredMethod = false expectedTypeName = java.lang.Object methodSignature = null 
    _jspx_th_h_005fcommandButton_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/AddAgent.jsp(26,20) 'Update'",_el_expressionfactory.createValueExpression("Update",java.lang.Object.class)));
    // /AddAgent.jsp(26,20) name = action type = javax.el.MethodExpression reqTime = false required = false fragment = false deferredValue = false deferredMethod = true expectedTypeName = null methodSignature = java.lang.Object action() 
    _jspx_th_h_005fcommandButton_005f0.setAction(new org.apache.jasper.el.JspMethodExpression("/AddAgent.jsp(26,20) '#{ejbImpl.addAgentEjb(agent)}'",_el_expressionfactory.createMethodExpression(_jspx_page_context.getELContext(),"#{ejbImpl.addAgentEjb(agent)}",java.lang.Object.class,new Class[] {})));
    _jspx_th_h_005fcommandButton_005f0.setJspId("jsp_1766590375_6");
    int _jspx_eval_h_005fcommandButton_005f0 = _jspx_th_h_005fcommandButton_005f0.doStartTag();
    if (_jspx_th_h_005fcommandButton_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_th_h_005fcommandButton_005f0.release();
      _jsp_instancemanager.destroyInstance(_jspx_th_h_005fcommandButton_005f0);
      return true;
    }
    _jspx_th_h_005fcommandButton_005f0.release();
    _jsp_instancemanager.destroyInstance(_jspx_th_h_005fcommandButton_005f0);
    return false;
  }
}
