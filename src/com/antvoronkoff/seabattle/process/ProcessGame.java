package com.antvoronkoff.seabattle.process;

import java.util.Scanner;
import static com.antvoronkoff.seabattle.util.ConsoleUtil.*;
import com.antvoronkoff.seabattle.process.*;


public class ProcessGame implements iProcess{
	
	public ProcessGame() {}

	@Override
	public void startProcess() {
		clearScreen();
	Scanner scanner = new Scanner(System.in);	
	System.out.println("----SEA BATTLE----");
	draw("C:/games/sea_battle/bin/com/antvoronkoff/seabattle/BattleInterface.txt");
	scanner.nextLine(); 
	closeProcess();	
	}
	
	@Override
	public void closeProcess() {
	clearScreen();
	}
	

}	


