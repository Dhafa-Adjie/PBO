package if2a;

import java.util.ArrayList;

import model.Sepatu;

public class Head {

	public static void main(String[] args) {
		ArrayList<Sepatu> spt = new ArrayList<Sepatu>();
		spt.add(new Sepatu("Nike", "Red and Blue", 40, 20000000, "nigga"));
		
		System.out.println(spt.get(0));
	}

}
