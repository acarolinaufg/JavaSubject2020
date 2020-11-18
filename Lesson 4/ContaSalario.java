
public class ContaSalario extends Conta{
	
	public ContaSalario(int numero, String dono) {
		super(numero, dono);
		
	}
	
	public void sacar(double saque) {
		if (saque<= saldo) {
			saldo = saldo - saque - 0.01;
		}else {
			System.out.println("Não foi possível realizar a transação!");
		}
		System.out.println("Seu saldo da cs é: "+saldo);
	}
	
	public void depositar(double deposito) {
		saldo = saldo+deposito-0.01;
		System.out.println("Seu saldo da cs é: "+saldo);
	}

}
