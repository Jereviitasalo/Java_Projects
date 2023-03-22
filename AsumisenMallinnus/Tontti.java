public class Tontti{
	
	//Luodaan luokalle jäsenmuuttujat
	private String nimi;
	private String leveyspiiri;
	private String pituuspiiri;
	private int pintaAla;
	
	//Luodaan luokalle muodostin/konstruktori
	public Tontti(String nimi, String leveyspiiri, String pituuspiiri, int pintaAla){
		this.nimi = nimi;
		this.leveyspiiri = leveyspiiri;
		this.pituuspiiri = pituuspiiri;
		this.pintaAla = pintaAla;
	}
	
	public String getNimi(){
		return nimi;
	}
	public String getLeveyspiiri(){
		return leveyspiiri;
	}
	public String getPituuspiiri(){
		return pituuspiiri;
	}
	public int getPintaAla(){
		return pintaAla;
	}
	
	public void tulostus(){
		System.out.println("\nTONTIN TIEDOT\nNimi: " + getNimi() + ".\nSijainti: (leveyspiiri: " + getLeveyspiiri() + 
		", pituuspiiri: " + getPituuspiiri() + ").\nPinta-ala: " + getPintaAla() + " neliometria.");
	}
	
	/*public String toString(){
		return("TONTIN TIEDOT\nNimi: " + getNimi() + ".\nSijainti: (leveyspiiri: " + getLeveyspiiri() + 
		", pituuspiiri: " + getPituuspiiri() + ").\nPinta-ala: " + getPintaAla() + " neliometria.");
	}*/
	
}