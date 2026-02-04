package escola;

public class Empregado extends Funcionario {
	public float sal;
	
	public Empregado(String nome, String endereco, int numFun, float sal) {
		super(nome,endereco,numFun);
		this.sal = sal;
	}
	
	public void mostrarDados() {
		System.out.println("\nEMPREGADO\n");
		super.mostraDados();
		System.out.println("Salario: " + sal + "\n");
	}

}
