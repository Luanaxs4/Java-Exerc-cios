package herenca;

public class Pessoa {
	public String nome;
	public String endereco;
	public Pessoa (String nome, String endereco) {
		this.nome=nome;
		this.endereco=endereco;
		
	}
	
	public void exibe() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Endereco: " + this.endereco);
	}
	

}
