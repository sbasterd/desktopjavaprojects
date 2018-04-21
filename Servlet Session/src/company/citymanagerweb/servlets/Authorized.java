package company.citymanagerweb.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/authorized.do")
public class Authorized extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        HttpSession s = request.getSession();
        boolean authorized = false;
        String uid = null;
        int authLvl = -1;
        if (s.getAttribute("userName") != null) {
            uid = (String) s.getAttribute("userName");
            out.println(uid);


        }
        if (s.getAttribute("userAuthLevel") != null) {
            authLvl = (int) s.getAttribute("userAuthLevel");
            out.println(authLvl);

        }
        if (authLvl >= 1 && uid != null && !uid.equals("")) {
            authorized = true;
            out.println(authorized);
        }

        if (!authorized) {
            response.sendRedirect("Login.html");
        } else {
            response.sendRedirect("/destinationpage.do");
        }

    }
}
