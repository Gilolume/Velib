import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.Font;


public class FrmStations extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lbl_adresse;
	private JLabel lbl_date_heure;
	private JLabel lbl_veloDisp;
	private JLabel lbl_pointAttache;
	private JLabel lbl_isOuvert;
	private JLabel lbl_pointAttacheDisp;
	private JLabel lbl_carte_bancaire;
	private SimpleDateFormat formater = null;
	private MyTableModel modelTable;
	private JScrollPane scrollPaneStations;
	private JTable tableStations;
	private Date aujourdhui;
	private JPanel panel_3;;
	private ButtonGroup groupeDeBoutons = new ButtonGroup();
	private ActionListener listnerDuGroupe = new ActionListenerBoutonGroupe();
	

	/**
	 * Create the frame.
	 */
	public FrmStations() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 787, 559);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Arrondissements de Paris", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 11, 246, 127);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtn_1 = new JRadioButton("1");
		rdbtn_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_1.setBounds(6, 17, 45, 23);
		panel.add(rdbtn_1);
		rdbtn_1.setActionCommand("1");
		groupeDeBoutons.add(rdbtn_1);
		rdbtn_1.addActionListener(listnerDuGroupe);
		
		JRadioButton rdbtn_2 = new JRadioButton("2");
		rdbtn_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_2.setBounds(53, 17, 45, 23);
		panel.add(rdbtn_2);
		rdbtn_2.setActionCommand("2");
		groupeDeBoutons.add(rdbtn_2);
		rdbtn_2.addActionListener(listnerDuGroupe);
		
		JRadioButton rdbtn_3 = new JRadioButton("3");
		rdbtn_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_3.setBounds(100, 17, 45, 23);
		panel.add(rdbtn_3);
		rdbtn_3.setActionCommand("3");
		groupeDeBoutons.add(rdbtn_3);
		rdbtn_3.addActionListener(listnerDuGroupe);
		
		JRadioButton rdbtn_4 = new JRadioButton("4");
		rdbtn_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_4.setBounds(147, 17, 45, 23);
		panel.add(rdbtn_4);
		rdbtn_4.setActionCommand("4");
		groupeDeBoutons.add(rdbtn_4);
		rdbtn_4.addActionListener(listnerDuGroupe);
		
		JRadioButton rdbtn_5 = new JRadioButton("5");
		rdbtn_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_5.setBounds(194, 17, 45, 23);
		panel.add(rdbtn_5);
		rdbtn_5.setActionCommand("5");
		groupeDeBoutons.add(rdbtn_5);
		rdbtn_5.addActionListener(listnerDuGroupe);
		
		JRadioButton rdbtn_6 = new JRadioButton("6");
		rdbtn_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_6.setBounds(6, 43, 45, 23);
		panel.add(rdbtn_6);
		rdbtn_6.setActionCommand("6");
		groupeDeBoutons.add(rdbtn_6);
		rdbtn_6.addActionListener(listnerDuGroupe);
		
		JRadioButton rdbtn_7 = new JRadioButton("7");
		rdbtn_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_7.setBounds(53, 43, 45, 23);
		panel.add(rdbtn_7);
		rdbtn_7.setActionCommand("7");
		groupeDeBoutons.add(rdbtn_7);
		rdbtn_7.addActionListener(listnerDuGroupe);
		
		JRadioButton rdbtn_8 = new JRadioButton("8");
		rdbtn_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_8.setBounds(100, 43, 45, 23);
		panel.add(rdbtn_8);
		rdbtn_8.setActionCommand("8");
		groupeDeBoutons.add(rdbtn_8);
		rdbtn_8.addActionListener(listnerDuGroupe);
		
		JRadioButton rdbtn_9 = new JRadioButton("9");
		rdbtn_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_9.setBounds(147, 43, 45, 23);
		panel.add(rdbtn_9);
		rdbtn_9.setActionCommand("9");
		groupeDeBoutons.add(rdbtn_9);
		rdbtn_9.addActionListener(listnerDuGroupe);
		
		JRadioButton rdbtn_10 = new JRadioButton("10");
		rdbtn_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_10.setBounds(194, 43, 45, 23);
		panel.add(rdbtn_10);
		rdbtn_10.setActionCommand("10");
		groupeDeBoutons.add(rdbtn_10);
		rdbtn_10.addActionListener(listnerDuGroupe);
		
		JRadioButton rdbtn_11 = new JRadioButton("11");
		rdbtn_11.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_11.setBounds(6, 69, 45, 23);
		panel.add(rdbtn_11);
		rdbtn_11.setActionCommand("11");
		groupeDeBoutons.add(rdbtn_11);
		rdbtn_11.addActionListener(listnerDuGroupe);
		
		JRadioButton rdbtn_12 = new JRadioButton("12");
		rdbtn_12.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_12.setBounds(53, 69, 45, 23);
		panel.add(rdbtn_12);
		rdbtn_12.setActionCommand("12");
		groupeDeBoutons.add(rdbtn_12);
		rdbtn_12.addActionListener(listnerDuGroupe);
		
		JRadioButton rdbtn_13 = new JRadioButton("13");
		rdbtn_13.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_13.setBounds(100, 69, 45, 23);
		panel.add(rdbtn_13);
		rdbtn_13.setActionCommand("13");
		groupeDeBoutons.add(rdbtn_13);
		rdbtn_13.addActionListener(listnerDuGroupe);
		
		JRadioButton rdbtn_14 = new JRadioButton("14");
		rdbtn_14.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_14.setBounds(147, 69, 45, 23);
		panel.add(rdbtn_14);
		rdbtn_14.setActionCommand("14");
		groupeDeBoutons.add(rdbtn_14);
		rdbtn_14.addActionListener(listnerDuGroupe);
		
		JRadioButton rdbtn_15 = new JRadioButton("15");
		rdbtn_15.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_15.setBounds(194, 69, 45, 23);
		panel.add(rdbtn_15);
		rdbtn_15.setActionCommand("15");
		groupeDeBoutons.add(rdbtn_15);
		rdbtn_15.addActionListener(listnerDuGroupe);
		
		JRadioButton rdbtn_16 = new JRadioButton("16");
		rdbtn_16.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_16.setBounds(6, 95, 45, 23);
		panel.add(rdbtn_16);
		rdbtn_16.setActionCommand("16");
		groupeDeBoutons.add(rdbtn_16);
		rdbtn_16.addActionListener(listnerDuGroupe);
		
		JRadioButton rdbtn_17 = new JRadioButton("17");
		rdbtn_17.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_17.setBounds(53, 95, 45, 23);
		panel.add(rdbtn_17);
		rdbtn_17.setActionCommand("17");
		groupeDeBoutons.add(rdbtn_17);
		rdbtn_17.addActionListener(listnerDuGroupe);
		
		JRadioButton rdbtn_18 = new JRadioButton("18");
		rdbtn_18.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_18.setBounds(100, 95, 45, 23);
		panel.add(rdbtn_18);
		rdbtn_18.setActionCommand("18");
		groupeDeBoutons.add(rdbtn_18);
		rdbtn_18.addActionListener(listnerDuGroupe);
		
		JRadioButton rdbtn_19 = new JRadioButton("19");
		rdbtn_19.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_19.setBounds(147, 95, 45, 23);
		panel.add(rdbtn_19);
		rdbtn_19.setActionCommand("19");
		groupeDeBoutons.add(rdbtn_19);
		rdbtn_19.addActionListener(listnerDuGroupe);
		
		JRadioButton rdbtn_20 = new JRadioButton("20");
		rdbtn_20.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_20.setBounds(194, 95, 45, 23);
		panel.add(rdbtn_20);
		rdbtn_20.setActionCommand("20");
		groupeDeBoutons.add(rdbtn_20);
		rdbtn_20.addActionListener(listnerDuGroupe);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "D\u00E9partements", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(266, 11, 246, 127);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtn_92 = new JRadioButton("92");
		rdbtn_92.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_92.setBounds(95, 29, 56, 23);
		panel_1.add(rdbtn_92);
		rdbtn_92.setActionCommand("92");
		groupeDeBoutons.add(rdbtn_92);
		rdbtn_92.addActionListener(listnerDuGroupe);
		
		
		JRadioButton rdbtn_93 = new JRadioButton("93");
		rdbtn_93.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_93.setBounds(95, 55, 56, 23);
		panel_1.add(rdbtn_93);
		rdbtn_93.setActionCommand("93");
		groupeDeBoutons.add(rdbtn_93);
		rdbtn_93.addActionListener(listnerDuGroupe);
		
		JRadioButton rdbtn_94 = new JRadioButton("94");
		rdbtn_94.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_94.setBounds(95, 81, 109, 23);
		panel_1.add(rdbtn_94);
		rdbtn_94.setActionCommand("94");
		groupeDeBoutons.add(rdbtn_94);
		rdbtn_94.addActionListener(listnerDuGroupe);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Autres", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_2.setBounds(522, 11, 249, 127);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JRadioButton rdbtn_mobile = new JRadioButton("Mobile");
		rdbtn_mobile.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_mobile.setBounds(98, 36, 93, 50);
		panel_2.add(rdbtn_mobile);
		rdbtn_mobile.setActionCommand("mobile");
		groupeDeBoutons.add(rdbtn_mobile);
		rdbtn_mobile.addActionListener(listnerDuGroupe);
		
		panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Disponibilit\u00E9", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(10, 149, 761, 127);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		lbl_adresse = new JLabel("");
		lbl_adresse.setBounds(10, 25, 741, 14);
		panel_3.add(lbl_adresse);
		
		lbl_date_heure = new JLabel("Date et heure");
		lbl_date_heure.setBounds(10, 50, 305, 14);
		panel_3.add(lbl_date_heure);
		
		lbl_veloDisp = new JLabel("");
		lbl_veloDisp.setBounds(10, 75, 305, 14);
		panel_3.add(lbl_veloDisp);
		
		lbl_pointAttache = new JLabel("");
		lbl_pointAttache.setBounds(10, 100, 305, 14);
		panel_3.add(lbl_pointAttache);
		
		lbl_isOuvert = new JLabel("");
		lbl_isOuvert.setBounds(369, 50, 210, 14);
		panel_3.add(lbl_isOuvert);
		
		lbl_pointAttacheDisp = new JLabel("");
		lbl_pointAttacheDisp.setBounds(369, 75, 210, 14);
		panel_3.add(lbl_pointAttacheDisp);
		
		lbl_carte_bancaire = new JLabel("");
		lbl_carte_bancaire.setBounds(369, 100, 210, 14);
		panel_3.add(lbl_carte_bancaire);
		
		scrollPaneStations = new JScrollPane();
		scrollPaneStations.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		scrollPaneStations.setBounds(10, 286, 761, 199);
		contentPane.add(scrollPaneStations);
		
		formater = new SimpleDateFormat("'le' dd/MM/yyyy 'à' hh:mm:ss");
		aujourdhui = new Date();
	    lbl_date_heure.setText("");
		modelTable = new MyTableModel();
		tableStations = new JTable();
		tableStations.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Verification si l'utilisateur na clic pas sur un case vide
				if (tableStations.getSelectedRow() != -1){
					afficherDisponibilite();
				}
			}
		});
		tableStations.setModel(modelTable);
		scrollPaneStations.setViewportView(tableStations);
		
		JButton btn_rafraichir = new JButton("Rafra\u00EEchir");
		btn_rafraichir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				rafraichirTable();
			}
		});
		btn_rafraichir.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn_rafraichir.setIcon(new ImageIcon(FrmStations.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		btn_rafraichir.setBounds(672, 496, 99, 23);
		contentPane.add(btn_rafraichir);
	}
	
	//Affichage des information dans les différent Label du Panel disponibilité
	public void afficherDisponibilite(){
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
			lbl_isOuvert.setText("La station est fermé.");
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
		lbl_pointAttache.setText("Nombre total de point d'attache : " + maMapDisponibilite.get("total"));
		lbl_pointAttacheDisp.setText("Point d'attache disponible : " + maMapDisponibilite.get("free"));
		
	
	}
	
	//Afficher les stations dans la JTable en rapport avec le numéro de l'arrondissement choisi
	public void afficherStaionsSelect(String numArr){
		((MyTableModel) tableStations.getModel()).setLesStations(numArr);
		tableStations.revalidate();
		tableStations.clearSelection();
		tableStations.repaint();
		viderDisponibilite();
	}
	
	//Rafraichir la JTable
	public void rafraichirTable(){
		groupeDeBoutons.clearSelection();
		tableStations.clearSelection();
		modelTable = new MyTableModel();
		tableStations.setModel(modelTable);
		viderDisponibilite();
	}
	
	//Fonction pour vider le panel des disponibilité
	//On parcour tout les composants du panel avec une boucle et on set leur text à ""
	public void viderDisponibilite(){
		for (Component leComposant : panel_3.getComponents()){
			((JLabel) leComposant).setText("");
		}
	}
	
	//Creation de la class ActionListenerBoutonGroupe qui va gérer les click sur les boutons
	class ActionListenerBoutonGroupe implements ActionListener {
	      public void actionPerformed(ActionEvent e) {
	    	  afficherStaionsSelect(e.getActionCommand());
	      }
	}
}
