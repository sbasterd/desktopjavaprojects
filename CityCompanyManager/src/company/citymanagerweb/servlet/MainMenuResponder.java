package company.citymanagerweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainMenuResponder
 */
@WebServlet("/mainmenueresponder.do")
public class MainMenuResponder extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MainMenuResponder() {
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
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String userChoice = request.getParameter("menuChoice");
		String[] userOptions = request.getParameterValues("adminoptions");
		StringBuilder param = new StringBuilder("");
		String queryStringParam = "";
		if (userOptions != null) {
			boolean isFirst = true;
			for (int i = 0; i < userOptions.length; ++i) {
				if (!isFirst) {
					param.append("&");
				} else {
					param.append("?");
				}
				if (userOptions[i].equalsIgnoreCase("useDB")) {
					param.append("useDB=1");
				} else if (userOptions[i].equalsIgnoreCase("sendEmail")) {
					param.append("sendEmail=1");
				}
				isFirst = false;
			}
			queryStringParam = param.toString();
		}

		if (userChoice.equals("1")) {
			response.sendRedirect("ListCities.html" + queryStringParam);
		} else if (userChoice.equals("2")) {
			response.sendRedirect("AddCity.html" + queryStringParam);
		} else if (userChoice.equals("3")) {
			response.sendRedirect("DeleteCity.html" + queryStringParam);
		} else {
			response.sendRedirect("index.html");
		}

	}
}
