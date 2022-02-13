
public class Equipo {
	/*se declaran los parametros de la clase
	 * @param nombre indica el nombre del jugador
	 * @param edad especifica la edad del jugador 
	 * @param idioma indican el idioma del jugador
	 * @param nombreEquipo indica el nombre del jugador
	 * @param ranking especifica la edad del jugador 
	 */
	private String nombreEquipo;
	private int ranking;
	
	/*se declaran los numeros magicos
	 * @param MINTAMANO Y MAXTAMANO indican el tamano minimo y maximo del string nombre
	 * @param MINRANKING MAXRANKING especifica el rango del ranking 
	 * @param MINPRIMERA MAXSEGUNDA MINSEGUNDA MINTERCERA indican los rangos de edad de las categorias
	 * @param NOVALIDO indica que el entero introducido no es valido
	 */
	static final int MINTAMANO = 4;
	static final int MAXTAMANO = 20;
	static final int MINRANKING = 0;
	static final int MAXRANKING = 10;
	static final int MINPRIMERA = 7;
	static final int MAXSEGUNDA = 6;
	static final int MINSEGUNDA = 3;
	static final int MINTERCERA = 0;
	static final int  NOVALIDO = -1;


	//asignamos nombre a la clase si tiene entre 4 y 20 caracteres, sino se pone a null
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo= null;
		if (nombreEquipo != null
				&&nombreEquipo.length() >= MINTAMANO
				&& nombreEquipo.length() <= MAXTAMANO
				&&nombreEquipo.matches("[a-zA-Z]+")){
				this.nombreEquipo=nombreEquipo.toUpperCase();
			}
		}
	


	//asignamos ranking a la clase si esta entre 0 y 10, si no se pone -1
	public void setRanking(int ranking) {
		this.ranking = NOVALIDO;
		if(ranking >= MINRANKING && ranking <=MAXRANKING){
			this.ranking = ranking;
		}
	}

	//asignamos categoria al equipo en funcion del ranking
	public String categoriaEquipo(){
		String categoria= "";
		if(this.nombreEquipo != null && this.ranking != NOVALIDO){
			if(ranking <= MAXRANKING && ranking >= MINPRIMERA) {
				categoria = "Primera";
			}else if(ranking >= MINSEGUNDA && ranking <= MAXSEGUNDA) {
				categoria = "Segunda";
			}else if(ranking >= MINTERCERA && ranking < MINSEGUNDA) {
				categoria = "Tercera";
			}else {
				categoria = null;
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
