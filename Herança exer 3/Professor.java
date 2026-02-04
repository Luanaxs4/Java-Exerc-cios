package escola;

public class Professor extends Funcionario{
	public int horas;
	public double valor;
	double sal;
	
	public Professor(String nome, String endereco, int numFun,int horas,double valor) {
		super(nome,endereco,numFun);
		this.horas = horas;
		this.valor = valor;
	}
	
	public void salFunc() {
		sal = horas * valor;
	}
	
	public void mostraDados() {
		System.out.println("\nPROFESSOR\n");
		super.mostraDados();
		System.out.println("Horas que trabalhou: " + this.horas);
		System.out.println("Valor por horas: " + valor);
		salFunc();
		System.out.println("Salario: " + sal);
		

	}
}
