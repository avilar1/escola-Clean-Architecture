package br.com.alura.escola.dominio.aluno;

//VALUE OBJECT
public class Email {

	private String endereco;
	
	public Email(String endereco) {
		
		//a do professor: !numero.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}");
		if(endereco == null || !endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("Email invalido");
		}
		
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}
	
}
