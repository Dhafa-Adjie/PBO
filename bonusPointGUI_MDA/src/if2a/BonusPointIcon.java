package if2a;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

class Frame1 extends JFrame implements ActionListener{

	JButton [] button = new JButton[8];
	ImageIcon [] iconAmd = {new ImageIcon("A:\\Private\\image\\amd\\thred.jpg"), new ImageIcon("A:\\Private\\image\\amd\\ryzen (1).jpg"),
			new ImageIcon("A:\\Private\\image\\amd\\pro.jpeg"), new ImageIcon("A:\\Private\\image\\amd\\mobile.jpg"),new ImageIcon("A:\\Private\\image\\amd\\opteron (1).jpg")
			,new ImageIcon("A:\\Private\\image\\amd\\athlon.jpg"),new ImageIcon("A:\\Private\\image\\amd\\amd_epyc_logo.jpg"), new ImageIcon("A:\\Private\\image\\amd\\a series.jpg")};

	String [] ket = {"High-end desktop (HEDT) processors aimed at professionals, content creators, and enthusiasts who need high core counts and multi-threaded performance. Examples include Threadripper 1000, 2000, 3000, and 5000 series.","AMD's mainstream desktop processors aimed at consumers and enthusiasts. This includes various generations such as Ryzen 1000, 2000, 3000, 4000, 5000, and 6000 series.",
			"These are enterprise-grade processors designed for business desktops and workstations. They offer features such as enhanced security and manageability.",
			"Processors designed for laptops and mobile devices. These include Ryzen 1000, 2000, 3000, 4000, and 5000 series for laptops, with variations for different power and performance requirements.",
			"Server and workstation processors designed for data centers and enterprise environments. These are typically optimized for multi-threaded performance and scalability.",
			"Entry-level processors for budget-conscious consumers and basic computing needs.",
			"AMD's server-grade processors designed for data center deployments, offering high core counts, memory bandwidth, and I/O capabilities for demanding server workloads.",
			"Previously known as AMD APU (Accelerated Processing Unit), these processors integrate CPU and GPU cores on the same die, offering enhanced graphics performance for budget desktops and laptops."
			};
	String [] nama = {"Ryzen Threadripper Series","Ryzen Series","Ryzen PRO Series"
			,"Ryzen Mobile Series","Opteron Series","Athlon Series","Epyc Series","A-Series"};
	JLabel [] labelket = new JLabel[8];
	
	public Frame1() throws HeadlessException {
		super("AMD's Processors Types");
		setSize(1000, 500);
		setUndecorated(true);
		getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
		setLocation(250, 250);
		setVisible(true);
		setLayout(new GridLayout(2, 4));
		for (int i = 0 ; i < 8 ; i++) {
			button[i] = new JButton(iconAmd[i]);
			add(button[i]);
			button[i].setBackground(Color.white);
			labelket[i] = new JLabel(ket[i], iconAmd[i], 0);
			button[i].addActionListener(this);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clicked =(JButton) e.getSource();
		for (int i = 0 ; i < 8 ; i++) {
			if (clicked == button[i]) {
				JFrame frame = new JFrame(nama[i]);
				frame.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
				frame.setSize(1280, 250);;
				frame.setUndecorated(true);
				frame.setLocation(0, 250);
				frame.setVisible(true);
				frame.add(labelket[i]);
			}
		}
	}
	
}

class Frame2 extends JFrame implements ActionListener{

	JButton [] button = new JButton[7];
	String [] nama = {"Intel Atom", "Intel Celeron", "Intel Pentium", "Intel Core i3", "Intel Core i5", "Intel Core i7", "Intel Core i9"};
	ImageIcon [] iconIntel = {new ImageIcon("A:\\Private\\image\\intel\\Intel-Atom.png"), new ImageIcon("A:\\Private\\image\\intel\\intel-celeron.jpg"),
							new ImageIcon("A:\\Private\\image\\intel\\Pentium-D.jpg"), new ImageIcon("A:\\Private\\image\\intel\\Intel-Core-i3.jpg"),
							new ImageIcon("A:\\Private\\image\\intel\\Core-i5.jpg"), new ImageIcon("A:\\Private\\image\\intel\\Core-i7.jpg"),
							new ImageIcon("A:\\Private\\image\\intel\\core-i9.jpg")};
	JLabel [] labelket = new JLabel[7];
	String [] ket = {"These are the smallest and most energy-efficient processors. They are ideal for basic tasks on mobile devices like tablets and smartphones, where battery life is crucial.",
					"A step up from Atom, Celerons offer more power for handling everyday tasks like web browsing, using office applications, and streaming videos. They are a budget-friendly option for basic computing needs.",
					"These processors provide a good balance between price and performance. They can handle most everyday tasks smoothly, including multitasking with moderate workloads.",
					"Stepping into higher performance territory, Core i3 processors are suitable for everyday use along with some light gaming or creative work.",
					"These processors offer significant performance improvement over i3. They can handle demanding applications like video editing, gaming, and multitasking with ease.",
					"Ideal for power users who need exceptional performance. Core i7 processors are great for tasks like heavy multitasking, high-end gaming, and professional content creation.",
					"The top-of-the-line processors from Intel. Core i9 is the ultimate choice for gamers, professional video editors, and anyone who needs the absolute best performance for demanding workloads."};
							
	
	public Frame2() throws HeadlessException {
		super("Intel's Processors");
		setSize(1000, 500);
		setUndecorated(true);
		getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
		setLocation(250, 250);
		setVisible(true);
		setLayout(new GridLayout(2, 4));
		for (int i = 0 ; i < 7 ; i++) {
			button[i] = new JButton(iconIntel[i]);
			add(button[i]);
			button[i].setBackground(Color.white);
			labelket[i] = new JLabel(ket[i], iconIntel[i], 0);
			button[i].addActionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clicked =(JButton) e.getSource();
		for (int i = 0 ; i < 7 ; i++) {
			if (clicked == button[i]) {
				JFrame frame = new JFrame(nama[i]);
				frame.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
				frame.setSize(1280, 250);;
				frame.setUndecorated(true);
				frame.setLocation(0, 250);
				frame.setVisible(true);
				frame.add(labelket[i]);
			}
		}
	}
	
}

public class BonusPointIcon {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Processors List");
		JButton home1 = new JButton(new ImageIcon("A:\\Private\\image\\intel\\Utama.png"));
		JButton home2 = new JButton(new ImageIcon("A:\\Private\\image\\amd\\utama.png"));
		frame.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
		frame.setSize(600, 300);
		frame.setUndecorated(true);
		frame.setLocation(500, 250);
		frame.setVisible(true);
		frame.setLayout(new GridLayout(1, 2));
		frame.add(home1);
		frame.add(home2);
		
		ActionListener amd = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Frame1 layaramd = new Frame1();
			}
		};
		
		ActionListener intel = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Frame2 layarint = new Frame2();
			}
		};
		
		home1.addActionListener(intel);
		home2.addActionListener(amd);
	}

}
