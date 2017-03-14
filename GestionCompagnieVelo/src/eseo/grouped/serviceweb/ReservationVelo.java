package eseo.grouped.serviceweb;

public class ReservationVelo {

	
	int codeReservation;
	int codeVelo;
	int codeClient;
	String dateDebut;
	String dateFin;
	boolean paiementEffectue;
	
	
	//Constructors
	public ReservationVelo(){
		this(0,0,0,"none","none",false);
	}
	
	public ReservationVelo(int codeReservation, int codeVelo, int codeClient, String dateDebut, String dateFin,
			boolean paiementEffectue) {
		this.codeReservation = codeReservation;
		this.codeVelo = codeVelo;
		this.codeClient = codeClient;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.paiementEffectue = paiementEffectue;
	}
	
	
	//Getter and Setter
	
	//Code reservation
	public int getCodeReservation() {
		return codeReservation;
	}
	public void setCodeReservation(int codeReservation) {
		this.codeReservation = codeReservation;
	}
	
	//code velo
	public int getCodeVelo() {
		return codeVelo;
	}
	public void setCodeVelo(int codeVelo) {
		this.codeVelo = codeVelo;
	}
	
	//code client
	public int getCodeClient() {
		return codeClient;
	}
	public void setCodeClient(int codeClient) {
		this.codeClient = codeClient;
	}
	
	//date debut
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	
	//date fin
	public String getDateFin() {
		return dateFin;
	}
	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}
	
	//paiement
	public boolean isPaiementEffectue() {
		return paiementEffectue;
	}
	public void setPaiementEffectue(boolean paiementEffectue) {
		this.paiementEffectue = paiementEffectue;
	}
	
}
