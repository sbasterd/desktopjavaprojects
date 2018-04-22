package company.citymanagerweb.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RemoveCookie")
public class RemoveCookie extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        Cookie[] myCookies=request.getCookies();
        if(myCookies!=null ||myCookies.length>0){
            for(Cookie c:myCookies){
                if(c.getName().toLowerCase().contains("credentials")){
                    c.setMaxAge(0);
                    response.addCookie(c);
                }
            }
        }
        PrintWriter out=response.getWriter();
        out.println("<html><body><h3>Cookies Expired</h3></body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
