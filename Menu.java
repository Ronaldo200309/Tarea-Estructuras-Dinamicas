import java.util.Scanner;

public class Menu {

    private ListaDoble lista = new ListaDoble();
    private Scanner sc = new Scanner(System.in);

    public void mostrarMenu() {

        int opcion;

        do {
            System.out.println("\n LISTA DOBLEMENTE ENLAZADA");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Recorrer hacia adelante");
            System.out.println("4. Recorrer hacia atras");
            System.out.println("5. Mostrar tamano");
            System.out.println("6. Mostrar si esta vacia");
            System.out.println("7. Buscar por valor");
            System.out.println("8. Buscar por indice");
            System.out.println("9. Borrar elemento");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese valor: ");
                    lista.insertarInicio(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Ingrese valor: ");
                    lista.insertarFinal(sc.nextInt());
                    break;

                case 3:
                    lista.recorrerAdelante();
                    break;

                case 4:
                    lista.recorrerAtras();
                    break;

                case 5:
                    lista.mostrarTamano();
                    break;

                case 6:
                    lista.estaVacia();
                    break;

                case 7:
                    System.out.print("Valor a buscar: ");
                    lista.buscarValor(sc.nextInt());
                    break;

                case 8:
                    System.out.print("Indice: ");
                    lista.buscarIndice(sc.nextInt());
                    break;

                case 9:
                    System.out.print("Valor a eliminar: ");
                    lista.borrarElemento(sc.nextInt());
                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);
    }
}