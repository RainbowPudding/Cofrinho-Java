/*
Nome: Gabriela Zanlucki Carvalho
RU: 4979234
 */
package uninter;

public class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }
    
    @Override
    public void info() {
        System.out.println("Real: " + valor);
    }
    
    @Override
    public double converter() {
        return valor; // já está em real, não precisa de conversão											
    }
}