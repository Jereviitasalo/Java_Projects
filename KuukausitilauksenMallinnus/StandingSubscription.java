public class StandingSubscription extends Subscription{
    
    private int alennusprosentti;

    public StandingSubscription(int alennusprosentti, String tilaajan_nimi, String lehden_nimi, String toimitusosoite, double kuukausihinta){
        super(tilaajan_nimi, lehden_nimi, toimitusosoite, kuukausihinta);
        this.alennusprosentti = alennusprosentti;
    }

    //Setterit

    public void setAlennusprosentti(int alennusprosentti){
        this.alennusprosentti = alennusprosentti;
    }

    //Getterit

    public int getAlennusprosentti(){
        return alennusprosentti;
    }

    public double laskeStandingHinta(){
        return (kuukausihinta * 12) - (((double)getAlennusprosentti() / 100) * (kuukausihinta * 12));
    }
	
	public void printInvoice(){
		System.out.println("\nTilauksesi tyyppi: Kestotilaus\nTilaajan nimi: " + tilaajan_nimi +
		"\nLehden nimi: " + lehden_nimi + "\nToimitusosoite: " + toimitusosoite + 
		"\nTilauksen kesto: 12 kuukautta\nTilauksen hinta: " + laskeStandingHinta() + " euroa");
	}
}