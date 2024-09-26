package if2a;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Coba_dreambox {

    private static final int NUM_DREAMBOXES = 4;
    private static final int NUM_PRIZES = 4;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Kotak Misteri");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 2));

        JButton[] dreamboxes = new JButton[NUM_DREAMBOXES];

        List<String> prizes = new ArrayList<>();
        prizes.add("Renovasi Rumah");
        prizes.add("McLaren dari Ronald");
        prizes.add("Family Pack KFC");
        prizes.add("Zonk!");

        Collections.shuffle(prizes);

        for (int i = 0; i < NUM_DREAMBOXES; i++) {
            dreamboxes[i] = new JButton("DreamBox " + (i + 1));
            dreamboxes[i].addActionListener(new DreamBoxListener(dreamboxes, prizes, i));
            dreamboxes[i].setBackground(Color.lightGray);
            dreamboxes[i].setFont(new Font("Bookman Old Style", Font.BOLD, 20));
            dreamboxes[i].setForeground(Color.red);
            frame.add(dreamboxes[i]);
        }

        frame.pack();
        frame.setVisible(true);
        frame.setSize(500, 500);
    }

    private static class DreamBoxListener implements ActionListener {

        private final JButton[] dreamboxes;
        private final List<String> prizes;
        private final int dreamboxIndex;

        public DreamBoxListener(JButton[] dreamboxes, List<String> prizes, int dreamboxIndex) {
            this.dreamboxes = dreamboxes;
            this.prizes = prizes;
            this.dreamboxIndex = dreamboxIndex;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (dreamboxes[dreamboxIndex].isEnabled()) {
                String prize = prizes.remove(0);
                dreamboxes[dreamboxIndex].setText(prize);
                dreamboxes[dreamboxIndex].setEnabled(false);

                if (prize.equals("Zonk!")) {
                    for (JButton dreambox : dreamboxes) {
                        dreambox.setEnabled(false);
                    }

                    JOptionPane.showMessageDialog(null, "Anda mendapatkan Zonk!");
                } else {
                    JOptionPane.showMessageDialog(null, "Selamat! Anda mendapatkan " + prize + "!");
                }
            }
        }
    }
}
