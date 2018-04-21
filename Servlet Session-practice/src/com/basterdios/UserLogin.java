package com.basterdios;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/userlogin.do")
public class UserLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession s = request.getSession();
        String uid = "authorizeduser";
        int authLevel = 1;
        s.setAttribute("userName", uid);
        s.setAttribute("authLevel", authLevel);
        if (authLevel < 1 || uid == null || uid == "") {
            response.sendRedirect("Login.html");

        } else {
            response.sendRedirect("/destinationpage.do");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
