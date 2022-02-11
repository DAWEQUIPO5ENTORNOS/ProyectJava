
public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;
	static int minTamaño = 4;
	static int maxTamaño = 20;
	static int minEdad = 18;
	static int maxEdadJunior = 25;
	static int maxEdadSenior = 35;
	static int maxEdadMaster = 100;
	static int  noValido = -1;
	public Jugador () {

	}

	public void setNombreJugador(String nombre) {
		//code here
		this.nombre = null;
		if(nombre != null) {
			if (nombre.length()>=4 && nombre.length()<=20) {
				if (nombre.matches("[a-zA-Z]+")){		
					this.nombre=nombre.toUpperCase();
				}
			}
		}


	}

	public void setEdad(int edad) {
		this.edad= -1;
		if (edad>=minEdad) {
			this.edad=edad;
		}
	}
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

	public String tipoJugador() {
		String tipo = null;
		int edad = this.edad;
		if(this.nombre != null && this.idioma != null) {
			if(edad >= 101) {
				tipo = "SuperMaster";
			}else if (edad >= minEdad && edad <= maxEdadJunior) {
				tipo = "Junior";
			}else if(edad > maxEdadJunior && edad <= maxEdadSenior) {
				tipo = "Senior";
			} else if (edad > maxEdadSenior && edad <= maxEdadMaster) {
				tipo = "Master";
			}
		}
		return tipo;
	}

}
