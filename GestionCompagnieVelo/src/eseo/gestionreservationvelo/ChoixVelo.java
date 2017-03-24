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
 * Servlet implementation class ChoixVelo
 */
@WebServlet("/ChoixVelo")
public class ChoixVelo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChoixVelo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		String debut = request.getParameter("dateDebut");
		String fin = request.getParameter("dateFin");
		String ville = request.getParameter("ville");
		String categorie = request.getParameter("type");
		
		
		
		
		// appel de la base : liste des vélos en fct des caracs de la page d'avant
		//il faut pouvoir cliquer sur une ligne pour la sélectionner et afficher le prix
		//au bout de chaque.	
		
		try{
		/*VeloService service = new VeloService();
		VeloSEI port = service.getVeloPort();
		
		port.Velo velo = new port.Velo(0,categorie,ville,0);

		ResultSet resultat = port.trouverVelo();*/
		}catch(Exception e){
			
		}
		//session.setAttribute("listeVelo", resultat);
		RequestDispatcher dispat = request.getRequestDispatcher("/JSP/Choix.jsp");
		dispat.forward(request, response);
	}

}
