/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-08-25 00:22:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\" />\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("<title>YOGAYO 회원가입</title>\n");
      out.write("<script src=\"https://kit.fontawesome.com/ae58912594.js\"\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/update.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<main>\n");
      out.write("\t\t<section id=\"step_1\">\n");
      out.write("\t\t\t<header>\n");
      out.write("\t\t\t\t<a href=\"/test/\"><div class=\"logo-wrapper\">\n");
      out.write("\t\t\t\t\t\t<span>YOGAYO</span>\n");
      out.write("\t\t\t\t\t\t<div class=\"box-div\"></div>\n");
      out.write("\t\t\t\t\t</div> </a>\n");
      out.write("\t\t\t</header>\n");
      out.write("\t\t\t<span class=\"welcome\">회원정보 수정</span> <span class=\"step_1\">정보를 수정해주세요</span>\n");
      out.write("\t\t\t<div class=\"sign-up-form\">\n");
      out.write("\t\t\t\t<form action=\"update\" method=\"POST\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<label for=\"\">이메일</label> \n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"userId\" id=\"email\"\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly/> <br /> \n");
      out.write("\t\t\t\t\t<label for=\"\">이름</label>\n");
      out.write("\t\t\t\t\t<input\n");
      out.write("\t\t\t\t\t\ttype=\"text\" name=\"userName\" id=\"name\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" /><br />\n");
      out.write("\t\t\t\t\t<label for=\"\">생년월일</label>\n");
      out.write("\t\t\t\t\t<input type=\"date\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.bDate }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"userBirthDay\"\n");
      out.write("\t\t\t\t\t\tid=\"birthDay\" placeholder=\"\" /><br /> \n");
      out.write("\t\t\t\t\t<label for=\"\">성별</label>\n");
      out.write("\t\t\t\t\t\t<select\n");
      out.write("\t\t\t\t\t\t\tname=\"gender\" id=\"gender\" >\n");
      out.write("\t\t\t\t\t\t\t<option value=\"M\" id=\"male\">남성</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"F\" id=\"female\">여성</option>\n");
      out.write("\t\t\t\t\t\t</select> <br /> \n");
      out.write("\t\t\t\t\t<label for=\"\">비밀번호</label><input type=\"password\"\n");
      out.write("\t\t\t\t\t\tname=\"password1\" id=\"pwd1\" placeholder=\"6자 이상\" /><br /> \n");
      out.write("\t\t\t\t\t<label\n");
      out.write("\t\t\t\t\t\tfor=\"\">비밀번호 확인</label><input type=\"password\" name=\"password2\"\n");
      out.write("\t\t\t\t\t\tid=\"pwd2\" placeholder=\"6자 이상\" />\n");
      out.write("\t\t\t\t\t<div class=\"alert-pwd alert\"></div>\n");
      out.write("\t\t\t\t\t<br />\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<input type=\"submit\" value=\"수정하기\">\n");
      out.write("\t\t</section>\n");
      out.write("\t</main>\n");
      out.write("\t<script language=JavaScript\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/update_valid_check.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\n");
      out.write("\t\tvar gender = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.gender}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("\t\tvar male = document.getElementById(\"male\");\n");
      out.write("\t\tvar female = document.getElementById(\"female\");\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\tif(gender === 'F'){\n");
      out.write("\t\t\tfemale.setAttribute(\"selected\", \"selected\")\t\n");
      out.write("\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t</script>\n");
      out.write("\t<script>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\tfunction nameVaildCheck() {\n");
      out.write("\t\t\tif ($(\"#name\").val().length != 0 && $(\"#name\").val().length > 2)\n");
      out.write("\t\t\t\treturn true;\n");
      out.write("\t\t\telse\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction birthdayVaildCheck() {\n");
      out.write("\t\t\tif ($(\"#birthDay\").val().length != 0)\n");
      out.write("\t\t\t\treturn true;\n");
      out.write("\n");
      out.write("\t\t\telse\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction password1VaildCheck() {\n");
      out.write("\t\t\tif ($(\"#pwd1\").val().length > 6)\n");
      out.write("\t\t\t\treturn true;\n");
      out.write("\t\t\telse\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction password2VaildCheck() {\n");
      out.write("\t\t\tif (password1VaildCheck() && $(\"#pwd2\").val() === $(\"#pwd1\").val())\n");
      out.write("\t\t\t\treturn true;\n");
      out.write("\t\t\telse\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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