package model;

public class Mahasiswa extends Person {
	
    private String npm;
    private double nilaiKuis;
    private double nilaiTugas;
    private double nilaiUts;
    private double nilaiUas;
    private double nilaiSoftskill;
    private ProgramStudi programStudi;

    public Mahasiswa(String nama, String kotaKelahiran, String npm, double nilaiKuis, double nilaiTugas, 
    		double nilaiUts, double nilaiUas, double nilaiSoftskill, ProgramStudi programStudi) {
        super(nama, kotaKelahiran);
        this.npm = npm;
        this.nilaiKuis = nilaiKuis;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
        this.nilaiSoftskill = nilaiSoftskill;
        this.programStudi = programStudi;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
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

    public double getNilaiUts() {
        return nilaiUts;
    }

    public void setNilaiUTS(double nilaiUts) {
        this.nilaiUts = nilaiUts;
    }

    public double getNilaiUas() {
        return nilaiUas;
    }

    public void setNilaiUAS(double nilaiUas) {
        this.nilaiUas = nilaiUas;
    }

    public double getNilaiSoftskill() {
        return nilaiSoftskill;
    }

    public void setNilaiSoftskill(double nilaiSoftskill) {
        this.nilaiSoftskill = nilaiSoftskill;
    }

    public ProgramStudi getProgramStudi() {
        return programStudi;
    }

    public void setProgramStudi(ProgramStudi programStudi) {
        this.programStudi = programStudi;
    }

    public double getNilaiAkhir() {
        return 0.1 * nilaiKuis + 0.2 * nilaiTugas + 0.3 * nilaiUts + 0.3 * nilaiUas + 0.1 * nilaiSoftskill;
    }

    public String getGrade() {
        if (getNilaiAkhir() <= 100 && getNilaiAkhir() >= 80) 
	    {
	    	return "A";
	    } 
	    else if (getNilaiAkhir() < 80 && getNilaiAkhir() >= 68) 
	    {
	    	return "B";
	    } 
	    else if (getNilaiAkhir() < 68 && getNilaiAkhir() >= 56) 
	    {
	    	return "C";
	    } 
	    else if (getNilaiAkhir() < 56 && getNilaiAkhir() >= 45) 
	    {
	    	return "D";
	    } 
	    else 
	    {
	    	return "E";
	    } 
    }
    
}
