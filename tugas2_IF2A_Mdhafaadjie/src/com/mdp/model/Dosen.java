package com.mdp.model;

public class Dosen extends Person{

	private String nid;

	public Dosen() {
		super();
	}

	public Dosen(String nama, String jenisKelamin, String nid) {
		super(nama, jenisKelamin);
		this.nid = nid;
	}

	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}
	
}
