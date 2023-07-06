package fundamentos;

public class DesafiosLogicos {
	public static void main(String[] args) {
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		System.out.println("Comprou a Tv de 50'? " + comprouTv50);
		
		boolean comprouCamaKing = trabalho1 || trabalho2;
		System.out.println("Comprou a cama king? " + comprouCamaKing);
		
		boolean comprouSorvete = trabalho1 && !trabalho2;
		System.out.println("Comprou o sorvete? " + comprouSorvete);
	}
}
