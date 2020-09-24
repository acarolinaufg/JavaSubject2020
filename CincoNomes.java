import java.util.Scanner;
public class CincoNomes {

	public static void main(String[] args) {
		//Declaração do vetor
		String vetor[];
		
		//declaração de variaveis
		String n1,n2,n3,n4,n5,b;
		
		//Scanners necessários
		Scanner nome1 = new Scanner(System.in);
		Scanner nome2 = new Scanner(System.in);
		Scanner nome3 = new Scanner(System.in);
		Scanner nome4 = new Scanner(System.in);
		Scanner nome5 = new Scanner(System.in);
		Scanner busca = new Scanner(System.in);
		
		//Inputs
		System.out.println("Os nomes inseridos deverão ser diferentes!!!");
		System.out.println("Inserir o primeiro nome:");
		n1 = nome1.nextLine();
		System.out.println("Inserir o segundo nome:");
		n2 = nome2.nextLine();
		System.out.println("Inserir o terceiro nome:");
		n3 = nome3.nextLine();
		System.out.println("Inserir o quarto nome:");
		n4= nome4.nextLine();
		System.out.println("Inserir o quinto nome:");
		n5 = nome5.nextLine();
		
		//Preenchendo o vetor
		vetor = new String [5];
		vetor[0] = n1;
		vetor[1] = n2;
		vetor[2] = n3;
		vetor[3] = n4;
		vetor[4] = n5;
		
		
		
		//procurar nome
		System.out.println("Entre com o nome para busca.");
		b = busca.nextLine();
		
		
		for (int i =0;i<=vetor.length-1;i++) {
			if(b.equalsIgnoreCase(vetor[i])) {
				System.out.println("Pertence a lista na posição "+i);
				break;
				}else {
					System.out.println("Não pertence a lista");
				}

		}
	}
}
