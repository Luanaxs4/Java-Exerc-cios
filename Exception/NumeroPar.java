package ex;

public class NumeroPar {
	private int numero;
	
	public NumeroPar(int numero) {
		this.numero = numero;
	}
	
	public boolean verificarPar() throws NumNaoParException, IntervaloErradoException, NaoParIntervaloException{
		if(numero%2!=0) {
			if(numero>=10 && numero<=50) 
				throw new NumNaoParException();
	
			else
				throw new NaoParIntervaloException();
		}
		else if(numero>=10 && numero<=50){
			throw new IntervaloErradoException();
			
		}
		if(numero%2 ==0) {
			return true;}
		else {
			return false;
			}
		}
	}