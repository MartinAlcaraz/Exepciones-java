/**
 *  IllegalArgumentException y IllegalStateException son dos excepciones
 * importantes que el desarrollador de Java debería utilizar. En 
 * general cuando tenga sentido, utilice una excepción estándar en 
 * lugar de crear la suya propia.
 * @author Martin
 * @version 1.0
 */
		
public abstract class Cuenta {
	private int numero;
	protected double saldo;
	private String titular;

	public Cuenta(int numero, double saldo) {
		if (numero < 1) {
			throw new IllegalArgumentException("Numero de cuenta invalido");
		}
		if (saldo < 0) {
			throw new IllegalArgumentException("Saldo invalido");
		}
		this.numero = numero;
		this.saldo = saldo;
	}

	public abstract void depositar(double valor);
	// this.saldo += valor;

	public void transferir(double valor, Cuenta cuenta) {
		this.saldo -= valor;
		cuenta.depositar(valor);
	}

	/**
	 *  Metodo para ratirar saldo de una cuenta
	 * @param valor candidad a retirar
	 * @throws SaldoInsuficienteException si el valor que se quiere
	 * retirar es mayor al saldo disponible se produce esta exepcion.
	 */
	public void retirar(double valor) throws SaldoInsuficienteException {

		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente");
		}
		this.saldo -= valor;
	}

	public void sacar(double valor) {

		if (this.saldo < valor) {
			throw new SaldoInsuficienteRunTimeException("Saldo insuficiente");
		}
		this.saldo -= valor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

}
