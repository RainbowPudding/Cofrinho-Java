/*
Nome: Gabriela Zanlucki Carvalho
RU: 4979234
 */
package uninter;

public abstract class Moeda {
	
    protected double valor;
    
    public Moeda(double valor) {
        this.valor = valor;
    }
    
    
    //getters and setters
    public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	@Override  //equals para comparação do valor das moedas
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    
	    Moeda moeda = (Moeda) obj;
	    return Double.compare(moeda.valor, this.valor) == 0;
	}


	public abstract void info();
	
	
    public abstract double converter();
}
