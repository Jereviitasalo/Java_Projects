public class Tontti{

	//Jasenmuuttujat
	private String nimiTontti;
	private String osoiteTontti;
	private int pintaAlaTontti;
	
	//Konstruktori
	public Tontti(String nimiTontti, String osoiteTontti, int pintaAlaTontti){
		this.nimiTontti = nimiTontti;
		this.osoiteTontti = osoiteTontti;
		this.pintaAlaTontti = pintaAlaTontti;
	}
	
	//Getterit
	public String getNimiTontti(){
		return nimiTontti;
	}
	public String getosoiteTontti(){
		return osoiteTontti;
	}
	
	public int getPintaAlaTontti(){
		return pintaAlaTontti;
	}

	public String toString(){
		return "\nTontin nimi: " + nimiTontti + "\nTontin osoite: " + osoiteTontti + 
		"\nTontin pinta-ala: " + pintaAlaTontti + " neliometria\n----------------------------------";
	}
}