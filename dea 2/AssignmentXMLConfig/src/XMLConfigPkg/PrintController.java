package XMLConfigPkg;

/*
 * M A D C De Silva
 * 10018717
 * BSC-NSBM-SWE-17.1-056
 * DEA 2 Practical Assignment
 */

	public class PrintController {


		private PrintService printC;
		
		
//		public PrintController() {
//			
//		}
		
		public PrintController(PrintService pr) {
			printC = pr;
		}
		
		
		
		public void doprint() {
			printC.print(" In Print Control");
		
		}

	}

