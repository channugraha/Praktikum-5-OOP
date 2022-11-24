public class Programmer extends Pegawai{
	private double bonus;
	
	public void setBonus(double bonus){
		this.bonus = bonus;
	}
	
	public double getBonus(){
		return this.bonus;
	}
	
	public Programmer(String nama){
		super(nama);
	}
	
	public Programmer(String nama, double gajiPokok){
		super(nama, gajiPokok);
	}
	
	public Programmer(String nama, double gajiPokok, double bonus){
		super(nama, gajiPokok);
		this.bonus = bonus;
	}
	
	public void cetakInfo(){
		super.cetakInfo();
		System.out.println("Bonus		: " + getBonus() + "\n");
	}
}