/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.91
 * Generated at: 2024-07-21 14:30:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_002dhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/javax.servlet.jsp.jstl-1.2.1.jar", Long.valueOf(1721027843679L));
    _jspx_dependants.put("jar:file:/D:/JSP/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/11-bank-application/WEB-INF/lib/javax.servlet.jsp.jstl-1.2.1.jar!/META-INF/c.tld", Long.valueOf(1323238578000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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

      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <title>Admin Home</title>\r\n");
      out.write("    <link\r\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\r\n");
      out.write("      crossorigin=\"anonymous\"\r\n");
      out.write("    />\r\n");
      out.write("    <style>\r\n");
      out.write("      .navbar {\r\n");
      out.write("        background-color: #343a40;\r\n");
      out.write("        height: 70px;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .navbar-brand,\r\n");
      out.write("      .navbar-nav .nav-link {\r\n");
      out.write("        color: #ffffff; /* White text */\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .navbar-brand:hover,\r\n");
      out.write("      .navbar-nav .nav-link:hover {\r\n");
      out.write("        color: #adb5bd; /* Light grey text on hover */\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .jumbotron {\r\n");
      out.write("        background: url(\"https://www.kotak.com/content/dam/Kotak/herosliderbanner/loans/home-loan/Documents%20Required%20for%20Home%20Loan%20by%20Kotak%20Bank.jpg\")\r\n");
      out.write("          no-repeat center center;\r\n");
      out.write("        background-size: cover;\r\n");
      out.write("        height: 500px;\r\n");
      out.write("        display: flex;\r\n");
      out.write("        align-items: center;\r\n");
      out.write("        justify-content: start;\r\n");
      out.write("        color: #ffffff; /* White text */\r\n");
      out.write("        text-align: center;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body class=\"bg-light\">\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">Admin Panel</a>\r\n");
      out.write("        <button\r\n");
      out.write("          class=\"navbar-toggler\"\r\n");
      out.write("          type=\"button\"\r\n");
      out.write("          data-bs-toggle=\"collapse\"\r\n");
      out.write("          data-bs-target=\"#navbarNav\"\r\n");
      out.write("          aria-controls=\"navbarNav\"\r\n");
      out.write("          aria-expanded=\"false\"\r\n");
      out.write("          aria-label=\"Toggle navigation\"\r\n");
      out.write("        >\r\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div\r\n");
      out.write("          class=\"collapse navbar-collapse justify-content-end\"\r\n");
      out.write("          id=\"navbarNav\"\r\n");
      out.write("        >\r\n");
      out.write("          <ul class=\"navbar-nav\">\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link active\" aria-current=\"page\" href=\"logout\"\r\n");
      out.write("                >Logout</a\r\n");
      out.write("              >\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"jumbotron\">\r\n");
      out.write("      <h1 class=\"display-2 text-dark text-xl-start ms-5\">\r\n");
      out.write("        Welcome to Admin Panel\r\n");
      out.write("      </h1>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container my-5\">\r\n");
      out.write("      <div class=\"row justify-content-center ms-5 py-3\">\r\n");
      out.write("        <div class=\"col-md-4 my-3\">\r\n");
      out.write("          <a\r\n");
      out.write("            href=\"admin?command=addCustomer\"\r\n");
      out.write("            class=\"btn btn-primary btn-lg btn-block px-5 py-3\"\r\n");
      out.write("            >Add Customer</a\r\n");
      out.write("          >\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-4 my-3\">\r\n");
      out.write("          <a\r\n");
      out.write("            href=\"admin?command=viewCustomers\"\r\n");
      out.write("            class=\"btn btn-primary btn-lg btn-block px-5 py-3\"\r\n");
      out.write("            >View Customers</a\r\n");
      out.write("          >\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-4 my-3\">\r\n");
      out.write("          <a\r\n");
      out.write("            href=\"admin?command=viewTransactions\"\r\n");
      out.write("            class=\"btn btn-primary btn-lg btn-block px-5 py-3\"\r\n");
      out.write("            >View Transactions</a\r\n");
      out.write("          >\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script\r\n");
      out.write("      src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("      integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\r\n");
      out.write("      crossorigin=\"anonymous\"\r\n");
      out.write("    ></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
