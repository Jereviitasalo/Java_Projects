public class InsuranceInfo{
	
	private double vakuutusarvo;
	private Property property;
	
	public InsuranceInfo(double vakuutusarvo, Property property){
		this.vakuutusarvo = vakuutusarvo;
		this.property = property;
	}
	
	//Setterit
	public void setVakuutusarvo(double vakuutusarvo){
		this.vakuutusarvo = vakuutusarvo;
	}
	
	public void setProperty(Property property){
		this.property = property;
	}
	
	//Getterit
	public double getVakuutusarvo(){
		return vakuutusarvo;
	}
	
	public Property getProperty(){
		return property;
	}
	
	//Kiinteistötietojen tulostus
	public void tulostus(){
		System.out.println("Tyyppi: " + property.getKiinteistotyyppi() + ".");
		System.out.println("Sijainti: " + property.getSijainti() + ".");
		System.out.println("Vakuutusarvo: " + vakuutusarvo + " euroa.\n");
	}
}