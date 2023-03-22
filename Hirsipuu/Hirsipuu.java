import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Hirsipuu {
    
    //Attribuutit
	private List<Character> arvaukset = new ArrayList<>();
	private int arvauksia = 0;
	private String arvattu;
    private String arvaamaton;

    //Muodostin
    public Hirsipuu(List<String> lista, int arvauksia) {
		Random rand = new Random();
        this.arvauksia = arvauksia;
        arvattu = lista.get(rand.nextInt(lista.size()));
        this.arvattu = arvattu;
        this.arvaamaton = arvattu.replaceAll(".", "*");
    }
	
	public String sana() {
        return arvattu;
    }
	public String getArvaamaton() {
        return arvaamaton;
    }
	public int arvauksiaOnJaljella() {
        return arvauksia;
    }
	public void setArvaamaton(String arvaamaton) {
        this.arvaamaton = arvaamaton;
    }
    public List<Character> arvaukset() {
        return arvaukset;
    }

    public void merkkiLisays (Character merkki) {
        for (int i = 0; i < sana().length(); i++) {
            if (Character.toLowerCase(merkki) == sana().toLowerCase().charAt(i)) {
                String string = vaihda(getArvaamaton(), merkki, i);
                setArvaamaton(string);
            }
        }
    }
	public boolean arvaa(Character merkki) {
		for (int i = 0; i < arvaukset().size(); i++) {
			if (merkki == arvaukset().get(i)) {
				System.out.println("Tama kirjain on jo kaytetty: " + merkki + "\n");
				return false;
			}
		}
        arvaukset().add(merkki);
        for (int i = 0; i < sana().length(); i++) {
            if (Character.toLowerCase(merkki) == sana().toLowerCase().charAt(i)) {
                return true;
            }
        }
        arvauksia--;
        return false;
    }

    public void tulostus() {
		
		System.out.println("___________________________________________");
        
        if (arvauksiaOnJaljella() < 1) {
            System.out.println("\nSinulla on kaytossa arvauksia: " + arvauksiaOnJaljella());
        }
		if (arvauksiaOnJaljella() < 2 && arvauksiaOnJaljella() > 0) {
            System.out.println("\nSinulla on kaytossa arvauksia: " + arvauksiaOnJaljella());
        }
		if (arvauksiaOnJaljella() < 3 && arvauksiaOnJaljella() > 1) {
            System.out.println("\nSinulla on kaytossa arvauksia: " + arvauksiaOnJaljella());
        }
		if (arvauksiaOnJaljella() < 4 && arvauksiaOnJaljella() > 2) {
            System.out.println("\nSinulla on kaytossa arvauksia: " + arvauksiaOnJaljella());
        }
		if (arvauksiaOnJaljella() < 5 && arvauksiaOnJaljella() > 3) {
            System.out.println("\nSinulla on kaytossa arvauksia: " + arvauksiaOnJaljella());
        }
		
		System.out.print("\nOlet kayttanyt nama kirjaimet: ");
        for (int i = 0; i < arvaukset().size(); i++) {
            System.out.print(arvaukset().get(i));
            if (i != (arvaukset().size() - 1)) {
                System.out.print(", ");
            }
        }

        System.out.println("\nArvaa sana: " + getArvaamaton());
		System.out.print("Anna kirjain: ");
    }

    public String vaihda(String mjono, char merkki, int i) {
        StringBuilder string = new StringBuilder(mjono);
        string.setCharAt(i, merkki);
        return string.toString();
    }

    public boolean onLoppu() {
        for (int i = 0; i < getArvaamaton().length(); i++) {
            if (getArvaamaton().charAt(i) == '*') {
                return false;
            }
        }
        return true;
    }

    public void tulos() {
        if (arvauksiaOnJaljella() > 0) {
            tulostus();
            System.out.println("\nVOITIT!");
        }
        else {
            tulostus();
            System.out.println("Sana oli: " + sana() + "\nHAVISIT!");
        }
    }
}
