package escola;

public class Funcionario {
	public String nome;
	public String endereco; 
	public int numFun;
	
	public Funcionario(String nome, String endereco, int numFun) {
		this.nome = nome;
		this.endereco = endereco;
		this.numFun = numFun;
	}
	
	public void mostraDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Endereco: " + this.endereco);
		System.out.println("Numero Funcionario:" + this.numFun);
	}
}
