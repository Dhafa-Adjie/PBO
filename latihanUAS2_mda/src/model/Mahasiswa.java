package model;

public class Mahasiswa extends Person {

	String npm;
	ProgramStudi programStudi;
	double nilaiKuis, nilaiTugas, nilaiSoftskill, nilaiUAS, nilaiUTS;
	
	public Mahasiswa(String nama, String kotaKelahiran, String npm, ProgramStudi programStudi, double nilaiKuis,
			double nilaiTugas, double nilaiSoftskill, double nilaiUAS, double nilaiUTS) {
		super(nama, kotaKelahiran);
		this.npm = npm;
		this.programStudi = programStudi;
		this.nilaiKuis = nilaiKuis;
		this.nilaiTugas = nilaiTugas;
		this.nilaiSoftskill = nilaiSoftskill;
		this.nilaiUAS = nilaiUAS;
		this.nilaiUTS = nilaiUTS;
	}

	public String getNpm() {
		return npm;
	}

	public void setNpm(String npm) {
		this.npm = npm;
	}

	public ProgramStudi getProgramStudi() {
		return programStudi;
	}

	public void setProgramStudi(ProgramStudi programStudi) {
		this.programStudi = programStudi;
	}

	public double getNilaiKuis() {
		return nilaiKuis;
	}

	public void setNilaiKuis(double nilaiKuis) {
		this.nilaiKuis = nilaiKuis;
	}

	public double getNilaiTugas() {
		return nilaiTugas;
	}

	public void setNilaiTugas(double nilaiTugas) {
		this.nilaiTugas = nilaiTugas;
	}

	public double getNilaiSoftskill() {
		return nilaiSoftskill;
	}

	public void setNilaiSoftskill(double nilaiSoftskill) {
		this.nilaiSoftskill = nilaiSoftskill;
	}

	public double getNilaiUAS() {
		return nilaiUAS;
	}

	public void setNilaiUAS(double nilaiUAS) {
		this.nilaiUAS = nilaiUAS;
	}

	public double getNilaiUTS() {
		return nilaiUTS;
	}

	public void setNilaiUTS(double nilaiUTS) {
		this.nilaiUTS = nilaiUTS;
	}
	
	
}
