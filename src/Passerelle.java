import java.util.HashMap;

import javax.xml.parsers.*;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import java.io.IOException;


public class Passerelle {

	private static String urlCarto = "http://www.velib.paris.fr/service/carto";
	private static String urlDispo = "http://www.velib.paris.fr/service/stationdetails/";
	private static Document document;
	
	
	public Passerelle(){
		
	}
	
	public static Document initialisation(String url){
		DocumentBuilderFactory fabrique = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder constructeur = fabrique.newDocumentBuilder();
			try {
				document = constructeur.parse(url);
				return document;
			} catch (SAXException | IOException e) {
				e.printStackTrace();
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Carte getCarte(){
		initialisation(urlCarto);
		Element racine = document.getDocumentElement();
		int nb = 0;
		int i = 0;
		nb = racine.getElementsByTagName("marker").getLength();
		System.out.println(nb);
		Carte carte = new Carte();
		NodeList nodeList;
		nodeList = racine.getElementsByTagName("marker");
		while (nb > i){
			String unNumero = ((Element) nodeList.item(i)).getAttribute("number");
			String uneAdresse = ((Element) nodeList.item(i)).getAttribute("address");
			String bonus = ((Element) nodeList.item(i)).getAttribute("bonus");
			String ouvert = ((Element) nodeList.item(i)).getAttribute("open");
			Boolean unBonus;
			
			if (bonus.equals("0")){
				unBonus = false;
			}
			else{
				unBonus = true;
			}
			
			Boolean etatOuvert;
			if (ouvert.equals("0")){
				etatOuvert = false;
			}
			else{
				etatOuvert = true;
			}
			
			System.out.println(unNumero + " | " + uneAdresse + " | " + unBonus + " | " + etatOuvert);
			carte.ajouteStations(unNumero, uneAdresse, unBonus, etatOuvert);
			i ++;
		}
		return carte;
	}
	
	public static HashMap<String , String> getDispo(String unNumero){
		HashMap<String, String> maMap = new HashMap();
		initialisation(urlDispo + unNumero);
		Element racineDispo = document.getDocumentElement();
		NodeList nodeListDispo;
		nodeListDispo = racineDispo.getElementsByTagName("*");
		int nbCle = nodeListDispo.getLength();
		int iCle = 0;
		while (nbCle > iCle){
			String key = nodeListDispo.item(iCle).getNodeName();
			String elem = nodeListDispo.item(iCle).getTextContent();
			System.out.println(key);
			System.out.println(elem);
			maMap.put(key, elem);
			iCle ++;
		}
		return maMap;
	}
}
