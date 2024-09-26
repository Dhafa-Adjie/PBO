package if2a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Coba2 extends JFrame implements ActionListener{ 
	String [] kode = {"SI","SI","SI","SI","SI","SI"
			,"IF","IF","IF","IF","IF","IF",
			"MJ","MJ","MJ","MJ","MJ","MJ",
			"TE","TE","TE","TE","TE","TE"};
	JButton [] tombol = new JButton[24];

	public Coba2() throws HeadlessException {
		super(":: M_DHAFA_2327250081 ::");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(200, 200);
		setVisible(true);
		setSize(500,500);
		setLayout(new GridLayout(6, 6));
		shuffleArray(kode);
		for (int i = 0 ; i< tombol.length ; i++) {
			tombol[i] = new JButton(kode[i]);
			add(tombol[i]);
			tombol[i].addActionListener(this);
		}
	}

	
	int clickedcount = 0;
	JButton buttonSelected = null;
	JButton first = null;
	JButton second = null;
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
//			((JButton)e.getSource()).setBackground(Color.red);
			JButton clickedButton = (JButton) e.getSource();
			if (clickedcount < 2) {
	            clickedButton.setBackground(Color.red);
	            clickedcount++;
	            
	            if (clickedcount == 1) {
	                first = clickedButton;
	                first.setEnabled(false);
	            } else if (clickedcount == 2) {
	                second = clickedButton;
	                if (first.getText().equals(second.getText())) {
	                    first.setBackground(Color.green);
	                    second.setBackground(Color.green);
	                    first.setEnabled(false);
	                    second.setEnabled(false);
	                } else {
	                	first.setEnabled(true);
	                }
	            }
	        } else {
	            clickedcount = 0;
	            first.setBackground(null);
	            second.setBackground(null);
	            first = null;
	            second = null;
	        }
		}
	}
	
	public static void shuffleArray(String[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            // Menukar elemen di posisi i dengan elemen di posisi index
            String temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
	
	public static void main(String[] args) {
		Coba2 layar = new Coba2();
	}
}
