// este try catch con Recursos utiliza la declaracion de la conexion 
// dentro del try y la clase Conexion2 utiliza la interface AutoCloseable
// para cerrar la conexion automaticamente cuando se sale del bloque
// try catch
// comentar y descomentar la excepcion de la clase Conexion2 para ver 
// como funciona el try 

public class TestConexionTryWithResources {

	public static void main(String[] args) {

		// try (with resource) . Es necesario implementar la interface 
		// AutoCloseable dentro de la clase Conexion2 . Al salir del 
		// bloque try se ejecuta el metodo close() de la clase Conexion2
		
		try (Conexion2 conexion = new Conexion2()) {
			conexion.leerDatos();
			System.out.println("si ocurre una excepcion en leerDatos este print no se ejecuta");
		} catch (IllegalStateException ex) {
			System.out.println("Surgió un error en la conexión ");
		}
	}

}
