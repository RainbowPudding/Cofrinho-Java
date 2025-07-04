/*
Nome: Gabriela Zanlucki Carvalho
RU: 4979234
 */
package uninter;

import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	public void adicionar(Moeda moeda) {
        this.listaMoedas.add(moeda);
    }

	// para remover as moedas    
    public void remover(Moeda moeda) {
    	boolean removidoCorretamente = false;
    	for (int i = 0; i < listaMoedas.size(); i++) {
            if (listaMoedas.get(i).equals(moeda)) {
                listaMoedas.remove(i);
                removidoCorretamente = true;
                System.out.println("Moeda removida com sucesso!");
                break; // evita remover mais do que o necessario
                }
        }
        
        if (!removidoCorretamente) {
            System.out.println("Moeda não encontrada no cofrinho.");
        }
    }
    
    
    // para listar as moedas
    public void listagemMoedas() {
        if (listaMoedas.isEmpty()) {
            System.out.println("O cofrinho está vazio!");
            return;
        }
        
        for (int i = 0; i < listaMoedas.size(); i++) {
            System.out.print(i + ". ");
            listaMoedas.get(i).info();
        }
    }
    
    
    //chama o converter das outras classes
    public double totalConvertido() {
        double total = 0;
        for (Moeda moeda : listaMoedas) {
            total += moeda.converter();
        }
        return total;
    }
}

