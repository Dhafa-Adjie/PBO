package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Layar1 extends JFrame implements ActionListener{
    JLabel label = new JLabel(new ImageIcon("A:\\image\\head.png"));
    ImageIcon img[] = {
        new ImageIcon("A:\\image\\sn0.png"), new ImageIcon("A:\\image\\sn1.png"),
        new ImageIcon("A:\\image\\sn2.png"), new ImageIcon("A:\\image\\sn3.png"),
        new ImageIcon("A:\\image\\sn4.png"), new ImageIcon("A:\\image\\sn5.png"),
        new ImageIcon("A:\\image\\sn6.png"), new ImageIcon("A:\\image\\sn7.png"),
        new ImageIcon("A:\\image\\sn8.png"), new ImageIcon("A:\\image\\sn9.png"),
        new ImageIcon("A:\\image\\sn10.png"), new ImageIcon("A:\\image\\sn11.png")
    };
    JButton[] katalog = new JButton[img.length];
    JButton checkoutButton = new JButton("Checkout > > >");

    public Layar1() throws HeadlessException {
        super("Toko Sepatu CRT");

        setLayout(new BorderLayout());

        JPanel headerPanel = new JPanel();
        headerPanel.add(label);
        add(headerPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(0, 4, 10, 10)); 

        for (int i = 0; i < 12; i++) {
            katalog[i] = new JButton(img[i]);
            katalog[i].addActionListener(this);
            katalog[i].setBackground(Color.white);
            buttonPanel.add(katalog[i]);
        }

        JScrollPane scrollPane = new JScrollPane(buttonPanel);
        add(scrollPane, BorderLayout.CENTER);

        JPanel footerPanel = new JPanel();
        footerPanel.add(checkoutButton);
        add(footerPanel, BorderLayout.SOUTH);

        setSize(1000, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Layar1();
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		Object object = e.getSource();
		for(int i = 0 ; i < katalog.length ; i++) {
			if (object == katalog[i]) {
				
			}
		}
	}
}
