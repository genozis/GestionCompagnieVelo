package eseo.grouped.serviceweb;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

public class GererVelo {
	
	public Velo[] trouverVelo(Velo unVelo){
		InterrogationBDD bdd = new InterrogationBDD();
		bdd.ouvertureConnexion();						//TODO créer fonction ouverture
		String[][] tableauVelo = bdd.rechercherUnVelo(unVelo); //TODO créer fonction rechercherUnVelo
		bdd.fermetureConnexion();
		Velo[] velo = Velo.tableDeVelo(tableauVelo);
		return velo;
	}
	
	public int ReserverVelo(ReservationVelo reservation){
		InterrogationBDD bdd = new InterrogationBDD();
		bdd.ouvertureConnexion();
		bdd.reserverUnVelo(reservation.getCodeClient(),reservation.getCodeReservation(),
					reservation.getCodeVelo(),reservation.getDateDebut(),
					reservation.getDateFin(),reservation.isPaiementEffectue());
		bdd.fermetureConnexion(); //TODO créer fonction reserverUnVelo
		return reservation.getCodeReservation();
	}
	
	public String payerVelo(int codeReservation){
		InterrogationBDD bdd = new InterrogationBDD();
		boolean result = false;
		
		bdd.ouvertureConnexion();
		result = bdd.payerReservationVelo(codeReservation,true); //TODO créer payerReservationVelo
		bdd.fermetureConnexion();
		
		if(result){
			return "transaction effectué";
		}else
			return "la transaction n'a pu aboutir";
		

	}
	
	public boolean annulerVelo(int codeReservation){
		InterrogationBDD bdd = new InterrogationBDD();
		boolean result = false;
		
		bdd.ouvertureConnexion();
		result = bdd.annulerReservationVelo(codeReservation,true); //TODO créer fonction annulerReservationVelo
		bdd.fermetureConnexion();
		

		//TODO faire un try catch et renvoyer un boolean pour dire si la requete est passé 
		return result;
	}
	
	
	
	
}
