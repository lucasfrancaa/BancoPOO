
public interface InterfaceConta {
	
		void saque(double valor);
		
		void deposito(double valor);
		
		void transferencia(double valor, InterfaceConta contaDestino);
		
		void imprimirExtrato();
	}
}
