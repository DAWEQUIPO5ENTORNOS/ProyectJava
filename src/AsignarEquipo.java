
public class AsignarEquipo {
	private Equipo equipo;
	private Jugador jugador;


	public AsignarEquipo() {

	}

	public void setEquipo(Equipo equipo) {
		//code here
		if(equipo != null) {
			this.equipo = new Equipo();
			this.equipo.setNombreEquipo(equipo.getNombreEquipo());
			this.equipo.setRanking(equipo.getRanking());
			
		}else {
			this.jugador = null;
		}
	}

	public void setJugador(Jugador jugador) {
		//code here

		if(jugador != null) {
			this.jugador = new Jugador();
			this.jugador.setNombreJugador(jugador.getNombreJugador());
			this.jugador.setEdad(jugador.getEdad());
			this.jugador.setIdioma(jugador.getIdioma());
		}else {
			this.jugador = null;
		}

	}

	public Equipo getEquipo(){
		return this.equipo;
	}

	public Jugador getJugador(){
		return this.jugador;
	}

}
