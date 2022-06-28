package br.com.alura.escola.dominio.aluno;

//SERVICE do DOMÍNIO
public interface CifradorDeSenha {

	String cifrarSenha(String senha);
	
	boolean validarSenhaCifrada(String senhaCifrada, String senha);

}
