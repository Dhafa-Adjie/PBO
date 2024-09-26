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

public class BonusPoint extends JFrame implements ActionListener {
	String listp [] = {"AMD Ryzen 5 HS Series" , "Intel i5 12th Gen", "Intel i7 14th Gen"};
	String lisro [] = {"256 GB", "512 GB", "1 TB"};
	String lisra [] = {"8 GB", "12 GB", "32 GB"};
	String lisvg [] = {"Nvidia GeForce RTX 2050", "Intel UHD", "Intel Geforce RTX 3060"};
	
	JLabel proces = new JLabel("Processor's type");
	JLabel rom = new JLabel("Choose Memory Size");
	JLabel ram = new JLabel("Choose RAM size");
	JLabel gpu = new JLabel("Choose graphics card's type");
	
	JPanel one = new JPanel();
	JPanel two = new JPanel();
	JPanel tres = new JPanel();
	JPanel quatro = new JPanel();
	
	JRadioButton [] chProces = new JRadioButton[3];
	JRadioButton [] chMem = new JRadioButton[3];
	JRadioButton [] chRam = new JRadioButton[3];
	JRadioButton [] chVga = new JRadioButton[3];
	
	ButtonGroup pro = new ButtonGroup();
	ButtonGroup mem = new ButtonGroup();
	ButtonGroup fram = new ButtonGroup();
	ButtonGroup vga = new ButtonGroup();
	
	JButton submit = new JButton("Submit");
	JButton reset = new JButton("Reset");

	public BonusPoint() throws HeadlessException   {
		super("Laptop Catalogs");
		setSize(800, 500);
		setLocation(450, 0);
		setLayout(new GridLayout(6, 1));
		setResizable(false);
		
		one.add(proces);
		two.add(rom);
		tres.add(ram);
		quatro.add(gpu);
		
		
		for(int i = 0 ; i < 3 ; i++) {
			chProces[i] = new JRadioButton(listp[i]);
			chMem[i] = new JRadioButton(lisro[i]);
			chRam[i] = new JRadioButton(lisra[i]);
			chVga[i] = new JRadioButton(lisvg[i]);

			pro.add(chProces[i]);
			mem.add(chMem[i]);
			fram.add(chRam[i]);
			vga.add(chVga[i]);
			
			one.add(chProces[i]);
			two.add(chMem[i]);
			tres.add(chRam[i]);
			quatro.add(chVga[i]);

		}
		
		add(one);
		add(two);
		add(tres);
		add(quatro);
		add(submit);
		add(reset);

		submit.addActionListener(this);
		reset.addActionListener(this);
		setVisible(true);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		Object object = e.getSource();
		
		if (object == reset) {
			chProces[0].setSelected(true);
			chMem[0].setSelected(true);
			chRam[0].setSelected(true);
			chVga[0].setSelected(true);
		} else {
			for (int i = 0 ; i < 3 ; i++) {
				for (int j = 0 ; j < 3 ; j++) {
					for (int k = 0 ; k < 3 ; k++) {
						for (int l = 0 ; l < 3 ;l++) {
							if (chProces[i].isSelected() && chMem[j].isSelected() && chRam[k].isSelected() && chVga[l].isSelected()) {
								String teks = "Check out these items \nProcessor : " + chProces[i].getText() + "\n"
												+ "Memory Size : "+ chMem[j].getText() + "\n" +
												 "RAM Size : " + chRam[k].getText() + "\n" +
												"Graphics card type : " + chVga[l].getText();
									JOptionPane.showMessageDialog(null, teks);
								
							}
						}
					}
				} 
			}
		}
	}}
