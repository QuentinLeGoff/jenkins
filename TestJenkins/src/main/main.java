package main;

import java.util.Scanner;

public class main {
	

	static int addition(int x, int y){
		return x+y;
	}
	
	static int soustraction(int x, int y){
		return x-y;
	}
	
	static int multiplication(int x, int y){
		return x*y;
	}

	public static void main (String[] args){
		System.out.println("Hello World");
		System.out.println("Veuillez entrer un x et un y");
		
		Scanner input = new Scanner (System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		System.out.println("Voici les résultats :");
		System.out.println("addition : "+addition(x,y));
		System.out.println("soustraction : "+soustraction(x,y));
		System.out.println("multiplication : "+multiplication(x,y));
	}
}
