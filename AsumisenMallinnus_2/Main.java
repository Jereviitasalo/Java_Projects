import java.util.Scanner;
import java.util.ArrayList;
public class Main{
	
	public static void main(String [] args){
		
		// Luodaan scanneri
		Scanner sc = new Scanner(System.in);
		
		// Luodaan tarvittavat listat
		ArrayList<ArrayList<String>> asukasListaAll = new ArrayList<ArrayList<String>>();
		ArrayList<String> asukasLista = new ArrayList<String>();
		ArrayList<Rakennus> rakennusLista = new ArrayList<Rakennus>();
		
		int pintaAlaTontti;
		int rakennuksenTyyppi;
		int asuntoLkm = 0;
		int pintaAlaAsunto;
		int huoneetLkm;
		int asukasLkm = 0;
		String nimiAsukas;
		String osoiteTontti;
		String nimiTontti;
		
		// Kysytaan tontin tiedot ensin
		
		System.out.println("\nSyota tontin pinta-ala");
		do{
			pintaAlaTontti = sc.nextInt();
			sc.nextLine();
			if (pintaAlaTontti < 0)
				System.out.println("Pinta-ala ei voi olla negatiivinen");
		}while(pintaAlaTontti < 0);
		System.out.println("Syota tontin osoite");
		osoiteTontti = sc.nextLine();
		System.out.println("Syota tontin nimi");
		nimiTontti = sc.nextLine();
		
		// Kysytaan seuraavaksi rakennuksen tiedot
		
		System.out.println("Syota rakennuksen tyyppi (Syota joko numero 1, 2 tai 3)");
		System.out.println("\n(1)Kerrostalo, (2)Rivitalo, (3)Omakotitalo");
		
		// Kysytaan niin kauan kuin kayttaja antaa oikean syotteen
		do{
			rakennuksenTyyppi = sc.nextInt();
			if (rakennuksenTyyppi < 1 || rakennuksenTyyppi > 4)
				System.out.println("Syota joko numerot 1, 2 tai 3");
		}while(rakennuksenTyyppi < 1 || rakennuksenTyyppi > 4);
		
		if (rakennuksenTyyppi == 1){
			System.out.println("Valitsit kerrostalon");
		}
		
		if (rakennuksenTyyppi == 2){
			System.out.println("Valitsit Rivitalon");
		}
		
		if (rakennuksenTyyppi == 3){
			System.out.println("Valitsit Omakotitalon");
			asuntoLkm = 1;
		}
		
		// Kysytaan tiedot rakennusta varten
		if (rakennuksenTyyppi != 3){
			System.out.println("Kuinka monta asuntoa rakennuksessa on?");
			asuntoLkm = sc.nextInt();
		}
		int j = 1;
		int l = 1;
		for (int i = 0; i < asuntoLkm; i++){
			System.out.println("Kuinka monta neliota " + j + ". asunnossa on?");
			do{
				pintaAlaAsunto = sc.nextInt();
				sc.nextLine();
				if (pintaAlaAsunto < 0)
					System.out.println("Pinta-ala ei voi olla negatiivinen");
			}while(pintaAlaAsunto < 0);
			System.out.println("Kuinka monta huonetta " + j + ". asunnossa on?");
			huoneetLkm = sc.nextInt();
			System.out.println("Kuinka monta asukasta " + j + ". asunnossa asuu?");
			asukasLkm = sc.nextInt();
			sc.nextLine();
			j++;

			for (int k = 0; k < asukasLkm; k++){
				System.out.println("Syota " + l + ". asukkaan nimi");
				nimiAsukas = sc.nextLine();
				asukasLista.add(nimiAsukas);
				l++;
			}

			ArrayList<String> asukasListaTemp = new ArrayList<String>(asukasLista);


			asukasListaAll.add(asukasListaTemp);
			l = 1;
			// Luodaan objekti joka sisaltaa tiedot yhdelle asunnolle ja lisataan se listaan
			Rakennus asunto = new Rakennus(asuntoLkm, pintaAlaAsunto, huoneetLkm, asukasLkm);
			rakennusLista.add(asunto);
			asukasLista.clear();
		}
		Tontti tontti = new Tontti(nimiTontti, osoiteTontti, pintaAlaTontti);
		System.out.println(tontti);

        for(int i = 0; i < rakennusLista.size(); i++){
            System.out.println(rakennusLista.get(i));
			System.out.println("Asunnossa asuvat asukkaat: " + asukasListaAll.get(i));
			
			//j = 1;
			//for (int h = 0; h < asukasListaAll.size(); h++){
			//	System.out.println(j + ". Asukkaan nimi: " + asukasListaAll.get(i).get(h));
			//	j++;
			//}
			System.out.println("----------------------------------");
        }
		sc.close();
	}
}