import java.util.Scanner;
public class media {
	public static void main(String[] args) {
		
		String a1,a2,a3,a4;
		int nota1,nota2,nota3,a2_nota1,a2_nota2,a2_nota3,a3_nota1,a3_nota2,a3_nota3,a4_nota1,a4_nota2,a4_nota3;
		float media_a1,media_a2,media_a3,media_a4;
		
	
		Scanner nome1 = new Scanner(System.in);
		Scanner n1 = new Scanner(System.in);
		Scanner n2 = new Scanner(System.in);
		Scanner n3 = new Scanner(System.in);
		
		System.out.println("Informe o nome do aluno 1:");
		a1 = nome1.nextLine();
		System.out.println("Informe a n1:");
		nota1 = n1.nextInt();
		System.out.println("Informe a n2:");
		nota2 = n2.nextInt();
		System.out.println("Informe a n3:");
		nota3 = n3.nextInt();
		
		System.out.println("Informe o nome do aluno 2:");
		a2 = nome1.nextLine();
		System.out.println("Informe a n1:");
		a2_nota1 = n1.nextInt();
		System.out.println("Informe a n2:");
		a2_nota2 = n2.nextInt();
		System.out.println("Informe a n3:");
		a2_nota3 = n3.nextInt();
		
		
		System.out.println("Informe o nome do aluno 3:");
		a3 = nome1.nextLine();
		System.out.println("Informe a n1:");
		a3_nota1 = n1.nextInt();
		System.out.println("Informe a n2:");
		a3_nota2 = n2.nextInt();
		System.out.println("Informe a n3:");
		a3_nota3 = n3.nextInt();
		
		System.out.println("Informe o nome do aluno 4:");
		a4 = nome1.nextLine();
		System.out.println("Informe a n1:");
		a4_nota1 = n1.nextInt();
		System.out.println("Informe a n2:");
		a4_nota2 = n2.nextInt();
		System.out.println("Informe a n3:");
		a4_nota3 = n3.nextInt();
		
		media_a1 = (nota1+nota2+nota3)/3;
		media_a2 = (a2_nota1+a2_nota2+a2_nota3)/3;
		media_a3 = (a3_nota1+a3_nota2+a3_nota3)/3;	
		media_a4 = (a4_nota1+a4_nota2+a4_nota3)/3;
		
		System.out.println("A média final do "+a1+" é: "+media_a1);
		System.out.println("A média final do "+a2+" é: "+media_a2);
		System.out.println("A média final do "+a3+" é: "+media_a3);
		System.out.println("A média final do "+a4+" é: "+media_a4);
		

    }

}


