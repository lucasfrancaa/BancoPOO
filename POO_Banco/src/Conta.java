
public abstract class Conta implements InterfaceConta {
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int conta;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.conta = SEQUENCIAL++;
		this.cliente = cliente;
	}

	
	public void saque(double valor) {
		saldo -= valor;
	}

	
	public void deposito(double valor) {
		saldo = saldo + valor;
	}

	
	public void transferencia(double valor, InterfaceConta contaDestino) {
		this.saque(valor);
		contaDestino.deposito(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void Infos() {
		System.out.println("\nTITULAR: " + this.cliente.getNome());
		System.out.println("AGÊNCIA: " + this.agencia);
		System.out.println("CONTA: " + this.conta);
		System.out.println("SALDO: " + this.saldo);
	}
		
}