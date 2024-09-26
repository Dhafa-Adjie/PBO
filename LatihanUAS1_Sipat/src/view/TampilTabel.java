package view;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import if2a.LatihanUAS1_Sipat;
import model.Mahasiswa;

public class TampilTabel extends JFrame {

    public TampilTabel() {
        bentukLayar();

        // text untuk header
        String namaKolom[] = { "No", "NPM", "Nama", "Kuis", "Tugas", "UTS", "UAS", "Softskill", "Nilai Akhir", "Grade" };
        // ambil data array
        ArrayList<Mahasiswa> dataMahasiswa = LatihanUAS1_Sipat.getDataMahasiswa();
        // tabel
        Object[][] isiTabel = new Object[dataMahasiswa.size()][10]; // baris kolom
        int i = 0;
        for (Mahasiswa mhsw : dataMahasiswa) {
            isiTabel[i][0] = (i + 1);
            isiTabel[i][1] = mhsw.getNpm();
            isiTabel[i][2] = mhsw.getNama();
            isiTabel[i][3] = mhsw.getNilaiKuis();
            isiTabel[i][4] = mhsw.getNilaiTugas();
            isiTabel[i][5] = mhsw.getNilaiUts();
            isiTabel[i][6] = mhsw.getNilaiUas();
            isiTabel[i][7] = mhsw.getNilaiSoftskill();
            isiTabel[i][8] = mhsw.getNilaiAkhir();
            isiTabel[i][9] = mhsw.getGrade();
            i++;
        }

        JTable tabelData = new JTable(isiTabel, namaKolom);
        JScrollPane scrollPane = new JScrollPane(tabelData);
        add(scrollPane);
        this.setVisible(true);
    }

    private void bentukLayar() {
        this.setTitle("♦○ Data Mahasiswa ○♦"); // super(":: NPM - Nama ::");
        this.setSize(900, 400);
        this.setLocation(0, 0);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
