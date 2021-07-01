package util;

/**
 * Classe responsavel por armazenar metodos de valida��o do sistema
 * 
 * @author Nathalia Lanaro
 * @since 03 de Mar�o de 2021
 * @version 1.0
 */
public class Valida {
	//m�todo p validar se o valor string est� preenchido
	
	public static boolean isEmptyOrNull (String args){
		return(args.trim().equals("") || args == null);
	}

}
