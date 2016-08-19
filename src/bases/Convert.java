package bases;

import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {

		boolean quit = false;
		int input, inBase, outBase; 

		Scanner scanner = new Scanner(System.in);
		
		while(!quit) {
			
			System.out.print("Enter Input Value: ");
			input = scanner.nextInt();
			System.out.print("Enter Input Base: ");
			inBase = scanner.nextInt();
			System.out.print("Enter Output Base: ");
			outBase = scanner.nextInt();
						
			System.out.println("Value: " + Encode.encode(Decode.decode(input, inBase), outBase));
			System.out.println();
		}
		
		scanner.close();
	}

}