public class Property{
	
	private String kiinteistotyyppi;
	private String sijainti;
	
	public Property(String kiinteistotyyppi, String sijainti){
		this.kiinteistotyyppi = kiinteistotyyppi;
		this.sijainti = sijainti;
	}
	
	//Luodaan setterit
	
	public void setKiinteistotyyppi(String kiinteistotyyppi){
		this.kiinteistotyyppi = kiinteistotyyppi;
	}
	
	public void setSijainti(String sijainti){
		this.sijainti = sijainti;
	}
	
	//Luodaan Getterit
	
	public String getKiinteistotyyppi(){
		return kiinteistotyyppi;
	}
	
	public String getSijainti(){
		return sijainti;
	}
}
