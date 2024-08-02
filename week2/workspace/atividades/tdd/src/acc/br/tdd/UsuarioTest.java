package acc.br.tdd;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class UsuarioTest {

	@Test
	public void testUsuarioMariorDeIdade() {
		Usuario usuario = new Usuario("João", 20);
		assertTrue(usuario.ehMaiorDeIdade());
	}
	
	@Test
	public void testUsuarioMenorDeIdade() {
		Usuario usuario = new Usuario("Maria", 17);
		assertFalse(usuario.ehMaiorDeIdade());
	}

}
