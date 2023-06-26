import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class Main {
    public static void main(String[] args) {
        TablaHash tablaHash;
        int cantidadElementos = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\victor\\Desktop\\EMPLEADO.TXT"))) {
            cantidadElementos = Integer.parseInt(br.readLine());
            tablaHash = new TablaHash(cantidadElementos);

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(" ");
                int codigo = Integer.parseInt(partes[0]);
                String nombre = partes[1] + " " + partes[2];
                String direccion = partes[3] + " " + partes[4] + ", " + partes[5];
                Empleado empleado = new Empleado(codigo, nombre, direccion);
                tablaHash.insertar(empleado);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo EMPLEADO.TXT: " + e.getMessage());
            return;
        }

        tablaHash.mostrarTabla();
    }
}