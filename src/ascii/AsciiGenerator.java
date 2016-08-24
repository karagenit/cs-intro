package ascii;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;

public class AsciiGenerator {
	
	static int THRESH_1 = 50;
	static int THRESH_2 = 100;
	static int THRESH_3 = 150;
	static int THRESH_4 = 200;
	static int RESOLUTION_SCALE = 10;
	static int CHAR_PER_PIXEL = 1;

	public static void main(String[] args) {
		
		//TODO take cmd line args
		
		//TODO get user input
		String imagePath = "C:\\java2.png";
		
		try {
			char[][] output = getAsciiMatrix(getBlackWhite(ImageIO.read(new File(imagePath))));
			
			//TODO nicer output (don't use Arrays.toString)
			for(char[] line : output) {
				System.out.println(Arrays.toString(line));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//primary call methods
	
	private static int[][] getBlackWhite(BufferedImage image) {
		if (image == null) return null;
		
		int height = image.getHeight();
		int width  = image.getWidth();
		
		 int[][] matrix = new int[height][width];
		 
		 for(int a = 0; a < height; a++) {
			 for(int b = 0; b < width; b++) {
				 matrix[a][b] = getBlackValue(getColorValue(image.getRGB(b, a)));
			 }
		 }
		 
		 return matrix;
	}

	@SuppressWarnings("unused")
	private static int[][] deresolve(int[][] input) {
		
		int height = input.length;
		int width  = input[0].length;
		int[][] image = new int[height / RESOLUTION_SCALE][width / RESOLUTION_SCALE];
		
		for(int a = 0; a < height; a += RESOLUTION_SCALE) {
			for(int b = 0; b < width; b += RESOLUTION_SCALE) {
				int sum = 0;
				
				for(int i = 0; i < RESOLUTION_SCALE; i++) {
					for(int j = 0; j < RESOLUTION_SCALE; i++) {
						sum += input[a+i][b+j];
					}
				}
				
				image[a / RESOLUTION_SCALE][b / RESOLUTION_SCALE] = sum;
			}
		}
		
		return image;
	}
	
	private static char[][] getAsciiMatrix(int[][] input) {
		int height = input.length;
		int width  = input[0].length;
		
		char[][] output = new char[height][width * CHAR_PER_PIXEL];
		
		for(int a = 0; a < height; a++) {
			for(int b = 0; b < width; b++) {
				char val = getAscii(input[a][b]);
				
				//TODO broken for CHAR vals > 1
				for(int c = 0; c < CHAR_PER_PIXEL; c++) {
					output[a][b+c] = val;
				}
			}
		}
		
		return output;
	}

	//helper methods

	private static int[] getColorValue(int color) {
		
		int red =   color >> 16 & 0xff; 
	    int blue =  color >>  8 & 0xff; 
	    int green = color       & 0xff; 
			    
	    int[] rgb = {red, blue, green};
	    
		return rgb;
	}
	
	private static int getBlackValue(int[] color) {
		
		if (color.length != 3) 
			return 0;
		
		return (color[0] + color[1] + color[2]) / 3;
	}
	
	private static char getAscii(int color) {
		
		if(color < THRESH_1) {
			return '@';
		} else if (color < THRESH_2) {
			return '#';
		} else if (color < THRESH_3) {
			return '=';
		} else if (color < THRESH_4) {
			return '+';
		} else {
			return ':';
		}
	}
	
}
