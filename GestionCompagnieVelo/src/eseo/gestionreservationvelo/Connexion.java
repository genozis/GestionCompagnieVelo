package eseo.gestionreservationvelo.applicationweb;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Connexion
 */
@WebServlet("/Connexion")
public class Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Connexion() {
    	
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		// verification dans la BDD !!!
		
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		
		session.setAttribute("nom", nom);
		session.setAttribute("prenom", prenom);
		
		
		RequestDispatcher dispat = request.getRequestDispatcher("/JSP/Accueil.jsp");
		dispat.forward(request, response);
	}

}
