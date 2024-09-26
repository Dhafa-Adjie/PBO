package if2a;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

class Layar extends JFrame{
	public Layar (String setTitle , int lokx , int loky) {		// Constructor
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200,200); // ( Width , Height)
		setLocation(lokx, loky);	// (x , y)
		setResizable(false);
		setTitle(setTitle);
		setUndecorated(true);
		getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
		setVisible(true);
		String kata = "Hahahaha ";
		JLabel labelKet = new JLabel(kata + setTitle);
		add(labelKet);
		setVisible(true);
	}
}

public class GraphicalUserInterface_MDA {

	public static void main(String[] args) {
		String asal = JOptionPane.showInputDialog("Inputkan Asal Anda");
		String welcome = "Selamat Datang , Orang " + asal;
		JOptionPane.showMessageDialog(null, welcome);
		
		Layar layarInfo = new Layar(asal, 0, 0);
	}

}
