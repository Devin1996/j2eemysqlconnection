package XMLConfigPkg;

/*
 * M A D C De Silva
 * 10018717
 * BSC-NSBM-SWE-17.1-056
 * DEA 2 Practical Assignment
 */

public class ConsolePrintService implements PrintService{

	

	@Override
	public void print(String console) {
		System.out.println("Console Print Serrvice" + console);
		
	}

}