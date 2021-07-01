package util;

/**
 * Classe responsavel por armazenar metodos de validação do sistema
 * 
 * @author Nathalia Lanaro
 * @since 03 de Março de 2021
 * @version 1.0
 */
public class Valida {
	//método p validar se o valor string está preenchido
	
	public static boolean isEmptyOrNull (String args){
		return(args.trim().equals("") || args == null);
	}

}
