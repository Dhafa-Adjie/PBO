package com.mdp.model;

public class Sekolah {
	private String namaSekolah;
	private String alamat;
	private String linkGoogleMaps;
	
	public Sekolah() {
		super();
	}

	public Sekolah(String namaSekolah, String alamat, String linkGoogleMaps) {
		super();
		this.namaSekolah = namaSekolah;
		this.alamat = alamat;
		this.linkGoogleMaps = linkGoogleMaps;
	}

	public String getNamaSekolah() {
		return namaSekolah;
	}

	public void setNamaSekolah(String namaSekolah) {
		this.namaSekolah = namaSekolah;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getLinkGoogleMaps() {
		return linkGoogleMaps;
	}

	public void setLinkGoogleMaps(String linkGoogleMaps) {
		this.linkGoogleMaps = linkGoogleMaps;
	}
	
	
}
