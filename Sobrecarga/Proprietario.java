package heranca1;

public class Proprietario {
	String nome;
	String cpf;
	
	Proprietario(String nome,String cpf) {
		this.nome=nome;
		this.cpf=cpf;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCPF() {
		return this.cpf;
	}
	
}
