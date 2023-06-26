class TablaHash {
    private Nodo[] tabla;
    
    public TablaHash(int size) {
        tabla = new Nodo[size];
    }
    
    public void insertar(Empleado empleado) {
        int indice = empleado.codigo % tabla.length;
        Nodo nuevoNodo = new Nodo(empleado);
        
        if (tabla[indice] == null) {
            tabla[indice] = nuevoNodo;
        } else {
            Nodo nodoActual = tabla[indice];
            while (nodoActual.siguiente != null) {
                nodoActual = nodoActual.siguiente;
            }
            nodoActual.siguiente = nuevoNodo;
        }
    }
    
    public void mostrarTabla() {
        System.out.println("Tabla de Dispersión:");
        System.out.println("---------------------------");
        
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Índice " + i + ": ");
            
            Nodo nodoActual = tabla[i];
            while (nodoActual != null) {
                System.out.print(nodoActual.empleado + " -> ");
                nodoActual = nodoActual.siguiente;
            }
            
            System.out.println("null");
        }
        
        System.out.println("---------------------------");
    }
}