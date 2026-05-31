package principal;

import excepciones.MaterialNoEncontradoException;
import modelo.AudioLibro;
import modelo.Libro;
import modelo.Material;
import modelo.Revista;
import servicio.Biblioteca;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        int opcion = 0;

        do {
            try {
                System.out.println("\n=== BIBLIOTECA ===");
                System.out.println("1. Agregar material");
                System.out.println("2. Buscar material");
                System.out.println("3. Actualizar material");
                System.out.println("4. Eliminar material");
                System.out.println("5- Listar materiales");
                System.out.println("6. Salir");
                System.out.print("Seleccione una opcion: ");
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("Que desea agregar?");
                        System.out.println("1. Libro");
                        System.out.println("2. Revista");
                        System.out.println("3. AudioLibro");
                        System.out.print("Opcion: ");
                        int tipo = sc.nextInt();
                        sc.nextLine();

                        if (tipo < 1 || tipo > 3) {
                            System.out.println("Tipo invalido");
                            break;
                        }

                        System.out.print("ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Titulo: ");
                        String titulo = sc.nextLine();

                        System.out.print("Autor: ");
                        String autor = sc.nextLine();

                        System.out.print("Año de publicacion: ");
                        int año = sc.nextInt();

                        switch (tipo) {
                            case 1:
                                System.out.print("Numero de paginas: ");
                                int numeroPaginas = sc.nextInt();

                                Libro libro = new Libro(id, titulo, autor, año, numeroPaginas);
                                biblioteca.agregar(libro);
                                System.out.println("Libro agregado correctamente");
                                break;

                            case 2:
                                System.out.print("Numero de edicion: ");
                                int numeroEdicion = sc.nextInt();

                                Revista revista = new Revista(id, titulo, autor, año, numeroEdicion);
                                biblioteca.agregar(revista);
                                System.out.println("Material agregado correctamente");
                                break;

                            case 3:
                                System.out.print("Duracion (minutos): ");
                                int duracion = sc.nextInt();
                                AudioLibro audioLibro = new AudioLibro(id, titulo, autor, año, duracion);
                                biblioteca.agregar(audioLibro);
                                System.out.println("AudioLibro agregado correctamente");
                                break;

                        }
                        break;

                    case 2:

                        if (biblioteca.estaVacia()) {
                            System.out.println("No se ha agregado ningun material");
                            break;
                        }

                        System.out.print("Ingrese el ID a buscar: ");
                        int idBuscar = sc.nextInt();

                        Material encontrado = biblioteca.buscar(idBuscar);
                        if (encontrado != null) {
                            System.out.println("\nMaterial encontrado");
                            System.out.println(encontrado);
                        } else {
                            System.out.println("\nMaterial no encontrado");
                        }
                        break;


                    case 3:
                        if (biblioteca.estaVacia()) {
                            System.out.println("No se ha agregado ningun material");
                            break;
                        }

                        System.out.print("Ingrese el ID a actualizar: ");
                        int idActualizar = sc.nextInt();
                        sc.nextLine();

                        Material existente = biblioteca.buscar(idActualizar);

                        if(existente == null) {
                            System.out.println("Material no encontrado");
                            break;
                        }

                        System.out.print("Nuevo titulo: ");
                        String nuevoTitulo = sc.nextLine();

                        System.out.print("Nuevo autor: ");
                        String nuevoAutor = sc.nextLine();

                        System.out.print("Nuevo año: ");
                        int nuevoAño = sc.nextInt();

                        Material actualizado = null;

                        if (existente instanceof Libro) {
                            System.out.print("Nuevo numero de paginas: ");
                            int paginas = sc.nextInt();

                            actualizado = new Libro(idActualizar, nuevoTitulo, nuevoAutor, nuevoAño, paginas);
                        }

                        else if (existente instanceof Revista) {
                            System.out.print("Nuevo numero de edicion: ");
                            int edicion = sc.nextInt();

                            actualizado = new Revista(idActualizar, nuevoTitulo, nuevoAutor, nuevoAño, edicion);
                        }

                        else if (existente instanceof AudioLibro) {
                            System.out.print("Nueva duracion (minutos): ");
                            int duracion = sc.nextInt();

                            actualizado = new AudioLibro(idActualizar, nuevoTitulo, nuevoAutor, nuevoAño, duracion);
                        }

                        biblioteca.actualizar(idActualizar, actualizado);
                        System.out.println("Material acualizado correctamente");
                        break;

                    case 4:
                        if (biblioteca.estaVacia()) {
                            System.out.println("No se ha agregado ningun material");
                            break;
                        }

                        System.out.print("Ingrese el ID a eliminar: ");
                        int idEliminar = sc.nextInt();

                        biblioteca.eliminar(idEliminar);

                        System.out.println("Material eliminado correctamente");
                        break;

                    case 5:
                        biblioteca.listar();
                        break;

                    case 6:
                        System.out.println("Saliendo");
                        break;

                    default:
                        System.out.println("Opcion invalida");
                }

            } catch (IllegalArgumentException | IllegalStateException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un numero");
                sc.nextLine();
            } catch (MaterialNoEncontradoException e) {
                System.out.println(e.getMessage());
            }
        } while (opcion != 6);
    }
}
