import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JugadorTest {

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
		assertEquals(nombreJugador,jugador.getNombreJugador());
	}

	//Nombre con más de 4 caracteres
	@Test 
		void testSetNombreJugadorValido() {
		Jugador jugador = new Jugador();
		String nombreJugador = "MANUEL";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}

	//Nombre con menos de 20 caracteres
	@Test 
		void testSetNombreJugadorValido2() {
		Jugador jugador = new Jugador();
		String nombreJugador = "MANUEL RECIO";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador,jugador.getNombreJugador());
	}

	//Nombre con 20 caracteres
	@Test 
		void testSetNombreJugadorValidoMaximoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "MANUELA CASTAÑO ABIEGO";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador,jugador.getNombreJugador());
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
		assertEquals(0,jugador.getEdad());
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
}