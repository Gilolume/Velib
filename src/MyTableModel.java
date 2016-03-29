import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class MyTableModel extends AbstractTableModel{
	// entetes des colonnes
	private String[] nomColonnes = {"Numéro", "Adresse", "Bonus", "Ouvert"};
	// objet qui va représenter la matrice des données à inclure dans notre JTable
	private final Object[][] donnees;
	private Carte laCarte;
	private ArrayList<Station> lesStations = new ArrayList<Station>();
	
	public MyTableModel()
	{
		super();
		// chargement de la carte
		laCarte = Passerelle.getCarte();
		
		// remplissage de la collection lesStations
		for(int i=0;i<laCarte.nbStations();i++){
			this.lesStations.add(laCarte.getLaStation(i));
		}
		
		// remplissage de la matrice
		this.donnees = new Object[lesStations.size()][];
		for(int i=0;i<lesStations.size();i++){
			donnees[i] = new Object[]{lesStations.get(i).getNumero(),lesStations.get(i).getAdresse(),
					lesStations.get(i).isBonus(),lesStations.get(i).isOuvert()};
		}
		
		// initialise laCarte grace à Passerelle puis
		// charge l'ensemble des stations de laCarte dans les Stations
		
	}
	
	@Override
	public int getColumnCount()
	{
		// renvoie le nombre de colonnes
		return nomColonnes.length;
	}
	
	@Override
	public int getRowCount() {
        // renvoie le nombre de stations à gérer
		return lesStations.size();
    }
	
	@Override
	public String getColumnName(int col)
	{
		//renvoie le nom de la colonne col
		return nomColonnes[col];
	}
	
	@Override
	public Object getValueAt(int row, int col)
	{
		// renvoie la valeur de l'attribut correspondant à la colonne col pour la station d'index row
		switch (col) {
		case 0:
			// Numéro
			return lesStations.get(row).getNumero();
		case 1:
			// Adresse
			return lesStations.get(row).getAdresse();
		case 2:
			// Bonus
			return lesStations.get(row).isBonus();
		case 3:
			// Ouvert
			return lesStations.get(row).isOuvert();
		default:
			throw new IllegalArgumentException();
		}
	}
	
	@Override
	public Class getColumnClass(int c) {
        // renvoie la classe d'un élément de la colonne c
		switch (c) {
		case 0:
			return String.class;
		case 1:
			return String.class;
		case 2:
			return Boolean.class;
		case 3:
			return Boolean.class;
		default:
			return Object.class;
		}
    }
	/*
	@Override
	public void setLesStations(String n) {
		// vide la liste des stations puis 
		// la remplit avec toutes les stations de l'arrondissement n
		
	}*/
}
