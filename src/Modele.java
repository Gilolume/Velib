import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Observable;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class Modele extends Observable {
	
	
	
	public void afficherStaionsSelect(String numArr, JTable table, JPanel panel_3){
		((MyTableModel) table.getModel()).setLesStations(numArr);
		table.revalidate();
		table.clearSelection();
		table.repaint();
		viderDisponibilite(panel_3);
	}
	
	public void rafraichirTable(MyTableModel modelTable, JTable table, ButtonGroup groupBouton, JPanel panel_3){
		groupBouton.clearSelection();
		table.clearSelection();
		modelTable = new MyTableModel();
		table.setModel(modelTable);
		viderDisponibilite(panel_3);
	}
	
	//Fonction pour vider le panel des disponibilité
	//On parcour tout les composants du panel avec une boucle et on set leur text à ""
	public void viderDisponibilite(JPanel panel_3){
		for (Component leComposant : panel_3.getComponents()){
			((JLabel) leComposant).setText("");
		}
	}
	
	public void afficherDisponibilite(JLabel lbl_adresse, JTable tableStations, Date aujourdhui, JLabel lbl_date_heure, SimpleDateFormat formater,
			JLabel lbl_isOuvert, JLabel lbl_carte_bancaire, JLabel lbl_veloDisp, JLabel lbl_pointAttache, JLabel lbl_pointAttacheDisp){
		lbl_adresse.setText(tableStations.getValueAt(tableStations.getSelectedRow(), 1).toString());
		
		aujourdhui = new Date();
	    lbl_date_heure.setText(formater.format(aujourdhui));
		
		boolean ouvert = (boolean) tableStations.getValueAt(tableStations.getSelectedRow(), 3);
		if (ouvert == true){
			lbl_isOuvert.setForeground(new Color(0, 128, 0));
			lbl_isOuvert.setText("La station est ouverte.");
		}
		else{
			lbl_isOuvert.setForeground(new Color(255, 0, 0));
			lbl_isOuvert.setText("La station est fermée.");
		}
		
		boolean bonusCB = (boolean) tableStations.getValueAt(tableStations.getSelectedRow(), 2);
		if (bonusCB == true){
			lbl_carte_bancaire.setForeground(new Color(0, 128, 0));
			lbl_carte_bancaire.setText("Location par carte bancaire : oui");
		}
		else{
			lbl_carte_bancaire.setForeground(new Color(255, 0, 0));
			lbl_carte_bancaire.setText("Location par carte bancaire : non");
		}
		
		HashMap<String, String> maMapDisponibilite = new HashMap<String, String>();
		maMapDisponibilite = Passerelle.getDispo(tableStations.getValueAt(tableStations.getSelectedRow(), 0).toString());
		
		lbl_veloDisp.setText("Vélos disponibles : " + maMapDisponibilite.get("available"));
		lbl_pointAttache.setText("Nombre total de points d'attaches : " + maMapDisponibilite.get("total"));
		lbl_pointAttacheDisp.setText("Points d'attaches disponibles : " + maMapDisponibilite.get("free"));
		
	
	}
}