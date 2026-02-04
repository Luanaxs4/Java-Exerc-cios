package heranca1;

public class Endereco{
	String tipolog, nomelog, comp;
	int num,ap;
	
	Endereco(String tipolog, String nomelog, int num, int ap){
		this.tipolog = tipolog;
		this.nomelog = nomelog;
		this.num = num;
		this.ap = ap;
	}
	Endereco(String tipolog, String nomelog, int num, int ap, String comp){
		this.tipolog = tipolog;
		this.nomelog = nomelog;
		this.num = num;
		this.ap = ap;
		this.comp = comp;
	}
	
	public void exibe() {
		System.out.print("Endereco: " + tipolog + " " + nomelog + ", " + num + ap);
        if (comp != null){
            System.out.print(" - " + comp);
        }
	}
}
