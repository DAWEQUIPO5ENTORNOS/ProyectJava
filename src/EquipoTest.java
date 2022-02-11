import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquipoTest {
	//Probamos nombre vacio
	@Test
	void testSetNombreEquipoVacio() {
		Equipo equipo = new Equipo();
		String NombreEquipoVacio = "";
		equipo.setNombreEquipo(NombreEquipoVacio);
		assertNull(equipo);
	}
	//Probamos nombre valido
	@Test
	void testSetNombreEquipoValido() {
		Equipo equipo = new Equipo();
		String NombreEquipoValido = "dawfc";
		equipo.setNombreEquipo(NombreEquipoValido);
		System.out.println(equipo.getNombreEquipo());
		assertNotNull(equipo);
	}
	//Probamos nombre invalido por exceso de caracteres y uso de caracteres no validos
	@Test
	void testSetNombreEquipoInv() {
		Equipo equipo = new Equipo();
		String NombreEquipoInvalido = "DAWF.CDAWF.CDAWF.CDAWF.CDAWF.CDAWF.CDAWF.CDAWF.C";
		equipo.setNombreEquipo(NombreEquipoInvalido);
		assertNull(equipo);
	}
	//Probamos nombre invalido por exceso de caracteres 
	@Test
	void testSetRankingInvMaximo() {
		Equipo equipo = new Equipo();
		int RankingInvMaximo = 11;
		equipo.setRanking(RankingInvMaximo);
		assertNull(equipo);
	}
	//Probamos ranking invalido por el limite inferior 
	@Test
	void testSetRankingInvMinimo() {
		Equipo equipo = new Equipo();
		int RankingInvMaximo = -1;
		equipo.setRanking(RankingInvMaximo);
		assertNull(equipo);
	}
	//Probamos ranking valido
	@Test
	void testSetRankingValido() {
		Equipo equipo = new Equipo();
		int RankingValido = 8;
		equipo.setRanking(RankingValido);
		assertNotNull(equipo);
	}
	//Probamos ranking vacio
	@Test
	void testSetRankingVacio() {
		Equipo equipo = new Equipo();
		int RankingValido = -1;
		equipo.setRanking(RankingValido);
		assertNull(equipo);
	}
	//Probamos categoria vacia
	@Test
	void testSetCategoriaVacia() {
		Equipo equipo = new Equipo();
		int RankingValido = -1;
		equipo.setRanking(RankingValido);
		assertNull(equipo);
	}
	//Probamos categoria invalida por superar el limite superior
	@Test
	void testSetCategoriaInvLimiteMax() {
		Equipo equipo = new Equipo();
		int RankingValido = 11;
		equipo.setRanking(RankingValido);
		assertNull(equipo);
	}
	//Probamos categoria invalida por ser menor que el limite inferior
	@Test
	void testSetCategoriaInvLimiteinf() {
		Equipo equipo = new Equipo();
		int RankingValido = -1;
		equipo.setRanking(RankingValido);
		assertNull(equipo);
	}
	//Probamos primera categoria valida con limite superior
	@Test
	void testSetPrimeraCategoriaMaximo () {
		Equipo equipo = new Equipo();
		String NombreEquipoValido = "dawfc";
		int RankingValido = 10;
		equipo.setNombreEquipo(NombreEquipoValido);
		equipo.setRanking(RankingValido);
		assertEquals("Primera" , equipo.categoriaEquipo());
	}
	//Probamos primera categoria valida 
	@Test
	void testSetPrimeraCategoria() {
		Equipo equipo = new Equipo();
		String NombreEquipoValido = "dawfc";
		int RankingValido = 8;
		equipo.setNombreEquipo(NombreEquipoValido);
		equipo.setRanking(RankingValido);
		assertEquals("Primera" , equipo.categoriaEquipo());
	}
	//Probamos primera categoria invalida 
	@Test
	void testSetPrimeraCategoriaInv() {
		Equipo equipo = new Equipo();
		String NombreEquipoValido = "dawfc";
		int RankingValido = 3;
		equipo.setNombreEquipo(NombreEquipoValido);
		equipo.setRanking(RankingValido);
		assertEquals(null , equipo.categoriaEquipo());
	}
	//Probamos primera categoria valida con limite inferior
	@Test
	void testSetPrimeraCategoriaMinimo() {
		Equipo equipo = new Equipo();
		String NombreEquipoValido = "dawfc";
		int RankingValido = 7;
		equipo.setNombreEquipo(NombreEquipoValido);
		equipo.setRanking(RankingValido);
		assertEquals("Primera" , equipo.categoriaEquipo());
	}
	//Probamos segunda categoria valida con limite superior
	@Test
	void testSetSegundaCategoriaMaximo() {
		Equipo equipo = new Equipo();
		String NombreEquipoValido = "dawfc";
		int RankingValido = 6;
		equipo.setNombreEquipo(NombreEquipoValido);
		equipo.setRanking(RankingValido);
		assertEquals("Segunda" , equipo.categoriaEquipo());
	}
	//Probamos segunda categoria valida 
	@Test
	void testSetSegundaCategoria() {
		Equipo equipo = new Equipo();
		String NombreEquipoValido = "dawfc";
		int RankingValido = 5;
		equipo.setNombreEquipo(NombreEquipoValido);
		equipo.setRanking(RankingValido);
		assertEquals("Segunda" , equipo.categoriaEquipo());
	}
	//Probamos segunda categoria invalida 
		@Test
		void testSetSegundaCategoriaInv() {
			Equipo equipo = new Equipo();
			String NombreEquipoValido = "dawfc";
			int RankingValido = 0;
			equipo.setNombreEquipo(NombreEquipoValido);
			equipo.setRanking(RankingValido);
			assertEquals(null , equipo.categoriaEquipo());
		}
	//Probamos segunda categoria valida con limite inferior
	@Test
	void testSetSegundaCategoriaMinimo() {
		Equipo equipo = new Equipo();
		String NombreEquipoValido = "dawfc";
		int RankingValido = 3;
		equipo.setNombreEquipo(NombreEquipoValido);
		equipo.setRanking(RankingValido);
		assertEquals("Segunda" , equipo.categoriaEquipo());
	}
	//Probamos segunda categoria valida con limite superior
	@Test
	void testSetTerceraCategoriaMaximo() {
		Equipo equipo = new Equipo();
		String NombreEquipoValido = "dawfc";
		equipo.setNombreEquipo(NombreEquipoValido);
		int RankingValido = 3;
		equipo.setRanking(RankingValido);
		assertEquals("Tercera", equipo.categoriaEquipo());
	}
	//Probamos segunda categoria valida 
	@Test
	void testSetTerceraCategoria() {
		Equipo equipo = new Equipo();
		String NombreEquipoValido = "dawfc";
		equipo.setNombreEquipo(NombreEquipoValido);
		int RankingValido = 2;
		equipo.setRanking(RankingValido);
		assertEquals("Tercera", equipo.categoriaEquipo());
	}
	//Probamos segunda categoria invalida 
		@Test
		void testSetTerceraCategoriaInv() {
			Equipo equipo = new Equipo();
			String NombreEquipoValido = "dawfc";
			equipo.setNombreEquipo(NombreEquipoValido);
			int RankingValido = 9;
			equipo.setRanking(RankingValido);
			assertEquals(null, equipo.categoriaEquipo());
		}
	//Probamos segunda categoria valida con limite inferior
	@Test
	void testSetTerceraCategoriaMinimo() {
		Equipo equipo = new Equipo();
		String NombreEquipoValido = "dawfc";
		equipo.setNombreEquipo(NombreEquipoValido);
		int RankingValido = 0;
		equipo.setRanking(RankingValido);
		assertEquals("Tercera", equipo.categoriaEquipo());
	}

}
