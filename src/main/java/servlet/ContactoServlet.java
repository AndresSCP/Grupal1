

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContactoFooter
 */
@WebServlet("/ContactoServlet")
public class ContactoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set the content type of the response
        response.setContentType("text/html");

        // Get the PrintWriter object to write the response
        PrintWriter out = response.getWriter();

        // Generate the HTML code for the page
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Contactos</title>");
       // out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Bienvenido  a la lista de Contactos</h1>");
        out.println("<form action='' method='POST'>");
        out.println("<label>Nombre completo:</label>");
        out.println("<input type='text' id='nombre' name='nombre' required>");
        out.println("<label for='email'>Correo electrónico:</label>");
        out.println("<input type='email' id='email' name='email' required>");
        out.println("<label for='asunto'>Asunto:</label>");
        out.println("<input type='text' id='asunto' name='asunto' required>");
		out.println("<label for='mensaje'>Mensaje:</label>");
        out.println("<textarea id='mensaje' name='mensaje' required></textarea>");
		out.println("<input type='submit' value='Enviar'>");
		out.println("</form>");
      	out.println("</body>");
        out.println("</html>");								
        // Close the PrintWriter
        out.close();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
