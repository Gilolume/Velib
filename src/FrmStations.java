import java.awt.BorderLayout;
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
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("serial")
public class FrmStations extends JFrame implements Observer {
	public Modele modele;
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
	private JPanel panel_3;
	private ButtonGroup groupeDeBoutons = new ButtonGroup();
	private JRadioButton rdbtn_1;
	private JRadioButton rdbtn_2;
	private JRadioButton rdbtn_3;
	private JRadioButton rdbtn_4;
	private JRadioButton rdbtn_5;
	private JRadioButton rdbtn_6;
	private JRadioButton rdbtn_7;
	private JRadioButton rdbtn_8;
	private JRadioButton rdbtn_9;
	private JRadioButton rdbtn_10;
	private JRadioButton rdbtn_11;
	private JRadioButton rdbtn_12;
	private JRadioButton rdbtn_13;
	private JRadioButton rdbtn_14;
	private JRadioButton rdbtn_15;
	private JRadioButton rdbtn_16;
	private JRadioButton rdbtn_17;
	private JRadioButton rdbtn_18;
	private JRadioButton rdbtn_19;
	private JRadioButton rdbtn_20;
	private JRadioButton rdbtn_92;
	private JRadioButton rdbtn_93;
	private JRadioButton rdbtn_94;
	private JRadioButton rdbtn_mobile;
	private JButton btn_rafraichir;
	
	/**
	 * Create the frame.
	 */
	public FrmStations(Modele modele) {
		this.modele = modele;
		modele.addObserver(this);
		pack();
		
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
		
		rdbtn_1 = new JRadioButton("1");
		rdbtn_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_1.setBounds(6, 17, 45, 23);
		panel.add(rdbtn_1);
		rdbtn_1.setActionCommand("1");
		groupeDeBoutons.add(rdbtn_1);
		//rdbtn_1.addActionListener(listnerDuGroupe);
		
		rdbtn_2 = new JRadioButton("2");
		rdbtn_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_2.setBounds(53, 17, 45, 23);
		panel.add(rdbtn_2);
		rdbtn_2.setActionCommand("2");
		groupeDeBoutons.add(rdbtn_2);
		//rdbtn_2.addActionListener(listnerDuGroupe);
		
		rdbtn_3 = new JRadioButton("3");
		rdbtn_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_3.setBounds(100, 17, 45, 23);
		panel.add(rdbtn_3);
		rdbtn_3.setActionCommand("3");
		groupeDeBoutons.add(rdbtn_3);
		//rdbtn_3.addActionListener(listnerDuGroupe);
		
		rdbtn_4 = new JRadioButton("4");
		rdbtn_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_4.setBounds(147, 17, 45, 23);
		panel.add(rdbtn_4);
		rdbtn_4.setActionCommand("4");
		groupeDeBoutons.add(rdbtn_4);
		//rdbtn_4.addActionListener(listnerDuGroupe);
		
		rdbtn_5 = new JRadioButton("5");
		rdbtn_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_5.setBounds(194, 17, 45, 23);
		panel.add(rdbtn_5);
		rdbtn_5.setActionCommand("5");
		groupeDeBoutons.add(rdbtn_5);
		//rdbtn_5.addActionListener(listnerDuGroupe);
		
		rdbtn_6 = new JRadioButton("6");
		rdbtn_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_6.setBounds(6, 43, 45, 23);
		panel.add(rdbtn_6);
		rdbtn_6.setActionCommand("6");
		groupeDeBoutons.add(rdbtn_6);
		//rdbtn_6.addActionListener(listnerDuGroupe);
		
		rdbtn_7 = new JRadioButton("7");
		rdbtn_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_7.setBounds(53, 43, 45, 23);
		panel.add(rdbtn_7);
		rdbtn_7.setActionCommand("7");
		groupeDeBoutons.add(rdbtn_7);
		//rdbtn_7.addActionListener(listnerDuGroupe);
		
		rdbtn_8 = new JRadioButton("8");
		rdbtn_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_8.setBounds(100, 43, 45, 23);
		panel.add(rdbtn_8);
		rdbtn_8.setActionCommand("8");
		groupeDeBoutons.add(rdbtn_8);
		//rdbtn_8.addActionListener(listnerDuGroupe);
		
		rdbtn_9 = new JRadioButton("9");
		rdbtn_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_9.setBounds(147, 43, 45, 23);
		panel.add(rdbtn_9);
		rdbtn_9.setActionCommand("9");
		groupeDeBoutons.add(rdbtn_9);
		//rdbtn_9.addActionListener(listnerDuGroupe);
		
		rdbtn_10 = new JRadioButton("10");
		rdbtn_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_10.setBounds(194, 43, 45, 23);
		panel.add(rdbtn_10);
		rdbtn_10.setActionCommand("10");
		groupeDeBoutons.add(rdbtn_10);
		//rdbtn_10.addActionListener(listnerDuGroupe);
		
		rdbtn_11 = new JRadioButton("11");
		rdbtn_11.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_11.setBounds(6, 69, 45, 23);
		panel.add(rdbtn_11);
		rdbtn_11.setActionCommand("11");
		groupeDeBoutons.add(rdbtn_11);
		//rdbtn_11.addActionListener(listnerDuGroupe);
		
		rdbtn_12 = new JRadioButton("12");
		rdbtn_12.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_12.setBounds(53, 69, 45, 23);
		panel.add(rdbtn_12);
		rdbtn_12.setActionCommand("12");
		groupeDeBoutons.add(rdbtn_12);
		//rdbtn_12.addActionListener(listnerDuGroupe);
		
		rdbtn_13 = new JRadioButton("13");
		rdbtn_13.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_13.setBounds(100, 69, 45, 23);
		panel.add(rdbtn_13);
		rdbtn_13.setActionCommand("13");
		groupeDeBoutons.add(rdbtn_13);
		//rdbtn_13.addActionListener(listnerDuGroupe);
		
		rdbtn_14 = new JRadioButton("14");
		rdbtn_14.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_14.setBounds(147, 69, 45, 23);
		panel.add(rdbtn_14);
		rdbtn_14.setActionCommand("14");
		groupeDeBoutons.add(rdbtn_14);
		//rdbtn_14.addActionListener(listnerDuGroupe);
		
		rdbtn_15 = new JRadioButton("15");
		rdbtn_15.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_15.setBounds(194, 69, 45, 23);
		panel.add(rdbtn_15);
		rdbtn_15.setActionCommand("15");
		groupeDeBoutons.add(rdbtn_15);
		//rdbtn_15.addActionListener(listnerDuGroupe);
		
		rdbtn_16 = new JRadioButton("16");
		rdbtn_16.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_16.setBounds(6, 95, 45, 23);
		panel.add(rdbtn_16);
		rdbtn_16.setActionCommand("16");
		groupeDeBoutons.add(rdbtn_16);
		//rdbtn_16.addActionListener(listnerDuGroupe);
		
		rdbtn_17 = new JRadioButton("17");
		rdbtn_17.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_17.setBounds(53, 95, 45, 23);
		panel.add(rdbtn_17);
		rdbtn_17.setActionCommand("17");
		groupeDeBoutons.add(rdbtn_17);
		//rdbtn_17.addActionListener(listnerDuGroupe);
		
		rdbtn_18 = new JRadioButton("18");
		rdbtn_18.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_18.setBounds(100, 95, 45, 23);
		panel.add(rdbtn_18);
		rdbtn_18.setActionCommand("18");
		groupeDeBoutons.add(rdbtn_18);
		//rdbtn_18.addActionListener(listnerDuGroupe);
		
		rdbtn_19 = new JRadioButton("19");
		rdbtn_19.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_19.setBounds(147, 95, 45, 23);
		panel.add(rdbtn_19);
		rdbtn_19.setActionCommand("19");
		groupeDeBoutons.add(rdbtn_19);
		//rdbtn_19.addActionListener(listnerDuGroupe);
		
		rdbtn_20 = new JRadioButton("20");
		rdbtn_20.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_20.setBounds(194, 95, 45, 23);
		panel.add(rdbtn_20);
		rdbtn_20.setActionCommand("20");
		groupeDeBoutons.add(rdbtn_20);
		//rdbtn_20.addActionListener(listnerDuGroupe);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "D\u00E9partements", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(266, 11, 246, 127);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		rdbtn_92 = new JRadioButton("92");
		rdbtn_92.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_92.setBounds(95, 29, 56, 23);
		panel_1.add(rdbtn_92);
		rdbtn_92.setActionCommand("92");
		groupeDeBoutons.add(rdbtn_92);
		//rdbtn_92.addActionListener(listnerDuGroupe);
		
		
		rdbtn_93 = new JRadioButton("93");
		rdbtn_93.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_93.setBounds(95, 55, 56, 23);
		panel_1.add(rdbtn_93);
		rdbtn_93.setActionCommand("93");
		groupeDeBoutons.add(rdbtn_93);
		//rdbtn_93.addActionListener(listnerDuGroupe);
		
		rdbtn_94 = new JRadioButton("94");
		rdbtn_94.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_94.setBounds(95, 81, 109, 23);
		panel_1.add(rdbtn_94);
		rdbtn_94.setActionCommand("94");
		groupeDeBoutons.add(rdbtn_94);
		//rdbtn_94.addActionListener(listnerDuGroupe);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Autres", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_2.setBounds(522, 11, 249, 127);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		rdbtn_mobile = new JRadioButton("Mobile");
		rdbtn_mobile.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtn_mobile.setBounds(98, 36, 93, 50);
		panel_2.add(rdbtn_mobile);
		rdbtn_mobile.setActionCommand("mobile");
		groupeDeBoutons.add(rdbtn_mobile);
		//rdbtn_mobile.addActionListener(listnerDuGroupe);
		
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
		scrollPaneStations.setBounds(10, 286, 761, 199);
		contentPane.add(scrollPaneStations);
		
		formater = new SimpleDateFormat("'le' dd/MM/yyyy 'à' hh:mm:ss");
		aujourdhui = new Date();
	    lbl_date_heure.setText("");
		modelTable = new MyTableModel();
		tableStations = new JTable();
		tableStations.setModel(modelTable);
		scrollPaneStations.setViewportView(tableStations);
		
		btn_rafraichir = new JButton("Rafra\u00EEchir");
		btn_rafraichir.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn_rafraichir.setIcon(new ImageIcon(FrmStations.class.getResource("/com/sun/javafx/scene/web/skin/Undo_16x16_JFX.png")));
		btn_rafraichir.setBounds(672, 496, 99, 23);
		contentPane.add(btn_rafraichir);
		setVisible(true);
	}
	
	public void update(Observable o, Object arg) {
		tableStations.revalidate();
		tableStations.clearSelection();
		tableStations.repaint();
    }

	public JRadioButton getRdbtn_1() {
		return rdbtn_1;
	}

	public void setRdbtn_1(JRadioButton rdbtn_1) {
		this.rdbtn_1 = rdbtn_1;
	}

	public JRadioButton getRdbtn_2() {
		return rdbtn_2;
	}

	public void setRdbtn_2(JRadioButton rdbtn_2) {
		this.rdbtn_2 = rdbtn_2;
	}

	public JRadioButton getRdbtn_3() {
		return rdbtn_3;
	}

	public void setRdbtn_3(JRadioButton rdbtn_3) {
		this.rdbtn_3 = rdbtn_3;
	}

	public JRadioButton getRdbtn_4() {
		return rdbtn_4;
	}

	public void setRdbtn_4(JRadioButton rdbtn_4) {
		this.rdbtn_4 = rdbtn_4;
	}

	public JRadioButton getRdbtn_5() {
		return rdbtn_5;
	}

	public void setRdbtn_5(JRadioButton rdbtn_5) {
		this.rdbtn_5 = rdbtn_5;
	}

	public JRadioButton getRdbtn_6() {
		return rdbtn_6;
	}

	public void setRdbtn_6(JRadioButton rdbtn_6) {
		this.rdbtn_6 = rdbtn_6;
	}

	public JRadioButton getRdbtn_7() {
		return rdbtn_7;
	}

	public void setRdbtn_7(JRadioButton rdbtn_7) {
		this.rdbtn_7 = rdbtn_7;
	}

	public JRadioButton getRdbtn_8() {
		return rdbtn_8;
	}

	public void setRdbtn_8(JRadioButton rdbtn_8) {
		this.rdbtn_8 = rdbtn_8;
	}

	public JRadioButton getRdbtn_9() {
		return rdbtn_9;
	}

	public void setRdbtn_9(JRadioButton rdbtn_9) {
		this.rdbtn_9 = rdbtn_9;
	}

	public JRadioButton getRdbtn_10() {
		return rdbtn_10;
	}

	public void setRdbtn_10(JRadioButton rdbtn_10) {
		this.rdbtn_10 = rdbtn_10;
	}

	public JRadioButton getRdbtn_11() {
		return rdbtn_11;
	}

	public void setRdbtn_11(JRadioButton rdbtn_11) {
		this.rdbtn_11 = rdbtn_11;
	}

	public JRadioButton getRdbtn_12() {
		return rdbtn_12;
	}

	public void setRdbtn_12(JRadioButton rdbtn_12) {
		this.rdbtn_12 = rdbtn_12;
	}

	public JRadioButton getRdbtn_13() {
		return rdbtn_13;
	}

	public void setRdbtn_13(JRadioButton rdbtn_13) {
		this.rdbtn_13 = rdbtn_13;
	}

	public JRadioButton getRdbtn_14() {
		return rdbtn_14;
	}

	public void setRdbtn_14(JRadioButton rdbtn_14) {
		this.rdbtn_14 = rdbtn_14;
	}

	public JRadioButton getRdbtn_15() {
		return rdbtn_15;
	}

	public void setRdbtn_15(JRadioButton rdbtn_15) {
		this.rdbtn_15 = rdbtn_15;
	}

	public JRadioButton getRdbtn_16() {
		return rdbtn_16;
	}

	public void setRdbtn_16(JRadioButton rdbtn_16) {
		this.rdbtn_16 = rdbtn_16;
	}

	public JRadioButton getRdbtn_17() {
		return rdbtn_17;
	}

	public void setRdbtn_17(JRadioButton rdbtn_17) {
		this.rdbtn_17 = rdbtn_17;
	}

	public JRadioButton getRdbtn_18() {
		return rdbtn_18;
	}

	public void setRdbtn_18(JRadioButton rdbtn_18) {
		this.rdbtn_18 = rdbtn_18;
	}

	public JRadioButton getRdbtn_19() {
		return rdbtn_19;
	}

	public void setRdbtn_19(JRadioButton rdbtn_19) {
		this.rdbtn_19 = rdbtn_19;
	}

	public JRadioButton getRdbtn_20() {
		return rdbtn_20;
	}

	public void setRdbtn_20(JRadioButton rdbtn_20) {
		this.rdbtn_20 = rdbtn_20;
	}

	public JRadioButton getRdbtn_92() {
		return rdbtn_92;
	}

	public void setRdbtn_92(JRadioButton rdbtn_92) {
		this.rdbtn_92 = rdbtn_92;
	}

	public JRadioButton getRdbtn_93() {
		return rdbtn_93;
	}

	public void setRdbtn_93(JRadioButton rdbtn_93) {
		this.rdbtn_93 = rdbtn_93;
	}

	public JRadioButton getRdbtn_94() {
		return rdbtn_94;
	}

	public void setRdbtn_94(JRadioButton rdbtn_94) {
		this.rdbtn_94 = rdbtn_94;
	}

	public JRadioButton getRdbtn_mobile() {
		return rdbtn_mobile;
	}

	public void setRdbtn_mobile(JRadioButton rdbtn_mobile) {
		this.rdbtn_mobile = rdbtn_mobile;
	}

	public JButton getBtn_rafraichir() {
		return btn_rafraichir;
	}

	public void setBtn_rafraichir(JButton btn_rafraichir) {
		this.btn_rafraichir = btn_rafraichir;
	}

	public ButtonGroup getGroupeDeBoutons() {
		return groupeDeBoutons;
	}

	public void setGroupeDeBoutons(ButtonGroup groupeDeBoutons) {
		this.groupeDeBoutons = groupeDeBoutons;
	}

	public JPanel getPanel_3() {
		return panel_3;
	}

	public void setPanel_3(JPanel panel_3) {
		this.panel_3 = panel_3;
	}

	public MyTableModel getModelTable() {
		return modelTable;
	}

	public void setModelTable(MyTableModel modelTable) {
		this.modelTable = modelTable;
	}

	public JScrollPane getScrollPaneStations() {
		return scrollPaneStations;
	}

	public void setScrollPaneStations(JScrollPane scrollPaneStations) {
		this.scrollPaneStations = scrollPaneStations;
	}

	public JTable getTableStations() {
		return tableStations;
	}

	public void setTableStations(JTable tableStations) {
		this.tableStations = tableStations;
	}

	public JLabel getLbl_adresse() {
		return lbl_adresse;
	}

	public void setLbl_adresse(JLabel lbl_adresse) {
		this.lbl_adresse = lbl_adresse;
	}

	public JLabel getLbl_date_heure() {
		return lbl_date_heure;
	}

	public void setLbl_date_heure(JLabel lbl_date_heure) {
		this.lbl_date_heure = lbl_date_heure;
	}

	public JLabel getLbl_veloDisp() {
		return lbl_veloDisp;
	}

	public void setLbl_veloDisp(JLabel lbl_veloDisp) {
		this.lbl_veloDisp = lbl_veloDisp;
	}

	public JLabel getLbl_pointAttache() {
		return lbl_pointAttache;
	}

	public void setLbl_pointAttache(JLabel lbl_pointAttache) {
		this.lbl_pointAttache = lbl_pointAttache;
	}

	public JLabel getLbl_isOuvert() {
		return lbl_isOuvert;
	}

	public void setLbl_isOuvert(JLabel lbl_isOuvert) {
		this.lbl_isOuvert = lbl_isOuvert;
	}

	public JLabel getLbl_pointAttacheDisp() {
		return lbl_pointAttacheDisp;
	}

	public void setLbl_pointAttacheDisp(JLabel lbl_pointAttacheDisp) {
		this.lbl_pointAttacheDisp = lbl_pointAttacheDisp;
	}

	public JLabel getLbl_carte_bancaire() {
		return lbl_carte_bancaire;
	}

	public void setLbl_carte_bancaire(JLabel lbl_carte_bancaire) {
		this.lbl_carte_bancaire = lbl_carte_bancaire;
	}

	public SimpleDateFormat getFormater() {
		return formater;
	}

	public void setFormater(SimpleDateFormat formater) {
		this.formater = formater;
	}

	public Date getAujourdhui() {
		return aujourdhui;
	}

	public void setAujourdhui(Date aujourdhui) {
		this.aujourdhui = aujourdhui;
	}
	
	
	
}
