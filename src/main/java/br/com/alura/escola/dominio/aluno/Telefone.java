package br.com.alura.escola.dominio.aluno;

public class Telefone {

	private String ddd;
	private String numero;
	
	public Telefone(String ddd, String numero) {
		if(ddd == null || numero== null) {
			throw new IllegalArgumentException("Telefone não preenchido corretamente");
		}
		if(!ddd.matches("[1-9]{2}")) {
			throw new IllegalArgumentException("DDD invalido");
		}
		if(!numero.matches("[0-9]{5}\\-?[0-9]{4}$")) {
			throw new IllegalArgumentException("Telefone invalido");
		}
		this.ddd = ddd;
		this.numero = numero;
	}

	public String getDdd() {
		return ddd;
	}

	public String getNumero() {
		return numero;
	}
	
	
	
	
}
