public class ListaDoble {

    private Nodo cabeza;
    private Nodo cola;
    private int tamano;

    public ListaDoble() {
        cabeza = null;
        cola = null;
        tamano = 0;
    }

    public void insertarInicio(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cabeza = nuevo;
        }

        tamano++;
        System.out.println("Elemento insertado al inicio.");
    }

    public void insertarFinal(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (cola == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }

        tamano++;
        System.out.println("Elemento insertado al final.");
    }

    public void recorrerAdelante() {
        if (cabeza == null) {
            System.out.println("La lista esta vacia.");
            return;
        }

        Nodo actual = cabeza;

        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }

        System.out.println();
    }

    public void recorrerAtras() {
        if (cola == null) {
            System.out.println("La lista esta vacia.");
            return;
        }

        Nodo actual = cola;

        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.anterior;
        }

        System.out.println();
    }

    public void mostrarTamano() {
        System.out.println("Tamano de la lista: " + tamano);
    }

    public void estaVacia() {
        if (tamano == 0) {
            System.out.println("La lista esta vacia.");
        } else {
            System.out.println("La lista NO esta vacia.");
        }
    }

    public void buscarValor(int valor) {
        Nodo actual = cabeza;
        int posicion = 0;

        while (actual != null) {
            if (actual.dato == valor) {
                System.out.println("Encontrado en posicion: " + posicion);
                return;
            }
            actual = actual.siguiente;
            posicion++;
        }

        System.out.println("Elemento no encontrado.");
    }

    public void buscarIndice(int indice) {
        if (indice < 0 || indice >= tamano) {
            System.out.println("Indice fuera de rango.");
            return;
        }

        Nodo actual = cabeza;
        int contador = 0;

        while (contador < indice) {
            actual = actual.siguiente;
            contador++;
        }

        System.out.println("Elemento en posicion " + indice + ": " + actual.dato);
    }

    public void borrarElemento(int valor) {
        Nodo actual = cabeza;

        while (actual != null) {

            if (actual.dato == valor) {

                if (actual == cabeza) {
                    cabeza = actual.siguiente;
                    if (cabeza != null) {
                        cabeza.anterior = null;
                    }
                }
                else if (actual == cola) {
                    cola = actual.anterior;
                    if (cola != null) {
                        cola.siguiente = null;
                    }
                }
                else {
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }

                tamano--;
                System.out.println("Elemento eliminado.");
                return;
            }

            actual = actual.siguiente;
        }

        System.out.println("Elemento no encontrado.");
    }
}