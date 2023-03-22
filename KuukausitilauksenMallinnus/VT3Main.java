import java.util.Scanner;
public class VT3Main{
	
	Subscription subs;
	
	//Tulostaa tilauksen tyypin, lehden nimen, tilaajan nimen, toimitusosoitteen ja
	//laskutettavien kuukausien määrän ja tilauksen hinnan.
	static void printSubscriptionInvoice(Subscription subs){
		subs.printInvoice();
	}
	
	public static void main(String[] args){
		boolean ehto = false;
		String t_nimi;
		String l_nimi;
		String t_osoite;
		int tilaustyyppi;
		int kuukausi_lkm;
		int hinta;
		int alennus;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Syota tilauksesi tyyppi");
		System.out.println("Kuukausitilaus(1), Kestotilaus(2)");
		do{
			tilaustyyppi = sc.nextInt();
			if ((tilaustyyppi == 1) || (tilaustyyppi == 2))
				ehto = true;
		}while(ehto != true);
		
		if (tilaustyyppi == 1){
			System.out.println("Valitsit kuukausitilauksen\n");
		}
		if (tilaustyyppi == 2){
			System.out.println("Valitsit kestotilauksen\n");
		}
		
		sc.nextLine();
		System.out.println("Syota tilaajan nimi");
		t_nimi = sc.nextLine();
		
		System.out.println("Syota lehden nimi");
		l_nimi = sc.nextLine();
		
		System.out.println("Syota toimitusosoite");
		t_osoite = sc.nextLine();
		
		System.out.println("Syota kuukausihinta");
		hinta = sc.nextInt();
		
		if (tilaustyyppi == 2){
			System.out.println("Syota alennusprosentti");
			alennus = sc.nextInt();
			StandingSubscription kestotilaus = new StandingSubscription(alennus, t_nimi, l_nimi, t_osoite, hinta);
			printSubscriptionInvoice(kestotilaus);
		}
		
		if (tilaustyyppi == 1){
			System.out.println("Syota kuukausien lukumaara");
			kuukausi_lkm = sc.nextInt();
			RegularSubscription kuukausitilaus = new RegularSubscription(kuukausi_lkm, t_nimi, l_nimi, t_osoite, hinta);
			printSubscriptionInvoice(kuukausitilaus);
		}
		sc.close();
	}
}