package com.mdp.model;

public class ProgramStudi {
	private String namaProgramStudi;
	private String jenjangProgramStudi;
	private Dosen ketuaProgramStudi;
	
	public ProgramStudi() {
		super();
	}
	public ProgramStudi(String namaProgramStudi, String jenjangProgramStudi, Dosen ketuaProgramStudi) {
		super();
		this.namaProgramStudi = namaProgramStudi;
		this.jenjangProgramStudi = jenjangProgramStudi;
		this.ketuaProgramStudi = ketuaProgramStudi;
	}
	public String getNamaProgramStudi() {
		return namaProgramStudi;
	}
	public void setNamaProgramStudi(String namaProgramStudi) {
		this.namaProgramStudi = namaProgramStudi;
	}
	public String getJenjangProgramStudi() {
		return jenjangProgramStudi;
	}
	public void setJenjangProgramStudi(String jenjangProgramStudi) {
		this.jenjangProgramStudi = jenjangProgramStudi;
	}
	public Dosen getKetuaProgramStudi() {
		return ketuaProgramStudi;
	}
	public void setKetuaProgramStudi(Dosen ketuaProgramStudi) {
		this.ketuaProgramStudi = ketuaProgramStudi;
	}
	
}
