package herenca;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		//ler dados professor dedicação exclusiva
		
		
		System.out.println("---Professor Dedicacao Exclusiva---\n");

		System.out.println("Qual o nome?");
		String nome = ent.nextLine();
		
		System.out.println("Endereco:");
		String endereco= ent.nextLine();
		
		System.out.println("Matricula:" );
		int matr = ent.nextInt();
		
		System.out.println("Salario:");
		double sal = ent.nextDouble();
	
		
		ProfessorDedicacaoExclusiva exclusiva = new ProfessorDedicacaoExclusiva(nome,endereco, matr, sal); 
		exclusiva.exibe();
		ent.nextLine();
		
		System.out.println("\n---Professor Horista---\n");
		
		System.out.println("Nome: ");
		nome= ent.nextLine();
		
		System.out.println("Endereco:");
		endereco= ent.nextLine();
		
		System.out.println("Matricula:" );
		matr = ent.nextInt();
		
		System.out.println("Horas de trabalho: ");
		float qtd = ent.nextFloat();

		System.out.println("Valor por hora: ");
		float valor = ent.nextFloat();
		
		ProfessorHorista horista = new ProfessorHorista(nome, endereco, matr, qtd, valor); 
		sal = horista.calSal();
		horista.exibe(sal);
	
		
		
		
		
		
		

		
		ent.close();
	}
}
