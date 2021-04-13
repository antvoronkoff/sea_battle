package com.antvoronkoff.seabattle.util;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ConsoleUtil{

    public static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")) {
            	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
            	Runtime.getRuntime().exec("clear");
            }
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
	
	public static void draw(String path){
		try (Scanner scanner = new Scanner(new FileReader(path))) {
			while (scanner.hasNextLine()) {
				String currentTxtRow = scanner.nextLine();
				String[] graphicCells=currentTxtRow.split("");
				for(int i=0; i<=graphicCells.length-1;i++){
					if(i==graphicCells.length-1){
						System.out.println(graphicCells[i]);
					
					}else{
						System.out.print(graphicCells[i]);
					}
					
				}
				
			}

		} catch (IOException ex) {
			System.out.println("Trouble with BattleInterface");
		}

		
	}
		

}	


