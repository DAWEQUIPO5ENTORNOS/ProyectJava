
public class Jugador {
	private String nombre;
	private int edad;
	private String idioma = "Espanol";
	static int minTamano = 4;
	static int maxTamano = 20;
	static int minEdad = 18;
	static int maxEdadJunior = 25;
	static int maxEdadSenior = 35;
	static int maxEdadMaster = 100;
	static int noValido = -1;


	//asignamos el nombre en mayusculas a la clase si tiene entre
	//4 y 20 caracteres sino devuelve null

	public void setNombreJugador(String nombre) {
		//code here
		this.nombre = null;

		if(nombre != null && nombre.length() >= minTamano 
				&& nombre.length() <= maxTamano
				&& nombre.matches("[a-zA-Z]+")){
			this.nombre=nombre.toUpperCase();
		}
	}

	//asignamos la edad si es mayor que 18
	public void setEdad(int edad) {
		this.edad= -1;
		if (edad >= minEdad) {
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
			}else if (this.edad >= minEdad && this.edad <= maxEdadJunior) {
				tipo = "Junior";
			}else if(this.edad > maxEdadJunior && this.edad <= maxEdadSenior) {
				tipo = "Senior";
			} else if (this.edad > maxEdadSenior && this.edad <= maxEdadMaster) {
				tipo = "Master";
			}
		}
		return tipo;
	}

}
