package br.com.programa.java;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * Teste unitário progrma para ou impar
 * @author Alécio Delprá, Fábio Castilhos, Leandro Akira, Vinicius Schaarschmidt e Wagner Pedrosa
 * Testa se um numero é PAR.  
 */
public class TestesUnitarios {

	ProgramaParImpar programaparimpar;
	
	public void inicio(){
		programaparimpar = new ProgramaParImpar();
	}
	
	@Test
	public void ehPar() {
		 resultado = programaparaimpar.ePar(20);
		Boolean resultadoEsperado = True;
		assertEquals(resultadoEsperado, resultado);
	}

}
