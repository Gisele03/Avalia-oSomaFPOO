package Desafio5;


public class Principal {

	public static void main(String[] args) {
		Produto produto = new Produto("A menina que roubava livros");
		System.out.println("Produto:");
		System.out.println("Nome: " + produto.getNome());
		
		Livro livro = new Livro("Seila", 300);
		System.out.println("Livro:");
		System.out.println("Autor: " + livro.getAutor());
		System.out.println("Paginas: " + livro.getPaginas());
	

	}

}