package one;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Variables {

	public static void main (String[] args) throws Exception {
		
		int sum = 0;
		
		int a = 3;
		a *= 2;
		
		for(int i = 0; i <= a; i++) {
			sum += i;
		}
		
		System.out.println("SUM IS: " + sum);
	}
}