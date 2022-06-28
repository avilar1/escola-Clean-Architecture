package br.com.alura.escola.dominio.aluno;

//apesar do nome, esse não é um Factory Method. É mais semelhante ao padrão BUILDER
public class FabricaDeAluno {

	private Aluno aluno;
	
	public FabricaDeAluno comNomeCPFeEmail(String nome, String cpf, String email) {
		this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
	
		return this;
	}
	
	public FabricaDeAluno comTelefone(String ddd, String numero) {
		this.aluno.adicionarTelefone(ddd, numero);
		
		return this;
	}
	
	public Aluno criar() {
		return this.aluno;
	}
	
	//o retur this permite o encadiamento de métodos.
	public static void main(String[] args) {
		FabricaDeAluno fabrica = new FabricaDeAluno();
		
		Aluno aluno2 = fabrica.comNomeCPFeEmail("", "", "")
		.comTelefone("", "")
		.criar();
	}
}
