package if2a;

import java.text.DecimalFormat;

class MataKuliah{
	private String namaMataKuliah;
	private double kuis, tugas, uts , uas, softskill;
	public MataKuliah(String namaMataKuliah, double kuis, double tugas, double uts, double uas, double softskill) {
		super();
		this.namaMataKuliah = namaMataKuliah;
		this.kuis = kuis;
		this.tugas = tugas;
		this.uts = uts;
		this.uas = uas;
		this.softskill = softskill;
	}
	public String getNamaMataKuliah() {
		return namaMataKuliah;
	}
	public void setNamaMataKuliah(String namaMataKuliah) {
		this.namaMataKuliah = namaMataKuliah;
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
	public double hitungNilaiAkhir() {
		double na = (softskill*0.1) + (kuis*0.1) + (tugas*0.2) + (uas*0.3) + (uts*0.3);

		DecimalFormat df = new DecimalFormat("#.##");      
		na = Double.valueOf(df.format(na));
		return na;
	}
	public String grade() {
		if (hitungNilaiAkhir() >= 80 && hitungNilaiAkhir() <= 100)
        {
            return "A";
        }
        else if (hitungNilaiAkhir() >= 76)
        {
            return "A-";
        }
        else if (hitungNilaiAkhir() >= 72)
        {
            return "B+";
        }
        else if (hitungNilaiAkhir() >= 68)
        {
            return "B";
        }
        else if (hitungNilaiAkhir() >= 64)
        {
            return "B-";
        }
        else if (hitungNilaiAkhir() >= 60)
        {
            return "C+";
        }
        else if (hitungNilaiAkhir() >= 56)
        {
            return "C";
        }
        else if (hitungNilaiAkhir() >= 46)
        {
            return "D";
        }
        else
        {
            return "E";
        }
	}
	
}

public class BelajarDebug_MDA_Mahasiswa {
	public static void main(String[] args) {
		MataKuliah [] mk = new MataKuliah[6];
		mk[0] = new MataKuliah("Basis Data II", 0,0,0,0,0);
		mk[1] = new MataKuliah("Pemrograman Berorientasi Objek", 0,0,0,0,0);
		mk[2] = new MataKuliah("Algoritma dan Struktur Data", 0,0,0,0,0);
		mk[3] = new MataKuliah("Kalkulus II", 0,0,0,0,0);
		mk[4] = new MataKuliah("Matematika Diskrit", 0,0,0,0,0);
		mk[5] = new MataKuliah("Pemrograman WEB", 0,0,0,0,0);

		for (int i = 0; i < mk.length; i++) {
			System.out.println(mk[i].getNamaMataKuliah() + "\t\t\t "+ mk[i].hitungNilaiAkhir() + "\t\t"+ mk[i].grade());
		}
		System.out.println();
	}
}
