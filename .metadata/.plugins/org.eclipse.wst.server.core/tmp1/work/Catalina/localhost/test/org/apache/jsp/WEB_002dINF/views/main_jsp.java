/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-09-08 12:58:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\" />\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("<title>YOGAYO</title>\n");
      out.write("<script src=\"https://kit.fontawesome.com/54919de5bd.js\"\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/main.css\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<header class=\"header\">\n");
      out.write("\t\t<div class=\"main-status_bar\">\n");
      out.write("\t\t\t<div class=\"main-logo_wrapper\">\n");
      out.write("\t\t\t\t<!-- <a href=\"main_page.html\">  -->\n");
      out.write("\t\t\t\t\t<div class=\"logo-wrapper\">\n");
      out.write("\t\t\t\t\t\t<span>YOGAYO</span>\n");
      out.write("\t\t\t\t\t\t<div class=\"box-div\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- </a> -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"main-status_categories\">\n");
      out.write("\t\t\t\t<span class=\"recommand\">추천</span> <span class=\"course\"><a\n");
      out.write("\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/course-page\">코스</a></span> <span\n");
      out.write("\t\t\t\t\tclass=\"dictionary\">자세 사전</span> <span class=\"my_page\"><a\n");
      out.write("\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/my-page\">마이 페이지</a></span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"main-profile\">\n");
      out.write("\t\t\t\t<div class=\"welcome_user\">안녕하세요. ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("님</div>\n");
      out.write("\t\t\t\t<a href=\"myPage\"><img\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/course/profile_face.png\"\n");
      out.write("\t\t\t\t\tclass=\"profile_img\" /></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("\t<main>\n");
      out.write("\t\t<div class=\"main-first_container\">\n");
      out.write("\t\t\t<div class=\"main-first_bg\">\n");
      out.write("\t\t\t\t<div class=\"main-first_title_section\">\n");
      out.write("\t\t\t\t\t<div class=\"main-title\">\n");
      out.write("\t\t\t\t\t\t<p>가까운 곳에서 즐기는 색다른 요가</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"main-sub_title\">\n");
      out.write("\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t그동안 몰랐던 요가의<br /> 아름다움을 발견해보세요.\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"main-btn\">\n");
      out.write("\t\t\t\t\t\t<button id=\"main-start_btn\">시작하기</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"main-second_container\">\n");
      out.write("\t\t\t<div class=\"up-on-scroll\">\n");
      out.write("\t\t\t\t<div class=\"main-second_bg\">\n");
      out.write("\t\t\t\t\t<div class=\"main-recommand\">\n");
      out.write("\t\t\t\t\t\t<a\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/course-detail?crsNum=1\">\n");
      out.write("\t\t\t\t\t\t\t<img\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/course/course.jpg\" />\n");
      out.write("\t\t\t\t\t\t\t<div class=\"main-first_course\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"main-course_title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${allCourses.get(0).title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"main-first_course_explain\">\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${allCourses.get(0).dscrt}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"main-recommand\">\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/course-detail\"> <img\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/course/course.jpg\" />\n");
      out.write("\t\t\t\t\t\t\t<div class=\"main-second_course\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"main-course_title\">당신의 허리를 위한 스트레칭</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"main-second_course_explain\">예전 같지 않은 허리 이대로\n");
      out.write("\t\t\t\t\t\t\t\t\t괜찮으신가요?</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"main-recommand\">\n");
      out.write("\t\t\t\t\t\t<img\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/course/course.jpg\" />\n");
      out.write("\t\t\t\t\t\t<div class=\"main-third_course\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"main-course_title\">당신의 허리를 위한 스트레칭</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"main-third_course_explain\">예전 같지 않은 허리 이대로\n");
      out.write("\t\t\t\t\t\t\t\t괜찮으신가요?</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"up-on-scroll\">\n");
      out.write("\t\t\t\t<div class=\"main-second_bg\">\n");
      out.write("\t\t\t\t\t<div class=\"main-recommand\">\n");
      out.write("\t\t\t\t\t\t<img\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/course/course2.jpg\" />\n");
      out.write("\t\t\t\t\t\t<div class=\"main-first_course\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"main-course_title\">당신의 허리를 위한 스트레칭</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"main-first_course_explain\">예전 같지 않은 허리 이대로\n");
      out.write("\t\t\t\t\t\t\t\t괜찮으신가요?</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"main-recommand\">\n");
      out.write("\t\t\t\t\t\t<img\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/course/course2.jpg\" />\n");
      out.write("\t\t\t\t\t\t<div class=\"main-second_course\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"main-course_title\">당신의 허리를 위한 스트레칭</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"main-second_course_explain\">예전 같지 않은 허리 이대로\n");
      out.write("\t\t\t\t\t\t\t\t괜찮으신가요?</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"main-recommand\">\n");
      out.write("\t\t\t\t\t\t<img\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/course/course2.jpg\" />\n");
      out.write("\t\t\t\t\t\t<div class=\"main-third_course\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"main-course_title\">당신의 허리를 위한 스트레칭</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"main-third_course_explain\">예전 같지 않은 허리 이대로\n");
      out.write("\t\t\t\t\t\t\t\t괜찮으신가요?</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"up-on-scroll\">\n");
      out.write("\t\t\t<div class=\"main-third_container\">\n");
      out.write("\t\t\t\t<div class=\"up-on-scroll\">\n");
      out.write("\t\t\t\t\t<div class=\"main-third_bg\">\n");
      out.write("\t\t\t\t\t\t<div class=\"main-latest_title_section\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"main-latest_courses_title\">새로 올라운 코스</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"main-latest_courses_explain\">\n");
      out.write("\t\t\t\t\t\t\t\t<p>세계 각지 사람들의 다양한 코스들을 경험해보세요. 저희 요가요에서 제공하는 코스들도 놓치지 마세요.</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"main-to_course_btn_section\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/course-page\">\n");
      out.write("\t\t\t\t\t\t\t\t<button id=\"main-to_course_btn\">모두 둘러보기</button>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"main-latest_sections\">\n");
      out.write("\t\t\t\t\t<div class=\"up-on-scroll\">\n");
      out.write("\t\t\t\t\t\t<div class=\"main-latest_section\">\n");
      out.write("\t\t\t\t\t\t\t<img\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/course/latest_course.jpg\" />\n");
      out.write("\t\t\t\t\t\t\t<div class=\"main-first_course\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"main-first_course_title\">\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${allCourses.get(0).title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"main-latest_section2\">\n");
      out.write("\t\t\t\t\t\t<div class=\"main-latest_section2-1\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"main-small_latest_courses\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"up-on-scroll\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"main-small_latest1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/course/latest_course.jpg\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"main-first_course\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"main-first_course_title\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${allCourses.get(1).title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"up-on-scroll\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"main-samll_latest2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/course/latest_course.jpg\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"main-first_course\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"main-first_course_title\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${allCourses.get(3).title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"up-on-scroll\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"main-latest_section2-2\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"main-latest\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/course/latest_course.jpg\" />\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"main-first_course\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"main-first_course_title\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${allCourses.get(4).title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<footer class=\"footer\">\n");
      out.write("\t\t\t<div class=\"main-footer_right\">\n");
      out.write("\t\t\t\t<i class=\"far fa-copyright\"></i> 2020 Team4,Inc.All rights reserved\n");
      out.write("\t\t\t\t<span>·</span> <span>개인정보 처리방침</span> <span>·</span> <span>이용약관</span>\n");
      out.write("\t\t\t\t<span>·</span> <span>사이트 맵</span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"main-footer_left\">\n");
      out.write("\t\t\t\t<ul class=\"main-footer_sns_list\">\n");
      out.write("\t\t\t\t\t<li><i class=\"fab fa-facebook-f\"></i></li>\n");
      out.write("\t\t\t\t\t<li><i class=\"fab fa-twitter\"></i></li>\n");
      out.write("\t\t\t\t\t<li><i class=\"fab fa-instagram\"></i></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</footer>\n");
      out.write("\t</main>\n");
      out.write("\t<script src=\"http://code.jquery.com/jquery.js\"></script>\n");
      out.write("\t<script language=JavaScript\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/main.js\"></script>\n");
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
