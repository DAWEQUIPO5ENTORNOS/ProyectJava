
public class Equipo {
	private String nombreEquipo;
	private int ranking;


	public Equipo () {
	}


	public void setNombreEquipo(String nombreEquipo) {
		if (nombreEquipo != null){
			if (nombreEquipo.length()<4 && nombreEquipo.length()>20) {
				for (int i=0; i <nombreEquipo.length();i++) {
					if (nombreEquipo.matches("[a-zA-Z]+")){
						this.nombreEquipo=nombreEquipo;
					}else {
						this.nombreEquipo=null;
					}
				}
			}else{
				this.nombreEquipo= null;
			}
		}else{
			this.nombreEquipo= null;
		}
	}
	public void setRanking(int ranking) {
		this.ranking = -1;
		if(ranking >= 0 && ranking <=10){
			this.ranking = ranking;
		}
	}

	public String categoriaEquipo(int ranking){
		if(ranking <= 10 && ranking >= 7) {
			this.ranking = "primera";
		}else if(ranking > 3 && ranking <= 6) {
			this.ranking ="Segunda";
		}else if(ranking >= 0 && ranking <= 3) {
			this.ranking = "Tercera";
		}else{
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
