
public class Main {

	public static void main(String[] args) {
				Cliente c = new Cliente();
				c.setNome("Lucas");
				
				Conta cc = new ContaCorrente(c);
				Conta poup = new ContaPoupanca(c);

				cc.deposito(680);
				cc.transferencia(10, poup);
				
				cc.imprimirExtrato();
				poup.imprimirExtrato();
			}
}

