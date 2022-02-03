
public class Jugador {
	private String nombre;
	private int edad;
	private String idioma;
	
	public Jugador () {
			
		}
	
	public void setNombreJugador(String nombre) {
		//code here
		if (nombre.length()<4 && nombre.length()>20) {
			for (int i=0; i <nombre.length();i++) {
				if (!Character.isLetter(nombre.charAt(i))){
					this.nombre=null;
				}else {
					this.nombre=nombre;
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
		for (int i=0;i<idioma.length();i++) {
			idiomaM+= Character.toUpperCase(idioma.charAt(i));
		}
		if(idiomaM == "INGLES" || idiomaM == "ESPANOL" || idiomaM == "FRANCES" || idiomaM == "ALEMAN") {
			this.idioma=idioma;
		}else {
			this.idioma=null;
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
