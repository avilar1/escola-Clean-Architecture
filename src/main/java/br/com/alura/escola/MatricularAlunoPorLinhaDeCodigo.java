package br.com.alura.escola;

import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeCodigo {

	public static void main(String[] args) {
		
		String nome = "Fulano S";
		String cpf = "123.456.789-00";
		String email = "fulano@email.com";
	
		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
	
		matricular.executaMatricular(
					new MatricularAlunoDto(nome, cpf, email));
	}

}
