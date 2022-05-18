
public class CuentaCorriente extends Cuenta implements Tributacion {

	public CuentaCorriente(int numero, double saldo) {
		super(numero, saldo);
	}

	@Override
	public void retirar(double valor) throws SaldoInsuficienteException{
		double valorAretirar = valor + 20;

		super.retirar(valorAretirar);
	}
	
	@Override
	public void sacar(double valor) {
		
		super.sacar(valor);
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public double getValorImpuesto() {
		return super.saldo * 0.01;
	}

}
