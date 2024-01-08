package AnnotationConfigPkg;

/*
 * M A D C De Silva
 * 10018717
 * BSC-NSBM-SWE-17.1-056
 * DEA 2 Practical Assignment
 */

import org.springframework.stereotype.Component;

@Component("consoleprint")
public class ConsolePrintService implements PrintService{

	

	@Override
	public void print(String console) {
		System.out.println("Console Print Serrvice" + console);
		
	}

}