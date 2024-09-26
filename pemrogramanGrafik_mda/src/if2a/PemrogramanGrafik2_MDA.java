package if2a;

import javax.swing.JFrame;
import javax.swing.JRootPane;

class Layar extends JFrame{
	public Layar (String setTitle , int lokx , int loky) {		// Constructor
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200,200); // ( Width , Height)
		setLocation(lokx, loky);	// (x , y)
		setResizable(false);
		setTitle(setTitle);
		setUndecorated(true);
		getRootPane().setWindowDecorationStyle(JRootPane.ERROR_DIALOG);
		setVisible(true);
	}
}

public class PemrogramanGrafik2_MDA {

	public static void main(String[] args) {
		Layar layarError = new Layar("Ambatukam" , 0, 200);
		Layar layarInformasi = new Layar("Rusdi" ,0, 400);
		Layar layarPeringatan = new Layar("Fadel", 0 , 600);
	}

}
