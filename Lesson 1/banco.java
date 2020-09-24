import java.util.Scanner;

public class banco {
public static void main(String[] args) {
		
		//Declarando variáveis
		String p1,p2,p3;
		float c1,c2,c3,s1,s2,s3;
		
		//Bloco dos scanners necessários
		Scanner nome1 = new Scanner(System.in);
		Scanner nome2 = new Scanner(System.in);
		Scanner nome3 = new Scanner(System.in);
		
		Scanner conta1 = new Scanner(System.in);
		Scanner conta2 = new Scanner(System.in);
		Scanner conta3 = new Scanner(System.in);
		
		Scanner saldo1 = new Scanner(System.in);
		Scanner saldo2 = new Scanner(System.in);
		Scanner saldo3 = new Scanner(System.in);
		
		//Input cliente 1
		System.out.println("Digite seu nome:");
		p1 = nome1.nextLine();
		System.out.println("Digite sua conta:");
		c1 = conta1.nextFloat();
		System.out.println("Digite seu saldo");
		s1 = saldo1.nextFloat();
		
		//Input cliente 2
		System.out.println("Digite seu nome:");
		p2 = nome2.nextLine();
		System.out.println("Digite sua conta:");
		c2 = conta2.nextFloat();
		System.out.println("Digite seu saldo");
		s2 = saldo2.nextFloat();
		
		//Input cliente 2
		System.out.println("Digite seu nome:");
		p3 = nome3.nextLine();
		System.out.println("Digite sua conta:");
		c3 = conta3.nextFloat();
		System.out.println("Digite seu saldo");
		s3 = saldo3.nextFloat();
		
		//Print clientes
		System.out.println("Cliente "+p1+" ,conta "+c1+" ,saldo:"+s1);
		System.out.println("Cliente "+p2+" ,conta "+c2+" ,saldo:"+s2);
		System.out.println("Cliente "+p3+" ,conta "+c3+" ,saldo:"+s3);
				
		
		
	}

}
