package com.antvoronkoff.seabattle;

import java.util.Scanner;
import java.io.IOException;
import com.antvoronkoff.seabattle.process.*;
import static com.antvoronkoff.seabattle.util.ConsoleUtil.clearScreen;

public class Main{

	public static void main(String[] args) {
		clearScreen();
		Scanner scanner = new Scanner(System.in);
		boolean activeMenu = true;
			
		ProcessIntro intro= new ProcessIntro();
		intro.startProcess();
		
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
	}		


