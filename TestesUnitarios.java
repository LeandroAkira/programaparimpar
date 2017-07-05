package br.com.programa.java;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * Teste unit�rio progrma para ou impar
 * @author Al�cio Delpr�, F�bio Castilhos, Leandro Akira, Vinicius Schaarschmidt e Wagner Pedrosa
 * Testa se um numero � PAR.  
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
