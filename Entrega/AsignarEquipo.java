
public class AsignarEquipo {
	/*se declaran los parametros de la clase
	 * @param equipo especifica al equipo
	 * @param jugador especifica al jugador
	 * @param NOVALIDO indica que el entero introducido no es valido
	 */
	private Equipo equipo;
	private Jugador jugador;
	static final int  NOVALIDO = -1;


	//asignamos equipo si cumple nombre valido y ranking valido
	public void setEquipo(Equipo equipo) {
		//code here
		this.equipo = null;
		if(equipo != null && equipo.getNombreEquipo() != null 
			&& equipo.getRanking() != NOVALIDO ) {
				this.equipo = new Equipo();
				this.equipo.setNombreEquipo(equipo.getNombreEquipo());
				this.equipo.setRanking(equipo.getRanking());
		}
		
	}

	//asignamos jugador si cumple las condiciones de nombre distinto de null, 
	//edad mayor que 18 e idioma valido
	public void setJugador(Jugador jugador) {
		//code here
		this.jugador = null;
		if(jugador != null && jugador.getNombreJugador() != null &&
			jugador.getEdad()!= NOVALIDO && jugador.getIdioma() != null ) {
				this.jugador = new Jugador();
				this.jugador.setNombreJugador(jugador.getNombreJugador());
				this.jugador.setEdad(jugador.getEdad());
				this.jugador.setIdioma(jugador.getIdioma());
		}
	}

	public Equipo getEquipo(){
		return this.equipo;
	}

	public Jugador getJugador(){
		return this.jugador;
	}

}
