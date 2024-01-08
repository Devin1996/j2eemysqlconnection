package AnnotationConfigPkg;

/*
 * M A D C De Silva
 * 10018717
 * BSC-NSBM-SWE-17.1-056
 * DEA 2 Practical Assignment
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


	@Component
	public class PrintController {

		@Autowired
		@Qualifier("fileprint")
		private PrintService printf;
		
		@Autowired
		@Qualifier("consoleprint")
		private PrintService printc;
		
		
		public PrintController() {}
		
		
		
		public void doprint() {
			printf.print(" In Print Control");
			printc.print(" In Print Control");
		
		}

	}

