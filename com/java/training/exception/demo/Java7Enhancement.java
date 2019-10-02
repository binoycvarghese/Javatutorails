package com.java.training.exception.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Java7Enhancement {
	
	public static void main(String[] args) throws CustomException {

		
		try {
			  File file = new File("E://file.txt");
		      FileReader fr = new FileReader(file); 
		}catch (RuntimeException | FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("esception occured: "+e.getMessage());
		}
	}

}
