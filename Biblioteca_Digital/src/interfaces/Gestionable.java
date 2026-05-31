package interfaces;

import excepciones.MaterialNoEncontradoException;
import modelo.Material;

public interface Gestionable {
    void agregar(Material material);
    Material buscar(int id);
    void actualizar(int id, Material material) throws MaterialNoEncontradoException;
    void eliminar(int id) throws MaterialNoEncontradoException;
    void listar();
}
