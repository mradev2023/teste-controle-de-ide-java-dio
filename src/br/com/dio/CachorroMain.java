package br.com.dio;

import br.com.dio.model.Cachorro;

public class CachorroMain {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Livro livro = new Livro();
		
		System.out.println(cachorro);
		System.out.println(livro);

	}

}

class Livro{
	public String titulo;
	public Integer numpag;
}
