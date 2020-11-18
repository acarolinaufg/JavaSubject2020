
public class Conta {
	protected int numero;
	protected String dono;
	protected double saldo =0;
	public double saque,deposito,valor;
	
	public Conta(int numero, String dono){
		this.numero = numero;
		this.dono = dono;
		
		
	}
	
	public void sacar(double saque) {
		if (saque<= saldo) {
			saldo = saldo - saque;
		}else {
			System.out.println("Não foi possível realizar a transação!");
		}
		System.out.println("O saldo na conta é: "+saldo);
	}
	
	public void depositar(double deposito) {
		saldo = saldo+deposito;
		System.out.println("O saldo na conta é: "+saldo);
	}
	
	public void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		
	}
	
	public String getDono() {
		return dono;
	}
	public int getNumero() {
		return numero;
	}

}
