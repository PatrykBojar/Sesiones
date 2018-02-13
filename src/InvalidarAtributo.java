import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/invalidar")
public class InvalidarAtributo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public InvalidarAtributo() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession sesion = request.getSession();
		sesion.invalidate();

		// Establacemos que la respuesta del servlet va a ser un archivo HTML.
		response.setContentType("text/html");

		// Creamos un objeto que nos permita ir escribiendo la respuesta del
		// servlet.
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='utf-8'>");
		out.println("<title>Sesión</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Sesión eliminada</h1>");
		out.println("<p>Se ha borrado la sesión del usuario.</p>");
		out.println("<body>");
		out.println("<html>");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

}
