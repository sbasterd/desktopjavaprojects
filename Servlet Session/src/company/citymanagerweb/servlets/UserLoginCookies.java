package company.citymanagerweb.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/userlogincookies.do")
public class UserLoginCookies extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uid = request.getParameter("userId");
        String pwd = request.getParameter("pwd");
        boolean remember = false;
        if (request.getParameter("remember") != null) {
            String rememberMe = request.getParameter("remember");
            if (rememberMe.equalsIgnoreCase("on")) {
                remember = true;
            }
        }
        int authLvl = 1;
        HttpSession s = request.getSession();
        s.setAttribute("userName", uid);
        s.setAttribute("password", pwd);
        if (remember) {
            int cookieLife = 3600 * 24 * 7;
            Cookie uidCookie = new Cookie("credential_uid", uid);
            uidCookie.setMaxAge(cookieLife);
            response.addCookie(uidCookie);
            Cookie pwdCookie = new Cookie("credential_pwd", pwd);
            pwdCookie.setMaxAge(cookieLife);
            response.addCookie(pwdCookie);
        }
        if (authLvl < 1 || uid == null || uid == "") {
            response.sendRedirect(response.encodeRedirectURL("index_cookies.html"));
        } else {
            response.sendRedirect("/destinationpage.do");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
