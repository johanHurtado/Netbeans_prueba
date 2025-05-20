package edu.usta.interfaces;

import edu.usta.clases.Nodo;

import javax.swing.DefaultListModel;

public interface Lista {

    public void resetearLista();

    public int cantidadElementos();

    public void agregar(Object datoAgregar);

    public void agregar(int posicion, Object datoAgregar);

    public void imprimir(DefaultListModel<String> salida);
    
    public void imprimirInverso(DefaultListModel<String> salida);

    public Nodo eliminar();

    public Nodo eliminar(int posicion);

    public Nodo buscarNodo(int posicion);

    public void actualizar(int posicion, Object datoCambiar);

}
