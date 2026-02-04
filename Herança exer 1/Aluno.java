package heranca1;

public class Aluno extends Pessoa{
	public String matr;
	public double nota1, nota2;
	
	public Aluno(String nome, int cpf, int tel, String matr, 
			double nota1, double nota2) {
		super(nome, cpf,tel);
		this.matr = matr;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	
	public double calculaMedia() {
		return (nota1+nota2)/2;

	}
	
	public void exibeDados() {
		System.out.println("---Dados do aluno----");
		super.exibeDados();
		System.out.println("Matricula: " + matr);
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2:" + nota2);
		System.out.println("Media: " + calculaMedia());
	}
}
