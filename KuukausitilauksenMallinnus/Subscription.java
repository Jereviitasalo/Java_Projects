public class Subscription{
	
	//Luodaan luokalle jäsenmuuttujat/attribuutit
	
	String tilaajan_nimi;
	String lehden_nimi;
	String toimitusosoite;
	double kuukausihinta;
	
	//Luodaan konstruktori
	
	public Subscription(String tilaajan_nimi, String lehden_nimi, String toimitusosoite, double kuukausihinta){
		this.tilaajan_nimi = tilaajan_nimi;
		this.lehden_nimi = lehden_nimi;
		this.toimitusosoite = toimitusosoite;
		this.kuukausihinta = kuukausihinta;
	}
	
	//Luodaan setterit
		
	public void setTilaajan_nimi(String tilaajan_nimi){
		this.tilaajan_nimi = tilaajan_nimi;
	}
	
	public void setLehden_nimi(String lehden_nimi){
		this.lehden_nimi = lehden_nimi;
	}
	
	public void setToimitusosoite(String toimitusosoite){
		this.toimitusosoite = toimitusosoite;
	}
	
	public void setKuukausihinta(double kuukausihinta){
		this.kuukausihinta = kuukausihinta;
	}
	
	// Luodaan getterit
	
	public String getTilaajan_nimi(){
		return tilaajan_nimi;
	}
	
	public String getLehden_nimi(){
		return lehden_nimi;
	}
	
	public String getToimitusosoite(){
		return toimitusosoite;
	}
	
	public double getKuukausihinta(){
		return kuukausihinta;
	}
	
	public void printInvoice(){
		
	}
	
}