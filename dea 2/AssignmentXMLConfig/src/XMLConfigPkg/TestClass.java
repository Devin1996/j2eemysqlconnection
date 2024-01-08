package XMLConfigPkg;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * M A D C De Silva
 * 10018717
 * BSC-NSBM-SWE-17.1-056
 * DEA 2 Practical Assignment
 */

import org.springframework.context.support.ClassPathXmlApplicationContext;

import XMLConfigPkg.FilePrintService;

public class TestClass {
	                         
	
		public static void main(String[] args) throws FileNotFoundException, IOException {
			
			
			
			try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml")) {
				PrintController obj = context.getBean("PrintControl", PrintController.class);
				PrintController obj1 = context.getBean("PrintControl2", PrintController.class);
			
				obj.doprint();
				obj1.doprint();
			}
		}
		
	}



