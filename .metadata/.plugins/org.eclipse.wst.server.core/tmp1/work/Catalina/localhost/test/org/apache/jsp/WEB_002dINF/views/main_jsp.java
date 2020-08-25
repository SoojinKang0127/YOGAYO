/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-08-24 08:07:01 UTC
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
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>YOGAYO</title>\n");
      out.write("    <script\n");
      out.write("      src=\"https://kit.fontawesome.com/54919de5bd.js\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    ></script>\n");
      out.write("     <link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/main.css\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <header class=\"header\">\n");
      out.write("      <div class=\"main-status_bar\">\n");
      out.write("        <div class=\"main-logo_wrapper\">\n");
      out.write("          <a href=\"main_page.html\">\n");
      out.write("            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/course/logo.jpg\" alt=\"logo\" />\n");
      out.write("          </a>\n");
      out.write("          <div class=\"box-div\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"main-status_categories\">\n");
      out.write("          <span class=\"recommand\">추천</span>\n");
      out.write("          <span class=\"course\"><a href=\"./course_page.html\">코스</a></span>\n");
      out.write("          <span class=\"dictionary\">자세 사전</span>\n");
      out.write("          <span class=\"my_page\">마이 페이지</span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"main-profile\">\n");
      out.write("          <div class=\"welcome_user\">\n");
      out.write("            안녕하세요. ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("님\n");
      out.write("          </div>\n");
      out.write("          <a href=\"my-page\"\n");
      out.write("            ><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/course/profile_face.png\" class=\"profile_img\"\n");
      out.write("          /></a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </header>\n");
      out.write("    <main>\n");
      out.write("      <div class=\"main-first_container\">\n");
      out.write("        <div class=\"main-first_bg\">\n");
      out.write("          <div class=\"main-first_title_section\">\n");
      out.write("            <div class=\"main-title\">\n");
      out.write("              <p>가까운 곳에서 즐기는 색다른 요가</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"main-sub_title\">\n");
      out.write("              <p>\n");
      out.write("                그동안 몰랐던 요가의<br />\n");
      out.write("                아름다움을 발견해보세요.\n");
      out.write("              </p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"main-btn\">\n");
      out.write("              <button id=\"main-start_btn\">시작하기</button>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"main-second_container\">\n");
      out.write("        <div class=\"up-on-scroll\">\n");
      out.write("          <div class=\"main-second_bg\">\n");
      out.write("            <div class=\"main-recommand\">\n");
      out.write("              <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/course/course.jpg\" />\n");
      out.write("              <div class=\"main-first_course\">\n");
      out.write("                <div class=\"main-course_title\">\n");
      out.write("                  당신의 허리를 위한 스트레칭\n");
      out.write("                </div>\n");
      out.write("                <div class=\"main-first_course_explain\">\n");
      out.write("                  예전 같지 않은 허리 이대로 괜찮으신가요?\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"main-recommand\">\n");
      out.write("              <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/course/course.jpg\" />\n");
      out.write("              <div class=\"main-second_course\">\n");
      out.write("                <div class=\"main-course_title\">\n");
      out.write("                  당신의 허리를 위한 스트레칭\n");
      out.write("                </div>\n");
      out.write("                <div class=\"main-second_course_explain\">\n");
      out.write("                  예전 같지 않은 허리 이대로 괜찮으신가요?\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"main-recommand\">\n");
      out.write("              <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/course/course.jpg\" />\n");
      out.write("              <div class=\"main-third_course\">\n");
      out.write("                <div class=\"main-course_title\">\n");
      out.write("                  당신의 허리를 위한 스트레칭\n");
      out.write("                </div>\n");
      out.write("                <div class=\"main-third_course_explain\">\n");
      out.write("                  예전 같지 않은 허리 이대로 괜찮으신가요?\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"up-on-scroll\">\n");
      out.write("          <div class=\"main-second_bg\">\n");
      out.write("            <div class=\"main-recommand\">\n");
      out.write("              <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/course/course2.jpg\" />\n");
      out.write("              <div class=\"main-first_course\">\n");
      out.write("                <div class=\"main-course_title\">\n");
      out.write("                  당신의 허리를 위한 스트레칭\n");
      out.write("                </div>\n");
      out.write("                <div class=\"main-first_course_explain\">\n");
      out.write("                  예전 같지 않은 허리 이대로 괜찮으신가요?\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"main-recommand\">\n");
      out.write("              <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/course/course2.jpg\" />\n");
      out.write("              <div class=\"main-second_course\">\n");
      out.write("                <div class=\"main-course_title\">\n");
      out.write("                  당신의 허리를 위한 스트레칭\n");
      out.write("                </div>\n");
      out.write("                <div class=\"main-second_course_explain\">\n");
      out.write("                  예전 같지 않은 허리 이대로 괜찮으신가요?\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"main-recommand\">\n");
      out.write("              <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/course/course2.jpg\" />\n");
      out.write("              <div class=\"main-third_course\">\n");
      out.write("                <div class=\"main-course_title\">\n");
      out.write("                  당신의 허리를 위한 스트레칭\n");
      out.write("                </div>\n");
      out.write("                <div class=\"main-third_course_explain\">\n");
      out.write("                  예전 같지 않은 허리 이대로 괜찮으신가요?\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"up-on-scroll\">\n");
      out.write("        <div class=\"main-third_container\">\n");
      out.write("          <div class=\"up-on-scroll\">\n");
      out.write("            <div class=\"main-third_bg\">\n");
      out.write("              <div class=\"main-latest_title_section\">\n");
      out.write("                <div class=\"main-latest_courses_title\">새로 올라운 코스</div>\n");
      out.write("                <div class=\"main-latest_courses_explain\">\n");
      out.write("                  <p>\n");
      out.write("                    세계 각지 사람들의 다양한 코스들을 경험해보세요. 저희\n");
      out.write("                    요가요에서 제공하는 코스들도 놓치지 마세요.\n");
      out.write("                  </p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"main-to_course_btn_section\">\n");
      out.write("                <a href=\"./course_page.html\">\n");
      out.write("                  <button id=\"main-to_course_btn\">모두 둘러보기</button>\n");
      out.write("                </a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"main-latest_sections\">\n");
      out.write("            <div class=\"up-on-scroll\">\n");
      out.write("              <div class=\"main-latest_section\">\n");
      out.write("                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/course/latest_course.jpg\" />\n");
      out.write("                <div class=\"main-first_course\">\n");
      out.write("                  <div class=\"main-first_course_title\">\n");
      out.write("                    어깨가 너무 결려서 만든 스트레칭\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"main-latest_section2\">\n");
      out.write("              <div class=\"main-latest_section2-1\">\n");
      out.write("                <div class=\"main-small_latest_courses\">\n");
      out.write("                  <div class=\"up-on-scroll\">\n");
      out.write("                    <div class=\"main-small_latest1\">\n");
      out.write("                      <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/course/latest_course.jpg\" />\n");
      out.write("                      <div class=\"main-first_course\">\n");
      out.write("                        <div class=\"main-first_course_title\">\n");
      out.write("                          어깨가 너무 결려서 만든 스트레칭\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"up-on-scroll\">\n");
      out.write("                    <div class=\"main-samll_latest2\">\n");
      out.write("                      <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/course/latest_course.jpg\" />\n");
      out.write("                      <div class=\"main-first_course\">\n");
      out.write("                        <div class=\"main-first_course_title\">\n");
      out.write("                          어깨가 너무 결려서 만든 스트레칭\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"up-on-scroll\">\n");
      out.write("                <div class=\"main-latest_section2-2\">\n");
      out.write("                  <div class=\"main-latest\">\n");
      out.write("                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/course/latest_course.jpg\" />\n");
      out.write("                    <div class=\"main-first_course\">\n");
      out.write("                      <div class=\"main-first_course_title\">\n");
      out.write("                        어깨가 너무 결려서 만든 스트레칭\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <footer class=\"footer\">\n");
      out.write("        <div class=\"main-footer_right\">\n");
      out.write("          <i class=\"far fa-copyright\"></i> 2020 Team4,Inc.All rights reserved\n");
      out.write("          <span>·</span>\n");
      out.write("          <span>개인정보 처리방침</span>\n");
      out.write("          <span>·</span>\n");
      out.write("          <span>이용약관</span>\n");
      out.write("          <span>·</span>\n");
      out.write("          <span>사이트 맵</span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"main-footer_left\">\n");
      out.write("          <ul class=\"main-footer_sns_list\">\n");
      out.write("            <li><i class=\"fab fa-facebook-f\"></i></li>\n");
      out.write("            <li><i class=\"fab fa-twitter\"></i></li>\n");
      out.write("            <li><i class=\"fab fa-instagram\"></i></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </footer>\n");
      out.write("    </main>\n");
      out.write("    <script src=\"http://code.jquery.com/jquery.js\"></script>\n");
      out.write("    <script language=JavaScript\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/main.js\"></script>\n");
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
