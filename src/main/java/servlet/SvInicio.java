package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Servlet implementation class Inicio
 */
@WebServlet("/Inicio")
public class SvInicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvInicio() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
//		dispatcher.forward(request, response);
//		PrintWriter out = response.getWriter();
		
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>Inicio</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<h1>Pagina de inicio</h1>");
//		out.println("<p>Esta es la pagina de INICIOOOOOO</p>");
//		out.println("</body>");
//		out.println("</html>");
		 //obtener una instancia del objeto RequestDispatcher
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        //redirigir la solicitud a la pagina JSP
        dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		request.setAttribute("pageTitle", "Inicio");
	}

}
