package br.com.saraiva.livraria.estoque;

public class CalculadoraDeEstoque {

	public static void main(String[] args) {
		
		double livroJava8 = 59.90;
		double livroTDD = 59.90;
				
				double soma = livroJava8 + livroTDD;
		System.out.println("O total em estoque � " + soma);

		if(soma <150) {
			System.out.println("Seu estoque est� muito baixo!");
		}else if (soma >= 2000){
			System.out.println("Seu estoque est� muito alto");
		}else {
			System.out.println("Seu estoque est� bomS");
		}
		
		double soma1  = 0;
		int contador = 0;
		
		while (contador <35 ) {
			double valorDoLivro = 59.90;
			soma =+ valorDoLivro;
			contador ++;
			
			System.out.println("O total em estoque � " + soma);
			if (soma < 150) {
				System.out.println("seu estoque est� muito baixo!");
			}else if(soma >= 2000 ) {
				System.out.println("Seu estoque est� muito alta!");
			}else {
				System.out.println("Seu estoque est� bom");
			}
			
		}
	}

}
