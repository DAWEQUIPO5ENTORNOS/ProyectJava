import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsignarEquipoTest{
	
	@Test
	void testSetJugadorVacio() {
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "";
		int edadValida = 0;
		String idiomaValido = "";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(null, jugadorGuardado.getNombreJugador());
		assertEquals(0, jugadorGuardado.getEdad());
		assertEquals(null, jugadorGuardado.getIdioma());
	}
	
	@Test
	void testSetJugadorCorrecto() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos válidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = "Antonio";
		int edadValida = 20;
		String idiomaValido = "Español";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	
	@Test
	void testSetJugadorNombreIncorrecto() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Jugador jugador = new Jugador();
		String nombrevalido = "Pep";
		int edadValida = 20;
		String idiomaValido = "Español";
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
	
	void testSetJugadorNombreVacio() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Jugador jugador = new Jugador();
		String nombrevalido = "";
		int edadValida = 20;
		String idiomaValido = "Español";
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
	void testSetJugadorEdadInvalido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Jugador jugador = new Jugador();
		String nombrevalido = "";
		int edadValida = 5;
		String idiomaValido = "Español";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(0, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	
	void testSetJugadorEdadVacia() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Jugador jugador = new Jugador();
		String nombrevalido = "";
		String idiomaValido = "Español";
		jugador.setNombreJugador(nombrevalido);
		
		jugador.setIdioma(idiomaValido);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(0, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	
	void testSetJugadorIdiomaVacia() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Jugador jugador = new Jugador();
		String nombrevalido = "";
		int edadValida = 20;
		String idiomaValido = "Español";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(null, jugadorGuardado.getIdioma());
	}
	@Test
	void testSetJugadorIdiomaInvalido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Jugador jugador = new Jugador();
		String nombrevalido = "Manuel";
		int edadValida = 20;
		String idiomaValido = "Brasileño";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(null, jugadorGuardado.getIdioma());
	}
	
	@Test
	void testSetEquipo() {
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Equipo equipo = new Equipo();
		String nombrevalido = "DAW.FC";
		int rankingValido = 10;
		equipo.setNombreEquipo(nombrevalido);
		equipo.setRanking(rankingValido);
		
		Equipo equipoGuardado = asignarEquipo.getEquipo(); 
		asignarEquipo.setEquipo(equipo);
		assertNotNull(equipoGuardado);
		assertEquals(nombrevalido, equipoGuardado.getNombreEquipo());
		assertEquals(rankingValido, equipoGuardado.getRanking());
		
	}
	
	
	void testSetEquipoVacio() {
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Equipo equipo = new Equipo();
		String nombrevalido = "";
		int rankingValido = 0;
		equipo.setNombreEquipo(nombrevalido);
		equipo.setRanking(rankingValido);
		
		Equipo equipoGuardado = asignarEquipo.getEquipo(); 
		asignarEquipo.setEquipo(equipo);
		assertNotNull(equipoGuardado);
		assertEquals(null, equipoGuardado.getNombreEquipo());
		assertEquals(0, equipoGuardado.getRanking());
	}
	
	void testSetEquipoNombreVacio() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Equipo equipo = new Equipo();
		String nombrevalido = "";
		int rankingValido = 10;
		equipo.setNombreEquipo(nombrevalido);
		equipo.setRanking(rankingValido);
		
		Equipo equipoGuardado = asignarEquipo.getEquipo(); 
		asignarEquipo.setEquipo(equipo);
		assertNotNull(equipoGuardado);
		assertEquals(null, equipoGuardado.getNombreEquipo());
		assertEquals(rankingValido, equipoGuardado.getRanking());
	}
	
	void testSetEquipoNombreIncorrecto() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Equipo equipo = new Equipo();
		String nombrevalido = "DAWDAWDAWDAWDAWDAWDAWDAWDAWDAWDAWDAW.FC";
		int rankingValido = 10;
		equipo.setNombreEquipo(nombrevalido);
		equipo.setRanking(rankingValido);
		
		Equipo equipoGuardado = asignarEquipo.getEquipo(); 
		asignarEquipo.setEquipo(equipo);
		assertNotNull(equipoGuardado);
		assertEquals(null, equipoGuardado.getNombreEquipo());
		assertEquals(rankingValido, equipoGuardado.getRanking());
	}
	
	void testSetEquipoRankingVacio() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Equipo equipo = new Equipo();
		String nombrevalido = "DAW.FC";
		
		equipo.setNombreEquipo(nombrevalido);
		
		
		Equipo equipoGuardado = asignarEquipo.getEquipo(); 
		asignarEquipo.setEquipo(equipo);
		assertNotNull(equipoGuardado);
		assertEquals(nombrevalido, equipoGuardado.getNombreEquipo());
		assertEquals(0, equipoGuardado.getRanking());
	}
	
	void testSetEquipoRankingIncorrecto() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		Equipo equipo = new Equipo();
		String nombrevalido = "DAW.FC";
		int rankingValido = -1;
		equipo.setNombreEquipo(nombrevalido);
		equipo.setRanking(rankingValido);
		
		Equipo equipoGuardado = asignarEquipo.getEquipo(); 
		asignarEquipo.setEquipo(equipo);
		assertNotNull(equipoGuardado);
		assertEquals(nombrevalido, equipoGuardado.getNombreEquipo());
		assertEquals(0, equipoGuardado.getRanking());
	}
	
}
