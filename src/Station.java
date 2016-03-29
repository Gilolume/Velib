
public class Station {

	private String adresse;
	private String arrondissement;
	private boolean bonus;
	private String numero;
	private boolean ouvert;
	
	public Station(String numero, String adresse, boolean bonus, boolean ouvert){
		this.numero = numero;
		this.adresse = adresse;
		if (Integer.parseInt(numero) < 21000){
			if (numero.length() == 5){
				this.arrondissement = numero.substring(0, 2);
			}
			else{
				this.arrondissement = numero.substring(0, 1);
			}
			
		}
		else{
			this.arrondissement = "9" + numero.substring(0, 1);
		}
		this.bonus = bonus;
		this.ouvert = ouvert;
	}
	
	public String getAdresse(){
		return this.adresse;
	}
	
	public String getArrondissement(){
		return this.arrondissement;
	}
	
	public boolean isBonus(){
		return this.bonus;
	}
	
	public String getNumero(){
		return this.numero;
	}
	
	public boolean isOuvert(){
		return this.ouvert;
	}
	
	public String toString(){
		return " ; Numero : " + this.numero + "Adresse : " + this.adresse + " ; Arrondissement : " + this.arrondissement + " ; Bonus : " + this.bonus + " ; Ouvert : " + this.ouvert;
	}
	
}
