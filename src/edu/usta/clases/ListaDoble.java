
package edu.usta.clases;

import edu.usta.interfaces.Lista;
import edu.usta.utilidades.Utilidad;
import javax.swing.DefaultListModel;

public class ListaDoble implements Lista{
    private Nodo cabeza;
    private Nodo cola;

    public ListaDoble()  {
        this.resetearLista();
    }

    @Override
    public void resetearLista() {
        cabeza = null;
        cola = null;
    }

    @Override
    public int cantidadElementos() {
        int contador = 0;
        Nodo tempotral = cabeza;
        while (tempotral != null) {  
            tempotral = tempotral.getSiguiente();
            contador++;
            
        }
        return contador;
    }

    @Override
    public void agregar(Object datoAgregar) {
        Nodo nuevoNodo = new Nodo(datoAgregar, cola, null);
        if (cabeza == null) {
            cabeza= nuevoNodo;
            
        } else {
            cola.setSiguiente(nuevoNodo);
        }
        cola = nuevoNodo;
    }

    @Override
    public void agregar(int posicion, Object datoAgregar) {
        Nodo nuevNodo = new Nodo();
        nuevNodo.setDato(datoAgregar);
        
        if (posicion == 0) {
            cabeza.setAnterior(nuevNodo);
            nuevNodo.setSiguiente(cabeza);
            cabeza = nuevNodo;
            
        } else {
            Nodo temporal = cabeza;
            int posAnterior = posicion;
            
            for (int i = 0; i < posAnterior; i++) {  
                temporal=temporal.getSiguiente();
                
            }
            Nodo siguiente = temporal.getSiguiente();
            //antes e buevo 
            temporal.setSiguiente(nuevNodo);
            nuevNodo.setAnterior(temporal);
            //despues de nuevo nodo
            siguiente.setAnterior(nuevNodo);
            nuevNodo.setSiguiente(siguiente);
            
        }
    }

    @Override
    public void imprimir(DefaultListModel<String> salida) {
        String nombreNodo, nombreAnterior, nombreSiguiente;
        int indice= 0;
        Nodo temporal = cabeza;
        
        while (temporal != null) {   
            nombreNodo = Utilidad.formatearTexto(temporal);
            nombreAnterior = Utilidad.formatearTexto(temporal.getAnterior());
            nombreSiguiente = Utilidad.formatearTexto(temporal.getSiguiente());
            
            
            salida.addElement(nombreAnterior + "<= Anterior[" + nombreNodo + "Lista Doble ["
                    + indice + "] = " + temporal.getDato() + "]Siguiente => " + nombreSiguiente);
            
            temporal = temporal.getSiguiente();
            indice++;
            
        }
    }

    @Override
    public void imprimirInverso(DefaultListModel<String> salida) {
        String nombreNodo, nombreAnterior, nombreSiguiente;
        int indice= cantidadElementos()-1;
        Nodo temporal = cola;
        
        while (temporal != null) {   
            nombreNodo = Utilidad.formatearTexto(temporal);
            nombreAnterior = Utilidad.formatearTexto(temporal.getAnterior());
            nombreSiguiente = Utilidad.formatearTexto(temporal.getSiguiente());
            
            
            salida.addElement(nombreAnterior + "<= Anterior[" + nombreNodo + "Lista Doble ["
                    + indice + "] = " + temporal.getDato() + "]Siguiente => " + nombreSiguiente);
            
            temporal = temporal.getAnterior();
            indice-=1;
            
        }
    }

    @Override
    public Nodo eliminar() { 
                Nodo eliminado;
                int tamano = cantidadElementos();
                
                if (tamano == 1) {
                    eliminado = cabeza;
            
        } else {
                    eliminado = cola;
                    cola.getAnterior();
                    cola.setSiguiente(null);
        }

            
        return eliminado;
    }

    @Override
    public Nodo eliminar(int posicion) {
        Nodo eliminado;
        
        int tamano = cantidadElementos();
        
        if (tamano == 0) {
            eliminado = cabeza;
            if (tamano == 1) {
                resetearLista();
                
            } else {
                cabeza=cabeza.getSiguiente();
                cabeza.setAnterior(null);
                
            }
            
        } else {
            if (posicion == (tamano-1)) {
                eliminado = cola;
                cola = cola.getAnterior();
                cola.setSiguiente(null);
                        
                
            } else {
                Nodo temporal = cabeza;
                
                for (int i = 0; i < posicion; i++) {
                    temporal = temporal.getSiguiente();
                    
                }
                Nodo anterior = temporal.getAnterior();
                Nodo siguiente = temporal.getAnterior();
                
                eliminado = temporal;
                anterior.setSiguiente(siguiente);
                siguiente.setAnterior(anterior);
                 
            }
        }
        return eliminado;

        
    }

    @Override
    public Nodo buscarNodo(int posicion) {
        Nodo encontrado;
        
         if (posicion == 0) {
             encontrado = cabeza;
        } else {
            
            Nodo temporal = cabeza;
            for (int i = 0; i < posicion; i++) {
                temporal = temporal.getSiguiente();
            }
            encontrado = temporal;

            
        }
         return encontrado;
    }

    @Override
    public void actualizar(int posicion, Object datoCambiar) {
                if (posicion == 0) {
            cabeza.setDato(datoCambiar);
        } else {
            
            Nodo temporal = cabeza;
            for (int i = 0; i < posicion; i++) {
                temporal = temporal.getSiguiente();
            }

            temporal.setDato(datoCambiar);
        }
    }
    public Nodo buscarAnterior(Nodo nodoActual) {
        
    Nodo actual = cabeza;
    Nodo anterior = null;

    while (actual != null && actual != nodoActual) {
        anterior = actual;
        actual = actual.getSiguiente();
    }

    return anterior;
}
     
}
