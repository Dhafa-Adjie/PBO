package com.mdp.model;

public abstract class Person {

	private String nama;
	private String jenisKelamin;
	
	public Person() {
		super();
	}

	public Person(String nama, String jenisKelamin) {
		super();
		this.nama = nama;
		this.jenisKelamin = jenisKelamin;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getJenisKelamin() {
		return jenisKelamin;
	}

	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	
	
}
