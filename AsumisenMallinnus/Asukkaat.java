public class Asukkaat{
	
	//Luodaan luokalle jäsenmuuttujat
	private String nimi;
	private int syntymavuosi;
	
	//Luodaan luokalle muodostin/konstruktori
	public Asukkaat(String nimi, int syntymavuosi){
		this.nimi = nimi;
		this.syntymavuosi = syntymavuosi;
	}
	
	public void setNimiJaIka(String nimi, int ika){
		this.nimi = nimi;
		this.syntymavuosi = syntymavuosi;
	}
	
	public String getNimi(){
		return nimi;
	}
	
	public int getSyntymavuosi(){
		return syntymavuosi;
	}
	
	public void tulostus(){
		System.out.println("Nimi: " + getNimi() + ". Syntymavuosi: " + getSyntymavuosi() + ".");
	}
	
	/*public String toString(){
		return "ASUKKAIDEN TIEDOT\nNimi: " + getNimi() + ", Syntymavuosi: " + getSyntymavuosi() + ".";
	}*/
}