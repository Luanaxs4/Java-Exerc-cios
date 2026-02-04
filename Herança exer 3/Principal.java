package escola;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = ent.nextLine();
		
		System.out.println("Endereço: ");
		String endereco = ent.nextLine();
		
		System.out.println("Numero Funcionario: ");
		int numFun = ent.nextInt();
		
		System.out.println("Salario: ");
		float sal = ent.nextFloat();
		
		Empregado emp = new Empregado(nome, endereco, numFun, sal);
		emp.mostrarDados();
		ent.nextLine();
		
		
		System.out.println("Nome: ");
		nome = ent.nextLine();
		
		System.out.println("Endereço: ");
		endereco = ent.nextLine();
		
		System.out.println("Numero Funcionario: ");
		numFun = ent.nextInt();
		
		System.out.println("Horas semanais: ");
		int horas = ent.nextInt();
		
		System.out.println("Valor por hora: ");
		double valor = ent.nextDouble();
		
		Professor prof = new Professor(nome, endereco, numFun, horas, valor);
		prof.mostraDados();
		
	
		ent.close();
	}
}
