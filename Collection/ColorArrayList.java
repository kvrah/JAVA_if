package JavaTech;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class ColorArrayList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> Listacor = new ArrayList<>();
		Scanner leia = new Scanner(System.in);
		
		for (int x =0;x<5;x++) {
			System.out.println("\nDigite a cor desejada: ");
			
		String cor = leia.nextLine();
		Listacor.add(cor);
			
		}
	
		System.out.println("\nAs cores digitadas foram: ");
		System.out.println(Listacor);
		
		Collections.sort(Listacor);
		System.out.println(Listacor);
		
		leia.close();
}


}