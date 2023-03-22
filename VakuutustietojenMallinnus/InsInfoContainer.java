import java.util.ArrayList;

public class InsInfoContainer{

	InsuranceInfo info;
	
	ArrayList<InsuranceInfo> tietosailio;
	
	public void lisays(InsuranceInfo x){
		tietosailio.add(x);
	}
	
	public InsInfoContainer(){
		tietosailio = new ArrayList<InsuranceInfo>();
	}
	
	int j = 1;
	public void tulostaLista(){
		System.out.println("\nKIINTEISTON TIEDOT");
		for (int i = 0; i < tietosailio.size(); i++){
			tietosailio.get(i).tulostus();
			System.out.println("--------------------------------------------");
		}
	}
	
	public void tulostaAlempi(double raja){
		for (int i = 0; i < tietosailio.size(); i++){
			if (tietosailio.get(i).getVakuutusarvo() < raja) {
                tietosailio.get(i).tulostus();
            }
		}
	}
	
	public void tulostaYlempi(double raja) { 
        for (int i = 0; i < tietosailio.size(); i++) {
            if (tietosailio.get(i).getVakuutusarvo() > raja) {
                tietosailio.get(i).tulostus();
            }
        }
    }
}