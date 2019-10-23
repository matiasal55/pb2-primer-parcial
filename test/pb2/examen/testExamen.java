package pb2.examen;

import org.junit.Assert;
import org.junit.Test;


public class testExamen {
	
	Direccion nuevaDireccion=new Direccion("Falsa", 1234, "Springfield");
	Usuario nuevo=new Usuario("hotmail.com", "1234", "Cosme", "Fulanito", 12345, nuevaDireccion);
	Usuario referencia=new Usuario("hotmail.com", "1234", "Cosme", "Fulanito", 12345, nuevaDireccion);
	Sistema miSistema=new Sistema("nuevo");
	
	@Test
	public void crearUsuario () {
		Assert.assertTrue(miSistema.agregarUsuario(nuevo));
		Assert.assertTrue(miSistema.getListaDeUsuarios().contains(referencia));
	}
	
	@Test
	public void loguearUsuario() {
		miSistema.agregarUsuario(nuevo);
		Assert.assertTrue(miSistema.ingresarAlSistema("hotmail.com", "1234"));
	}
	
	@Test
	public void eliminarUnUsuario() {
		miSistema.agregarUsuario(nuevo);
		Assert.assertTrue(miSistema.eliminarUsuario(12345));
	}
	
}
