package if2a;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DreamBoxbyME {
	public static void shuffleArray(String[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            String temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

	public static void main(String[] args) {
		JFrame frame1 = new JFrame("Kotak Misteri");
		String label = "Kotak Misteri";
		JButton [] button = new JButton[6];
		String [] hadiah = {"Renovasi Rumah🏡" ,"McLaren dari Ronald🚗","Family Pack KFC🍗", "zonk! :P", "zonk! :P","Liburan ke Disney Land🥳"};
        boolean[] hadiahTersedia = {true, true, true, true, true, true};
        
        shuffleArray(hadiah);

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		
		for(int i = 0 ; i < button.length ; i++) {
			button[i] = new JButton(label);
			frame1.add(button[i]);
			
			button[i].setBackground(Color.cyan);
			button[i].setFont(new Font("Bookman Old Style" , Font.BOLD, 20));	
			button[i].setForeground(Color.BLACK);

		}

		frame1.setLayout(new GridLayout(2, 2));
		frame1.pack();
		frame1.setVisible(true);
		frame1.setSize(800, 500);

		ActionListener kotakMisteri = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			    JButton clickedButton = (JButton) e.getSource();
			    int buttonIndex = -1;
			    for (int i = 0; i < button.length; i++) {
			        if (button[i] == clickedButton) {
			            buttonIndex = i;
			            break;
			        }
			    }
			    if (buttonIndex != -1) {
			        if (hadiahTersedia[buttonIndex]) {
			            clickedButton.setText(hadiah[buttonIndex]);
			            hadiahTersedia[buttonIndex] = false; 
			            if (clickedButton.getText().equals("zonk! :P")) {
			            	for (int i = 0 ; i < button.length ; i++) {
			            		button[i].setEnabled(false);
			            	}
		            		JOptionPane.showMessageDialog(null, "ZONK :(", "Death Sentence", JOptionPane.ERROR_MESSAGE);
		            		clickedButton.setBackground(Color.red);
			            } else {
			            	clickedButton.setEnabled(false);
			            	clickedButton.setBackground(Color.lightGray);
			            	clickedButton.setForeground(Color.BLACK);
			            	String kdh = "Selamat anda mendapatkan hadiah " + clickedButton.getText();
		            		JOptionPane.showMessageDialog(null, kdh , "Congrats!!!", JOptionPane.INFORMATION_MESSAGE);
			            }
			        } 
			    }
			}

		};

		for (int i = 0 ; i < button.length ; i++) {
			button[i].addActionListener(kotakMisteri);
		}
		
	}

}
