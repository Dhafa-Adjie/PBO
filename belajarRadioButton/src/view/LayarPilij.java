package view;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRootPane;

public class LayarPilij extends JFrame implements ActionListener{
	JRadioButton [] fakultas = new JRadioButton[2];
	JRadioButton [] waktu = new JRadioButton[2];

	ButtonGroup fkl = new ButtonGroup();
	ButtonGroup wkt = new ButtonGroup();

	private JLabel labelPil = new JLabel("Pilih Fakultas");
	private JLabel waktuKul = new JLabel("Waktu Kuliah");
	private JLabel labelKet = new JLabel("-- Waktu Kuliah --");


	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();

	JButton submit = new JButton("Submit");
	JButton reset = new JButton("Reset");
	
	public LayarPilij() throws HeadlessException {
		super("Pilihan Fakultas");
		fakultas[0]= new JRadioButton("FIKR");
		fakultas[1]= new JRadioButton("FEB");
		waktu[0] = new JRadioButton("Pagi");
		waktu[1] = new JRadioButton("Malam");

		setSize(700, 300);
		setLocation(450, 0);
		setLayout(new GridLayout(3, 4));
		setResizable(true);
		add(labelPil);
		
		for (int i = 0 ; i < fakultas.length ; i++) {
			fkl.add(fakultas[i]);
			add(fakultas[i]);
		}
		
		
		
		ActionListener btnWaktu = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				labelKet.setText("07:50 s.d 15:10");
			}
		};
		
		ActionListener btnSore = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				labelKet.setText("15:30 s.d 20:40");
			}
		};
		
		add(waktuKul);
		for (int i = 0 ; i < fakultas.length ; i++) {
			wkt.add(waktu[i]);
			add(waktu[i]);
			
		}
		add(labelKet);

		waktu[0].addActionListener(btnWaktu);
		waktu[1].addActionListener(btnSore);

		panel.add(submit);
		panel.add(reset);
		add(panel);
		submit.addActionListener(this);
		reset.addActionListener(this);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object object = e.getSource();
		if(object == reset) {
			fakultas[0].setSelected(true);
		} else if (object == submit) {
			for (int i = 0 ; i < 2 ; i++) {
				for (int j = 0 ; j < 2 ; j++) {
					if (fakultas[i].isSelected() && waktu[j].isSelected()) {
						String lab = getNamaFakultas(fakultas[i].getText()) + "\n" + waktu[j].getText() + " " + labelKet.getText();
						JOptionPane.showMessageDialog(null, lab);
					}
				}
				
			}
		}
	}
	
	public String getNamaFakultas (String kodeFakultas) {
		if (kodeFakultas.equals("FIKR")) {
			return "Fakultas Ilmu Komputer dan Rekayasa";
		} else {
			return "Fakultas Ekonomi dan Bisnis";
		}
	}
	
	
}
