package view;

import model.Mahasiswa;
import model.ProgramStudi;
import if2a.LatihanUAS2_Sipat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayarInput extends JFrame implements ActionListener {
    private JLabel labelNPM = new JLabel("NPM");
    private JTextField textFieldNPM = new JTextField("");
    private JLabel labelNama = new JLabel("Nama");
    private JTextField textFieldNama = new JTextField("");
    private JLabel labelKotaKelahiran = new JLabel("Kota Kelahiran");
    private JRadioButton radioPalembang = new JRadioButton("Palembang");
    private JRadioButton radioLuarPalembang = new JRadioButton("Luar Palembang");
    private JTextField textFieldKotaLain = new JTextField("");
    private ButtonGroup radioGroup = new ButtonGroup();
    private JLabel labelKuis = new JLabel("Kuis");
    private JTextField textFieldKuis = new JTextField("");
    private JLabel labelTugas = new JLabel("Tugas");
    private JTextField textFieldTugas = new JTextField("");
    private JLabel labelUTS = new JLabel("UTS");
    private JTextField textFieldUTS = new JTextField("");
    private JLabel labelUAS = new JLabel("UAS");
    private JTextField textFieldUAS = new JTextField("");
    private JLabel labelSoftskill = new JLabel("Softskill");
    private JTextField textFieldSoftskill = new JTextField("");
    private JLabel labelProgramStudi = new JLabel("Program Studi");
    private JComboBox<String> comboBoxProgramStudi = new JComboBox<>(
            new String[] { "Informatika", "Manajemen", "Hukum Bisnis" });
    private JButton buttonSimpan = new JButton("SIMPAN");
    private JButton buttonClear = new JButton("CLEAR");
    private JButton buttonTampil = new JButton("TAMPIL");
    private JButton buttonKeluar = new JButton("KELUAR");

    public LayarInput() {
        radioGroup.add(radioPalembang);
        radioGroup.add(radioLuarPalembang);

        bentukLayar();
        this.setLayout(new GridLayout(13, 2)); // baris, kolom
        this.add(labelNPM);
        this.add(textFieldNPM);
        this.add(labelNama);
        this.add(textFieldNama);
        this.add(labelKotaKelahiran);
        this.add(radioPalembang);
        this.add(new JLabel());
        this.add(radioLuarPalembang);
        this.add(new JLabel());
        this.add(textFieldKotaLain);
        this.add(labelKuis);
        this.add(textFieldKuis);
        this.add(labelTugas);
        this.add(textFieldTugas);
        this.add(labelUTS);
        this.add(textFieldUTS);
        this.add(labelUAS);
        this.add(textFieldUAS);
        this.add(labelSoftskill);
        this.add(textFieldSoftskill);
        this.add(labelProgramStudi);
        this.add(comboBoxProgramStudi);
        this.add(buttonSimpan);
        this.add(buttonClear);
        this.add(buttonTampil);
        this.add(buttonKeluar);

        textFieldKotaLain.setVisible(false); // Initially hide the city input field

        buttonSimpan.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonTampil.addActionListener(this);
        buttonKeluar.addActionListener(this);

        radioPalembang.addActionListener(this);
        radioLuarPalembang.addActionListener(this);

        this.setVisible(true);
    }

    private void bentukLayar() {
        this.setTitle(":: 2327250055 - Siti Fatimah Az Zahrah ::");
        this.setSize(400, 400);
        this.setLocation(0, 0);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource();
        if (object == buttonKeluar) {
            JOptionPane.showMessageDialog(null, "Terima Kasih");
            System.exit(0);
        } else if (object == buttonTampil) {
            TampilTabel tampilanTabel = new TampilTabel();
        } else if (object == buttonSimpan) {
            if (textFieldNPM.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "NPM tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (textFieldNama.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!(radioPalembang.isSelected() || radioLuarPalembang.isSelected())) {
                JOptionPane.showMessageDialog(null, "Kota Kelahiran harus dipilih", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (radioLuarPalembang.isSelected() && textFieldKotaLain.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Masukkan nama kota lain", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (Double.parseDouble(textFieldKuis.getText()) < 0
                    || Double.parseDouble(textFieldKuis.getText()) > 100) {
                JOptionPane.showMessageDialog(null, "Nilai Kuis harus diantara 0 - 100", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else if (Double.parseDouble(textFieldTugas.getText()) < 0
                    || Double.parseDouble(textFieldTugas.getText()) > 100) {
                JOptionPane.showMessageDialog(null, "Nilai Tugas harus diantara 0 - 100", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else if (Double.parseDouble(textFieldUTS.getText()) < 0
                    || Double.parseDouble(textFieldUTS.getText()) > 100) {
                JOptionPane.showMessageDialog(null, "Nilai UTS harus diantara 0 - 100", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else if (Double.parseDouble(textFieldUAS.getText()) < 0
                    || Double.parseDouble(textFieldUAS.getText()) > 100) {
                JOptionPane.showMessageDialog(null, "Nilai UAS harus diantara 0 - 100", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else if (Double.parseDouble(textFieldSoftskill.getText()) < 0
                    || Double.parseDouble(textFieldSoftskill.getText()) > 100) {
                JOptionPane.showMessageDialog(null, "Nilai Softskill harus diantara 0 - 100", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                String kota = radioPalembang.isSelected() ? "Palembang" : textFieldKotaLain.getText();
                Mahasiswa mhs = new Mahasiswa(textFieldNama.getText(),
                        kota, textFieldNPM.getText(),
                        Double.parseDouble(textFieldKuis.getText()), Double.parseDouble(textFieldTugas.getText()),
                        Double.parseDouble(textFieldUTS.getText()), Double.parseDouble(textFieldUAS.getText()),
                        Double.parseDouble(textFieldSoftskill.getText()),
                        new ProgramStudi((String) comboBoxProgramStudi.getSelectedItem(), "", ""));

                LatihanUAS2_Sipat.inputSatuMahasiswa(mhs);
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            }
        } else if (object == buttonClear) {
            textFieldNPM.setText("");
            textFieldNama.setText("");
            radioGroup.clearSelection();
            textFieldKotaLain.setText("");
            textFieldKotaLain.setVisible(false);
            textFieldKuis.setText("0");
            textFieldTugas.setText("0");
            textFieldUTS.setText("0");
            textFieldUAS.setText("0");
            textFieldSoftskill.setText("0");
            comboBoxProgramStudi.setSelectedIndex(0);
        } else if (object == radioLuarPalembang) {
            textFieldKotaLain.setVisible(true);
        } else if (object == radioPalembang) {
            textFieldKotaLain.setVisible(false);
        }
    }
}
