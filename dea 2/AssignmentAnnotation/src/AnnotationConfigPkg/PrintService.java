package AnnotationConfigPkg;

/*
 * M A D C De Silva
 * 10018717
 * BSC-NSBM-SWE-17.1-056
 * DEA 2 Practical Assignment
 */

import org.springframework.stereotype.Component;

@Component
public interface PrintService {
	
	public void print(String p);
}
