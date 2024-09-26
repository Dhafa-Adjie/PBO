package model;

public class ProgramStudi {
	private String namaProgramStudi, namaFakultas, namaUniversitas;

	public ProgramStudi(String namaProgramStudi, String namaFakultas, String namaUniversitas) {
		super();
		this.namaProgramStudi = namaProgramStudi;
		this.namaFakultas = namaFakultas;
		this.namaUniversitas = namaUniversitas;
	}

	public String getNamaProgramStudi() {
		return namaProgramStudi;
	}

	public void setNamaProgramStudi(String namaProgramStudi) {
		this.namaProgramStudi = namaProgramStudi;
	}

	public String getNamaFakultas() {
		return namaFakultas;
	}

	public void setNamaFakultas(String namaFakultas) {
		this.namaFakultas = namaFakultas;
	}

	public String getNamaUniversitas() {
		return namaUniversitas;
	}

	public void setNamaUniversitas(String namaUniversitas) {
		this.namaUniversitas = namaUniversitas;
	}
	
	
}
