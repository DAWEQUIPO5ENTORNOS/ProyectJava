import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsignarEquipoTest{
	
	@Test
	void testSetJugadorVacio() {
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos vacios*/
		Jugador jugador = null;
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNull(jugadorGuardado);
		
	}
	
	@Test
	void testSetJugadorCorrecto() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos v�lidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		int edadValida = 20;
		String idiomaValido = "Espanol";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido.toUpperCase(), jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	
	@Test
	void testSetJugadorNombreIncorrecto() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//Creamos un jugador con el nombre incorrecto
		Jugador jugador = new Jugador();
		String nombrevalido = "Pep";
		int edadValida = 20;
		String idiomaValido = "Espanol";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(null, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	@Test
	void testSetJugadorNombreVacio() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//Creamos el jugador con el nombre vacio
		Jugador jugador = new Jugador();
		String nombrevalido = "";
		int edadValida = 20;
		String idiomaValido = "Espanol";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(null, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	@Test
	void testSetJugadorEdadInvalido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//Creamos el jugador con la edad incorrecta
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		int edadValida = 5;
		String idiomaValido = "Espanol";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido.toUpperCase(), jugadorGuardado.getNombreJugador());
		assertEquals(-1, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	@Test
	void testSetJugadorEdadVacia() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//Creamos el jugador con la edad vacia
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		int edadValida = -1;
		String idiomaValido = "Espanol";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido.toUpperCase(), jugadorGuardado.getNombreJugador());
		assertEquals(-1, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	@Test
	void testSetJugadorIdiomaVacio() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//Creamos el jugador con el idioma vacio
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		int edadValida = 20;
		String idiomaValido = null;
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido.toUpperCase(), jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(null, jugadorGuardado.getIdioma());
	}
	@Test
	void testSetJugadorIdiomaInvalido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//Creamos el jugador con el idioma invalido
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		int edadValida = 20;
		String idiomaValido = "Brasileno";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido.toUpperCase(), jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(null, jugadorGuardado.getIdioma());
	}
	
	@Test
	void testSetEquipo() {
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//Creamos el equipo correcto
		Equipo equipo = new Equipo();
		String nombrevalido = "DAWFC";
		int rankingValido = 10;
		equipo.setNombreEquipo(nombrevalido);
		equipo.setRanking(rankingValido);
		/*Asignar el equipo creado en asignar equipo*/
		asignarEquipo.setEquipo(equipo);
		Equipo equipoGuardado = asignarEquipo.getEquipo(); 
		
		assertNotNull(equipoGuardado);
		assertEquals(nombrevalido.toUpperCase(), equipoGuardado.getNombreEquipo());
		assertEquals(rankingValido, equipoGuardado.getRanking());
		
	}
	
	@Test
	void testSetEquipoVacio() {
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//Creamos el equipo vacio
		Equipo equipo = null;
		/*Asignar el equipo creado en asignar equipo*/
		asignarEquipo.setEquipo(equipo);
		Equipo equipoGuardado = asignarEquipo.getEquipo();
		assertNull(equipoGuardado);
	}
	@Test
	void testSetEquipoNombreVacio() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//Creamos el equipo con el nombre vacio
		Equipo equipo = new Equipo();
		String nombrevalido = null;
		int rankingValido = 10;
		equipo.setNombreEquipo(nombrevalido);
		equipo.setRanking(rankingValido);
		/*Asignar el equipo creado en asignar equipo*/
		 
		asignarEquipo.setEquipo(equipo);
		Equipo equipoGuardado = asignarEquipo.getEquipo();
		assertNotNull(equipoGuardado);
		assertEquals(null, equipoGuardado.getNombreEquipo());
		assertEquals(rankingValido, equipoGuardado.getRanking());
	}
	@Test
	void testSetEquipoNombreIncorrecto() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//Creamos el equipo con el nombre incorrecto
		Equipo equipo = new Equipo();
		String nombrevalido = "DAWDAWDAWDAWDAWDAWDAWDAWDAWDAWDAWDAW.FC";
		int rankingValido = 10;
		equipo.setNombreEquipo(nombrevalido);
		equipo.setRanking(rankingValido);
		/*Asignar el equipo creado en asignar equipo*/
		asignarEquipo.setEquipo(equipo);
		Equipo equipoGuardado = asignarEquipo.getEquipo();
		assertNotNull(equipoGuardado);
		assertEquals(null, equipoGuardado.getNombreEquipo());
		assertEquals(rankingValido, equipoGuardado.getRanking());
	}
	@Test
	void testSetEquipoRankingVacio() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//Creamos el equipo con el ranking vacio
		Equipo equipo = new Equipo();
		String nombrevalido = "DAWFC";
		
		equipo.setNombreEquipo(nombrevalido);
		
		/*Asignar el equipo creado en asignar equipo*/
		asignarEquipo.setEquipo(equipo);
		Equipo equipoGuardado = asignarEquipo.getEquipo();
		assertNotNull(equipoGuardado);
		assertEquals(nombrevalido.toUpperCase(), equipoGuardado.getNombreEquipo());
		assertEquals(0, equipoGuardado.getRanking());
	}
	@Test
	void testSetEquipoRankingIncorrecto() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//Creamos el equipo con el ranking incorrecto
		Equipo equipo = new Equipo();
		String nombrevalido = "DAWFC";
		int rankingValido = -1;
		equipo.setNombreEquipo(nombrevalido);
		equipo.setRanking(rankingValido);
		/*Asignar el equipo creado en asignar equipo*/
		asignarEquipo.setEquipo(equipo);
		Equipo equipoGuardado = asignarEquipo.getEquipo();
		assertNotNull(equipoGuardado);
		assertEquals(nombrevalido.toUpperCase(), equipoGuardado.getNombreEquipo());
		assertEquals(-1, equipoGuardado.getRanking());
	}
	
}
