package principal;

import org.junit.jupiter.api.DisplayName;


import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class EstadisticaTest {
    private final float[] casoVacio = {}; //Lista vacia
    private final float[] casoCorrecto = {1,2,3,4};
    private final float[] caso1Elemento = {1};
    private final float[] caso0 = {0,0,0,0,0};

    @org.junit.jupiter.api.Test
    @DisplayName("Test de la media")
    void media() {
        System.out.println("TEST DE LA MEDIA");
        Estadistica obj=new Estadistica();
        float obtenido=obj.media(casoVacio);

        //Primera prueba: caso vacio
        System.out.println("Caso 1: vector vacio");
        assertEquals(0,obtenido);
        System.out.println("Salida esperada: " + 0.0);
        System.out.println("Salida obtenida: " + obtenido);

        System.out.println("--------------------");

        //Segunda prueba: 1 elemento vector

        System.out.println("Caso 2: 1 elemento en el vector");
        obtenido=obj.media(caso1Elemento);
        assertEquals(1,obtenido);
        System.out.println("Salida esperada: " + 1.0);
        System.out.println("Salida obtenida: " + obtenido);

        System.out.println("--------------------");

        //Tercera prueba: resultado 0

        System.out.println("Caso 3: resultado es 0");
        obtenido=obj.media(caso0);
        assertEquals(0,obtenido);
        System.out.println("Salida esperada: " + 0.0);
        System.out.println("Salida obtenida: " + obtenido);

        System.out.println("--------------------");

        //Cuarta prueba: resultado correcto

        System.out.println("Caso 4: resultado correcto");
        obtenido=obj.media(casoCorrecto);
        assertEquals(2.5,obtenido);
        System.out.println("Salida esperada: " + 2.5);
        System.out.println("Salida obtenida: " + obtenido);
        System.out.println("--------------------");
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Test de la varianza")
    void varianza() {
        System.out.println("TEST DE LA VARIANZA");
        Estadistica obj=new Estadistica();
        float obtenido=obj.varianza(casoVacio);

        //Primera prueba: caso vacio
        System.out.println("Caso 1: vector vacio");
        assertEquals(0,obtenido);
        System.out.println("Salida esperada: " + 0.0);
        System.out.println("Salida obtenida: " + obtenido);

        System.out.println("--------------------");

        //Segunda prueba: 1 elemento vector

        System.out.println("Caso 2: 1 elemento en el vector");
        obtenido=obj.varianza(caso1Elemento);
        assertEquals(0,obtenido);
        System.out.println("Salida esperada: " + 1.0);
        System.out.println("Salida obtenida: " + obtenido);

        System.out.println("--------------------");

        //Tercera prueba: resultado 0

        System.out.println("Caso 3: resultado es 0");
        obtenido=obj.varianza(caso0);
        assertEquals(0,obtenido);
        System.out.println("Salida esperada: " + 0.0);
        System.out.println("Salida obtenida: " + obtenido);

        System.out.println("--------------------");

        //Cuarta prueba: resultado correcto

        System.out.println("Caso 4: resultado correcto");
        obtenido=obj.varianza(casoCorrecto);
        assertEquals(1.25,obtenido);
        System.out.println("Salida esperada: " + 1.25);
        System.out.println("Salida obtenida: " + obtenido);
        System.out.println("--------------------");
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Test de la desviacion Estandar    ")
    void desviacionEstandar() {
        System.out.println("TEST DE LA DESVIACION ESTANDAR");
        Estadistica obj=new Estadistica();

        //Primera prueba: caso vacio
        System.out.println("Caso 1: vector vacio");
        float obtenido=obj.desviacionEstandar(casoVacio);
        assertEquals(0,obtenido);
        System.out.println("Salida esperada: " + 0.0);
        System.out.println("Salida obtenida: " + obtenido);

        System.out.println("--------------------");

        //Segunda prueba: 1 elemento vector

        System.out.println("Caso 2: 1 elemento en el vector");
        obtenido=obj.desviacionEstandar(caso1Elemento);
        assertEquals(0,obtenido);
        System.out.println("Salida esperada: " + 1.0);
        System.out.println("Salida obtenida: " + obtenido);

        System.out.println("--------------------");

        //Tercera prueba: resultado 0

        System.out.println("Caso 3: resultado es 0");
        obtenido=obj.desviacionEstandar(caso0);
        assertEquals(0,obtenido);
        System.out.println("Salida esperada: " + 0.0);
        System.out.println("Salida obtenida: " + obtenido);

        System.out.println("--------------------");

        //Cuarta prueba: resultado correcto

        System.out.println("Caso 4: resultado correcto");
        obtenido=obj.desviacionEstandar(casoCorrecto);
        assertEquals(1.1180340051651,obtenido,0.001);
        System.out.println("Salida esperada: " + 1.25);
        System.out.println("Salida obtenida: " + obtenido);
        System.out.println("--------------------");
    }
}