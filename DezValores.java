import java.util.Scanner;
public class DezValores {
	public static void main(String[] args) {
		
		//declaração do vetor
		int vetor[], inv[],quad[];
		int p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
		int soma,media;
		
		//Scanners necessários
		Scanner n1 = new Scanner(System.in);
		Scanner n2 = new Scanner(System.in);
		Scanner n3 = new Scanner(System.in);
		Scanner n4 = new Scanner(System.in);
		Scanner n5 = new Scanner(System.in);
		Scanner n6 = new Scanner(System.in);
		Scanner n7 = new Scanner(System.in);
		Scanner n8 = new Scanner(System.in);
		Scanner n9 = new Scanner(System.in);
		Scanner n10 = new Scanner(System.in);
		
		//Input dos scanners
		System.out.println("Entre com o n1:");
		p1 = n1.nextInt();
		System.out.println("Entre com o n2:");
		p2 = n2.nextInt();
		System.out.println("Entre com o n3:");
		p3 = n3.nextInt();
		System.out.println("Entre com o n4:");
		p4 = n4.nextInt();
		System.out.println("Entre com o n5:");
		p5 = n5.nextInt();
		System.out.println("Entre com o n6:");
		p6 = n6.nextInt();
		System.out.println("Entre com o n7:");
		p7 = n7.nextInt();
		System.out.println("Entre com o n8:");
		p8 = n8.nextInt();
		System.out.println("Entre com o n9:");
		p9 = n9.nextInt();
		System.out.println("Entre com o n10:");
		p10 = n10.nextInt();
		
		//atribuição do vetor
		vetor = new int [10];
		
		vetor[0] = p1;
		vetor[1] = p2;
		vetor[2] = p3;
		vetor[3] = p4;
		vetor[4] = p5;
		vetor[5] = p6;
		vetor[6] = p7;
		vetor[7] = p8;
		vetor[8] = p9;
		vetor[9] = p10;
		
		//Soma dos valores do vetor
		soma = 0;
		
		for(int i = 0; i<vetor.length-1;i++) {
		soma = soma + vetor[i];
		}
		
		//Média dos valores do vetor
			
		media = soma/10;
			
		//Ordem inversa do vetor
		
		for (int i = vetor.length-1;i >=0;i--) {
			System.out.println("O vetor inverso é: "+vetor[i]); 
		}
		
		// Quadrado do vetor
		quad = new int[10];
		for (int i = 0;i<vetor.length;i++) {
			quad[i] = vetor[i]*vetor[i];
		}
		
		//imprimir os valores
		System.out.println("O valor da soma é: "+soma);
		System.out.println("O valor da média é: "+media);
		System.out.println("O vetor com os valores ao quadrado é: "+quad);
	}

}
