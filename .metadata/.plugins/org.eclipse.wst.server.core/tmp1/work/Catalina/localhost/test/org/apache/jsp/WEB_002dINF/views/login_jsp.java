/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-09-18 01:17:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>YOGAYO | LOGIN</title>\n");
      out.write("\n");
      out.write(" <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/home.css\" media=\"all and (min-width:600px) and (max-width:2000px)\">\n");
      out.write(" <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/home_mobile.css\" media=\"all and (min-width:300px) and (max-width:599px)\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <main>\n");
      out.write("      <div class=\"content\">\n");
      out.write("        <header>\n");
      out.write("          <div class=\"logo-wrapper\">\n");
      out.write("            <span>YOGAYO</span>\n");
      out.write("            <div class=\"box-div\"></div>\n");
      out.write("          </div>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"login-form-wrapper showing\" id=\"login-wrapper\">\n");
      out.write("          <div class=\"login-form\">\n");
      out.write("            <span>로그인</span>\n");
      out.write("            <div class=\"errMessage\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errMessage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("            <div class=\"form-row\">\n");
      out.write(" \n");
      out.write("              <form action=\"login\" method=\"post\">\n");
      out.write("                <input type=\"text\" name=\"id\" placeholder=\"이메일 (example@gmail.com)\"/><br />\n");
      out.write("                <input type=\"password\" name=\"pwd\" placeholder=\"비밀번호\"/><br />\n");
      out.write("                <input type=\"submit\" value=\"로그인\" />\n");
      out.write("              </form>\n");
      out.write("              \n");
      out.write("            </div>\n");
      out.write("            <div class=\"withgoogle\">\n");
      out.write("\t\t\t\t<!-- <a href=\"sign-up\"><div class=\"sign-up-btn naverBtn\">네이버로 로그인</div></a>\n");
      out.write("              <div></div>\n");
      out.write("              <div></div>\n");
      out.write("              <div></div> -->\n");
      out.write("            </div>\n");
      out.write("            <a href=\"sign-up\"><div class=\"sign-up-btn\">회원가입</div></a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      <div class=\"background-cover\"></div>\n");
      out.write("      <div class=\"background\"></div>\n");
      out.write("    </main>\n");
      out.write("    <script>\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("    ");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
