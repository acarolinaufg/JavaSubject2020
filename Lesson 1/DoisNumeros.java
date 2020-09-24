import java.util.Scanner;
public class DoisNumeros {
	public static void main(String[] args) {
		//declaração de variavel
		float n1, n2, sum, dif, mult, div;
		
		//Scanners necessários
		Scanner num1 = new Scanner(System.in);
		Scanner num2 = new Scanner(System.in);
		
		//Inputs necessários
		System.out.println("Insira o primeiro número:");
		n1 = num1.nextFloat();
		System.out.println("Insira o segundo número:");
		n2 = num2.nextFloat();
		
		//Cálculo:
		sum = n1+n2;
		div = n1/n2;
		dif = n1-n2;
		mult = n1*n2;
		
		//Print
		System.out.println("O valor da soma dos dois número é: "+sum);
		System.out.println("O valor da divisão dos dois número é: "+div);
		System.out.println("O valor da diferença dos dois número é: "+dif);
		System.out.println("O valor da multiplicação dos dois número é: "+mult);
	
	}
}
