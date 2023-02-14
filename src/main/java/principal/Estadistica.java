package principal;

import java.util.ArrayList;

public class Estadistica {

    public float media(float[] lista){

        if(lista.length == 0 ){
            return 0;
        }
        float media = 0;
        for(int i = 0;i<lista.length;i++){
            media += lista[i];
        }
        return media/lista.length;
    }

    public float varianza(float[] lista){
        if(lista.length == 0 ){
            return 0;
        }
        float media = media(lista);
        float varianza = 0;
        for(int i = 0; i<lista.length;i++){
            varianza += Math.pow(lista[i]-media,2);
        }
        return varianza/lista.length;
    }

    public float desviacionEstandar(float[] lista){
        if(lista.length == 0 ){
            return 0;
        }
        float varianza = varianza(lista);
        return (float) Math.sqrt(varianza);

    }


}