import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class AsignarEquipoTest{
	static String nombre = "Antonio";
	static String nombreEquipo = "dawfc";
	private String idioma = "Espanol";
	//probamos a asignar un jugador vacio
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
	//probamos a asignar un jugador correcto
	@Test
	void testSetJugadorCorrecto() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		/*Creamos un jugador con todos los campos v�lidos*/
		Jugador jugador = new Jugador();
		String nombrevalido = nombre;
		int edadValida = 20;
		String idiomaValido = idioma;
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
	}
	//probamos a asignar un jugador con nombre incorrecto
	@Test
	void testSetJugadorNombreIncorrecto() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//Creamos un jugador con el nombre incorrecto
		Jugador jugador = new Jugador();
		String nombrevalido = "Pep";
		int edadValida = 20;
		String idiomaValido = idioma;
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNull(jugadorGuardado);
		
	}
	//probamos a asignar un jugador con nombre vacio
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
		assertNull(jugadorGuardado);
		
	}
	//probamos a asignar un jugador con edad invalida
	@Test
	void testSetJugadorEdadInvalido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//Creamos el jugador con la edad incorrecta
		Jugador jugador = new Jugador();
		String nombrevalido = nombre;
		int edadValida = 5;
		String idiomaValido = idioma;
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNull(jugadorGuardado);
	}
	//probamos a asignar un jugador con edad vacia
	@Test
	void testSetJugadorEdadVacia() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//Creamos el jugador con la edad vacia
		Jugador jugador = new Jugador();
		String nombrevalido = nombre;
		int edadValida = -1;
		String idiomaValido = idioma;
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNull(jugadorGuardado);
	}
	//probamos a asignar un jugador con idioma vacio
	@Test
	void testSetJugadorIdiomaVacio() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//Creamos el jugador con el idioma vacio
		Jugador jugador = new Jugador();
		String nombrevalido = nombre;
		int edadValida = 20;
		String idiomaValido = null;
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNull(jugadorGuardado);
	}
	//probamos a asignar un jugador con edad invalida
	@Test
	void testSetJugadorIdiomaInvalido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//Creamos el jugador con el idioma invalido
		Jugador jugador = new Jugador();
		String nombrevalido = nombre;
		int edadValida = 20;
		String idiomaValido = "Brasileno";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		/*Asignar el jugador creado en asignar equipo*/
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNull(jugadorGuardado);
	}
	
	//probamos a asignar un equipo valido
	@Test
	void testSetEquipo() {
		
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//Creamos el equipo correcto
		Equipo equipo = new Equipo();
		String nombrevalido = nombreEquipo;
		int rankingValido = 10;
		equipo.setNombreEquipo(nombrevalido);
		equipo.setRanking(rankingValido);
		/*Asignar el equipo creado en asignar equipo*/
		asignarEquipo.setEquipo(equipo);
		Equipo equipoGuardado = asignarEquipo.getEquipo(); 
		
		assertNotNull(equipoGuardado);
		
		
	}
	//probamos a asignar un equipo vacio
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
	//probamos a asignar un equipo con nombre vacio
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
		assertNull(equipoGuardado);
	}
	//probamos a asignar un equipo con nombre incorrecto
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
		assertNull(equipoGuardado);
	}
	//probamos a asignar un equipo con ranking vacio
	@Test
	void testSetEquipoRankingVacio() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//Creamos el equipo con el ranking vacio
		Equipo equipo = new Equipo();
		String nombrevalido = nombreEquipo;
		
		equipo.setNombreEquipo(nombrevalido);
		
		/*Asignar el equipo creado en asignar equipo*/
		asignarEquipo.setEquipo(equipo);
		Equipo equipoGuardado = asignarEquipo.getEquipo();
		assertNull(equipoGuardado);
	}
	//probamos a asignar un equipo con ranking incorrecto
	@Test
	void testSetEquipoRankingIncorrecto() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();
		//Creamos el equipo con el ranking incorrecto
		Equipo equipo = new Equipo();
		String nombrevalido = nombreEquipo;
		int rankingValido = -1;
		equipo.setNombreEquipo(nombrevalido);
		equipo.setRanking(rankingValido);
		/*Asignar el equipo creado en asignar equipo*/
		asignarEquipo.setEquipo(equipo);
		Equipo equipoGuardado = asignarEquipo.getEquipo();
		assertNull(equipoGuardado);
	}
	
}
