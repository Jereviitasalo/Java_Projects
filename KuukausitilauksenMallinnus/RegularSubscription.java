public class RegularSubscription extends Subscription {

    private int kesto;

    public RegularSubscription (int kesto, String tilaajan_nimi, String lehden_nimi, String toimitusosoite, double kuukausihinta){
        super(tilaajan_nimi, lehden_nimi, toimitusosoite, kuukausihinta);
        this.kesto = kesto;
    }

    //Setterit

    public void setKesto(int kesto){
        this.kesto = kesto;
    }

    //Getterit

    public int getKesto(){
        return kesto;
    }

    public double laskeRegularHinta(){
        return getKesto() * kuukausihinta;
    }
	
	public void printInvoice(){
		System.out.println("\nTilauksesi tyyppi: Kuukausitilaus\nTilaajan nimi: " + tilaajan_nimi +
		"\nLehden nimi: " + lehden_nimi + "\nToimitusosoite: " + toimitusosoite + "\nTilauksen kesto: " + kesto + " kuukautta");
		System.out.println("\nTilauksen hinta: " + laskeRegularHinta() + " euroa");
	}
}