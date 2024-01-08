package AnnotationConfigPkg;

/*
 * M A D C De Silva
 * 10018717
 * BSC-NSBM-SWE-17.1-056
 * DEA 2 Practical Assignment
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;

@Component("fileprint")

public class FilePrintService implements PrintService{

	@Override
	public void print(String print) {
		 
		try {
		      FileWriter myObj = new FileWriter("textfile.txt");
		      
		      myObj.write("File Print Service written to the log");
		      myObj.close();
		      System.out.println("File Print Service" + print);
		       
		      }
		     catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
   

		}
	}