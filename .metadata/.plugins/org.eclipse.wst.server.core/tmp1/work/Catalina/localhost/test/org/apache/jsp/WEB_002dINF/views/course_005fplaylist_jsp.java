/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-09-16 00:53:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class course_005fplaylist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("\tcontent=\"target-densitydpi=device-dpi, user-scalable=0, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, width=device-width\" />\n");
      out.write("<title>YOGAYO | COURSEPLAYLIST</title>\n");
      out.write("<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://kit.fontawesome.com/a076d05399.js\"></script>\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.10.4/jquery-ui.js\"></script>\n");
      out.write("<script src=\"http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js\"></script>\n");
      out.write("\n");
      out.write("<script language=JavaScript src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/course_playlist.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/course_playlist.css\" media=\"all and (min-width:600px) and (max-width:2000px)\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/course_playlist_mobile.css\" media=\"all and (min-width:400px) and (max-width:599px)\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<header></header>\n");
      out.write("\t<main>\n");
      out.write("\t<div id=\"mypage_container\">\n");
      out.write("\t\t<div id=\"s1_container\">\n");
      out.write("\t\t\t<div class=\"s1_gap\">\n");
      out.write("\t\t\t\t<div class=\"s1_wrapper\">\n");
      out.write("\t\t\t\t\t<div class='box_container'>\n");
      out.write("\t\t\t\t\t\t<form action=\"mkcourse\" method=\"POST\" id=\"form_tag\"\n");
      out.write("\t\t\t\t\t\t\tenctype=\"multipart/form-data\" name=\"mk_course\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" id=\"seq1\" name=\"seq1\" value=\"\"> <input\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"hidden\" id=\"seq2\" name=\"seq2\" value=\"\"> <input\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"hidden\" id=\"seq3\" name=\"seq3\" value=\"\"> <input\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"hidden\" id=\"seq4\" name=\"seq4\" value=\"\"> <input\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"hidden\" id=\"seq5\" name=\"seq5\" value=\"\"> <input\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"hidden\" id=\"seq6\" name=\"seq6\" value=\"\"> <input\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"hidden\" id=\"seq7\" name=\"seq7\" value=\"\"> <input\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"hidden\" id=\"seq8\" name=\"seq8\" value=\"\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course_title\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"title\" class=\"title_box\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"코스의 제목을 입력하세요\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course_explain\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"dscrt\" class=\"description_box\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"설명추가\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course_upload\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"file\" name=\"coursethumbnail\" class=\"textbox\"\n");
      out.write("\t\t\t\t\t\t\t\t\tid=\"coursethumbnail\" placeholder=\"사진추가\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course_keyword\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"keyword_box\" name=\"keywordBox\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"키워드를 입력하세요\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"course_search\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" id=\"searching_box\" class=\"search\"\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"원하는 포즈명을 검색해보세요\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<label>준비물</label> <select name=\"material\" id=\"material\">\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"요가매트\">요가 매트</option>\n");
      out.write("\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"pose_info_box\">\n");
      out.write("\t\t\t\t\t\t<ul id=\"sortable_list1\"></ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"s2_container\">\n");
      out.write("\t\t\t<div class=\"s2_wrapper\">\n");
      out.write("\t\t\t\t<div class=\"s2_gap\">\n");
      out.write("\t\t\t\t\t<div class=\"s2_titlebox\">\n");
      out.write("\t\t\t\t\t\t<p class=\"s2_title\">포즈를 더블클릭하거나 드래그하세요</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"list_box\">\n");
      out.write("\t\t\t\t\t\t<ul id=\"sortable_list2\">\n");
      out.write("\t\t\t\t\t\t\t<li id=\"object1\"></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"addItem_box\">\n");
      out.write("\t\t<input type=\"button\" class=\"addItem\" value=\"나의 코스목록에 추가\">\n");
      out.write("\t\t<div class=\"backBtn\">\n");
      out.write("\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/myPage\">뒤로가기</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</form>\n");
      out.write("\t</main>\n");
      out.write("\t<footer> </footer>\n");
      out.write("\t<script>\n");
      out.write("\t\t\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
