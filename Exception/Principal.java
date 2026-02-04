package ex;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		try {
			System.out.println("Numero:");
			int num = ent.nextInt();
			NumeroPar numero = new NumeroPar(num);
			if (numero.verificarPar()) {
				System.out.println("O Numero é par.");
			}
		}
		catch(NumNaoParException e){
			System.out.println(e);
		}
		catch(IntervaloErradoException e) {
			System.out.println(e);
		}
		catch(NaoParIntervaloException e) {
			System.out.println(e);
		}
		catch(InputMismatchException e) {
			System.out.println(e);
		}
		
		finally {
			ent.close();
		}
	}
}