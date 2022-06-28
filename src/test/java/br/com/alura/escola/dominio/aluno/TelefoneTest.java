package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TelefoneTest {

	@Test
	void naoDeixaTelefoneInvalido() {
		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone(null, null));
		assertThrows(IllegalArgumentException.class, 
				() -> new Telefone("", ""));

	}
		
	@Test
	void NaoTemMensagemDeErroSeForValido() {
		assertDoesNotThrow(() -> new Telefone("21", "12345-6789"));
	}

}
