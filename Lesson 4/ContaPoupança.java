
public class ContaPoupança extends Conta{
	public double porcentagem;
	public double saldo;
	
	public ContaPoupança(int numero, String dono) {
		super(numero, dono);
		
	}
	
	public void atualizaSaldo(double porcentagem) {
		saldo = saldo*(porcentagem+1);
		System.out.println("Seu saldo da cp é: "+saldo);
	}

}
