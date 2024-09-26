package if2a;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.SwingConstants;

public class Layaer extends JFrame implements ActionListener{
	JLabel labelKeterangan ;
	JLabel labelAngka = new JLabel("0", SwingConstants.CENTER);
	JButton btnSatu = new JButton("HIT");
	JButton btnDua = new JButton("SMASH");
	JButton btnTiga = new JButton("SMASH");
	JButton btnEmpat = new JButton("SMASH");
	int counter = 0;
	public Layaer() {
		super("MDA-2327250081");	//setTitle();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		setLocation(0, 0);
		setVisible(true);
		setLayout(new GridLayout(0,1));	// Baris , Kolom
		labelAngka.setFont(new Font("Times New Roman", Font.ITALIC, 40));
		labelAngka.setForeground(Color.GREEN);
		btnSatu.setForeground(Color.GREEN);
		btnSatu.setBackground(Color.BLACK);
		btnSatu.setFont(new Font("Arial", Font.BOLD, 40));
		add(labelAngka);
		setBackground(Color.GRAY);
		add(btnSatu);
		add(btnDua);
		add(btnTiga);
		btnSatu.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object object = e.getSource();
		if (object == btnSatu) {
//			JOptionPane.showMessageDialog(null, "Anda mendapat uang Rp.0,05");
			counter++;
			labelAngka.setText(String.valueOf(counter));
			if (counter == 1000) {
				JOptionPane.showMessageDialog(null, "Anda mendapat uang Rp.0,05");
			}
		}
	}
}
