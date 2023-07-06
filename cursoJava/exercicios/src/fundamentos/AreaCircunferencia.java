package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		double raio = 3.4;
		double pi = 3.14;
		
		double area = pi * raio * raio;
		System.out.println(area);
		
		raio = 10;
		area = pi * raio * raio;
		System.out.println("Área =" + area + "m2.");
	}
}
