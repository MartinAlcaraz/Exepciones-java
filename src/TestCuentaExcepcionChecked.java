// Checked: este tipo de excepcion ocurre porque la excepcion creada hereda 
// de Exception y  no de RunTimeException, entonces hay que tratar 
// la excepcion con try catch o avisar con throws para que otro metodo
// la atrape.

public class TestCuentaExcepcionChecked {

	public static void main(String[] args) {

		CuentaCorriente cuenta = new CuentaCorriente(1, 200);

		try {
			cuenta.retirar(300);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		
		

	}
}
