package AnnotationConfigPkg;

/*
 * M A D C De Silva
 * 10018717
 * BSC-NSBM-SWE-17.1-056
 * DEA 2 Practical Assignment
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	
	
		public static void main(String[] args) throws FileNotFoundException, IOException {
			
	                                 
			
			try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml")) {
				PrintController obj = context.getBean(PrintController.class);
				PrintController obj1 = context.getBean(PrintController.class);
				
				obj.doprint();
				obj1.doprint();
			}
		}
		
	}



