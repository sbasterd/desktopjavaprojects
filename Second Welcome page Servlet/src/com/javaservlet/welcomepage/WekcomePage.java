package com.javaservlet.welcomepage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/WelcomePage")
public class WekcomePage extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String studentNO = new String("8611006");
        out.println("<html>" +
                "<body>" +
                "<h1 align='center'>Welcome to this page</h1>" +
                "<p>The value of studentNO is: " + studentNO + "</p>" +
                "</body>" +
                "</html>");

    }
}
