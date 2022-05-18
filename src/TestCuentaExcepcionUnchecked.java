// Unchecked: este tipo de excepcion ocurre porque la excepcion creada 
// hereda de "RunTimeException" y  no de Exception, por lo tanto no hay 
// que tratar la excepcion con try catch o avisar con throws para que 
// otro metodo  la atrape.

// Excepciones checked son encontradas por el compilador y por eso hay 
// que manejarlas con throws y try catch para que el programa compile  
// porque se sabe que estas excepciones van a ocurrir.

// Excepciones unchecked NO son encontradas por el compilador y pueden 
// ocurrir o no, dependiendo de las operaciones que se realizen

public class TestCuentaExcepcionUnchecked {

	public static void main(String[] args) {
		
		CuentaCorriente c = new CuentaCorriente(2, 200);
		
		try {
			c.sacar(300);	
		}catch(SaldoInsuficienteRunTimeException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("fin");
		
	}
	

}
