package com.antvoronkoff.seabattle.process;

import java.util.Scanner;
import static com.antvoronkoff.seabattle.util.ConsoleUtil.clearScreen;
import com.antvoronkoff.seabattle.process.*;

public class ProcessGame implements iProcess{
	
	public ProcessGame() {}

	@Override
	public void startProcess() {
		clearScreen();
	Scanner scanner = new Scanner(System.in);	
	System.out.println("----SEA BATTLE----");
	System.out.println(" Y    Player Map          Y    Enemy Map      ");
	System.out.println("X  01020304050607080910  X 01020304050607080910");
	System.out.println("  *--------------------*  *--------------------*");
	System.out.println(" 1|....................| 1| . . . . . . . . . .|");
	System.out.println(" 2|....................| 2| . . . . . . . . . .|");
	System.out.println(" 3|....................| 3| . . . . . . . . . .|");
	System.out.println(" 4|....................| 4| . . . . . . . . . .|");
	System.out.println(" 5|....................| 5| . . . . . . . . . .|");
	System.out.println(" 6|....................| 6| . . . . . . . . . .|");
	System.out.println(" 7|....................| 7| . . . . . . . . . .|");
	System.out.println(" 8|....................| 8| . . . . . . . . . .|");
	System.out.println(" 9|....................| 9| . . . . . . . . . .|");
	System.out.println("10|....................|10| . . . . . . . . . .|");
	System.out.println("  *--------------------*  *--------------------*");
	scanner.nextLine(); 
	closeProcess();	
	}
	
	@Override
	public void closeProcess() {
	clearScreen();
	}
}	


