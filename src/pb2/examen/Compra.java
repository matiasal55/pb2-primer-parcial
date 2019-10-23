package pb2.examen;

import java.util.ArrayList;

public class Compra {
	private Usuario usuario;
	private ArrayList<Producto> productosComprados;
	public Compra(Usuario usuario) {
		this.usuario = usuario;
		this.productosComprados=new ArrayList<Producto>();
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public ArrayList<Producto> getProductosComprados() {
		return productosComprados;
	}
	public void setProductosComprados(ArrayList<Producto> productosComprados) {
		this.productosComprados = productosComprados;
	}
	
	
}
