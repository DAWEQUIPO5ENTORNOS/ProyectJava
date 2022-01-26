import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquipoTest {

	@Test
	void testSetNombreEquipoVacio() {
		Equipo equipo = new Equipo();
		String NombreEquipoVacio = "";
		equipo.setNombreEquipo(NombreEquipoVacio);
		assertEquals(null, equipo.getNombreEquipo());
	}

	@Test
	void testSetNombreEquipoValido() {
		Equipo equipo = new Equipo();
		String NombreEquipoValido = "DAW F.C";
		equipo.setNombreEquipo(NombreEquipoValido);
		assertEquals(NombreEquipoValido, equipo.getNombreEquipo());
	}

	@Test
	void testSetNombreEquipo() {
		Equipo equipo = new Equipo();
		String NombreEquipoInvalido = "DAWF.CDAWF.CDAWF.CDAWF.CDAWF.CDAWF.CDAWF.CDAWF.C";
		equipo.setNombreEquipo(NombreEquipoInvalido);
		assertEquals(NombreEquipoInvalido, equipo.getNombreEquipo());
	}

	@Test
	void testSetRankingInvMaximo () {
		Equipo equipo = new Equipo();
		int RankingInvMaximo = 11;
		equipo.setRanking(RankingInvMaximo);
		assertEquals(RankingInvMaximo , equipo.getRanking());
	}
	
	@Test
	void testSetRankingValido () {
		Equipo equipo = new Equipo();
		int RankingValido = 8;
		equipo.setRanking(RankingValido);
		assertEquals(RankingValido , equipo.getRanking());
	}

}
