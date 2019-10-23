package pb2.examen;

public class Producto {
	private String descripcion;
	private Integer puntos;
	public Producto(String descripcion, Integer puntos) {
		this.descripcion = descripcion;
		this.puntos = puntos;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getPuntos() {
		return puntos;
	}
	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}
	
}
