
public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;

	public Jugador () {

	}

	public void setNombreJugador(String nombre) {
		//code here
		String ntemp = nombre;
		if(ntemp != null) {
			if (ntemp.length()>=4 && ntemp.length()<=20) {
				if (ntemp.matches("[a-zA-Z]+")){
						
					this.nombre=nombre;
				}else {
					this.nombre=null;
				}
			}
		}else{
			this.nombre= null;
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
		if(idiomaM != null) {
			idiomaM = idioma.toUpperCase();
			if(idiomaM.equals("INGLES") || idiomaM.equals("ESPANOL") || idiomaM.equals("FRANCES") || idiomaM.equals("ALEMAN")) {
				this.idioma = idioma;
			}else {
				this.idioma = null;
			}
		}else {
			this.idioma = null;
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
	
	public String tipoJugador(int edad) {
		String tipo = null;
		if(this.nombre != null && this.idioma != null) {
			if (edad >= 18 && edad <= 25) {
				tipo = "Junior";
			}else if(edad > 25 && edad <= 35) {
				tipo = "Senior";
			}else if (edad > 35) {
				tipo = "Master";
			}else {
				tipo = null;
			}
		}
		return tipo;
	}
	
}
