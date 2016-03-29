
public class testComplet {

	public static void main(String[] args) {
		// Test de Station
		Station s = new Station("21021", "15 rue petit", true, true);
		Station s1 = new Station("31023", "11 rue Blanche", true, true);
		Station s2 = new Station("8567", "45 rue Noire", true, true);
		
		System.out.println(s.getArrondissement());
		System.out.println(s1.getArrondissement());
		System.out.println(s2.getArrondissement());
		
		Passerelle pass = new Passerelle();
		//pass.getCarte();
		pass.getDispo("4017");

		
		// Test de Carte
		/*Carte c = new Carte();
		c.ajouteStation("20021", "15 rue petit", true, true);
		c.ajouteStation("31023", "11 rue Blanche", true, true);
		c.ajouteStation("8567", "45 rue Noire", true, true);
		System.out.println(c.nbStations());
		System.out.println(c.getLaStation(1));*/
		
		// Test de Passerelle.getCarte()
		/*Carte c = Passerelle.getCarte();
		System.out.println(c.nbStations()+" stations chargées\n");
		System.out.println(c.getLaStation(0));
		System.out.println(c.chercher("4017"));*/
		
		// Test de MyTableModel
		/*Carte c = Passerelle.getCarte();
		System.out.println(c.nbStations()+" stations chargées\n");
		
		MyTableModel maTable = new MyTableModel();
		System.out.println(maTable.getValueAt(1,0));
		System.out.println(maTable.getValueAt(1,1));
		System.out.println(maTable.getValueAt(1,2));
		System.out.println(maTable.getValueAt(1,3));*/
		
		// Test de la fenetre
		/*Carte c = Passerelle.getCarte();
		System.out.println(c.nbStations()+" stations chargées");
		new FrmStations();*/
	}

}
