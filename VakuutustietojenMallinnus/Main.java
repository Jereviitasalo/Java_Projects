import java.util.Scanner;

public class Main{

	public static void main(String [] args){
		
		String tyyppi;
		String sijainti;
		double vakuutusarvo;
		int lkm;
		double arvo;
		InsInfoContainer lista = new InsInfoContainer();
		
		
		Scanner syote = new Scanner(System.in);
		
		System.out.println("Syota vahintaan viitta kiinteistoa koskevaa vakuutustietoa.");
		System.out.println("Kuinka monta kiinteistoa haluat syottaa?");
		do {
		lkm = syote.nextInt();
		if (lkm < 5){
			System.out.println("Sinun tulee syottaa vahintaan viisi vakuutustietoa.");
		}
		} while(lkm < 5);
		
		int j = 1;
		
		for (int i = 0; i < lkm; i++){
			
			System.out.println("Syota " + j + ". kiinteiston vakuutusarvo: ");
			vakuutusarvo = syote.nextDouble();
			syote.nextLine();
			System.out.println("Syota " + j + ". kiinteiston tyyppi: ");
			tyyppi = syote.nextLine();
			System.out.println("Syota " + j + ". kiinteiston sijainti: ");
			sijainti = syote.nextLine();
			
			Property property = new Property(tyyppi, sijainti);
			InsuranceInfo vakuutustiedot = new InsuranceInfo(vakuutusarvo, property);
			
			lista.lisays(vakuutustiedot);
			j++;
		}
		
		System.out.println("Syota vakuutusarvo.");
		System.out.println("Ohjelma erittelee kiinteistot, jotka ovat suurempia ja pienempia kuin syottamasi arvo.");
		arvo = syote.nextDouble();
		
		lista.tulostaLista();
		System.out.println("Kiinteistot vakuutusarvon ylapuolella: ");
		lista.tulostaYlempi(arvo);
		System.out.println("\nKiinteistot vakuutusarvon alapuolella: ");
		lista.tulostaAlempi(arvo);
		
		syote.close();
	}
}