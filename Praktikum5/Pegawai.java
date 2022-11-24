public class Pegawai{
	private String nama;
	private double gajiPokok;
	
	public void setNama(String nama){
		this.nama = nama;
	}
	
	public void setGajiPokok(double gajiPokok){
		this.gajiPokok = gajiPokok;
	}
	
	public String getNama(){
		return this.nama;
	}
	
	public double getGajiPokok(){
		return this.gajiPokok;
	}
	
	public Pegawai(String nama, double gajiPokok){
		this.nama = nama;
		this.gajiPokok = gajiPokok;
	}
	
	public Pegawai(String nama){
		this.nama = nama;
	}
	
	public void cetakInfo(){
		System.out.println("Nama		: " + getNama());
		System.out.println("Gaji Pokok	: " + getGajiPokok());
	}
}