
public class CuentaAhorro extends Cuenta {

	public CuentaAhorro(int numero, double saldo) {
		super(numero, saldo);
	}

	@Override
	public void depositar(double valor) {
		super.saldo += valor;
		
	}
	
	

}
