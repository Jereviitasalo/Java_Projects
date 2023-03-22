public class Asukas extends Rakennus{
	
	// Jasenmuuttujat
	
	private String nimiAsukas;
	
	// Konstruktori
	
	public Asukas(String nimiAsukas, int asuntoLkm, int pintaAlaAsunto, int huoneetLkm, int asukasLkm){
		super(asuntoLkm, pintaAlaAsunto, huoneetLkm, asukasLkm);
		this.nimiAsukas = nimiAsukas;
	}
	
	// Setteri
	
	public void setNimiAsukas(String nimiAsukas){
		this.nimiAsukas = nimiAsukas;
	}
	
	// Getteri
	
	public String getNimiAsukas(){
		return nimiAsukas;
	}
}