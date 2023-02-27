package proyectoJesusCondori;

public class JesusCondoriFutbol {
	public String equipo;
	public String nombreHobby;
	public int numeroFavorito;
	
	public JesusCondoriFutbol(String equipo, String nombreHobby, int numeroFavorito) {
		this.equipo=equipo;
		this.nombreHobby=nombreHobby;
		this.numeroFavorito=numeroFavorito;
	}
	
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo=equipo;
	}
	
	public String getNombreHobby() {
		return nombreHobby;
	}
	public void setNombreHobby(String nombreHobby) {
		this.nombreHobby=nombreHobby;
	}
}
