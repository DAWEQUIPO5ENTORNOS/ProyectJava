
public class AsignarEquipo {
      private Equipo equipo;
      private Jugador jugador;
      
      
      public AsignarEquipo() {
    	  
      }
      
      public void setEquipo(Equipo equipo) {
  		//code here
    	  if(equipo.getNombreEquipo().length() < 21) {
    		  this.jugador.setNombreJugador(jugador.getNombreJugador());
    	  }else {
    		  this.jugador.setNombreJugador("");
    	  }
      }
      
      public void setJugador(Jugador jugador) {
  		//code here
    	  if(jugador.getNombreJugador().length() >= 4 && jugador.getNombreJugador().length() <= 20) {
    		  this.jugador.setNombreJugador(jugador.getNombreJugador());
    	  }else {
    		  this.jugador.setNombreJugador("");
    	  }
      }
      
      public Equipo getEquipo(){
          return equipo;
      }
      
      public Jugador getJugador(){
         return jugador;
      }
      
}
