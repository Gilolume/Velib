import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.SwingConstants;

public class Controleur implements MouseListener, ActionListener { 
    Modele modele;
    FrmStations vue;
    
    Controleur(Modele modele, FrmStations vue) {
		this.modele = modele;
		this.vue = vue;
		
		//Ajout des actions listeners sur les boutons
		vue.getRdbtn_1().addActionListener(this);
		vue.getRdbtn_2().addActionListener(this);
		vue.getRdbtn_3().addActionListener(this);
		vue.getRdbtn_4().addActionListener(this);
		vue.getRdbtn_5().addActionListener(this);
		vue.getRdbtn_6().addActionListener(this);
		vue.getRdbtn_7().addActionListener(this);
		vue.getRdbtn_8().addActionListener(this);
		vue.getRdbtn_9().addActionListener(this);
		vue.getRdbtn_10().addActionListener(this);
		vue.getRdbtn_11().addActionListener(this);
		vue.getRdbtn_12().addActionListener(this);
		vue.getRdbtn_13().addActionListener(this);
		vue.getRdbtn_14().addActionListener(this);
		vue.getRdbtn_15().addActionListener(this);
		vue.getRdbtn_16().addActionListener(this);
		vue.getRdbtn_17().addActionListener(this);
		vue.getRdbtn_18().addActionListener(this);
		vue.getRdbtn_19().addActionListener(this);
		vue.getRdbtn_20().addActionListener(this);
		vue.getRdbtn_92().addActionListener(this);
		vue.getRdbtn_93().addActionListener(this);
		vue.getRdbtn_94().addActionListener(this);
		vue.getRdbtn_mobile().addActionListener(this);
		vue.getBtn_rafraichir().addActionListener(this);
		
		//Ajout du mouse listener sur la JTable
		vue.getTableStations().addMouseListener(this);
    }
    
    //Fonction qui gère les actions des boutons
    public void actionPerformed(ActionEvent e) {
    	if (e.getSource().getClass() == JRadioButton.class){
    		modele.afficherStaionsSelect(e.getActionCommand(), vue.getTableStations(), vue.getPanel_3());
    	}
    	else if (e.getSource().getClass() == JButton.class){
    		modele.rafraichirTable(vue.getModelTable(), vue.getTableStations(), vue.getGroupeDeBoutons(), vue.getPanel_3());
    	}
    }

    //Fonction qui gère le click de souris sur la JTable
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().getClass() == JTable.class){
    		if (vue.getTableStations().getSelectedRow() != -1){
				modele.afficherDisponibilite(vue.getLbl_adresse(), vue.getTableStations(), vue.getAujourdhui(), vue.getLbl_date_heure(), vue.getFormater(),
						vue.getLbl_isOuvert(), vue.getLbl_carte_bancaire(), vue.getLbl_veloDisp(), vue.getLbl_pointAttache(), vue.getLbl_pointAttacheDisp());
			}
		}
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}