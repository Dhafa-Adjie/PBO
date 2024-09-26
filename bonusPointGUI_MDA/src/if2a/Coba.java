package if2a;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Coba {
	 private static final int INITIAL_VALUE = 0;

	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Number Input with Confirmation");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(new FlowLayout());
	        frame.setSize(100, 200);
	        frame.setLocation(500, 500);

	        // Text field to display the number
	        JTextField numberField = new JTextField(String.valueOf(INITIAL_VALUE),5);
	        numberField.setEditable(false);

	        // Buttons for increment, decrement, and confirmation
	        JButton incrementButton = new JButton("+");
	        JButton decrementButton = new JButton("-");
	        JButton confirmButton = new JButton("Confirm");

	        // Action listener for increment and decrement buttons
	        ActionListener incrementDecrementListener = new ActionListener() {
	            int currentValue = INITIAL_VALUE;

	            @Override
	            public void actionPerformed(ActionEvent e) {
	                JButton clickedButton = (JButton) e.getSource();
	                String buttonText = clickedButton.getText();

	                if (buttonText.equals("+")) {
	                    currentValue++;
	                } else if (buttonText.equals("-")) {
	                    currentValue--;
	                }

	                numberField.setText(String.valueOf(currentValue));
	            }
	        };

	        // Action listener for confirmation button
	        ActionListener confirmListener = new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                int finalNumber = Integer.parseInt(numberField.getText());

	                // Confirm the number with a message dialog
	                int confirmation = JOptionPane.showConfirmDialog(null,
	                        "Confirm number: " + finalNumber + "\nProceed?",
	                        "Confirmation", JOptionPane.YES_NO_OPTION);

	                if (confirmation == JOptionPane.YES_OPTION) {
	                    System.out.println("Confirmed: " + finalNumber);
	                    // Perform actions based on the confirmed number here
	                } else {
	                    System.out.println("Confirmation canceled.");
	                }
	            }
	        };

	        // Add action listeners to buttons
	        incrementButton.addActionListener(incrementDecrementListener);
	        decrementButton.addActionListener(incrementDecrementListener);
	        confirmButton.addActionListener(confirmListener);

	        // Add components to the frame
	        frame.add(numberField);
	        frame.add(incrementButton);
	        frame.add(decrementButton);
	        frame.add(confirmButton);

	        frame.pack();
	        frame.setVisible(true);
	    }

}
