package heranca1;

public class ProfessorMestre extends Pessoa{
	String temaDoMestrado;
	
	public ProfessorMestre(String nome, int cpf, int tel, String temaDoMestrado) {
		super(nome, cpf,tel);
		this.temaDoMestrado = temaDoMestrado;
	}
	
	public void exibeDados() {
		super.exibeDados();
		System.out.println("Tema do mestrado: " + temaDoMestrado);
	}
}
