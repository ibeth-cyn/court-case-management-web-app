/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-12-13 08:52:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forms_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/styles/forms.css", Long.valueOf(1576224550067L));
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
      out.write("    <title>Typical forms page content</title>\r\n");
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
      out.write("h1 {\r\n");
      out.write("    margin-top: 3%;\r\n");
      out.write("    font-size: 2em;\r\n");
      out.write("    margin-left: 5%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#progressbar {\r\n");
      out.write("    counter-reset: step;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#progressbar li {\r\n");
      out.write("    list-style-type: none;\r\n");
      out.write("    width: 25%;\r\n");
      out.write("    float: left;\r\n");
      out.write("    font-size: 12px;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    color: #7d7d7d;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#progressbar li:before {\r\n");
      out.write("    width: 30px;\r\n");
      out.write("    height: 30px;\r\n");
      out.write("    content: counter(step);\r\n");
      out.write("    counter-increment: step;\r\n");
      out.write("    line-height: 30px;\r\n");
      out.write("    border: 1px solid #804242;\r\n");
      out.write("    display: block;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    margin: 0 auto 10px auto;\r\n");
      out.write("    border-radius: 50%;\r\n");
      out.write("    background-color: white;\r\n");
      out.write("}\r\n");
      out.write("#progressbar li:after {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 2px;\r\n");
      out.write("    content: '';\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    background-color: #000000;\r\n");
      out.write("    top: 15px;\r\n");
      out.write("    left: -50%;\r\n");
      out.write("    z-index: -1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#progressbar li:first-child:after {\r\n");
      out.write("    content: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#progressbar li.active {\r\n");
      out.write("    color: #804242;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#progressbar li.active + li:after {\r\n");
      out.write("    background-color: #804242;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#progressbar li.active:before,  #progressbar li.active:after{\r\n");
      out.write("    background: #804242;\r\n");
      out.write("    color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("form{\r\n");
      out.write("    margin-top: 3%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("p{\r\n");
      out.write("    color: black;\r\n");
      out.write("    font-size: 1.5em;\r\n");
      out.write("    margin-left: 13%;\r\n");
      out.write("    margin-top: 5%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".rad{\r\n");
      out.write("    display: grid;\r\n");
      out.write("    grid-template-columns: 5% 95%;\r\n");
      out.write("    grid-template-rows: auto auto;\r\n");
      out.write("    grid-row-gap: 30%;\r\n");
      out.write("    margin-left: 20%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".rad p{\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    font-size: 1.3em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inp p{\r\n");
      out.write("    font-size: 1.3em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button[type=button] {\r\n");
      out.write("    width: 15%;\r\n");
      out.write("    background-color: #FFFFFF;\r\n");
      out.write("    color: #804242;\r\n");
      out.write("    padding: 12px 18px;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    border: 1px solid #707070;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button[type=button]:hover {\r\n");
      out.write("    background-color: #804242;\r\n");
      out.write("    color: #FFFFFF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button[name=prev] {\r\n");
      out.write("    width: 15%;\r\n");
      out.write("    background-color: #a0a0a0;\r\n");
      out.write("    color: #FFFFFF;\r\n");
      out.write("    padding: 12px 18px;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    border: 1px solid #707070;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    margin-left: 75%;\r\n");
      out.write("    margin-top: 5%;\r\n");
      out.write("    margin-right: 100px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button[name=prev] {\r\n");
      out.write("    width: 15%;\r\n");
      out.write("    background-color: #a0a0a0;\r\n");
      out.write("    color: #FFFFFF;\r\n");
      out.write("    padding: 12px 18px;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    border: 1px solid #707070;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    margin-left: 75%;\r\n");
      out.write("    margin-top: 5%;\r\n");
      out.write("    margin-right: 100px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button[type=submit] {\r\n");
      out.write("    width: 15%;\r\n");
      out.write("    background-color: #FFFFFF;\r\n");
      out.write("    color: #804242;\r\n");
      out.write("    padding: 12px 18px;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    border: 1px solid #707070;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button[type=submit]:hover {\r\n");
      out.write("    background-color: #804242;\r\n");
      out.write("    color: #FFFFFF;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inp{\r\n");
      out.write("  display: grid;\r\n");
      out.write("    grid-template-columns: 30% 70%;\r\n");
      out.write("    grid-row-gap: 15%;\r\n");
      out.write("    grid-template-rows: auto auto auto auto;\r\n");
      out.write("    margin-left: 16%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=text]{\r\n");
      out.write("    width: 65%;\r\n");
      out.write("    background-color: #FFFFFF;\r\n");
      out.write("    margin-bottom: 3%;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    border: 1px solid #707070;\r\n");
      out.write("    height: 40px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=email]{\r\n");
      out.write("    width: 65%;\r\n");
      out.write("    background-color: #FFFFFF;\r\n");
      out.write("    margin-bottom: 3%;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    border: 1px solid #707070;\r\n");
      out.write("    height: 40px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=textbox]{\r\n");
      out.write("    width: 65%;\r\n");
      out.write("    background-color: #FFFFFF;\r\n");
      out.write("    margin-bottom: 3%;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    border: 1px solid #707070;\r\n");
      out.write("    height: 80px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inp p{\r\n");
      out.write("    margin-top: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".pages .previous{\r\n");
      out.write("    margin-left: 50%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input.invalid {\r\n");
      out.write("    background-color: #beacac;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>Filing a Claim Procedure</h1>\r\n");
      out.write("<form id=\"fileClaim\" action= \"/file.co\" method=\"post\">\r\n");
      out.write("    <!--Progress bar -->\r\n");
      out.write("    <ul id=\"progressbar\">\r\n");
      out.write("        <li class=\"active\">Claimant information</li>\r\n");
      out.write("        <li>Defendant information</li>\r\n");
      out.write("        <li>Claim Details</li>\r\n");
      out.write("        <li>Claim Documents</li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <br><br><br>\r\n");
      out.write("    <div id= \"one\">\r\n");
      out.write("        <p>Are you an individual, a law firm or an organisation? <strong>*</strong></p><br>\r\n");
      out.write("        <div class=\"rad\">\r\n");
      out.write("            <input class= \"individual\" type=\"radio\" name=\"radio\" id=\"yes\">\r\n");
      out.write("            <p>An individual</p>\r\n");
      out.write("            <input class=\"group\" type=\"radio\" name=\"radio\" id=\"no\">\r\n");
      out.write("            <p>A law firm or an organization</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <button class=\"next\" name=\"next\" type=\"button\" style=\"margin-top: 5%; margin-left: 75%;\" onclick=\"checked()\"><strong>NEXT</strong></button>\r\n");
      out.write("        </div>\r\n");
      out.write("    <div class=\"pages\" id=\"val1\" style=\"display: none;\">\r\n");
      out.write("        <p>What is your full name? <strong>*</strong></p><br>\r\n");
      out.write("        <div class=\"inp\">\r\n");
      out.write("                <p>First and middle name</p>\r\n");
      out.write("                <input class=\"try-out\" name=\"claimantName\" type=\"text\">\r\n");
      out.write("                <p>Surname</p>\r\n");
      out.write("                <input class=\"try-out\" name=\"claimantSurname\"type=\"text\">\r\n");
      out.write("                <p>Trading name or <br>representative capacity(if any)</p>\r\n");
      out.write("                <input class=\"try-out\" name=\"claimantTradingName\" type=\"text\">\r\n");
      out.write("            </div>\r\n");
      out.write("        <button class=\"previous\" name=\"prev\" onclick=\"prevI()\" type=\"button\"><strong>PREVIOUS</strong></button>\r\n");
      out.write("        <button class=\"next\" name=\"next\" onclick=\"next1()\" type=\"button\"><strong>NEXT</strong></button>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"pages\" id=\"val2\" style=\"display: none;\">\r\n");
      out.write("            <p>What is the name of the law firm or organisation?  <strong>*</strong></p><br>\r\n");
      out.write("            <div class=\"inp\">\r\n");
      out.write("                <p>Name</p>\r\n");
      out.write("                <input name=\"claimantName\" type=\"text\">\r\n");
      out.write("                <p>Firm or organisation type</p>\r\n");
      out.write("                <input name=\"claimantOrganisationType\" type=\"text\">\r\n");
      out.write("                <p>Trading name (if any)</p>\r\n");
      out.write("                <input name=\"claimantTradingName\" type=\"text\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <button name=\"prev\" class=\"previous\" onclick=\"prevII()\" type=\"button\"><strong>PREVIOUS</strong></button>\r\n");
      out.write("            <button name=\"next\" class=\"next\" onclick=\"nextI()\" type=\"button\"><strong>NEXT</strong></button>\r\n");
      out.write("        </div>\r\n");
      out.write("    <div class=\"pages\" id=\"two\" style=\"display: none;\">\r\n");
      out.write("            <p>Is your client an individual, a law firm or an organisation? <strong>*</strong></p><br>\r\n");
      out.write("            <div class=\"rad\">\r\n");
      out.write("                <input class= \"individual\" type=\"radio\" name=\"radio\" id=\"yess\">\r\n");
      out.write("                <p>An individual</p>\r\n");
      out.write("                <input class=\"group\" type=\"radio\" name=\"radio\" id=\"noo\">\r\n");
      out.write("                <p>A law firm or an organization</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <button name=\"prev\" class=\"previous\" onclick=\"prevone()\" type=\"button\"><strong>PREVIOUS</strong></button>\r\n");
      out.write("            <button name=\"next\" class=\"next position\" onclick=\"checkedd()\" type=\"button\"><strong>NEXT</strong></button>\r\n");
      out.write("        </div>\r\n");
      out.write("    <div class=\"pages\" id=\"val11\" style=\"display: none;\">\r\n");
      out.write("            <p>What is your client's full name? <strong>*</strong></p><br>\r\n");
      out.write("            <div class=\"inp\">\r\n");
      out.write("                <p>First and middle name</p>\r\n");
      out.write("                <input name=\"clientName\" type=\"text\">\r\n");
      out.write("                <p>Surname</p>\r\n");
      out.write("                <input name=\"clientSurname\" type=\"text\">\r\n");
      out.write("                <p>Trading name or <br>representative capacity(if any)</p>\r\n");
      out.write("                <input name=\"clientTradingName\" type=\"text\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <button name=\"prev\" class=\"previous\" onclick=\"prev2()\" type=\"button\"><strong>PREVIOUS</strong></button>\r\n");
      out.write("            <button name=\"next\" class=\"next position\" onclick=\"next2()\" type=\"button\"><strong>NEXT</strong></button>\r\n");
      out.write("        </div>\r\n");
      out.write("    <div class=\"pages\" id=\"val22\" style=\"display: none;\">\r\n");
      out.write("            <p>What is the name of your client's company or organisation? <strong>*</strong></p><br>\r\n");
      out.write("            <div class=\"inp\">\r\n");
      out.write("                <p>Name</p>\r\n");
      out.write("                <input name=\"clientName\" type=\"text\">\r\n");
      out.write("                <p>Firm or organisation type</p>\r\n");
      out.write("                <input name=\"clientOrganisationType\" type=\"text\">\r\n");
      out.write("                <p>Trading name (if any)</p>\r\n");
      out.write("                <input name=\"clientTradingName\" type=\"text\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <button name=\"prev\" class=\"previous\" onclick=\"previ()\" type=\"button\"><strong>PREVIOUS</strong></button>\r\n");
      out.write("            <button name=\"next\" class=\"next position\" onclick=\"nexti()\" type=\"button\"><strong>NEXT</strong></button>\r\n");
      out.write("        </div>\r\n");
      out.write("    <div class=\"pages\" id=\"three\" style=\"display: none;\">\r\n");
      out.write("        <p>How will you prefer to be contacted by the court? <strong>(pick one)</strong></p>\r\n");
      out.write("            <div class=\"rad\">\r\n");
      out.write("                <input class= \"individual\" type=\"radio\" name=\"radio\" id=\"yesss\">\r\n");
      out.write("                <p>By email</p>\r\n");
      out.write("                <input class=\"group\" type=\"radio\" name=\"radio\" id=\"nooo\">\r\n");
      out.write("                <p>By post</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <button name=\"prev\" class=\"previous\" onclick=\"prevtwo()\" type=\"button\"><strong>PREVIOUS</strong></button>\r\n");
      out.write("            <button name=\"next\" onclick=\"checkeddd()\" class=\"next position\" type=\"button\"><strong>NEXT</strong></button>\r\n");
      out.write("        </div>\r\n");
      out.write("    <div class=\"pages\" id=\"val111\" style=\"display: none;\">\r\n");
      out.write("            <p>Enter your email address <strong>*</strong></p>\r\n");
      out.write("            <div class=\"inp\">\r\n");
      out.write("                <p>Email Address</p>\r\n");
      out.write("                <input name=\"claimantEmailAddress\" type=\"email\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <button name=\"prev\" class=\"previous\" onclick=\"prev3()\" type=\"button\"><strong>PREVIOUS</strong></button>\r\n");
      out.write("            <button name=\"next\" class=\"next position\" onclick=\"next3()\" type=\"button\"><strong>NEXT</strong></button>\r\n");
      out.write("        </div>\r\n");
      out.write("    <div class=\"pages\" id=\"val222\" style=\"display: none;\">\r\n");
      out.write("        <p>Enter your physical address <strong>*</strong></p>\r\n");
      out.write("            <div class=\"inp\">\r\n");
      out.write("                <p>Physical Address</p>\r\n");
      out.write("                <input name=\"claimantPhysicalAddress\" type=\"text\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <button name=\"prev\" class=\"previous\" onclick=\"prevIII()\" type=\"button\"><strong>PREVIOUS</strong></button>\r\n");
      out.write("            <button name=\"next\" class=\"next position\" onclick=\"nextIII()\" type=\"button\"><strong>NEXT</strong></button>\r\n");
      out.write("        </div>\r\n");
      out.write("    <div class=\"pages\" id=\"four\" style=\"display: none;\">\r\n");
      out.write("        <p>Is the defendant of this claim an individual, a company or an organisation? <strong>*</strong></p><br>\r\n");
      out.write("            <div class=\"rad\">\r\n");
      out.write("                <input class= \"individual\" type=\"radio\" name=\"radio\" id=\"yessss\">\r\n");
      out.write("                <p>An individual</p>\r\n");
      out.write("                <input class=\"group\" type=\"radio\" name=\"radio\" id=\"noooo\">\r\n");
      out.write("                <p>A company or an organization</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <button name=\"prev\" class=\"previous\" onclick=\"prevthree()\" type=\"button\"><strong>PREVIOUS</strong></button>\r\n");
      out.write("            <button name=\"next\" class=\"next position\" onclick=\"checkedddd()\" type=\"button\"><strong>NEXT</strong></button>\r\n");
      out.write("        </div>\r\n");
      out.write("    <div class=\"pages\" id=\"val1111\" style=\"display: none;\">\r\n");
      out.write("            <p>What is the defendant's full name? <strong>*</strong></p><br>\r\n");
      out.write("            <div class=\"inp\">\r\n");
      out.write("                <p>First and middle name</p>\r\n");
      out.write("                <input name=\"defendantName\" type=\"text\">\r\n");
      out.write("                <p>Surname</p>\r\n");
      out.write("                <input name=\"defendantSurname\" type=\"text\">\r\n");
      out.write("                <p>Trading name or <br>representative capacity(if any)</p>\r\n");
      out.write("                <input name=\"defendantTradingName\" type=\"text\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <button name=\"prev\" class=\"previous\" onclick=\"prev4()\" type=\"button\"><strong>PREVIOUS</strong></button>\r\n");
      out.write("            <button name=\"next\" class=\"next position\" onclick=\"next4()\" type=\"button\"><strong>NEXT</strong></button>\r\n");
      out.write("        </div>\r\n");
      out.write("    <div class=\"pages\" id=\"val2222\" style=\"display: none;\">\r\n");
      out.write("            <p>What is the defendant's company or organisation?  <strong>*</strong></p><br>\r\n");
      out.write("            <div class=\"inp\">\r\n");
      out.write("                <p>Name</p>\r\n");
      out.write("                <input name=\"defendantName\" type=\"text\">\r\n");
      out.write("                <p>Firm or organisation type</p>\r\n");
      out.write("                <input name=\"defendantOrganisationType\" type=\"text\">\r\n");
      out.write("                <p>Trading name (if any)</p>\r\n");
      out.write("                <input name=\"defendantTradingName\" type=\"text\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <button name=\"prev\" class=\"previous\" onclick=\"prevIV()\" type=\"button\"><strong>PREVIOUS</strong></button>\r\n");
      out.write("            <button name=\"next\" class=\"next position\" onclick=\"nextIV()\" type=\"button\"><strong>NEXT</strong></button>\r\n");
      out.write("        </div>\r\n");
      out.write("    <div class=\"pages\" id=\"five\" style=\"display: none;\">\r\n");
      out.write("        <p>Would you like the court to serve this claim on your behalf?  <strong>*</strong></p><br>\r\n");
      out.write("        <div class=\"rad\">\r\n");
      out.write("            <input class= \"individual\" type=\"radio\" name=\"radio\" id=\"yesssss\">\r\n");
      out.write("            <p>Yes</p>\r\n");
      out.write("            <input class=\"group\" type=\"radio\" name=\"radio\" id=\"nooooo\">\r\n");
      out.write("            <p>No</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <button name=\"prev\" class=\"previous\" onclick=\"prevfour()\" type=\"button\"><strong>PREVIOUS</strong></button>\r\n");
      out.write("        <button name=\"next\" class=\"next position\" onclick=\"checkeddddd()\" type=\"button\"><strong>NEXT</strong></button>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"pages\" id=\"val11111\" style=\"display: none;\">\r\n");
      out.write("            <p>What is the defendant's contact details? <strong>*</strong></p><br>\r\n");
      out.write("            <div class=\"inp\">\r\n");
      out.write("                <p>Address</p>\r\n");
      out.write("                <input name=\"defendantAddress\" type=\"text\">\r\n");
      out.write("                <p>Local Government Area</p>\r\n");
      out.write("                <input name=\"defendantLGA\" type=\"text\">\r\n");
      out.write("                <p>Email Address</p>\r\n");
      out.write("                <input name=\"defendantEmail\" type=\"email\"> <!--LIMITATION: ADD ANOTHER DEFENDANT-->\r\n");
      out.write("            </div>\r\n");
      out.write("            <button name=\"prev\" class=\"previous\" onclick=\"prev5()\" type=\"button\"><strong>PREVIOUS</strong></button>\r\n");
      out.write("            <button name=\"next\" class=\"next position\" onclick=\"next5()\" type=\"button\"><strong>NEXT</strong></button>\r\n");
      out.write("        </div>\r\n");
      out.write("    <div class=\"pages\" id=\"val22222\" style=\"display: none;\">\r\n");
      out.write("            <p>What is the background of the claim? <strong>*</strong></p>\r\n");
      out.write("            <div class=\"inp\">\r\n");
      out.write("                <p>Briefly describe the essential facts about the story behind this claim.</p>\r\n");
      out.write("                <input name=\"briefDescription\" type=\"textbox\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <button name=\"prev\" class=\"previous\" onclick=\"prevV()\"type=\"button\"><strong>PREVIOUS</strong></button>\r\n");
      out.write("            <button name=\"submit\" class=\"next position\" type=\"submit\"><strong>SUBMIT</strong></button>\r\n");
      out.write("        </div>\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("<script src=\"/javascript/progressbar.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
