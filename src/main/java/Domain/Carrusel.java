package Domain;

public class Carrusel {

	int id;
	String descripcion;
	String imagen;
	int activo;
	public Carrusel(int id, String descripcion, String imagen, int activo) {
		
		this.id = id;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.activo = activo;
	}
	public Carrusel() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public int getActivo() {
		return activo;
	}
	public void setActivo(int activo) {
		this.activo = activo;
	}
	@Override
	public String toString() {
		return "Carrusel [id=" + id + ", descripcion=" + descripcion + ", imagen=" + imagen + ", activo=" + activo
				+ "]";
	}
	
	
	
	
}
