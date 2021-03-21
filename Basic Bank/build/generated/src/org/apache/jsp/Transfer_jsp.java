package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Transfer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Transfer</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <style type=text/css>\n");
      out.write("    body{\n");
      out.write("     margin: 0;\n");
      out.write("     padding: 0;\n");
      out.write("     background-image: url(\"bank.jpg\");\n");
      out.write("     background-position: center;\n");
      out.write("     background-repeat: no-repeat;\n");
      out.write("     font-family:apple-system, BlinkMacSystemFont, \"Segoe UI\", Helvetica, Arial, sans-serif;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("    #title{\n");
      out.write("    \n");
      out.write("    display: flex;\n");
      out.write("    flex-wrap: wrap;\n");
      out.write("    background-color:#0099cc;\n");
      out.write("}\n");
      out.write("h1{\n");
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
      out.write("    a{\n");
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
      out.write("    a:hover{\n");
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
      out.write("    #section{\n");
      out.write("        border-radius: 10px;\n");
      out.write("        width: 30%;\n");
      out.write("        margin: 0 auto;\n");
      out.write("        margin-top: 100px;\n");
      out.write("        background-color: #f2f4f8;\n");
      out.write("        height:340px;\n");
      out.write("    }\n");
      out.write("    #TransferForm{\n");
      out.write("        padding: 10px;\n");
      out.write("        width:90%;\n");
      out.write("        margin: 0 auto;\n");
      out.write("    \n");
      out.write("    }\n");
      out.write("    #form1{\n");
      out.write("        display: flex;\n");
      out.write("        flex-wrap: wrap;\n");
      out.write("        flex-direction: column;\n");
      out.write("       \n");
      out.write("    }\n");
      out.write("    #form1 label{\n");
      out.write("       padding: 5px; \n");
      out.write("    }\n");
      out.write("    input[type=submit]{\n");
      out.write("        width: 30%;\n");
      out.write("        margin: 0 auto;\n");
      out.write("        margin-top: 10px;\n");
      out.write("        height: 30px;\n");
      out.write("        border-radius: 5px;\n");
      out.write("        background-color: #0099cc;\n");
      out.write("        color:#f2f4f8;\n");
      out.write("        cursor: pointer;\n");
      out.write("    }\n");
      out.write("    input[type=submit]:hover{\n");
      out.write("          background-color:#ffffff;\n");
      out.write("          color:black;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    input[type=text]{\n");
      out.write("        border-radius:5px;\n");
      out.write("        height: 30px;\n");
      out.write("    }\n");
      out.write("    @media screen and (max-width:692px){\n");
      out.write("       #title{\n");
      out.write("           height: 100px;\n");
      out.write("       }\n");
      out.write("       h1{\n");
      out.write("           font-size: 18px;\n");
      out.write("       }\n");
      out.write("       \n");
      out.write("    a{\n");
      out.write("        font-size: 10px;\n");
      out.write("    }  } \n");
      out.write("    </style>\n");
      out.write("<body>\n");
      out.write("    <div id=\"title\">\n");
      out.write("        <h1>Basic Banking System</h1>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <div id=\"nav-bar\">\n");
      out.write("        <a href=\"index.html\">Home</a>\n");
      out.write("        <a href=\"#\">ViewAllCustomers</a>\n");
      out.write("        <a href=\"#\">TransferHistory</a>\n");
      out.write("         \n");
      out.write("\n");
      out.write("    </div></div>\n");
      out.write("    <div id=\"section\">\n");
      out.write("        <div id=\"TransferForm\">\n");
      out.write("            <form id=\"form1\" method=\"POST\">\n");
      out.write("                <label>Sender's name</label>\n");
      out.write("                <input type=\"text\"/>\n");
      out.write("                <label>Sender's Email</label>\n");
      out.write("                <input type=\"text\"/>\n");
      out.write("                <label>Enter Reciever's Name</label>\n");
      out.write("                <input type=\"text\"/>\n");
      out.write("                <label>Enter Amount </label>\n");
      out.write("                <input type=\"text\" max=\"10\"/>\n");
      out.write("                <input type=\"submit\" value=\"Transfer\"/>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    </body>\n");
      out.write("    </html>\n");
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
