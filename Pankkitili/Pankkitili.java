import java.util.Scanner;

public class Pankkitili{
	
	private static String tilinro;
	private static String omistaja;
	private static double saldo;
	
	static Scanner syote = new Scanner(System.in);
	
	public static void setNimi(){
		omistaja = syote.nextLine();
	}
	
	public static void setTilinro(){
		tilinro = syote.nextLine();
	}
	
	public static void setSaldo(){
		saldo = syote.nextDouble();
		while (saldo < 0 || saldo > 100000){
			if (saldo < 0){
				System.out.println("Saldo ei voi olla negatiivinen");
				System.out.println("Syota positiivinen arvo");
			}
			if (saldo > 100000){
				System.out.println("Saldo on liian korkea, syota pienempi luku");
			}
			saldo = 0;
			saldo = syote.nextDouble();
		}
	}
	
	public static void otto(){
		double syote_otto;
		System.out.println("Syota summa jonka haluat nostaa");
		syote_otto = syote.nextDouble();
		do{
			if (syote_otto <= saldo){
				while (syote_otto < 0){
					System.out.println("Ei voi syottaa negatiivisia arvoja.");
					System.out.println("Syota positiivinen arvo");
					syote_otto = 0;
				}
			}
			else{
				System.out.println("Tilin saldo ei riita.");
				System.out.println("Syota uudestaan summa jonka haluat nostaa");
				syote_otto = syote.nextDouble();
			}
			
		} while(syote_otto > saldo);
		
		saldo = saldo - syote_otto;
	}
	
	public static void talletus(){
		double syote_talletus;
		System.out.println("Syota haluamasi summa jonka haluat tallettaa");
		syote_talletus = syote.nextDouble();
		if (syote_talletus < 0){
			System.out.println("Ei voi syottaa negatiivisia arvoja.");
			System.out.println("Syota positiivinen arvo");
			syote_talletus = 0;
		}
		else{
			saldo = saldo + syote_talletus;
		}
		
	}
	
	public static void tulostaTiedot(){
		System.out.println("Tilin omistaja: " + omistaja);
		System.out.println("Tilinumero: " + tilinro);
		System.out.println("Tilin saldo: " + saldo);
	}
}