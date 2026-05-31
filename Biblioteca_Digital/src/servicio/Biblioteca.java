package servicio;

import java.util.ArrayList;
import java.util.HashSet;

import excepciones.MaterialNoEncontradoException;
import interfaces.Gestionable;
import modelo.Material;

public class Biblioteca implements Gestionable {

    private ArrayList<Material> materiales;
    private HashSet<Integer> ids;

    public Biblioteca() {
        materiales = new ArrayList<>();
        ids = new HashSet<>();
    }

    @Override
    public void agregar(Material material) {

        if (ids.contains(material.getId())) {
            throw new IllegalArgumentException("Ya existe un material con ese id");
        }

        ids.add(material.getId());
        materiales.add(material);
    }

    @Override
    public Material buscar(int id) {

        validarNoVacia();

        for(Material material : materiales) {
            if (material.getId() == id) {
                return material;
            }
        }
        return null;
    }

    @Override
    public void actualizar(int id, Material materialActualizado) throws MaterialNoEncontradoException {

        validarNoVacia();

        for (int i = 0; i < materiales.size(); i++) {
            if(materiales.get(i).getId() == id) {
                materiales.set(i, materialActualizado);
                return;
            }
        }
        throw new MaterialNoEncontradoException("Material no encontrado");
    }

    @Override
    public void eliminar(int id) throws MaterialNoEncontradoException{

        validarNoVacia();

        for (int i = 0; i < materiales.size(); i++) {
            if (materiales.get(i).getId() == id) {
                materiales.remove(i);
                ids.remove(id);
                return;
            }
        }
        throw new MaterialNoEncontradoException("Material no encontrado");
    }

    @Override
    public void listar() {

        validarNoVacia();

        for (Material material : materiales) {
            System.out.println(material);
            System.out.println("------------------------");
        }
    }

    public boolean estaVacia() {
        return materiales.isEmpty();
    }

    private void validarNoVacia() {
        if (materiales.isEmpty()) {
            throw new IllegalStateException("No se he agregado ningun material");
        }
    }
}
