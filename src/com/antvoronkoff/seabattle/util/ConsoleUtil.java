package com.antvoronkoff.seabattle.util;

import java.io.IOException;

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
		

}	


