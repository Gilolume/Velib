import java.util.ArrayList;


public class Carte {

	private ArrayList<Station> mesStations;
	
	public Carte(){
		mesStations = new ArrayList<Station>();
	}
	
	public void ajouteStations(String numero, String adresse, boolean bonus, boolean ouvert){
		mesStations.add(new Station(numero, adresse, bonus, ouvert));
	}
	
	public Station chercher(String numero){
		for (Station laStation : mesStations){
			if (laStation.getNumero() == numero){
				return laStation;
			}
		}
		return null;
	}
	
	public Station getLaStation(int index){
		return mesStations.get(index);
	}
	
	public int nbStations(){
		return mesStations.size();
	}
}
