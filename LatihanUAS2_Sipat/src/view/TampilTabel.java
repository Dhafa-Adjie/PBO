package view;

import if2a.LatihanUAS2_Sipat;
import model.Mahasiswa;
import javax.swing.*;
import java.util.ArrayList;

public class TampilTabel extends JFrame {

    public TampilTabel() {
        bentukLayar();

        // text untuk header
        String namaKolom[] = { "Nomor", "Nama Mahasiswa", "Kota Kelahiran", "Program Studi", "Nilai Akhir", "Grade" };
        // ambil data array
        ArrayList<Mahasiswa> dataMahasiswa = LatihanUAS2_Sipat.getDataMahasiswa();
        // tabel
        Object[][] isiTabel = new Object[dataMahasiswa.size()][6]; // baris kolom
        int i = 0;
        for (Mahasiswa mhsw : dataMahasiswa) {
            isiTabel[i][0] = mhsw.getNpm();
            isiTabel[i][1] = mhsw.getNama();
            isiTabel[i][2] = mhsw.getKotaKelahiran();
            isiTabel[i][3] = mhsw.getProgramStudi().getNamaProgramStudi();
            isiTabel[i][4] = mhsw.getNilaiAkhir();
            isiTabel[i][5] = mhsw.getGrade();
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


