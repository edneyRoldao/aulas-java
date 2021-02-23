package aula03.orientacaoObjetos.interfaces;

public class BancoItauService implements ContaBancariaService {

	@Override
	public void consultar(Conta conta) {
		System.out.println("sou a implementacao do itau");
		System.out.println(conta.getSaldo());
	}

	@Override
	public float sacar(Conta conta, float valorSaque) {
		System.out.println("sou a implementacao do itau");
		
		if (conta.getSaldo() < valorSaque) {
			System.out.println("saldo insuficiente");
			return 0.0f;
		}
		
		float novoSaldo = conta.getSaldo() - valorSaque;
		conta.setSaldo(novoSaldo);

		System.out.println("saque realizado. Saldo atual: " + novoSaldo);
		
		return valorSaque;
	}

	@Override
	public void depositar(Conta conta, float valorDeposito) {
		System.out.println("sou a implementacao do itau");
		
		if (valorDeposito < 10.0) {
			System.out.println("regra itau: so pode depositar valores acima de 10.00");
			return;
		}
		
		float novoSaldo = conta.getSaldo() + valorDeposito;
		conta.setSaldo(novoSaldo);
	}

	@Override
	public boolean transferir(Conta origem, Conta destino, float valorTransferir) {
		System.out.println("sou a implementacao do itau");
		
		if (origem.getSaldo() < valorTransferir) return false;
		
		// sacar da conta origem
		sacar(origem, valorTransferir);
		
		// depositar conta destino
		depositar(destino, valorTransferir);
				
		return true;
	}
	
}
