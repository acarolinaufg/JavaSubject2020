
public class ContaCorrente extends Conta {
	
	public ContaCorrente(int numero, String dono) {
		super(numero, dono);
		
	}
	
	public void sacar(double saque) {
		if (saque<= saldo) {
			saldo = saldo - saque - 0.05;
		}else {
			System.out.println("Não foi possível realizar a transação!");
		}
		System.out.println("Seu saldo da cc é: "+saldo);
	}
	
	public void depositar(double deposito) {
		saldo = saldo+deposito-0.05;
		System.out.println("Seu saldo da cc é: "+saldo);
	}

}
