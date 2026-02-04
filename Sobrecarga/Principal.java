package heranca1;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Nome:");
		String nome = ent.nextLine();
		
		System.out.println("CPF:");
		String cpf= ent.nextLine();
		
		System.out.println("Entre com o tipo do logradouro:");
		String tipolog = ent.nextLine();
        
		System.out.println("Entre com o nome do logradouro:");
		String nomelog = ent.nextLine();
		
		System.out.println("Entre com o numero:");
		int num= ent.nextInt();
        
		ent.nextLine();
		
		System.out.println("1- Apartamento");
		System.out.println("2- Apartamento com complemento");
	    int numero = ent.nextInt();
	    
	    Endereco end;
	    ent.nextLine();
	    
	    switch(numero) {
	    	case 1:
	    		System.out.println("Entre com o apartamento");
	    		int ap= ent.nextInt();
	    		end = new Endereco(tipolog, nomelog, num,ap);
	    		break;
		    case 2:
		    	System.out.println("Entre com o complemento: ");
	    		String comp = ent.nextLine();
	    		System.out.println("Entre com o apartamento");
	    		ap= ent.nextInt();
	    		end = new Endereco(tipolog, nomelog, num,ap,comp);
	    		break;
	    }
		
		System.out.println("Quantidade de quartos:");
		int qtd = ent.nextInt();
		
		System.out.println("preco base do aluguel: ");
		double preco = ent.nextDouble();
		
		System.out.println("Tem porteiro? sim ou nao");
		String a = ent.nextLine();
		boolean porteiro;
		if (a == "sim") {
			porteiro = true;
		}
		else {
			porteiro = false;
		}
		ent.nextLine();		
		
		Proprietario prop= new Proprietario(nome , cpf);
		prop.getNome();
		prop.getCPF();
		
		Apartamento apart= new Apartamento(prop, end, qtd, porteiro ,preco);		
		double valor = apart.calculaAluguel();
		apart.exibeDados(valor);
		
		
		ent.close();
	}
}