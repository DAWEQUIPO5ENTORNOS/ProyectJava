
public class Jugador {
	/*se declaran los parametros de la clase
	 * @param nombre indica el nombre del jugador
	 * @param edad especifica la edad del jugador 
	 * @param idioma indican el idioma del jugador
	 */
	private String nombre;
	private int edad;
	private String idioma = "Espanol";
	
	/*se declaran los numeros magicos
	 * @param MINTAMANO Y MAXTAMANO indican el tamano minimo y maximo del string nombre
	 * @param MINEDAD especifica la edad minima 
	 * @param MAXEDADJUNIOR MAXEDADSENIOR Y MAXEDADMASTER indican los rangos de edad de las categorias
	 * @param NOVALIDO indica que el entero introducido no es valido
	 */
	static final int MINTAMANO = 4;
	static final int MAXTAMANO = 20;
	static final int MINEDAD = 18;
	static final int MAXEDADJUNIOR = 25;
	static final int MAXEDADSENIOR = 35;
	static final int MAXEDADMASTER = 100;
	static final int  NOVALIDO = -1;


	//asignamos el nombre en mayusculas a la clase si tiene entre
	//4 y 20 caracteres sino devuelve null

	public void setNombreJugador(String nombre) {
		//code here
		this.nombre = null;

		if(nombre != null && nombre.length() >= MINTAMANO 
				&& nombre.length() <= MAXTAMANO
				&& nombre.matches("[a-zA-Z]+")){
			this.nombre=nombre.toUpperCase();
		}
	}

	//asignamos la edad si es mayor que 18
	public void setEdad(int edad) {
		this.edad= -1;
		if (edad >= MINEDAD) {
			this.edad=edad;
		}
	}

	//asignamos el idioma si es esta dentro de las opciones disponibles
	public void setIdioma(String idioma) {
		String idiomaM = "";
		idiomaM = idioma;
		this.idioma = null;
		if(idiomaM != null) {
			idiomaM = idioma.toUpperCase();
			if(idiomaM.equals("INGLES")
					|| idiomaM.equals("ESPANOL")
					|| idiomaM.equals("FRANCES")
					|| idiomaM.equals("ALEMAN")) {
				this.idioma = idioma;
			}
		}
	}


	public String getIdioma() {
		return idioma;
	}

	public String getNombreJugador() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}

	//asignamos un tipo de jugador dependiendo de la edad de este
	public String tipoJugador() {
		String tipo = null;

		if(this.nombre != null && this.idioma != null) {
			if(this.edad >= 101) {
				tipo = "SuperMaster";
			}else if (this.edad >= MINEDAD && this.edad <= MAXEDADJUNIOR) {
				tipo = "Junior";
			}else if(this.edad > MAXEDADJUNIOR && this.edad <= MAXEDADSENIOR) {
				tipo = "Senior";
			} else if (this.edad > MAXEDADSENIOR && this.edad <= MAXEDADMASTER) {
				tipo = "Master";
			}
		}
		return tipo;
	}

}
