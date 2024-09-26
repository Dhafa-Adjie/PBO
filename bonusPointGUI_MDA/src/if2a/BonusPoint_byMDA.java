package if2a;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BonusPoint_byMDA {


	public static void main(String[] args) {
		int angka = 0 ;
		
		String nama = JOptionPane.showInputDialog("Masukkan Nama Anda : ");
		String id = JOptionPane.showInputDialog("Masukkan ID Anda : ");
		JFrame frame1 = new JFrame("MDhafaAdjie");
		JLabel forframe1 = new JLabel("Masukkan jumlah koin anda ");
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JTextField field = new JTextField(String.valueOf(angka), 5);
		JButton konfirm = new JButton("Lanjut");
		field.setEditable(false);
		
		ActionListener tandk = new ActionListener() {
			int inangka = angka;
			@Override
			public void actionPerformed(ActionEvent e) {
				Object object = e.getSource();
				if (object == plus) {
					inangka++;				
				}	else {
					inangka--;
				} 
				field.setText(String.valueOf(inangka));
			}
		};
		
		ActionListener konfirmasi = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Object object = e.getSource();
				int finalNumber = Integer.parseInt(field.getText());
				
				String teks = "Nama : " + nama + "\n"+
				"ID : " + id + "\n" +
						"Jumlah Koin : " + finalNumber;

                int confirmation = JOptionPane.showConfirmDialog(null,
                        teks + "\nLanjut?", "Laman Konfirmasi!", JOptionPane.YES_NO_OPTION);

                if (confirmation == JOptionPane.YES_OPTION) {
                    System.out.println("Confirmed: " + finalNumber);
                } else {
                	JOptionPane.showMessageDialog(null, "Transaction Cancelled", "Confirmation", JOptionPane.ERROR_MESSAGE);
                }
			}
		};

		System.out.println(field.getText());
		plus.addActionListener(tandk);
		minus.addActionListener(tandk);
		konfirm.addActionListener(konfirmasi);
		frame1.setLayout(new FlowLayout());
		frame1.add(forframe1);
		frame1.add(field);
		frame1.add(plus);
		frame1.add(minus);
		frame1.add(konfirm);
		frame1.pack();
		frame1.setSize(600, 150);
		frame1.setLocation(250, 500);
		frame1.setVisible(true);
	}

}
