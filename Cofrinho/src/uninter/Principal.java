/*
Nome: Gabriela Zanlucki Carvalho
RU: 4979234
 */
package uninter;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
	int opcao;
	int tipoMoeda;
	double valor;
	double remover;
	Moeda moeda;
	
	Scanner teclado = new Scanner(System.in);
	Cofrinho cofrinho = new Cofrinho();

	while (true) {
		System.out.println("\nCofrinho da Gabi:");
		System.out.println("1 - Adicionar Moeda");
		System.out.println("2 - Remover Moeda");
		System.out.println("3 - Listar Moedas");
		System.out.println("4 - Calcular total convertido para Real");
		System.out.println("5 - Sair");
		System.out.print("Escolha uma opção: ");
    	opcao = teclado.nextInt();
 
        switch (opcao) {
        
        	// Menu para adicionar as moedas
            case 1:
            	boolean adicionarMoeda = true;
            	while (adicionarMoeda) {
                System.out.println("Escolha o tipo de moeda para adicionar:");
                System.out.println("1 - Dólar");
                System.out.println("2 - Euro");
                System.out.println("3 - Real");
                System.out.println("4 - Retornar ao menu");
                tipoMoeda = teclado.nextInt();
                
                if (tipoMoeda == 4) {
                	adicionarMoeda = false;
                	break;
                }
                
                System.out.print("Digite o valor da moeda: ");
                valor = teclado.nextDouble();
                
                if (tipoMoeda == 1)
                	cofrinho.adicionar(new Dolar(valor));
                else if (tipoMoeda == 2)
                	cofrinho.adicionar(new Euro(valor));
                else if (tipoMoeda == 3)
                	cofrinho.adicionar(new Real(valor));
                else
                	System.out.println("Opção inválida, tente novamente.");
                	
                System.out.println("Moeda adicionada ao cofrinho com sucesso !");
            	}
                break;
                

                
       
            // Menu para remover as moedas
            case 2:
            	System.out.println("Escolha o tipo de moeda para remover:");
                System.out.println("1 - Dólar");
                System.out.println("2 - Euro");
                System.out.println("3 - Real");
                tipoMoeda = teclado.nextInt();
                
                System.out.print("Digite o valor da moeda: ");
                valor = teclado.nextDouble();
                
                if (tipoMoeda == 1)
                	cofrinho.remover(new Dolar(valor));
                else if (tipoMoeda == 2)
                	cofrinho.remover(new Euro(valor));
                else if (tipoMoeda == 3)
                	cofrinho.remover(new Real(valor));
                break;
                
                
                
           // Menu para listar as moedas no cofrinho
            case 3:
                cofrinho.listagemMoedas();
                break;
                
                
           // Menu para converter para real
            case 4:
                System.out.println("Convertendo todas as moedas para real, você possui R$ " + cofrinho.totalConvertido());
                break;
                
                
            // Sair
            case 5:
                System.out.println("Saindo...");
                teclado.close();
                return;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
}
}
