package bases;

import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {

		boolean quit = false;
		int input, inBase, outBase, raw; 
		String output;

		Scanner scanner = new Scanner(System.in);
		
		while(!quit) {
			
			System.out.print("Enter Input Value: ");
			input = scanner.nextInt();
			System.out.print("Enter Input Base: ");
			inBase = scanner.nextInt();
			System.out.print("Enter Output Base: ");
			outBase = scanner.nextInt();
			
			raw = Decode.decode(input, inBase);
			output = Encode.encode(raw, outBase);
			
			System.out.println("Value: " + output);
			System.out.println();
		}
		
		scanner.close();
	}

}
