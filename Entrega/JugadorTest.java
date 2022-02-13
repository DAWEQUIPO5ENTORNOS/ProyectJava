import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JugadorTest {
	static int minTamano = 4;
	static int maxTamano = 20;
	static int minEdad = 18;
	static int maxEdadJunior = 25;
	static int maxEdadSenior = 35;
	static int maxEdadMaster = 100;
	static int noValido = -1;
	static String nombreValido = "Manuel";
	static String nombreLargo = "MANUELAGARRIDOABIEGO";
	static String nombreInvLargo = "MANUELA CASTAÑO SANCHEZ ";
	static String idioma = "Espanol";
	//*****************PRUEBAS CON NOMBRE

	//Nombre con 0 caracteres
	@Test 
	void testSetNombreJugadorInvalidVacio() {
		Jugador jugador = new Jugador();
		String nombreJugador = "";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(null, jugador.getNombreJugador());
	}

	//Nombre con menos de 4 caracteres
	@Test 
	void testSetNombreJugadorInvalidInsufCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "ZOÉ";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(null,jugador.getNombreJugador());
	}

	//Nombre con 4 caracteres
	@Test 
	void testSetNombreJugadorValidoSufCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "MANU";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador.toUpperCase(),jugador.getNombreJugador());
	}

	//Nombre con más de 4 caracteres
	@Test 
	void testSetNombreJugadorValido() {
		Jugador jugador = new Jugador();
		String nombreJugador = nombreValido;
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador.toUpperCase(), jugador.getNombreJugador());
	}

	//Nombre con menos de 20 caracteres
	@Test 
	void testSetNombreJugadorValido2() {
		Jugador jugador = new Jugador();
		String nombreJugador = nombreValido;
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador.toUpperCase(),jugador.getNombreJugador());
	}

	//Nombre con 20 caracteres
	@Test 
	void testSetNombreJugadorValidoMaximoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = nombreLargo;
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador.toUpperCase(),jugador.getNombreJugador());
	}

	//Nombre con más de 20 caracteres
	@Test 
	void testSetNombreJugadorInvalidoMaximoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "MANUELA CASTAÑO SANCHEZ ";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(null,jugador.getNombreJugador());
	}



	//*******************PRUEBAS CON EDAD

	//Edad INT < 18
	@Test
	void testSetEdadInvMaximo () {
		Jugador jugador = new Jugador();
		int edadJugador = 15;
		jugador.setEdad(edadJugador);
		assertEquals(-1,jugador.getEdad());
	}

	//Edad con INT = 18
	@Test
	void testSetEdadValidoMinimo () {
		Jugador jugador = new Jugador();
		int edadJugador = 18;
		jugador.setEdad(edadJugador);
		assertEquals(edadJugador,jugador.getEdad());
	}

	//Edad con INT > 18
	@Test
	void testSetEdadValido () {
		Jugador jugador = new Jugador();
		int edadJugador = 21;
		jugador.setEdad(edadJugador);
		assertEquals(edadJugador,jugador.getEdad());
	}

	//Tipo null
	@Test
	void testtipoNull () {
		Jugador jugador = new Jugador();
		int edadJugador = 15;
		jugador.setEdad(edadJugador);

		assertEquals(null,jugador.tipoJugador());
	}

	//Tipo Junior
	@Test
	void testtipoJuniorValido() {
		Jugador jugador = new Jugador();
		String nombreJugador = "MANU";
		int edadJugador = 18;
		String idiomaValido = idioma;
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idiomaValido);
		assertNotNull(jugador);
		assertEquals("Junior",jugador.tipoJugador());

	}
	
	//JuniorNombre con 0 caracteres
		@Test 
		void testSetJuniorNombreJugadorInvalidVacio() {
			Jugador jugador = new Jugador();
			String nombreJugador = "";
			jugador.setNombreJugador(nombreJugador);
			assertEquals(null, jugador.getNombreJugador());
		}

		//JuniorNombre con menos de 4 caracteres
		@Test 
		void testSetJuniorNombreJugadorInvalidInsufCaracteres() {
			Jugador jugador = new Jugador();
			String nombreJugador = "ZOÉ";
			jugador.setNombreJugador(nombreJugador);
			assertEquals(null,jugador.getNombreJugador());
		}

		//JuniorNombre con 4 caracteres
		@Test 
		void testSetJuniorNombreJugadorValidoSufCaracteres() {
			Jugador jugador = new Jugador();
			String nombreJugador = "MANU";
			jugador.setNombreJugador(nombreJugador);
			assertEquals(nombreJugador.toUpperCase(),jugador.getNombreJugador());
		}

		//JuniorNombre con más de 4 caracteres
		@Test 
		void testSetJuniorNombreJugadorValido() {
			Jugador jugador = new Jugador();
			String nombreJugador = nombreValido;
			jugador.setNombreJugador(nombreJugador);
			assertEquals(nombreJugador.toUpperCase(), jugador.getNombreJugador());
		}

		//JuniorNombre con menos de 20 caracteres
		@Test 
		void testSetJuniorNombreJugadorValido2() {
			Jugador jugador = new Jugador();
			String nombreJugador = nombreValido;
			jugador.setNombreJugador(nombreJugador);
			assertEquals(nombreJugador.toUpperCase(),jugador.getNombreJugador());
		}

		//JuniorNombre con 20 caracteres
		@Test 
		void testSetJuniorNombreJugadorValidoMaximoCaracteres() {
			Jugador jugador = new Jugador();
			String nombreJugador = nombreLargo;
			jugador.setNombreJugador(nombreJugador);
			assertEquals(nombreJugador.toUpperCase(),jugador.getNombreJugador());
		}

		//JuniorNombre con más de 20 caracteres
		@Test 
		void testSetJuniorNombreJugadorInvalidoMaximoCaracteres() {
			Jugador jugador = new Jugador();
			String nombreJugador = nombreInvLargo;
			jugador.setNombreJugador(nombreJugador);
			assertEquals(null,jugador.getNombreJugador());
		}

		//JuniorEdad INT < 18
		@Test
		void testSetJuniorEdadInvMaximo () {
			Jugador jugador = new Jugador();
			int edadJugador = 15;
			jugador.setEdad(edadJugador);
			assertEquals(-1,jugador.getEdad());
		}

		//JuniorEdad con INT = 18
		@Test
		void testSetJuniorEdadValidoMinimo () {
			Jugador jugador = new Jugador();
			int edadJugador = 18;
			jugador.setEdad(edadJugador);
			assertEquals(edadJugador,jugador.getEdad());
		}

		//JuniorEdad con INT > 18
		@Test
		void testSetJuniorEdadValido () {
			Jugador jugador = new Jugador();
			int edadJugador = 21;
			jugador.setEdad(edadJugador);
			assertEquals(edadJugador,jugador.getEdad());
		}
		//JuniorEdad con INT = 24
		@Test
		void testSetJuniorrEdadValidoMinimo () {
			Jugador jugador = new Jugador();
			int edadJugador = 24;
			jugador.setEdad(edadJugador);
			assertEquals(edadJugador,jugador.getEdad());
		}


	//Tipo Senior
	@Test
	void testtipoSenior() {
		Jugador jugador = new Jugador();
		String nombreJugador = "MANU";
		int edadJugador = 27;
		String idiomaValido = idioma;
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idiomaValido);
		assertNotNull(jugador);
		assertEquals("Senior",jugador.tipoJugador());

	}
	
	//SeniorNombre con 0 caracteres
	@Test 
	void testSetSeniorNombreJugadorInvalidVacio() {
		Jugador jugador = new Jugador();
		String nombreJugador = "";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(null, jugador.getNombreJugador());
	}

	//SeniorNombre con menos de 4 caracteres
	@Test 
	void testSetSeniorNombreJugadorInvalidInsufCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "ZOÉ";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(null,jugador.getNombreJugador());
	}

	//SeniorNombre con 4 caracteres
	@Test 
	void testSetSeniorNombreJugadorValidoSufCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "MANU";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador.toUpperCase(),jugador.getNombreJugador());
	}

	//SeniorNombre con más de 4 caracteres
	@Test 
	void testSetSeniorNombreJugadorValido() {
		Jugador jugador = new Jugador();
		String nombreJugador = nombreValido;
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador.toUpperCase(), jugador.getNombreJugador());
	}

	//SeniorNombre con menos de 20 caracteres
	@Test 
	void testSetSeniorNombreJugadorValido2() {
		Jugador jugador = new Jugador();
		String nombreJugador = nombreValido;
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador.toUpperCase(),jugador.getNombreJugador());
	}

	//SeniorNombre con 20 caracteres
	@Test 
	void testSetSeniorNombreJugadorValidoMaximoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = nombreLargo;
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador.toUpperCase(),jugador.getNombreJugador());
	}

	//SeniorNombre con más de 20 caracteres
	@Test 
	void testSetSeniorNombreJugadorInvalidoMaximoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = nombreInvLargo;
		jugador.setNombreJugador(nombreJugador);
		assertEquals(null,jugador.getNombreJugador());
	}

	//SeniorEdad con INT = 25
	@Test
	void testSetSeniorEdadValidoMinimo () {
		Jugador jugador = new Jugador();
		int edadJugador = 25;
		jugador.setEdad(edadJugador);
		assertEquals(edadJugador,jugador.getEdad());
	}

	//SeniorEdad con INT > 25
	@Test
	void testSetSeniorEdadValido () {
		Jugador jugador = new Jugador();
		int edadJugador = 26;
		jugador.setEdad(edadJugador);
		assertEquals(edadJugador,jugador.getEdad());
	}
	//SeniorEdad con INT = 34
	@Test
	void testSetSeniorrEdadValidoMinimo () {
		Jugador jugador = new Jugador();
		int edadJugador = 34;
		jugador.setEdad(edadJugador);
		assertEquals(edadJugador,jugador.getEdad());
	}
	
	//Tipo Master
	@Test
	void testtipoMaster() {
		Jugador jugador = new Jugador();
		String nombreJugador = "MANU";
		int edadJugador = 40;
		String idiomaValido = idioma;
		jugador.setNombreJugador(nombreJugador);
		jugador.setEdad(edadJugador);
		jugador.setIdioma(idiomaValido);
		assertNotNull(jugador);
		assertEquals("Master",jugador.tipoJugador());

	}
	
	
	//MasterNombre con 0 caracteres
	@Test 
	void testSetMasterNombreJugadorInvalidVacio() {
		Jugador jugador = new Jugador();
		String nombreJugador = "";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(null, jugador.getNombreJugador());
	}

	//MasterNombre con menos de 4 caracteres
	@Test 
	void testSetMasterNombreJugadorInvalidInsufCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "ZOÉ";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(null,jugador.getNombreJugador());
	}

	//MasterNombre con 4 caracteres
	@Test 
	void testSetMasterNombreJugadorValidoSufCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "MANU";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador.toUpperCase(),jugador.getNombreJugador());
	}

	//MasterNombre con más de 4 caracteres
	@Test 
	void testSetMasterNombreJugadorValido() {
		Jugador jugador = new Jugador();
		String nombreJugador = nombreValido;
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador.toUpperCase(), jugador.getNombreJugador());
	}

	//MasterNombre con menos de 20 caracteres
	@Test 
	void testSetMasterNombreJugadorValido2() {
		Jugador jugador = new Jugador();
		String nombreJugador = nombreValido;
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador.toUpperCase(),jugador.getNombreJugador());
	}

	//MasterNombre con 20 caracteres
	@Test 
	void testSetMasterNombreJugadorValidoMaximoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = nombreLargo;
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador.toUpperCase(),jugador.getNombreJugador());
	}

	//MasterNombre con más de 20 caracteres
	@Test 
	void testSetMasterNombreJugadorInvalidoMaximoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = nombreInvLargo;
		jugador.setNombreJugador(nombreJugador);
		assertEquals(null,jugador.getNombreJugador());
	}

	//MasterEdad con INT = 35
	@Test
	void testSetMasterEdadValidoMinimo () {
		Jugador jugador = new Jugador();
		int edadJugador = 35;
		jugador.setEdad(edadJugador);
		assertEquals(edadJugador,jugador.getEdad());
	}

	//MasterEdad con INT > 35
	@Test
	void testSetMasterEdadValido () {
		Jugador jugador = new Jugador();
		int edadJugador = 36;
		jugador.setEdad(edadJugador);
		assertEquals(edadJugador,jugador.getEdad());
	}
	//MasterEdad con INT = 99
	@Test
	void testSetMaasterEdadValidoMinimo () {
		Jugador jugador = new Jugador();
		int edadJugador = 99;
		jugador.setEdad(edadJugador);
		assertEquals(edadJugador,jugador.getEdad());
	}
	
	//Tipo SuperMaster
		@Test
		void testtipoSuperMaster() {
			Jugador jugador = new Jugador();
			String nombreJugador = "MANU";
			int edadJugador = 101;
			String idiomaValido = idioma;
			jugador.setNombreJugador(nombreJugador);
			jugador.setEdad(edadJugador);
			jugador.setIdioma(idiomaValido);
			assertNotNull(jugador);
			assertEquals("SuperMaster",jugador.tipoJugador());

		}
		
		//SuperMasterNombre con 0 caracteres
		@Test 
		void testSetSuperMasterNombreNombreJugadorInvalidVacio() {
			Jugador jugador = new Jugador();
			String nombreJugador = "";
			jugador.setNombreJugador(nombreJugador);
			assertEquals(null, jugador.getNombreJugador());
		}

		//SuperMasterNombre con menos de 4 caracteres
		@Test 
		void testSetSuperMasterNombreNombreJugadorInvalidInsufCaracteres() {
			Jugador jugador = new Jugador();
			String nombreJugador = "ZOÉ";
			jugador.setNombreJugador(nombreJugador);
			assertEquals(null,jugador.getNombreJugador());
		}

		//SuperMasterNombre con 4 caracteres
		@Test 
		void testSetSuperMasterNombreNombreJugadorValidoSufCaracteres() {
			Jugador jugador = new Jugador();
			String nombreJugador = "MANU";
			jugador.setNombreJugador(nombreJugador);
			assertEquals(nombreJugador.toUpperCase(),jugador.getNombreJugador());
		}

		//SuperMasterNombre con más de 4 caracteres
		@Test 
		void testSetSuperMasterNombreNombreJugadorValido() {
			Jugador jugador = new Jugador();
			String nombreJugador = nombreValido;
			jugador.setNombreJugador(nombreJugador);
			assertEquals(nombreJugador.toUpperCase(), jugador.getNombreJugador());
		}

		//SuperMasterNombre con menos de 20 caracteres
		@Test 
		void testSetSuperMasterNombreNombreJugadorValido2() {
			Jugador jugador = new Jugador();
			String nombreJugador = nombreValido;
			jugador.setNombreJugador(nombreJugador);
			assertEquals(nombreJugador.toUpperCase(),jugador.getNombreJugador());
		}

		//SuperMasterNombre con 20 caracteres
		@Test 
		void testSetSuperMasterNombreNombreJugadorValidoMaximoCaracteres() {
			Jugador jugador = new Jugador();
			String nombreJugador = nombreLargo;
			jugador.setNombreJugador(nombreJugador);
			assertEquals(nombreJugador.toUpperCase(),jugador.getNombreJugador());
		}

		//SuperMasterNombre con más de 20 caracteres
		@Test 
		void testSetSuperMasterNombreNombreJugadorInvalidoMaximoCaracteres() {
			Jugador jugador = new Jugador();
			String nombreJugador = nombreInvLargo;
			jugador.setNombreJugador(nombreJugador);
			assertEquals(null,jugador.getNombreJugador());
		}

		//SuperMasterEdad con INT = 100
		@Test
		void testSetSuperMasterNombreEdadValidoMinimo () {
			Jugador jugador = new Jugador();
			int edadJugador = 100;
			jugador.setEdad(edadJugador);
			assertEquals(edadJugador,jugador.getEdad());
		}

		//SuperMasterEdad con INT > 100
		@Test
		void testSetSuperMasterNombreEdadValido () {
			Jugador jugador = new Jugador();
			int edadJugador = 101;
			jugador.setEdad(edadJugador);
			assertEquals(edadJugador,jugador.getEdad());

		}
		
}