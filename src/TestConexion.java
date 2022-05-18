// manejo de excepciones con try catch normal
// otra forma de manejar estas excepciones es usa try with resources
// (try con recursos) . Ver TestConexionTryWithResources y Conexion2
// para ver el manejo de las excepciones descomentar la excepcion 
// en la clase Conexion.java
public class TestConexion {

	public static void main(String[] args) {
		
		Conexion con = new Conexion(); 
		try {
			con.leerDados();
		} 
		catch (IllegalStateException ex) {
			System.out.println("Surgio un error en la conexión");
		}
		finally {
	        con.cerrar();
		}
	}
}
