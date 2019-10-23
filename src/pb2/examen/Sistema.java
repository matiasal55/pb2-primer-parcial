package pb2.examen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Sistema {
	private LinkedList<Usuario> listaDeUsuarios;
	private String nombre;
	private ArrayList<Compra> listaDeCompras;

	public Sistema(String nombre) {
		this.nombre = nombre;
		this.listaDeUsuarios = new LinkedList<Usuario>();
		this.listaDeCompras=new ArrayList<Compra>();
	}

	public Boolean agregarUsuario(Usuario usuario) {
		for (Usuario lista : this.listaDeUsuarios) {
			if (lista.getMail().equals(usuario.getMail())) {
				return false;
			}
		}
		this.listaDeUsuarios.add(usuario);
		return true;
	}

	public Boolean ingresarAlSistema(String mail, String password) {
		for (Usuario lista : this.listaDeUsuarios) {
			if (lista.getMail().equals(mail) && lista.getContrasenia().equals(password)) {
				return true;
			}
		}
		return false;
	}

	public Boolean eliminarUsuario(Integer id) {
		Iterator<Usuario> it = this.listaDeUsuarios.iterator();
		while (it.hasNext()) {
			Usuario aEliminar = it.next();
			if (aEliminar.getId().equals(id)) {
				it.remove();
				return true;
			}
		}
		return false;
	}
	
	public Integer obtenerPuntosDeUnUsuario (Usuario usuario) {
		Integer puntos=0;
		for(Compra lista:this.listaDeCompras) {
			if(lista.getUsuario().equals(usuario)) {
				for(Producto otraLista:lista.getProductosComprados()) {
					puntos+=otraLista.getPuntos();
				}
			}
		}
		return puntos;
	}

	public LinkedList<Usuario> getListaDeUsuarios() {
		return listaDeUsuarios;
	}

	public void setListaDeUsuarios(LinkedList<Usuario> listaDeUsuarios) {
		this.listaDeUsuarios = listaDeUsuarios;
	}
	
	
}
