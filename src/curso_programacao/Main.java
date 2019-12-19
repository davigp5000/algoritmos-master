package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		/*byte num = 5*5;
		double altura = 1.65457;
		char sexo = 'f';
		
		String nome = "Maria";
		int idade = 32;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);
		System.out.println(num);
		System.out.printf("%.2f%n",altura);
		System.out.println(sexo);
		System.out.println("A altura é "+ altura +" O sexo "+ sexo );*/
		
		String produto = "computador";
		String produto2 = "monitor";
		
		String usuario = "Marcos";
		int idade = 36; 
		int codigo = 5243;
		char sexo = 'M';
		
		double preco = 2100;
		double preco2 = 650;
		double teste = 650;
		
		
		System.out.printf("Produtos:%n");
		System.out.println();
		Locale.setDefault(Locale.US);
		System.out.printf("O %s está custando R$ %.2f%n", produto,preco);
		System.out.printf("O %s está custando R$ %.2f%n", produto2, preco2);
		System.out.println();
		System.out.printf("Cadastro:%n");
		System.out.println();
		System.out.printf("Seu nome é %s tem %d anos, sexo %s, o codigo do produto é %d",usuario, idade, sexo, codigo );
		System.out.println();
		Locale.setDefault(Locale.US);
		System.out.printf("Us decimal point; %.2f%n",teste);
		System.out.println();
		
		
			       

		
	

	}

}
