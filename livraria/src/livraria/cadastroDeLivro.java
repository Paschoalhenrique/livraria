package livraria;
/**
 * classe que executa meu programa
 * @author Paschoal Henrique
 *
 */
public class cadastroDeLivro {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.nome = "Paschoal Henrique";
		autor.emailDoAutor = "Paschoalteste@gmail.com";
		autor.cpfDoAutor = "100.200.321-22";
		
		Livro livro = new Livro();
		livro.nome = "Java pratico 8  sucesso";
		livro.descricao = "Novos recursos da linguagem";
		livro.valor = 59.90;
		livro.isbn = "978-85-66250-46-6";
		
		Livro.monstrarLivro();
	
		Livro outroLivro = new Livro();
		outroLivro.nome = "Logica de programação";
		outroLivro.descricao = "Criando seus primeiros programas";
		outroLivro.valor = 59.90;
		outroLivro.isbn = "978-85-66250-22-0";
		
		
		System.out.println("Monstra detalhes do livro ");
		System.out.println(livro.nome);
		System.out.println(livro.descricao);
		System.out.println(livro.valor);
		System.out.println(livro.isbn);
		System.out.println("-------");
		
		Livro.monstrarLivro();	
		
	
		
	}

}
