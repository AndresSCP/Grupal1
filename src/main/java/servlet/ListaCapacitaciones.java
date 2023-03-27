package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ListaCapacitaciones")
public class ListaCapacitaciones extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Verificar si el usuario ha iniciado sesión
        if (request.getSession().getAttribute("username") == null) {
            response.sendRedirect("login.jsp");
            return;
        }
        
        // Crear una lista de capacitaciones
        ArrayList<String> capacitaciones = new ArrayList<>();
        capacitaciones.add("Capacitacion 1");
        capacitaciones.add("Capacitacion 2");
        capacitaciones.add("Capacitacion 3");
        
        // Establecer los atributos para la lista de capacitaciones y enviarlos a la página JSP
        request.setAttribute("capacitaciones", capacitaciones);
        request.getRequestDispatcher("listaCapacitaciones.jsp").forward(request, response);
    }

//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    }
}