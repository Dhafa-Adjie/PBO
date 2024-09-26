package model;

public class Sepatu {
	private String merk;
	private String warna;
	private int ukuran;
	private double harga;
	private String nama;
	
	public Sepatu(String merk, String warna, int ukuran, double harga, String nama) {
		super();
		this.merk = merk;
		this.warna = warna;
		this.ukuran = ukuran;
		this.harga = harga;
		this.nama = nama;
	}
	public String getMerk() {
		return merk;
	}
	public void setMerk(String merk) {
		this.merk = merk;
	}
	public String getWarna() {
		return warna;
	}
	public void setWarna(String warna) {
		this.warna = warna;
	}
	public int getUkuran() {
		return ukuran;
	}
	public void setUkuran(int ukuran) {
		this.ukuran = ukuran;
	}
	public double getHarga() {
		return harga;
	}
	public void setHarga(double harga) {
		this.harga = harga;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	
}
