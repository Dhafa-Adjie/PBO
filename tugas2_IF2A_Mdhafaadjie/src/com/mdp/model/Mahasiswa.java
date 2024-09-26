package com.mdp.model;

public class Mahasiswa extends Person{
	private String npm;
	private String agama;
	private ProgramStudi programStudi;
	private Dosen dosenPA;
	private Sekolah asalSD;
	private Sekolah asalSMP;
	private Sekolah asalSMA;
	public Mahasiswa() {
		super();
	}

	public Mahasiswa(String nama, String jenisKelamin, String npm, String agama, ProgramStudi programStudi,
			Dosen dosenPA, Sekolah asalSD, Sekolah asalSMP, Sekolah asalSMA) {
		super(nama, jenisKelamin);
		this.npm = npm;
		this.agama = agama;
		this.programStudi = programStudi;
		this.dosenPA = dosenPA;
		this.asalSD = asalSD;
		this.asalSMP = asalSMP;
		this.asalSMA = asalSMA;
	}

	public String getNpm() {
		return npm;
	}
	public void setNpm(String npm) {
		this.npm = npm;
	}
	public String getAgama() {
		return agama;
	}
	public void setAgama(String agama) {
		this.agama = agama;
	}
	public ProgramStudi getProgramStudi() {
		return programStudi;
	}
	public void setProgramStudi(ProgramStudi programStudi) {
		this.programStudi = programStudi;
	}
	public Dosen getDosenPA() {
		return dosenPA;
	}
	public void setDosenPA(Dosen dosenPA) {
		this.dosenPA = dosenPA;
	}
	public Sekolah getAsalSD() {
		return asalSD;
	}
	public void setAsalSD(Sekolah asalSD) {
		this.asalSD = asalSD;
	}
	public Sekolah getAsalSMP() {
		return asalSMP;
	}
	public void setAsalSMP(Sekolah asalSMP) {
		this.asalSMP = asalSMP;
	}
	public Sekolah getAsalSMA() {
		return asalSMA;
	}
	public void setAsalSMA(Sekolah asalSMA) {
		this.asalSMA = asalSMA;
	}

	public void tampil() {
		System.out.println("-------------------------------------------------------Biodata-----------------------------------------------");
		System.out.println("Nama \t\t\t: " + getNama() + "\n" 
				+ "NPM \t\t\t: " + getNpm() + "\n" 
				+ "Agama \t\t\t: " + getAgama() + "\n" 
				+ "Program Studi \t\t: " + getProgramStudi().getNamaProgramStudi() + "\n" 
				+ "Jenjang Prodi \t\t: " + getProgramStudi().getJenjangProgramStudi() + "\n" 
				+ "Ketua Prodi \t\t: " + getProgramStudi().getKetuaProgramStudi().getNama() + "\n"
				+ "Dosen Pembimbing \t: " + getDosenPA().getNama() + "(" + getDosenPA().getNid() + ")" + "\n" + "\n"
				+ "Asal SD \t\t: " + getAsalSD().getNamaSekolah() + "\n"
						+ "Alamat \t\t\t: " + getAsalSD().getAlamat() + "\n"
						+ "Link Google Maps \t: " + getAsalSD().getLinkGoogleMaps() + "\n" + "\n"
				+ "Asal SMP \t\t: " + getAsalSMP().getNamaSekolah() + "\n"
						+ "Alamat \t\t\t: " + getAsalSMP().getAlamat() + "\n"
						+ "Link Google Maps \t: " + getAsalSMP().getLinkGoogleMaps() + "\n"+ "\n"
				+ "Asal SMA \t\t: " + getAsalSMA().getNamaSekolah() + "\n"
						+ "Alamat \t\t\t: " + getAsalSMA().getAlamat() + "\n"
						+ "Link Google Maps \t: " + getAsalSMA().getLinkGoogleMaps() + "\n");
	}
}
