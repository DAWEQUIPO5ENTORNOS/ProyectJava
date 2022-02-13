
public class Equipo {
	private String nombreEquipo;
	private int ranking;
	static int minTamaño = 4;
	static int maxTamaño = 20;
	static int minRanking = 0;
	static int maxRanking = 10;
	static int minPrimera = 7;
	static int maxSegunda = 6;
	static int minSegunda = 3;
	static int minTercera = 0;
	static int  noValido = -1;
	
	
	public Equipo () {}

	//asignamos nombre a la clase si tiene entre 4 y 20 caracteres, sino se pone a null
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo= null;
		if (nombreEquipo != null){
			if (nombreEquipo.length() >= minTamaño && nombreEquipo.length() <= maxTamaño) {
				if (nombreEquipo.matches("[a-zA-Z]+")){
					this.nombreEquipo=nombreEquipo.toUpperCase();
				}
			}
		}
	}
	
	//asignamos ranking a la clase si esta entre 0 y 10, si no se pone -1
	public void setRanking(int ranking) {
		this.ranking = noValido;
		if(ranking >= minRanking && ranking <=maxRanking){
			this.ranking = ranking;
		}
	}

	//asignamos categoria al equipo en funcion del ranking
	public String categoriaEquipo(){
		int ranking = this.ranking;
		String nombre = this.nombreEquipo;
		String categoria= null;
		if(nombre!= null && ranking != noValido){
			if(ranking <= maxRanking && ranking >= minPrimera) {
				categoria = "Primera";
			}else if(ranking >= minSegunda && ranking <= maxSegunda) {
				categoria = "Segunda";
			}else if(ranking >= minTercera && ranking < minSegunda) {
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
