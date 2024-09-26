package if2a;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LayarContoh extends JFrame implements ActionListener {
//	JButton buttonA = new JButton("SI");
//	JButton buttonB = new JButton("IF");
//	JButton buttonc = new JButton("TE");
//	JButton buttonD = new JButton("MJ");
	
	String [] kode = {"SI", "IF", "TE", "MJ"};
	JButton [] tombol = new JButton[4];

	public LayarContoh() throws HeadlessException {
		super(":: M_DHAFA_2327250081 ::");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(200, 200);
		setVisible(true);
		setSize(400,200);
		setLayout(new GridLayout(1, 4));
//		this.add(buttonA);
//		add(buttonB);
//		add(buttonc);
//		add(buttonD);
		
		for (int i = 0 ; i< tombol.length ; i++) {
			tombol[i] = new JButton(kode[i]);
			add(tombol[i]);
			tombol[i].addActionListener(this);
			
			if (i % 2 == 0) {
				tombol[i].setBackground(Color.WHITE);
				tombol[i].setFont(new Font("Comic Sans MS" , Font.BOLD, 20));			
			} else {
				tombol[i].setBackground(Color.BLACK);
				tombol[i].setFont(new Font("Comic Sans MS" , Font.BOLD, 20));
				tombol[i].setForeground(Color.GRAY);
			}
		}
		
//		buttonA.setBackground(Color.WHITE);
//		buttonA.setFont(new Font("Comic Sans MS" , Font.BOLD, 20));
//		
//		buttonB.setBackground(Color.BLACK);
//		buttonB.setFont(new Font("Comic Sans MS" , Font.BOLD, 20));
//		buttonB.setForeground(Color.GRAY);
//		
//		buttonc.setBackground(Color.WHITE);
//		buttonc.setFont(new Font("Comic Sans MS" , Font.BOLD, 20));
//		
//		buttonD.setBackground(Color.BLACK);
//		buttonD.setFont(new Font("Comic Sans MS" , Font.BOLD, 20));
//		buttonD.setForeground(Color.GRAY);
//		
//		buttonA.addActionListener(this);
//		buttonB.addActionListener(this);
//		buttonc.addActionListener(this);
//		buttonD.addActionListener(this);
	}
	int clickedcount = 0;
	@Override
	public void actionPerformed(ActionEvent e) {
//		Object object = e.getSource();
//		String kode = "";
		if (e.getSource() instanceof JButton) {
//			((JButton)e.getSource()).setBackground(Color.red);
			JButton clickedButton = (JButton) e.getSource();
            if (clickedcount < 2) {
                clickedButton.setBackground(Color.red);
                clickedcount++;
            } else {
            	clickedcount = 0;
                 clickedButton.setBackground(null);
                 for (JButton button : tombol ) {
                     button.setBackground(null); 
                 }
            }
		}
	}

//	public void tampil(String kode) {
//		String ket;
//		if (kode.equals("SI")) {
//			ket = "Sistem Informasi";
//		} else if (kode.equals("IF")) {
//			ket = "Informatika";
//		} else if (kode.equals("TE")) {
//			ket = "Teknik Elektro";
//		} else {
//			ket = "Manajemen";
//		}
//		JOptionPane.showMessageDialog(null, kode + " = " + ket , "Program Studi", JOptionPane.DEFAULT_OPTION);
//	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		Object object = e.getSource();
//		if (object == buttonA) {
//			String kode = buttonA.getText();
//			JOptionPane.showMessageDialog(null, kode + " = Sistem Informasi" , "Program Studi", JOptionPane.DEFAULT_OPTION);
//		} else if (object == buttonB) {
//			JOptionPane.showMessageDialog(null, "Informatika" , "Program Studi", JOptionPane.DEFAULT_OPTION);
//		} else if (object == buttonc) {
//			JOptionPane.showMessageDialog(null, "Teknik Elektro" , "Program Studi", JOptionPane.DEFAULT_OPTION);
//		} else {
//			JOptionPane.showMessageDialog(null, "Manajemen" , "Program Studi", JOptionPane.DEFAULT_OPTION);
//
//		}
//	}
}
