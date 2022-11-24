public class Manager extends Pegawai{
	private double tunjangan;

	public void setTunjangan(double tunjangan){
		this.tunjangan = tunjangan;
	}

	public double getTunjangan(){
		return this.tunjangan;
	}

	public Manager(String nama){
		super(nama);
	}

	public Manager(String nama, double gajiPokok){
		super(nama, gajiPokok);
	}

	public Manager(String nama, double gajiPokok, double tunjangan){
		super(nama, gajiPokok);
		this.tunjangan = tunjangan;
	}

	public void cetakInfo(){
		super.cetakInfo();
		System.out.println("Tunjangan	: " + getTunjangan() + "\n");
	}
}