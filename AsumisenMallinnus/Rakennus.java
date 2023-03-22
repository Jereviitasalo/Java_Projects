public class Rakennus{
	
	//Luodaan tarvittavat jäsenmuuttujat luokalle
	private int pintaAla;
	private int huoneet;
	private int asukkaat;
	
	//Luodaan luokalle muodostin/konstruktori
	public Rakennus(int pintaAla, int huoneet, int asukkaat){
		this.pintaAla = pintaAla;
		this.huoneet = huoneet;
		this.asukkaat = asukkaat;
	}
	
	public int getPintaAla(){
		return pintaAla;
	}
	
	public int getHuoneet(){
		return huoneet;
	}
	
	public int getAsukkaat(){
		return asukkaat;
	}
	
	public void tulostus(){
		System.out.println("\nRAKENNUKSEN TIEDOT\nPinta-ala: " + getPintaAla() + " neliometria.\nHuoneiden lukumaara: " + getHuoneet() 
		+ " huonetta.\nAsukkaiden lukumaara: " + getAsukkaat() + " henkiloa.");
	}
	
	/*public String toString(){
		return "\nRAKENNUKSEN TIEDOT\nPinta-ala: " + getPintaAla() + " neliometria.\nHuoneiden lukumaara: " + getHuoneet() 
		+ " huonetta.\nAsukkaiden lukumaara: " + getAsukkaat() + " henkiloa.";
	}*/
}