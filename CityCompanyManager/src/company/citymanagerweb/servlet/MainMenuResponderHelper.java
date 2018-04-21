package company.citymanagerweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainMenuResponderHelper
 */
@WebServlet("/mainmenuresponderhelper.do")
public class MainMenuResponderHelper extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MainMenuResponderHelper() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String useDB = (String) request.getAttribute("useDB");
		String sendEmail = (String) request.getAttribute("sendEmail");
		String choice = (String) request.getAttribute("userChoice");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String pageToNavigate = "";
		if (choice.equals("1")) {
			pageToNavigate = "List All Cities";

		} else if (choice.equals("2")) {
			pageToNavigate = "Add a city";
		} else if (choice.equals("3")) {
			pageToNavigate = "Delete a city";
		}

		boolean optEmail = (sendEmail == null ? false : sendEmail.equals("1"));
		boolean optDB = (useDB == null ? false : useDB.equals("1"));
		String msg = String.format(
				"<span> You choose to show the " + "page to %s and set useDB to %b and sendEmail to " + "%b</span>",
				pageToNavigate, optDB, optEmail);
		out.println("<html><body><h1>" + msg + "</h1></body></html>");
	}

}
