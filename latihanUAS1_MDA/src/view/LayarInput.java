package view;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import if2a.LatihanUAS1_MDA;
import model.Mahasiswa;

public class LayarInput extends JFrame implements ActionListener {
	private JLabel labelNPM = new JLabel("NPM"); 
    private JTextField textFieldNPM = new JTextField(""); 
	private JLabel labelNama = new JLabel("Nama"); 
    private JTextField textFieldNama = new JTextField(""); 
	private JLabel labelKuis = new JLabel("Nilai Kuis"); 
    private JTextField textFieldKuis = new JTextField("0"); 
	private JLabel labelTugas = new JLabel("Nilai Tugas"); 
    private JTextField textFieldTugas = new JTextField("0");
	private JLabel labelUts = new JLabel("Nilai UTS"); 
    private JTextField textFieldUts = new JTextField("0"); 
	private JLabel labelUas = new JLabel("Nilai UAS"); 
    private JTextField textFieldUas = new JTextField("0"); 
	private JLabel labelSoftskill = new JLabel("Nilai Softskill"); 
    private JTextField textFieldSoftskill = new JTextField("0"); 
    private JButton buttonSimpan = new JButton("SIMPAN");
    private JButton buttonClear = new JButton("CLEAR");
    private JButton buttonTampil = new JButton("TAMPIL");
    private JButton buttonKeluar = new JButton("KELUAR");

    public LayarInput() {
        bentukLayar();
        this.setLayout(new GridLayout(10,4));// baris, kolom
        this.add(labelNPM);  this.add(textFieldNPM); 
        this.add(labelNama);  this.add(textFieldNama); 
        this.add(labelKuis);  this.add(textFieldKuis); 
        this.add(labelTugas);  this.add(textFieldTugas); 
        this.add(labelUts);  this.add(textFieldUts); 
        this.add(labelUas);  this.add(textFieldUas); 
        this.add(labelSoftskill);  this.add(textFieldSoftskill); 


        this.add(buttonSimpan); this.add(buttonClear);
        this.add(buttonTampil); this.add(buttonKeluar);
        buttonKeluar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Thengs!");
				System.exit(0);				
			}
		});
        buttonSimpan.addActionListener(this);
        buttonTampil.addActionListener(this);
        buttonClear.addActionListener(this);
        this.setVisible(true);
    }
    private void bentukLayar() {
        this.setTitle(":: 2327250081 - Minamino ::");//super(":: NPM - NAMA ::");
        this.setSize(400, 400);
        this.setLocation(0, 0);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		Object object = e.getSource();
//		if(object == buttonKeluar) {
//			JOptionPane.showMessageDialog(null, "Thengs!");
//			System.exit(0);
//		} else 
		if (object == buttonTampil) {
			TampilanTabel tabel = new TampilanTabel();
		} else if (object == buttonSimpan) {
			if (textFieldNPM.getText().trim().equals("")) {
				JOptionPane.showMessageDialog(null, "NPM Tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
			} else if (Double.parseDouble(textFieldKuis.getText()) > 100 || Double.parseDouble(textFieldKuis.getText()) < 0){
				JOptionPane.showMessageDialog(null, "Nilai harus dimasukkan dengan benar", "Error", JOptionPane.ERROR_MESSAGE);
			} else if (Double.parseDouble(textFieldTugas.getText()) > 100 || Double.parseDouble(textFieldTugas.getText()) < 0){
				JOptionPane.showMessageDialog(null, "Nilai harus dimasukkan dengan benar", "Error", JOptionPane.ERROR_MESSAGE);
			}else {
				LatihanUAS1_MDA.inputDatamhs( new Mahasiswa(textFieldNPM.getText(), textFieldNama.getText(), Double.parseDouble(textFieldKuis.getText()), Double.parseDouble(textFieldTugas.getText()), Double.parseDouble(textFieldUts.getText()), Double.parseDouble(textFieldUas.getText()), Double.parseDouble(textFieldSoftskill.getText()) ) );
			}
			textFieldNPM.setText("");
			textFieldNama.setText("");
			textFieldKuis.setText("0");
			textFieldTugas.setText("0");
			textFieldUts.setText("0");
			textFieldUas.setText("0");
			textFieldSoftskill.setText("0");
//			LatihanUAS1_MDA.inputDatamhs(mhs);
//			LatihanUAS1_MDA.inputDatamhs(new Mahasiswa("2327250078", "Migel", 90, 90, 90, 90, 90));
//			LatihanUAS1_MDA.inputDatamhs(new Mahasiswa("2327250070", "Fadhel", 62,80,90,85,90));
//			LatihanUAS1_MDA.inputDatamhs(new Mahasiswa("2327250018", "Klaudius", 12, 76, 96, 97, 75));
//			LatihanUAS1_MDA.inputDatamhs(new Mahasiswa("2327250052", "Dimas", 70, 70, 70, 70, 70));
//			LatihanUAS1_MDA.inputDatamhs(new Mahasiswa("2327250004", "Jeremy", 80, 86, 90, 90, 72));
		} else {
			textFieldNPM.setText("");
			textFieldNama.setText("");
			textFieldKuis.setText("0");
			textFieldTugas.setText("0");
			textFieldUts.setText("0");
			textFieldUas.setText("0");
			textFieldSoftskill.setText("0");
		}
	}
	

}
