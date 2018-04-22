package company.citymanagerweb.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loginwithcookieinfo.do")
public class LoginWithCookieInfo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uid = "";
        String pwd = "";
        Cookie[] myCookies = request.getCookies();
        if (myCookies != null) {
            for (Cookie c : myCookies) {
                if (c.getName().equalsIgnoreCase("credential_uid")) {
                    uid = c.getValue();
                } else if (c.getName().equalsIgnoreCase("credential_pwd")) {
                    pwd = c.getValue();
                }
            }
        }
        StringBuilder sb = new StringBuilder("");
        sb.append("<html><body>");
        sb.append("<form id='formLogin' name='formLogin' " +
                "action='/userlogincookies.do' method='post'/>");
        sb.append("UserName:<input type='text' name='userId'/><br/>");
        sb.append("Password:<input type='password' name='pwd' /><br/>");
        sb.append("<input type='checkbox' name='remember' />Remember me<br/>");
        sb.append("<input type='submit' name='loginBtn' value='log in' />");
        sb.append("</body></html>");
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println(sb.toString());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
