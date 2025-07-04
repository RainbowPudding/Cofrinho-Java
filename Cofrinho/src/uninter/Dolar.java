/*
Nome: Gabriela Zanlucki Carvalho
RU: 4979234
 */
package uninter;

public class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor);
    }
    
    @Override
    public void info() {
        System.out.println("Dólar: " + valor);
    }
    
    @Override
    public double converter() {
        return valor * 5.75; // Cotação aproximada em 5,75 de 1 dólar para real
    }
}