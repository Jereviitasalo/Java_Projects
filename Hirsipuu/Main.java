import java.util.Scanner;

public class Main {

    public static void main(String [] args){
		
        int arvauksia = 5;
		String nimi_t = "sanat.txt";

		Sanalista sanalista = new Sanalista(nimi_t);
		Hirsipuu hirsipuu = new Hirsipuu(sanalista.annaSanat(), arvauksia);
		
		Scanner sc = new Scanner(System.in);
        Character merkki;
		
        while (hirsipuu.arvauksiaOnJaljella() > 0) {
            hirsipuu.tulostus();
            merkki = sc.next().charAt(0);
			if (hirsipuu.onLoppu()) {
                break;
            }
            if (hirsipuu.arvaa(merkki)) {
                hirsipuu.merkkiLisays(merkki);
            }
        }
        sc.close();
        hirsipuu.tulos();
    }
}