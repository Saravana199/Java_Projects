package com.decembertrainingjava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Customexception {
	
	static FileReader fr = null;
	static BufferedReader br = null;
	
	public static void main(String[] args) {
		File f = new File("Input.txt");
		fr = new FileReader(f);
		br = new BufferedReader(fr);
		String line = br.readLine();

while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

		
	}
}
