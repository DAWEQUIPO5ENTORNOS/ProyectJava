
public class Equipo {
	private String nombreEquipo;
	private int ranking;


	public Equipo () {}


	public void setNombreEquipo(String nombreEquipo) {
		if (nombreEquipo != null){
			if (nombreEquipo.length()>=4 && nombreEquipo.length()<=20) {
				if (nombreEquipo.matches("[a-zA-Z]+")){
					this.nombreEquipo=nombreEquipo.toUpperCase();
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

	public String categoriaEquipo(){
		int ranking = this.ranking;
		String nombre = this.nombreEquipo;
		String categoria= null;
		if(nombre!= null && ranking != -1){
			if(ranking < 11 && ranking >= 7) {
				categoria = "Primera";
			}else if(ranking >= 3 && ranking <= 6) {
				categoria = "Segunda";
			}else if(ranking >= 0 && ranking < 3) {
				categoria = "Tercera";
			}
		}
		return categoria;
	}
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public int getRanking() {
		return ranking;
	}
}
