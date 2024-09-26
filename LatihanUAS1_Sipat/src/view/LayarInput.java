package view;

import model.Mahasiswa;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import if2a.LatihanUAS1_Sipat;

public class LayarInput extends JFrame implements ActionListener {
	private JLabel labelNPM = new JLabel("NPM");
	private JTextField textFieldNPM = new JTextField("");
	private JLabel labelNama = new JLabel("Nama");
	private JTextField textFieldNama = new JTextField("");
	private JLabel labelKuis = new JLabel("Kuis");
	private JTextField textFieldKuis = new JTextField("0");
	private JLabel labelTugas = new JLabel("Tugas");
	private JTextField textFieldTugas = new JTextField("0");
	private JLabel labelUTS = new JLabel("UTS");
	private JTextField textFieldUTS = new JTextField("0");
	private JLabel labelUAS = new JLabel("UAS");
	private JTextField textFieldUAS = new JTextField("0");
	private JLabel labelSoftskill = new JLabel("Softskill");
	private JTextField textFieldSoftskill = new JTextField("0");
	private JButton buttonSimpan = new JButton("SIMPAN");
	private JButton buttonClear = new JButton("CLEAR");
	private JButton buttonTampil = new JButton("TAMPIL");
	private JButton buttonKeluar = new JButton("KELUAR");

	public LayarInput() {
		bentukLayar();
		this.setLayout(new GridLayout(9, 2)); // baris, kolom
		this.add(labelNPM);
		this.add(textFieldNPM);
		this.add(labelNama);
		this.add(textFieldNama);
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
		this.add(buttonSimpan);
		this.add(buttonClear);
		this.add(buttonTampil);
		this.add(buttonKeluar);

		buttonSimpan.addActionListener(this);
		buttonClear.addActionListener(this);
		buttonTampil.addActionListener(this);
		buttonKeluar.addActionListener(this);
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
			// trim : membuang whitespace kiri dan kanan
			if (textFieldNPM.getText().trim().equals("")) {
				JOptionPane.showMessageDialog(null, "NPM tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
			} else if (textFieldNama.getText().trim().equals("")) {
				JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
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
				Mahasiswa mhs = new Mahasiswa(textFieldNPM.getText(), textFieldNama.getText(),
						Double.parseDouble(textFieldKuis.getText()), Double.parseDouble(textFieldTugas.getText()),
						Double.parseDouble(textFieldUTS.getText()), Double.parseDouble(textFieldUAS.getText()),
						Double.parseDouble(textFieldSoftskill.getText()));
				
				LatihanUAS1_Sipat.inputSatuMahasiswa(mhs);
				JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
			}
		} else if (object == buttonClear) {
			textFieldNPM.setText("");
			textFieldNama.setText("");
			textFieldKuis.setText("0");
			textFieldTugas.setText("0");
			textFieldUTS.setText("0");
			textFieldUAS.setText("0");
			textFieldSoftskill.setText("0");
		}
	}
}
