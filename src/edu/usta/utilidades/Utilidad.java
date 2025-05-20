package edu.usta.utilidades;

import edu.usta.clases.Nodo;

public class Utilidad {

    public static String formatearTexto(Nodo objetico) {
        String salida, miTexto;

        if (objetico == null) {
            return "Null";
        } else {
            miTexto = objetico.toString();
            salida = miTexto.substring(miTexto.indexOf('@') + 1);
        }
        return salida;
    }

}
