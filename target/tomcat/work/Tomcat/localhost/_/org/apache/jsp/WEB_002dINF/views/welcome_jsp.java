/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-11-12 09:59:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/styles/welcome.css", Long.valueOf(1573549405192L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Welcome page content</title>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Noto+Sans&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <style>");
      out.write("body{\r\n");
      out.write("    background: linear-gradient(rgba(255,255,255,0.9),rgba(255,255,255,0.9)),\r\n");
      out.write("    url(/images/gavel_image.jpg);\r\n");
      out.write("    background-size: cover;\r\n");
      out.write("    font-family: 'Noto Sans', sans-serif;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("section{\r\n");
      out.write("    margin-top: 6%;\r\n");
      out.write("    display: grid;\r\n");
      out.write("    grid-template-columns: auto auto auto;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    grid-gap: 20%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".top,p{\r\n");
      out.write("    color:#707070;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1{\r\n");
      out.write("    margin-top: 3%;\r\n");
      out.write("    font-size: 2em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".top{\r\n");
      out.write("    font-size: 1.1em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1,.top{\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img{\r\n");
      out.write("    height: 150px;\r\n");
      out.write("    max-width: 150px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a{\r\n");
      out.write("    display: grid;\r\n");
      out.write("    grid-template-columns: auto auto;\r\n");
      out.write("    text-decoration-line: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a p,.description h3{\r\n");
      out.write("    color: #804242;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a p{\r\n");
      out.write("    margin-top: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".links{\r\n");
      out.write("    height: 20px;\r\n");
      out.write("    max-width: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>Welcome to the Case Management system</h1>\r\n");
      out.write("<h3 class=\"top\">Click on one of these links to start</h3>\r\n");
      out.write("<section>\r\n");
      out.write("    <div class=\"description\">\r\n");
      out.write("        <img src=\"/images/lawyer.png\">\r\n");
      out.write("        <h3>Lawyers</h3>\r\n");
      out.write("        <p>File a claim on the<br>\r\n");
      out.write("            system in 4 easy-to-<br>\r\n");
      out.write("            follow steps.</p>\r\n");
      out.write("        <a href=\"/file.co\">\r\n");
      out.write("            <p><strong>File a claim</strong></p>\r\n");
      out.write("            <img class=\"links\" src=\"/images/arrow_icon.png\">\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"description\">\r\n");
      out.write("        <img src=\"/images/registrar.png\">\r\n");
      out.write("        <h3>Court Registrars</h3>\r\n");
      out.write("        <p>Login to your dashboard to<br>\r\n");
      out.write("            view filed cases and approve<br>\r\n");
      out.write("            a case for designation.</p>\r\n");
      out.write("        <a href=\"/login.co\">\r\n");
      out.write("            <p><strong>Login to Dashboard</strong></p>\r\n");
      out.write("            <img class=\"links\" src=\"/images/arrow_icon.png\">\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"description\">\r\n");
      out.write("        <img src=\"/images/gavel.png\">\r\n");
      out.write("        <h3>Judges</h3>\r\n");
      out.write("        <p>Login to your dashboard to<br>\r\n");
      out.write("            view cases on your<br>\r\n");
      out.write("            calendar.</p>\r\n");
      out.write("        <a href=\"/login.co\">\r\n");
      out.write("            <strong><p>Login to Dashboard</p></strong>\r\n");
      out.write("            <img class=\"links\" src=\"/images/arrow_icon.png\">\r\n");
      out.write("        </a>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
