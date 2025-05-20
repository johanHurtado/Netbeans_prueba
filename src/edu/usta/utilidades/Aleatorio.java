package edu.usta.utilidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Aleatorio {

    public static Integer numeroEntero(int inicio, int fin) {
        int valor;
        Random aleatorio = new Random();
        // valor = aleatorio.nextInt(fin - inicio + 1) + inicio;
        valor = aleatorio.nextInt(inicio, fin + 1);
        return valor;
    }

    public static Double numeroDoble(int inicio, int fin) {
        Double valor;
        Random aleatorio = new Random();
        valor = aleatorio.nextDouble(inicio, fin + 1);
        valor = Math.round(valor * 100.0) / 100.0;
        return valor;
    }

    public static String texto(int cantCarateres) {
        char caracter;
        String cadenaTexto, diccionario;
        int i, posicion, limiteDiccionario;

        cadenaTexto = "";
        diccionario = "abcdefghijklmnopqrstuvwxyz";
        limiteDiccionario = diccionario.length() - 1;

        for (i = 0; i < cantCarateres; i++) {
            posicion = numeroEntero(0, limiteDiccionario);
            caracter = diccionario.charAt(posicion);
            cadenaTexto = cadenaTexto + caracter;
        }
        return cadenaTexto;
    }

    public static String fecha(Date fechaIni, Date fechaFin) {
        String patronFecha = "yyyy-MM-dd";
        int unDiaMili = 1000 * 60 * 60 * 24;
        SimpleDateFormat miFormato = new SimpleDateFormat(patronFecha);

        long inicioMili = fechaIni.getTime();
        long finMili = fechaFin.getTime() + unDiaMili;

        long aleatorioMili = ThreadLocalRandom.current().nextLong(inicioMili, finMili);
        Date fechaAleatoria = new Date(aleatorioMili);

        return miFormato.format(fechaAleatoria);
    }

}
