package company.citymanagerweb.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/destinationpage.do")
public class DestinationPage extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession s = request.getSession();
        out.println(s.isNew());
        String uid = (String) s.getAttribute("userName");
        out.println("<html><body><p>" + uid + "</p></body></html>");
        if (s != null && !s.isNew() && s.getAttribute("userName") != null) {
            out.println("<html><body><span>Welcome </span>&nbsp;<strong>" + uid + "</strong></body></html>");
        } else {
            out.println("<html><body><span>Unauthorized</span></body></html>");
        }
    }
}
