
class Empleado {
    int codigo;
    String nombre;
    String direccion;
    
    public Empleado(int codigo, String nombre, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public String toString() {
        return codigo + " " + nombre + " " + direccion;
    }
}