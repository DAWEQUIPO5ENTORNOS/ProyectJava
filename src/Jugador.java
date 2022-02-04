
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

		if (edad>18) {

			this.edad=edad;

		}else{

			this.edad= -1;
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
}
