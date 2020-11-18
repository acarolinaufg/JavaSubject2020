
public class TestaConta {

	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente (123,"Ana Oliveira");
		Conta cp1 = new ContaPoupança (001, "Penelope Fearigthon");
		ContaSalario cs1 = new ContaSalario (003,"Colin Bridgerton");
		
		cc1.depositar(100);
		cc1.sacar(25);
		
		cp1.depositar(200);
		cp1.sacar(100);
		((ContaPoupança) cp1).atualizaSaldo(0.02); 
		
		cs1.depositar(100);
		cs1.sacar(50);
		
		
		cc1.transferir(cp1, 20);
		System.out.println("O saldo da conta destino é: " +cp1.saldo);
		System.out.println("O saldo da conta que transferiu é: " +cc1.saldo);
		
		cs1.transferir(cc1, 50);
		System.out.println("O saldo da conta destino é: " +cc1.saldo);
		System.out.println("O saldo da conta que transferiu é: " +cs1.saldo);
	}

}
