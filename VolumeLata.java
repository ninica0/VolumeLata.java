import java.util.Scanner;

public class VolumeLata {

	public static void main(String[] args) {
		int num3;
		double num1, num2, num4,  res;
		
		
	    num1 = 3.14159;
		num3 = 2;
		
	Scanner sc=new Scanner (System.in);
	
	System.out.print("Digite o raio da lata em centímetros: ");
	num2 = sc.nextDouble();
	System.out.println("Digite a altura da lata em centímetros: ");
	num4 = sc.nextDouble();
	
	res = num1 * (num2 * num2) * num4;
	
	System.out.println("O volume da lata de óleo é: " + res);
	


	}

}