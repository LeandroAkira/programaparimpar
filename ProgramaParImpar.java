package br.com.programa.java;
import javax.swing.JOptionPane;

/**
 * Progrma para ou impar
 * @author Alécio Delprá, Fábio Castilhos, Leandro Akira, Vinicius Schaarschmidt e Wagner Pedrosa
 * Programa para retornar se um numero é PAR ou IMPAR.  
 */
public class ProgramaParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 91;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero:"));
		if( ePar(numero))
		    System.out.println("O número: "+numero+" É PAR");
		else        
			System.out.println("O número: "+numero+" É IMPAR");
	}
	
// Método que retorna true se numero for par, e false caso contrário.
	public static boolean ePar(int numero)	{
	if(numero % 2 == 0)
		return true;
	else
		return false;
	}
}
