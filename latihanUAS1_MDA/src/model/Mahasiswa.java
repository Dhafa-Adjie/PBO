package model;

public class Mahasiswa {

	private String npm, nama;
	private double kuis;
	private double tugas;
	private double uts;
	private double uas;
	private double softskill;
	public Mahasiswa(String npm, String nama, double kuis, double tugas, double uts, double uas, double softskill) {
		super();
		this.npm = npm;
		this.nama = nama;
		this.kuis = kuis;
		this.tugas = tugas;
		this.uts = uts;
		this.uas = uas;
		this.softskill = softskill;
	}
	public String getNpm() {
		return npm;
	}
	public void setNpm(String npm) {
		this.npm = npm;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public double getKuis() {
		return kuis;
	}
	public void setKuis(double kuis) {
		this.kuis = kuis;
	}
	public double getTugas() {
		return tugas;
	}
	public void setTugas(double tugas) {
		this.tugas = tugas;
	}
	public double getUts() {
		return uts;
	}
	public void setUts(double uts) {
		this.uts = uts;
	}
	public double getUas() {
		return uas;
	}
	public void setUas(double uas) {
		this.uas = uas;
	}
	public double getSoftskill() {
		return softskill;
	}
	public void setSoftskill(double softskill) {
		this.softskill = softskill;
	}
	public double getNilaiAkhir() {
		return (getKuis() * 0.1) + (getTugas() * 0.2) + (getSoftskill() * 0.1) + (getUas() * 0.3) + (getUts() * 0.3);
	}
	
	public char grade() {
		char hasil;
		if (getNilaiAkhir() >= 80 && getNilaiAkhir() <= 100) {
			hasil = 'A';
		} else if (getNilaiAkhir() < 80 && getNilaiAkhir() >= 68) {
			hasil = 'B';
		} else if (getNilaiAkhir() < 68 && getNilaiAkhir() >= 56) {
			hasil = 'C';
		} else if (getNilaiAkhir() < 56 && getNilaiAkhir() >= 45) {
			hasil = 'D';
		} else {
			hasil = 'E';
		}
		return hasil;
	}
}
