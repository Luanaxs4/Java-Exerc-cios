package heranca1;

public class Professor extends Pessoa{
	int horasDeAula;
	double valorHora , sal;
	
	public Professor(String nome, int cpf, int tel, int horasDeAula,
			double valorHora) {
		super(nome, cpf,tel);
		this.horasDeAula = horasDeAula;
		this.valorHora = valorHora;
	}
	
	public double calculaSal() {
		return horasDeAula * valorHora;
	}
	
	public void exibeDados() {
		System.out.println("---Dados do Professor---");
		super.exibeDados();
		System.out.println("Horas de aulas por mês: " + horasDeAula);
		System.out.println("Valor po hora: " + valorHora);
		System.out.println("Salário: " + calculaSal());
	}
}
