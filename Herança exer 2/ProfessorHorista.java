package herenca;

public class ProfessorHorista extends Pessoa{
	
	public int matr;
	public float qtd;
	public float valor;

	public ProfessorHorista(String nome, String endereco,int matr, float qtd, float valor) {
		super(nome,endereco);
		this.matr=matr;
		this.qtd=qtd;
		this.valor=valor;
	}
	
	public double calSal() {
		return this.qtd * this.valor;
	}
	
	
	public void exibe(double sal) {
		System.out.println("\nHORISTA\n");
		super.exibe();
		System.out.println("Matricula: " + this.matr);
		System.out.println("Quantidade de horas que trabalhou:" + this.qtd);
		System.out.println("Valor por hora:" + this.valor);
		System.out.println("Salario:" + sal);
	}
}
