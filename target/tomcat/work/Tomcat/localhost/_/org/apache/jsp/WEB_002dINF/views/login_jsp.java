/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-11-19 18:45:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/styles/login.css", Long.valueOf(1574119760065L));
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Login Page Content</title>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Noto+Sans&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <style>");
      out.write("body{\r\n");
      out.write("    background: linear-gradient(rgba(255,255,255,0.9),rgba(255,255,255,0.9)),\r\n");
      out.write("    url(/images/gavel_image.jpg);\r\n");
      out.write("    background-size: cover;\r\n");
      out.write("    font-family: 'Noto Sans', sans-serif;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("h1{\r\n");
      out.write("    margin-top: 3%;\r\n");
      out.write("    font-size: 2em;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h3{\r\n");
      out.write("    font-size: 1.1em ;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    color:#707070;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form{\r\n");
      out.write("    display: grid;\r\n");
      out.write("    grid-template-rows: auto auto auto;\r\n");
      out.write("    grid-gap: 6%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div{\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    background-color: #f2f2f2;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("    margin-top: 6%;\r\n");
      out.write("    margin-left: 20%;\r\n");
      out.write("    height: 48%;\r\n");
      out.write("    width: 55%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button[type=submit] {\r\n");
      out.write("    width: 30%;\r\n");
      out.write("    background-color: #FFFFFF;\r\n");
      out.write("    color: #804242;\r\n");
      out.write("    padding: 14px 20px;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    border: 1px solid #707070;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    margin-left: 60%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button[name=next] {\r\n");
      out.write("    margin-top: -25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=email]{\r\n");
      out.write("    width: 90%;\r\n");
      out.write("    background-color: #FFFFFF;\r\n");
      out.write("    padding: 10px 16px;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    border: 1px solid #707070;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=password]{\r\n");
      out.write("    width: 90%;\r\n");
      out.write("    background-color: #FFFFFF;\r\n");
      out.write("    padding: 10px 16px;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    border: 1px solid #707070;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button[type=button]:hover {\r\n");
      out.write("    background-color: #804242;\r\n");
      out.write("    color: #FFFFFF;\r\n");
      out.write("}");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>Login Page for Court Registrars and Judges</h1>\r\n");
      out.write("<h3>Enter your Lagos high court email ending in .ng to access your dashboard</h3>\r\n");
      out.write("<div>\r\n");
      out.write("<form action=\"/login.co\" method=\"post\">\r\n");
      out.write("    Email:<br>\r\n");
      out.write("    <input type=\"email\" name=\"email\" placeholder=\"Enter your mail\"><br>\r\n");
      out.write("    Password:<br>\r\n");
      out.write("    <input type=\"password\" name=\"password\" placeholder=\"Enter your password\" title=\"Password must be at least 8 or more characters including 1 uppercase letter, 1 lowercase letter and numeric characters\"\r\n");
      out.write("           required pattern=\"(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}\"><br>\r\n");
      out.write("\r\n");
      out.write("    <!--TODO: if there is time, implement reset password functionality-->\r\n");
      out.write("    <button type=\"submit\"><strong>LOGIN TO DASHBOARD</strong></button>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
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
