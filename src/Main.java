import java.awt.EventQueue;

public class Main {
	 public static void main(String[] arg) {
		 
		Modele modele = new Modele();
		FrmStations vue = new FrmStations(modele);
		Controleur controleur =  new Controleur(modele, vue);

	}
}

