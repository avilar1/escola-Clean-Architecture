package br.com.alura.escola.infra.aluno;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import br.com.alura.escola.dominio.aluno.CifradorDeSenha;

//padrão SERVICE
public class CifradorDeSenhaComMD5 implements CifradorDeSenha {

	/**
	 * Quando precisamos executar alguma ação 
	 * que não faça parte de nenhuma entidade 
	 * nem de um VO, podemos utilizar uma 
	 * classe Service.
	 */
	
	//essa é uma implementação, com interfarce posso fazer outras
	
	@Override
	public String cifrarSenha(String senha) {
		// verificar método depois
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(senha.getBytes());
			byte[] bytes = md.digest();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < bytes.length; i++) {

				sb.append(Integer.toString((bytes[i] & 0xff) + 0x100));
			}
			return sb.toString();
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("erro ao gerar");
		}
	}

	@Override
	public boolean validarSenhaCifrada(String senhaCifrada, String senha) {

		return senhaCifrada.equals(cifrarSenha(senha));
	}

}
