package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CPFTest {

	@Test
	void naoDeixaCPFInvalido() {
		assertThrows(IllegalArgumentException.class, 
				() -> new CPF(null));
		assertThrows(IllegalArgumentException.class, 
				() -> new CPF(""));

	}
		
	@Test
	void NaoTemMensagemDeErroSeForValido() {
		assertDoesNotThrow(() -> new CPF("123.456.789-00"));
	}

}
