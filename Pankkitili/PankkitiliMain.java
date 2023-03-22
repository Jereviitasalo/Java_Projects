import java.util.Scanner;

public class PankkitiliMain{
	
	Scanner syote = new Scanner(System.in);
	
	public static void main(String []args){
		
		System.out.println("Syota tilin omistajan nimi: ");
		Pankkitili.setNimi();
		
		System.out.println("Syota tilinumero: ");
		Pankkitili.setTilinro();
		
		System.out.println("Syota tilin saldo: ");
		System.out.println("Maksimi saldo on 100000");
		Pankkitili.setSaldo();
		
		Pankkitili.tulostaTiedot();
		Pankkitili.otto();
		Pankkitili.tulostaTiedot();
		
	}
}