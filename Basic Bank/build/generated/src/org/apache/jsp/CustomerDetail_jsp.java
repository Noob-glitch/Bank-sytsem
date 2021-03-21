package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CustomerDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("    body{\n");
      out.write("     margin: 0;\n");
      out.write("     padding: 0;\n");
      out.write("     background-image: url(\"C:/Users/Pankaj singh/Desktop/BasIc Banking System/bank.jpg\");\n");
      out.write("     background-position: center;\n");
      out.write("     background-repeat: no-repeat;\n");
      out.write("    }\n");
      out.write("    #title{\n");
      out.write("    \n");
      out.write("        display: flex;\n");
      out.write("        flex-wrap: wrap;\n");
      out.write("        background-color:#0099cc;\n");
      out.write("    }\n");
      out.write("    h1{\n");
      out.write("        margin-left: 10px;\n");
      out.write("        margin-top: 40px;\n");
      out.write("        margin-bottom: 20px;\n");
      out.write("        font-family:apple-system, BlinkMacSystemFont, \"Segoe UI\", Helvetica, Arial, sans-serif;\n");
      out.write("        color: #ffffff;\n");
      out.write("        Font-size: 30px;\n");
      out.write("\n");
      out.write("Font-weight: 400;\n");
      out.write("\n");
      out.write("Line-height: 0px;\n");
      out.write("\n");
      out.write("color: #ffffff;\n");
      out.write("    }\n");
      out.write("    .nav{\n");
      out.write("        text-decoration: none;\n");
      out.write("        margin: 10px;\n");
      out.write("        margin-top: 30px;\n");
      out.write("        margin-bottom: 20px;\n");
      out.write("        font-family:apple-system, BlinkMacSystemFont, \"Segoe UI\", Helvetica, Arial, sans-serif;\n");
      out.write("        Font-size: 16px;\n");
      out.write("\n");
      out.write("Font-weight: 700;\n");
      out.write("\n");
      out.write("Line-height: 32px;\n");
      out.write("        color: #ffffff;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("    .nav:hover{\n");
      out.write("        color:#1d7eac;\n");
      out.write("\n");
      out.write("\n");
      out.write("    }\n");
      out.write("    #nav-bar{\n");
      out.write("        margin-left: 40px;\n");
      out.write("        width: 50%;\n");
      out.write("        display: flex;\n");
      out.write("        flex-wrap: wrap;\n");
      out.write("        height: inherit;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("        #customerdetail{\n");
      out.write("        border-radius: 10px;\n");
      out.write("        margin: 0 auto;\n");
      out.write("        margin-top: 20px;\n");
      out.write("        width: 45%;\n");
      out.write("        color: #ffffff;\n");
      out.write("    }\n");
      out.write("    table{\n");
      out.write("        padding: 10px;\n");
      out.write("        width:100%;\n");
      out.write("    }\n");
      out.write("    table thead th{\n");
      out.write("        background-color: #383e56;\n");
      out.write("       padding: 5px;\n");
      out.write("       border: 1px solid #ffffff; \n");
      out.write("       border-radius: 5px;       \n");
      out.write("    }\n");
      out.write("    table tbody th{\n");
      out.write("        padding: 5px;\n");
      out.write("        border: 1px solid #ffffff;\n");
      out.write("        border-radius: 5px; \n");
      out.write("        color:black;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("         <div id=\"title\">\n");
      out.write("            <h1>Basic Banking System</h1>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <div id=\"nav-bar\">\n");
      out.write("            <a class=\"nav\"href=\"index.html\">Home</a>\n");
      out.write("            <a class=\"nav\"href=\"#\" id=\"nav2\">ViewAllCustomers</a>\n");
      out.write("            <a class=\"nav\"href=\"TransferHistory.html\" id=\"nav3\">TransferHistory</a>\n");
      out.write("    \n");
      out.write("\n");
      out.write("        </div></div>\n");
      out.write("        <div id=\"customerdetail\">\n");
      out.write("            <table>\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>\n");
      out.write("                            Name\n");
      out.write("                        </th>\n");
      out.write("                        <th>\n");
      out.write("                            Email\n");
      out.write("                        </th>\n");
      out.write("                        <th>\n");
      out.write("                            Current Balance\n");
      out.write("                        </th>\n");
      out.write("                        <th>Action</th>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Naveen</th>\n");
      out.write("                        <th>Singhnaveen</th>\n");
      out.write("                        <th>5000</th>\n");
      out.write("                        <th> <a href=\"Tranfer.jsp\">Transfer Money</a></th>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
