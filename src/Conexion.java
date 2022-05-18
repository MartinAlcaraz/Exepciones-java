
public class Conexion {


        public Conexion () {
            System.out.println("Abriendo conexión");
        }


        public void leerDados() {
            System.out.println("Recibiendo datos");
            throw new IllegalStateException();
        }


        public void cerrar() {
            System.out.println("Cerrando conexión ");
        }
}