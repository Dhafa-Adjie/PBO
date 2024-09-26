package if2a;

import java.util.ArrayList;

import model.Sepatu;
import view.Layar1;

public class Tugas3_MDA {
	private static ArrayList<Sepatu> arraySpt = new ArrayList<Sepatu>();
	
	public static void inputSpt(Sepatu obj) {
		arraySpt.add(obj);
	}
	
	public static ArrayList<Sepatu> getData(){
		return arraySpt;
	}

	public static void main(String[] args) {
		Layar1 layar = new Layar1();
	}

}
