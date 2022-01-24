
public class AsignarEquipo {
      private static Equipo equipo;
      private static Jugador jugador;
      
      
      public AsignarEquipo() {
    	  
      }
      
      public void setEquipo(Equipo equipo) {
  		//code here
    	  this.equipo = equipo;
      }
      
      public void setJugador(Jugador jugador) {
  		//code here
    	  this.jugador=jugador;
      }
      
      public  Equipo getEquipo(){
          return this.equipo;
      }
      
      public  Jugador getJugador(){
         return this.jugador;
      }
      
}
