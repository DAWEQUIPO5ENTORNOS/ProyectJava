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
		String NombreEquipoValido = "dawfc";
		equipo.setNombreEquipo(NombreEquipoValido);
		System.out.println(equipo.getNombreEquipo());
		assertEquals(NombreEquipoValido.toUpperCase(), equipo.getNombreEquipo());
	}

	@Test
	void testSetNombreEquipoInv() {
		Equipo equipo = new Equipo();
		String NombreEquipoInvalido = "DAWF.CDAWF.CDAWF.CDAWF.CDAWF.CDAWF.CDAWF.CDAWF.C";
		equipo.setNombreEquipo(NombreEquipoInvalido);
		assertEquals(null, equipo.getNombreEquipo());
	}

	@Test
	void testSetRankingInvMaximo () {
		Equipo equipo = new Equipo();
		int RankingInvMaximo = 11;
		equipo.setRanking(RankingInvMaximo);
		assertEquals(-1 , equipo.getRanking());
	}
	
	@Test
	void testSetRankingValido () {
		Equipo equipo = new Equipo();
		int RankingValido = 8;
		equipo.setRanking(RankingValido);
		assertEquals(RankingValido , equipo.getRanking());
	}
	
	@Test
	void testSetRankingVacio () {
		Equipo equipo = new Equipo();
		int RankingValido = -1;
		equipo.setRanking(RankingValido);
		assertEquals(-1 , equipo.getRanking());
	}
	
	@Test
	void testSetCategoriaVacia () {
		Equipo equipo = new Equipo();
		int RankingValido = -1;
		equipo.setRanking(RankingValido);
		assertEquals(null , equipo.categoriaEquipo(equipo.getRanking()));
	}
	
	@Test
	void testSetPrimeraCategoria () {
		Equipo equipo = new Equipo();
		int RankingValido = 10;
		equipo.setRanking(RankingValido);
		assertEquals("Primera" , equipo.categoriaEquipo(equipo.getRanking()));
	}
	
	@Test
	void testSetSegundaCategoria () {
		Equipo equipo = new Equipo();
		int RankingValido = 5;
		equipo.setRanking(RankingValido);
		assertEquals("Segunda" , equipo.categoriaEquipo(equipo.getRanking()));
	}
	@Test
	void testSetTerceraCategoria () {
		Equipo equipo = new Equipo();
		int RankingValido = 2;
		equipo.setRanking(RankingValido);
		assertEquals("Tercera", equipo.categoriaEquipo(equipo.getRanking()));
	}
	
		
}
