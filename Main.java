package cubesolver;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


	
	// ;
	public static String[][] bluetar = {{"b", "b", "b"}, {"b", "b", "b"}, {"b", "b", "b"}};
	public static String[][] orangetar = {{"o", "o", "o"}, {"o", "o", "o"}, {"o", "o", "o"}};
	public static String[][] greentar = {{"g", "g", "g"}, {"g", "g", "g"}, {"g", "g", "g"}};
	public static String[][] redtar = {{"r", "r", "r"}, {"r", "r", "r"}, {"r", "r", "r"}};
	public static String[][] whitetar = {{"w", "w", "w"}, {"w", "w", "w"}, {"w", "w", "w"}};
	public static String[][] yellowtar = {{"y", "y", "y"}, {"y", "y", "y"}, {"y", "y", "y"}};
	
	public static Cube target = new Cube(bluetar, orangetar, greentar, redtar, whitetar, yellowtar);

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Blue, W top, R left, O right");
		String bluesidea = in.nextLine();
		System.out.println("Orange, W top, B left, G right");
		String orangesidea = in.nextLine();
		System.out.println("Green, W top, O left, R right");
		String greensidea = in.nextLine();
		System.out.println("Red, W top, G left, B right");
		String redsidea = in.nextLine();
		System.out.println("White, G top, R left, O right");
		String whitesidea = in.nextLine();
		System.out.println("Yellow, G top, O left, R right");
		String yellowsidea = in.nextLine();
		System.out.println(bluesidea);
		System.out.println(orangesidea);
		System.out.println(greensidea);
		System.out.println(redsidea);
		System.out.println(whitesidea);
		System.out.println(yellowsidea);
		String[][] blueside = new String[3][3];
		String[][] orangeside = new String[3][3];
		String[][] greenside = new String[3][3];
		String[][] redside = new String[3][3];
		String[][] whiteside = new String[3][3];
		String[][] yellowside = new String[3][3];
		
		// TODO Hold green, white up, orange left 
		
		char[] y = bluesidea.toCharArray();
		String[] z = charArrayToStringArray(y);
		blueside = makeSide(z);
		
		y = orangesidea.toCharArray();
		z = charArrayToStringArray(y);
		orangeside = makeSide(z);
		
		y = greensidea.toCharArray();
		z = charArrayToStringArray(y);
		greenside = makeSide(z);
		
		y = redsidea.toCharArray();
		z = charArrayToStringArray(y);
		redside = makeSide(z);
		
		y = whitesidea.toCharArray();
		z = charArrayToStringArray(y);
		whiteside = makeSide(z);
		
		y = yellowsidea.toCharArray();
		z = charArrayToStringArray(y);
		yellowside = makeSide(z);
		
		
		String all = bluesidea + orangesidea + greensidea + redsidea + whitesidea + yellowsidea;
		char[] charall = all.toCharArray();
		int[] occs = {getOccurences('b', charall), getOccurences('o', charall), getOccurences('g', charall), getOccurences('y', charall), getOccurences('r', charall), getOccurences('w', charall)};
		boolean allsix = OtherMethods.isAllEqual(occs);
		
		if (!allsix) {
			System.out.println("This is an impossible cube position. ");
			System.exit(1);
		}
	
		in.close();
		Cube original = new Cube(blueside, orangeside, greenside, redside, whiteside, yellowside);
		String sol = getSolution(original);
		System.out.println(sol);
	}

	public static String[] charArrayToStringArray(char[] array) {
		String[] outut = new String[array.length];
		for (int i = 0; i < array.length; i++) {
			outut[i] = String.valueOf(array[i]).toLowerCase();
		}
		return outut;
		
	}
	
	public static String[][] makeSide(String[] str) {
		String[][] outut = new String[3][3];
		outut[0][0] = str[0];
		outut[0][1] = str[1];
		outut[0][2] = str[2];
		outut[1][0] = str[3];
		outut[1][1] = str[4];
		outut[1][2] = str[5];
		outut[2][0] = str[6];
		outut[2][1] = str[7];
		outut[2][2] = str[8];

		return outut;
		
	}
	
	
	public static int getOccurences(char c, char[] a) {
		  int n = a.length;
		  char x = c;
		  int count = 0;
		  
		   for(int i = 0; i < n; i++)
	       {
	           if(a[i] == x)
	           {
	               count++;
	           }
	       }
		   return count;
	   }
	
	
	public static boolean arrsa(String[] a, String[] b) {
		return Arrays.equals(a, b);
	}
	
	
	public static String arrtostr(String[] arr) {
		String output = "";
		int t = 0;
		
		for (String el : arr) {
			if (t == 0) {
				output = el;
			} else {
				output = output + "\n" + el;
			}
			
			t++;
		}
		
		
		
		return output;
	}
	
	
	
	public static String getSolution(Cube cube) {
		if (cube.equals(target)) {
			return "It's already solved ya dum dum!";
		}
		
		
		return null;
	}
	

	
}
