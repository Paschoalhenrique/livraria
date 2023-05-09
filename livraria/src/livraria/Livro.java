package livraria;

public class Livro {
	/**
	 * atributos da classe livros
	 */
	String nome;
	String descricao;
	public static double valor;
	String isbn;
	String autor;

	void monstrarDetalhes() {
		System.out.println("Monstrando detalhes do livro");
		System.out.println("Nome " + nome);
		System.out.println("Descrição " + descricao);
		System.out.println("Valor " + valor);
		System.out.println("ISBN" + isbn);
		System.out.println("------------");
		

	}

	public static void monstrarLivro() {
		// TODO Auto-generated method stub
		
	}

}
