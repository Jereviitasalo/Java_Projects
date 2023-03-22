public class Rakennus{
	
	// Jasenmuuttujat
	
	private int asuntoLkm;
	private int pintaAlaAsunto;
	private int huoneetLkm;
	private int asukasLkm;
	
	// Konstruktori
	
	public Rakennus(int asuntoLkm, int pintaAlaAsunto, int huoneetLkm, int asukasLkm){
		this.asuntoLkm = asuntoLkm;
		this.pintaAlaAsunto = pintaAlaAsunto;
		this.huoneetLkm = huoneetLkm;
		this.asukasLkm = asukasLkm;
	}
	
	// Setterit
	
	public void setAsuntoLkm(int asuntoLkm){
		this.asuntoLkm = asuntoLkm;
	}
	
	public void setPintaAlaAsunto(int pintaAlaAsunto){
		this.pintaAlaAsunto = pintaAlaAsunto;
	}
	
	public void sethuoneetLkm(int huoneetLkm){
		this.huoneetLkm = huoneetLkm;
	}
	
	public void setAsukasLkm(int asukasLkm){
		this.asukasLkm = asukasLkm;
	}
	
	// Getterit
	
	public int getAsuntoLkm(){
		return asuntoLkm;
	}
	
	public int getPintaAlaAsunto(){
		return pintaAlaAsunto;
	}
	
	public int getHuoneetLkm(){
		return huoneetLkm;
	}
	
	public int getAsukasLkm(){
		return asukasLkm;
	}
	
	public String toString(){
		return "Asuntojen lukumaara: " + asuntoLkm + "\nAsunnon pinta-ala: " + pintaAlaAsunto + 
		" neliometria\nAsunnon huoneiden maara: " + huoneetLkm + "\nAsunnon asukkaiden maara: " + asukasLkm;
	}
}