package aula03.orientacaoObjetos.interfaces;

/**
 * 
 * 01 - uma interface nao pode ser instanciada
 * 02 - uma interface so possui metodos abstratos (o modificador abstract e implicito)
 * 03 - todo metodo em uma interface e public, portanto ele e implicito tbm
 * 04 - uma classe pode implementar mais de uma interface
 * 05 - quando uma classe implementa uma interface, ela ganha o tipo da interface (instanceOf)
 * 
 */

public interface ContaBancariaService {

	void consultar(Conta conta);
	float sacar(Conta conta, float valorSaque);
	void depositar(Conta conta, float valorTransferir);	
	boolean transferir(Conta origem, Conta destino, float valorTransferir);
		
}
