package heranca1;

public class Pessoa {
	public String nome;
	public int tel,cpf;
	
	Pessoa(String nome, int cpf,int tel){
		this.nome = nome;
		this.cpf = cpf;
		this.tel = tel;
	}
	
	public void exibeDados() {
		System.out.println("Nome: " + this.nome );
		System.out.println("CPF: " + cpf);
		System.out.println("Telefone: " + tel);
	}
}
