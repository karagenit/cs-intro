package bases;

import java.util.Scanner;

public class Convert {
	
	

	public static void main(String[] args) {

		boolean quit = false;
		String input;
		int inBase, outBase; 

		Scanner scanner = new Scanner(System.in);
		
		while(!quit) {
			
			System.out.print("Enter Input Value: ");
			input = scanner.nextLine();
			System.out.print("Enter Input Base: ");
			inBase = Integer.parseInt(scanner.nextLine());
			System.out.print("Enter Output Base: ");
			outBase = Integer.parseInt(scanner.nextLine());
						
			System.out.println("Value: " + Encode.encode(Decode.decode(input, inBase), outBase));
			System.out.println();
			
			scanner.reset();
		}
		
		scanner.close();
	}

}