package heranca1;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		System.out.println("---Aluno----");
		
		System.out.println("Nome do aluno: ");
		String nome = leitura.nextLine();
		
		System.out.println("CPF do aluno: ");
		int cpf = leitura.nextInt();
		leitura.nextLine();

		System.out.println("Matricula do aluno: ");
		String matr = leitura.nextLine();
		
		System.out.println("Telefone do aluno: ");
		int tel = leitura.nextInt();
		
		System.out.println("Entre com a nota 1: ");
		double nota1 = leitura.nextDouble();

		System.out.println("Entre com a nota 2: ");
		double nota2 = leitura.nextDouble();
		
		Aluno aluno = new Aluno(nome,cpf,tel,matr,nota1,nota2);
		aluno.exibeDados();

		leitura.nextLine();

		System.out.println("\n--Professor--");
		System.out.println("Nome do Professor: ");
		nome = leitura.nextLine();
		
		System.out.println("CPF do Professor: ");
		cpf = leitura.nextInt();
		leitura.nextLine();
		
		System.out.println("Telefone do Professor: ");
		tel = leitura.nextInt();
		
		System.out.println("Horas de aula: ");
		int horasDeAula = leitura.nextInt();
		
		System.out.println("Valor da hora: ");
		double valorHora = leitura.nextDouble();
		
		Professor prof = new Professor(nome, cpf, tel, horasDeAula, valorHora);
		prof.exibeDados();
		
		leitura.nextLine();
		
		System.out.println("\n--Professor Mestre--");
		System.out.println("Nome do Professor Mestre: ");
		nome = leitura.nextLine();
		
		System.out.println("CPF do Professor Mestre: ");
		cpf = leitura.nextInt();
		
		System.out.println("Telefone do Professor Mestre: ");
		tel = leitura.nextInt();
		leitura.nextLine();
		
		System.out.println("Tema do mestrado: ");
		String temaDoMestrado = leitura.nextLine();
		
		ProfessorMestre profMestre = new ProfessorMestre(nome, cpf, tel, temaDoMestrado);
		profMestre.exibeDados();
		
		leitura.close();
	}
	

}
