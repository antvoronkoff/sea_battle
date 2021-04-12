package com.antvoronkoff.seabattle.util;

import java.io.IOException;

public class ConsoleUtil{

		public static void clearScreen(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
		

}	


