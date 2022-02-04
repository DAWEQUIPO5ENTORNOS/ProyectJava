
public class Equipo {
	private String nombreEquipo;
	private int ranking;


	public Equipo () {
	}


	public void setNombreEquipo(String nombreEquipo) {
		if (nombreEquipo.length()<4 && nombreEquipo.length()>20) {
			for (int i=0; i <nombreEquipo.length();i++) {
				if (!Character.isLetter(nombreEquipo.charAt(i))){
					this.nombreEquipo=null;
				}else {
					this.nombreEquipo=nombreEquipo;
				}
			}
		}else{
			this.nombreEquipo= null;
		}
	}
	public void setRanking(int ranking) {
		String R1 = "Primera";
		String R2 = "Segunda";
		String R3 = "Tercera";

		if(ranking > 10) {
			this.ranking = -1;
		}
		if(ranking <= 10 && ranking >= 7) {
			R1 = "primera";
			this.ranking = ranking;
		}else if(ranking >= 3 && ranking <= 6) {
			R2 = "Segunda";
			this.ranking = ranking;
		}else if(ranking >= 0 && ranking <= 3) {
			R3 = "Tercera";
			this.ranking = ranking;
		}else if(ranking < 0);{
			this.ranking = -1;
		}
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public int getRanking() {
		return ranking;
	}
}
