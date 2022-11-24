public class MainConstructor{
	public static void main(String[] args){
		
		Manager denis = new Manager("Denis Kurniawan");
		Manager adit = new Manager("Adit", 7000000);
		Manager jarwo = new Manager("Jarwo", 7900000, 800000);
		
		Programmer andi = new Programmer("Andi Herlambang");
		Programmer riko = new Programmer("Riko", 6000000);
		Programmer dina = new Programmer("Dina", 5000000, 4500000);
		
		denis.cetakInfo();
		adit.cetakInfo();
		jarwo.cetakInfo();
		
		andi.cetakInfo();
		riko.cetakInfo();
		dina.cetakInfo();
	}
}