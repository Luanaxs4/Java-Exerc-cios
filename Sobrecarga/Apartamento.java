package heranca1;

public class Apartamento{
	Proprietario prop;
	Endereco end;
	int qtd;
	boolean porteiro;
	double preco;
	
	Apartamento(Proprietario prop, Endereco end, int qtd, boolean porteiro, double preco){
		this.prop=prop;
		this.end=end;
		this.qtd=qtd;
		this.porteiro=porteiro;
		this.preco=preco;
	}
	
	/*public void getLocal() {
		return this.end;
	}*/
	
	public int getQuarto() {
		return this.qtd;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public double calculaAluguel() {
		double valor;
		valor = preco + (qtd * 100.00);
		if (porteiro == true) {
			valor += 450.00;
		}
		return valor;
	}
	
	public void exibeDados(double valor){
		System.out.println("Quandidade de quartos: " + qtd);
		System.out.println("Preco do aluguel: " + preco );
		System.out.println("valor do aluguel :" + valor);
	}
		
}
