// Checked: este tipo de excepcion ocurre porque la excepcion creada hereda 
// de Exception y  no de RunTimeException, entonces hay que tratar 
// la excepcion con try catch o avisar con throws para que otro metodo
// la atrape.

public class TestCuentaExcepcionChecked {

	public static void main(String[] args) {
		/**
		 * En esta CuentaCorriente se cobra una comision por retirar dinero
		 * Si no hay saldo suficiente para el retiro deseado mas la comision
		 * no se puede hacer el retiro.
		 * @author Martin
		 * @version 1.0
		 */
		CuentaCorriente cuenta = new CuentaCorriente(1, 200);

		try {
			cuenta.retirar(200);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		
		

	}
}
