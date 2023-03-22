import java.util.Scanner;
import java.util.Arrays;

public class Main{
	
	//Luodaan main metodi
	public static void main(String[] args){
		
		//Luodaan tarvittavat attribuutit
		int pintaAla;
		int pintaAlaR;
		int huoneet;
		int asukkaat;
		String nimi;
		String leveyspiiri;
		String pituuspiiri;
		
		Scanner syote = new Scanner(System.in);
		
		
		//Kysytaan kayttajalta tarvittavat tiedot tonttia varten
		System.out.println("Syota tontin pinta-ala");
		do{
		pintaAla = syote.nextInt();
		if (pintaAla < 0){
			System.out.println("Pinta-ala ei voi olla negatiivinen. Syota uudelleen.");
		}
		}while(pintaAla < 0);
		System.out.println("Syota tontin sijainti (leveys- ja pituuspiireina)");
		System.out.println("Syota leveyspiiri");
		syote.nextLine();
		leveyspiiri = syote.nextLine();
		System.out.println("Syota pituuspiiri");
		pituuspiiri = syote.nextLine();
		System.out.println("Anna tontille nimi");
		nimi = syote.nextLine();
		
		//Kysytaan kayttajalta tiedot rakennusta varten
		System.out.println("Syota tontilla sijaitsevan rakennuksen pinta-ala");
		do{
		pintaAlaR = syote.nextInt();
		if (pintaAlaR > pintaAla){
			System.out.println("Rakennuksen pinta-ala ei voi olla suurempi kuin tontin.\nSyota uudelleen.");
		}
		}while(pintaAlaR > pintaAla);
		System.out.println("Kuinka monta huonetta rakennuksessa on?");
		huoneet = syote.nextInt();
		System.out.println("Kuinka monta henkiloa rakennuksessa asuu?");
		asukkaat = syote.nextInt();
		
		int[] syntymavuosi = new int[asukkaat];
		String[] nimiA = new String[asukkaat];

		
		//Luodaan objekti tontille
		Tontti tontti = new Tontti(nimi, leveyspiiri, pituuspiiri, pintaAla);
		
		//Luodaan objekti rakennukselle
		Rakennus rakennus = new Rakennus(pintaAlaR, huoneet, asukkaat);
		
		//Tulostetaan asukkaat yksi kerrallaan
		int j = 1;
		for (int i = 0; i< asukkaat; i++){	
			//Kysytään asukkaan nimi ja syntymavuosi
			System.out.println("Syota " + j + ". asukkaan nimi");
			syote.nextLine();
			nimiA[i] = syote.nextLine();
			System.out.println("Syota " + j + ". asukkaan syntymavuosi");
			syntymavuosi[i] = syote.nextInt();
			j++;
		}
		
		//System.out.println(tontti);
		tontti.tulostus();
		//System.out.println(rakennus);
		rakennus.tulostus();
		//Tulostetaan lopuksi kaikki asukkaat
		System.out.println("\nASUKKAIDEN TIEDOT");
		for (int i = 0; i< asukkaat; i++){
			//Luodaan objekti asukkaalle
			Asukkaat asukas = new Asukkaat(nimiA[i], syntymavuosi[i]);
			//System.out.println(asukas);
			asukas.tulostus();
		}
	}
	
}