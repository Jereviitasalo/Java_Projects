import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Sanalista {

    //Luodaan lista ja attribuutit
    private List<String> lista = new ArrayList<String>();
	private String rivi;
	
	File tiedosto; 
	Scanner sc;

    //Luodaan muodostin
    public Sanalista(String nimi_t) {
        List<String> lista = new ArrayList<String>();
		
        try {
            tiedosto = new File(nimi_t);
            sc = new Scanner(tiedosto);
            while (sc.hasNextLine()) {
                rivi = sc.nextLine();
                lista.add(rivi);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Tiedoston avaus epaonnistui!");
            e.printStackTrace();
        }
        this.lista = lista;
    }

    public List<String> annaSanat() {
        return lista;
    }
}
