package br.com.programa.java;
import javax.swing.JOptionPane;

/**
 * Progrma para ou impar
 * @author Al�cio Delpr�, F�bio Castilhos, Leandro Akira, Vinicius Schaarschmidt e Wagner Pedrosa
 * Programa para retornar se um numero � PAR ou IMPAR.  
 */
public class ProgramaParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 91;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero:"));
		if( ePar(numero))
		    System.out.println("O n�mero: "+numero+" � PAR");
		else        
			System.out.println("O n�mero: "+numero+" � IMPAR");
	}
	
// M�todo que retorna true se numero for par, e false caso contr�rio.
	public static boolean ePar(int numero)	{
	if(numero % 2 == 0)
		return true;
	else
		return false;
	}
}
