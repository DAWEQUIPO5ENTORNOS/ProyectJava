
public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;

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
		if (edad>=18) {
			this.edad=edad;
		}
	}
	public void setIdioma(String idioma) {
		String idiomaM = "";
		idiomaM = idioma;
		this.idioma = null;
		if(idiomaM != null) {
			idiomaM = idioma.toUpperCase();
			if(idiomaM.equals("INGLES") || idiomaM.equals("ESPANOL") || idiomaM.equals("FRANCES") || idiomaM.equals("ALEMAN")) {
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
			}else if (edad >= 18 && edad <= 25) {
				tipo = "Junior";
			}else if(edad > 25 && edad <= 35) {
				tipo = "Senior";
			} else if (edad > 35 && edad < 101) {
				tipo = "Master";
			}
		}
		return tipo;
	}

}
