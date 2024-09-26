package model;

public class Mahasiswa {

    private String Npm;
    private String nama;
    private double nilaiKuis;
    private double nilaiTugas;
    private double nilaiUts;
    private double nilaiUas;
    private double nilaiSoftskill;

    public Mahasiswa(String npm, String nama, double nilaiKuis, double nilaiTugas, double nilaiUts, 
            double nilaiUas, double nilaiSoftskill) {
        super();
        Npm = npm;
        this.nama = nama;
        this.nilaiKuis = nilaiKuis;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
        this.nilaiSoftskill = nilaiSoftskill;
    }

    public String getNpm() {
        return Npm;
    }

    public void setNpm(String npm) {
        Npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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

    public void setNilaiUts(double nilaiUts) {
        this.nilaiUts = nilaiUts;
    }

    public double getNilaiUas() {
        return nilaiUas;
    }

    public void setNilaiUas(double nilaiUas) {
        this.nilaiUas = nilaiUas;
    }

    public double getNilaiSoftskill() {
        return nilaiSoftskill;
    }

    public void setNilaiSoftskill(double nilaiSoftskill) {
        this.nilaiSoftskill = nilaiSoftskill;
    }

    public double getNilaiAkhir() {
        return (0.1 * nilaiKuis) + (0.2 * nilaiTugas) + (0.3 * nilaiUts) + (0.3 * nilaiUas) + (0.1 * nilaiSoftskill);
    }

    public String getGrade() {
        double nilaiAkhir = getNilaiAkhir();
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
