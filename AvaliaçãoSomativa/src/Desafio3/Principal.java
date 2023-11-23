package Desafio3;

public class Principal {

	public static void main(String[] args) {
			Pedido pedido = new Pedido(1, "Notebook", 2000);
			System.out.println("Pedido:");
			System.out.println("Id: " + pedido.getId());
			System.out.println("Produto: " + pedido.getProduto());
			System.out.println("Quantidade: " + pedido.getQuantidade());

	}

}
