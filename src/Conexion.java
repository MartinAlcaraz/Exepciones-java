
public class Conexion {


        public Conexion () {
            System.out.println("Abriendo conexi�n");
        }


        public void leerDados() {
            System.out.println("Recibiendo datos");
            throw new IllegalStateException();
        }


        public void cerrar() {
            System.out.println("Cerrando conexi�n ");
        }
}