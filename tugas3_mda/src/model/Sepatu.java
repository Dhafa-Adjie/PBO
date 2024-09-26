package model;

public class Sepatu {
	private String merk, deskripsi, warna, url;
	private int ukuran; 
	private double harga;

	
	public Sepatu() {
		super();
	}
	public Sepatu(String merk, String deskripsi, String warna, String url, int ukuran, double harga) {
		super();
		this.merk = merk;
		this.deskripsi = deskripsi;
		this.warna = warna;
		this.url = url;
		this.ukuran = ukuran;
		this.harga = harga;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMerk() {
		return merk;
	}
	public void setMerk(String merk) {
		this.merk = merk;
	}
	public String getDeskripsi() {
		return deskripsi;
	}
	public void setDeskripsi(String deskripsi) {
		this.deskripsi = deskripsi;
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
}
