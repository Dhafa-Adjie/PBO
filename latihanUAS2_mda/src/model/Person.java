package model;

public class Person {

	String nama;
	String kotaKelahiran;
	public Person(String nama, String kotaKelahiran) {
		super();
		this.nama = nama;
		this.kotaKelahiran = kotaKelahiran;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getKotaKelahiran() {
		return kotaKelahiran;
	}
	public void setKotaKelahiran(String kotaKelahiran) {
		this.kotaKelahiran = kotaKelahiran;
	}
	
	
}
