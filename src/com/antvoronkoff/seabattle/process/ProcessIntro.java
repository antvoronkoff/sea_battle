package com.antvoronkoff.seabattle.process;

import java.util.Scanner;
import static com.antvoronkoff.seabattle.util.ConsoleUtil.clearScreen;
import com.antvoronkoff.seabattle.process.iProcess;

public class ProcessIntro implements iProcess{
	
	public ProcessIntro() {}

	@Override
	public void startProcess() {
	Scanner scanner = new Scanner(System.in);	
	System.out.println("----SEA BATTLE----");
	System.out.println("\033[0;34m"+"~~~~~~~~~~~~~~~~~~");
	System.out.println("~~~~"+"\033[0m"+"|\\"+"\033[0;34m"+"~~~~~~~~~~~~");
	System.out.println("~~"+"\033[0m"+"__|_\\__"+"\033[0;34m"+"~~~~~~~~~");
	System.out.println("~~"+"\033[0m"+"\\_____/"+"\033[0;34m"+"~~~~"+"\033[0m"+"/|"+"\033[0;34m~~");
	System.out.println("~~~~~~~~~~"+"\033[0m"+"__/_|"+"\033[0;34m"+"~~~");
	System.out.println("~~~~~~~~~~"+"\033[0m"+"\\_____/"+"\033[0;34m"+"~");
	System.out.println("~~~~~~~~~~~~~~~~~~"+"\033[0m"+"");
	System.out.println("------------------");
	System.out.println("  Press any key   ");
	System.out.println("   to continue    ");
	scanner.nextLine(); 
	closeProcess();	
	}
	
	@Override
	public void closeProcess() {
	clearScreen();
	}
}	


