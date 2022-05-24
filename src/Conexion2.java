// hacer hover sobre la palabra AutoCloseable para ver que hace
public class Conexion2 implements AutoCloseable{

        public Conexion2() {
            System.out.println("Abriendo Conexion");
        }

        public void leerDatos() {
            System.out.println("Recibiendo datos");
            throw new IllegalStateException();
        }

        public void cerrar() {
            System.out.println("Cerrando conexión ");
        }

        // este metodo close() pertenece a la interface AutoCloseable
        // se ejecuta cuande se sale del bloque try-with-resource
        public void close() {
        	System.out.println("se ejecuta el metodo close() de AutoCloseable");
        	cerrar();
        }
}
