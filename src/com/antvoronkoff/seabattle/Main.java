package com.antvoronkoff.seabattle;

import java.util.Scanner;
import java.io.IOException;

public class Main{

	public static void main(String[] args) {
		clearScreen();
		Scanner scanner = new Scanner(System.in);
		boolean activeMenu = true;
		//Intro
			System.out.println("----SEA BATTLE----");
			System.out.println("    			  ");
			System.out.println("    |\\		*  ");
			System.out.println("  __|_\\__         ");
			System.out.println("  \\_____/    /|   ");
			System.out.println("          __/_|__ ");
			System.out.println("    *     \\_____/ ");
			System.out.println("                  ");
			System.out.println("------------------");
			System.out.println("  Press any key   ");
			System.out.println("   to continue    ");
			scanner.nextLine(); 
		clearScreen();

		while (activeMenu) {
			
			  
			System.out.println("----SEA BATTLE----");
			System.out.println(" [0] Continue");
			System.out.println(" [1] New game");
			System.out.println(" [2] Load game");
			System.out.println(" [3] Save game");
			System.out.println(" [4] Multiplayer");
			System.out.println(" [5] Exit");
			
		
			int usertype = scanner.nextInt();
			switch(usertype){
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
				System.out.println("This option in development");

				break;
				case 5:
				activeMenu=false;
				break;
				default:
				clearScreen();
				break;
				}
			} 
		}
		
		public static void clearScreen(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
		

}	


