package view;

import java.awt.HeadlessException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import if2a.LatihanUAS1_MDA;
import model.Mahasiswa;

public class TampilanTabel extends JFrame {
	// text untuk header
	String namaKolom[] = {"No", "NPM", "Nama", "Kuis", "Tugas", "UTS", "UAS", "Softskill", "Nilai Akhir", "Grade"};
    private void bentukLayar() {
        this.setTitle("🥶🥶🥶 Data Mahasiswa 🥶🥶");//super(":: NPM - NAMA ::");
        this.setSize(1000, 400);
        this.setLocation(0, 0);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }

	public TampilanTabel() throws HeadlessException {
		super();
		bentukLayar();
		
		// Ambil data array
		ArrayList<Mahasiswa> dataMahasiswa = LatihanUAS1_MDA.getDataMhs();
		Object [][] isiTabel = new Object[dataMahasiswa.size()][10]; // Baris Kolom
		int i = 0;
		double total = 0;
		for (Mahasiswa mhsw : dataMahasiswa) {
			isiTabel[i][0] = (i+1);
			isiTabel[i][1] = mhsw.getNpm();
			isiTabel[i][2] = mhsw.getNama();
			isiTabel[i][3] = mhsw.getKuis();
			isiTabel[i][4] = mhsw.getTugas();
			isiTabel[i][5] = mhsw.getUts();
			isiTabel[i][6] = mhsw.getUas();
			isiTabel[i][7] = mhsw.getSoftskill();
			isiTabel[i][8] = mhsw.getNilaiAkhir();
			total += mhsw.getNilaiAkhir();
			isiTabel[i][9] = mhsw.grade();
			i++;
		}
		total /= dataMahasiswa.size();
		
		JTable tabelData = new JTable(isiTabel, namaKolom);
		JScrollPane scrollPane = new JScrollPane(tabelData);
		add(scrollPane);
		tabelData.setEnabled(false);
		setVisible(true);
		
		JOptionPane.showMessageDialog(null, "Rata-rata = " + total);
	}
	
}
