package if2a;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MatchingGame extends JFrame {

    private static final int GRID_SIZE = 4;
    private List<JButton> buttons = new ArrayList<>();
    private List<Integer> numbers = new ArrayList<>();
    private JButton selectedButton = null;
    private int pairsFound = 0;

    public MatchingGame() {
        setTitle("Matching Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(GRID_SIZE, GRID_SIZE));

        // Add numbers twice to the list to ensure there are pairs
        for (int i = 1; i <= (GRID_SIZE * GRID_SIZE) / 2; i++) {
            for (int j = 0; j < 2; j++) {
                numbers.add(i);
            }
        }
        Collections.shuffle(numbers); // Shuffle the numbers

        for (int i = 0; i < GRID_SIZE * GRID_SIZE; i++) {
            JButton button = new JButton();
            button.setPreferredSize(new Dimension(100, 100)); // Adjust button size as needed
            buttons.add(button);
            button.addActionListener(new ButtonListener());
            add(button);
        }

        pack();
        setLocationRelativeTo(null); // Center the JFrame
        setVisible(true);
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            int index = buttons.indexOf(clickedButton);
            int number = numbers.get(index);

            if (selectedButton == null) {
                selectedButton = clickedButton;
                selectedButton.setText(String.valueOf(number));
            } else {
                if (selectedButton != clickedButton) {
                    clickedButton.setText(String.valueOf(number));
                    if (selectedButton.getText().equals(clickedButton.getText())) {
                        // Match found
                        selectedButton.setEnabled(false);
                        clickedButton.setEnabled(false);
                        pairsFound++;
                        if (pairsFound == (GRID_SIZE * GRID_SIZE) / 2) {
                            JOptionPane.showMessageDialog(null, "Congratulations! You've matched all pairs.");
                        }
                    } else {
                        // No match, reset numbers after a short delay
                        Timer timer = new Timer(1000, new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                selectedButton.setText("");
                                clickedButton.setText("");
                            }
                        });
                        timer.setRepeats(false);
                        timer.start();
                    }
                    selectedButton = null;
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MatchingGame::new);
    }
}


