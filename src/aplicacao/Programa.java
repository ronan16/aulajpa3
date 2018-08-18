package aplicacao;

import dominio.Usuario;

public class Programa {

	public static void main(String[] args) {
		Usuario u = new Usuario(1, "ROnan", "asodao@asodoasd.com");
		Usuario u2 = new Usuario(2, "ROnan2", "asodao@asodoasd.com");
		Usuario u3 = new Usuario(3, "ROnan3", "asodao@asodoasd.com");
		
		System.out.println(u.toString());
		System.out.println(u2.toString());
		System.out.println(u3.toString());
	}

}
