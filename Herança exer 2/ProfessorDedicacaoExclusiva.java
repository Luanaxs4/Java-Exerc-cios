package herenca;

public class ProfessorDedicacaoExclusiva extends Pessoa{
	
	public int matr;
	public double sal;
	
	public ProfessorDedicacaoExclusiva(String nome, String endereco, int matr, double sal) {
		super(nome,endereco);
		this.matr=matr;
		this.sal=sal;
	}
	
	public void exibe() {
		
		System.out.println("\nDEDICAÇÃO EXCLUSIVA\n");
		super.exibe();
		System.out.println("matricula: " + this.matr);
		System.out.println("Salario:" + this.sal);
	}
}
