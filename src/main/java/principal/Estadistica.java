package principal;

import java.util.ArrayList;

public class Estadistica {

    public float media(ArrayList<Float> lista){

        if(lista.size() == 0 ){
            return 0;
        }
        float media = 0;
        for(int i = 0;i<lista.size();i++){
            media += lista.get(i);
        }
        return media/lista.size();
    }

    public float varianza(ArrayList<Float> lista){
        if(lista.size() == 0 ){
            return 0;
        }
        float media = media(lista);
        float varianza = 0;
        for(int i = 0; i<lista.size();i++){
            varianza += Math.pow(lista.get(i)-media,2);
        }
        return varianza/lista.size();
    }

    public float desviacionEstandar(ArrayList<Float> lista){
        if(lista.size() == 0 ){
            return 0;
        }
        float varianza = varianza(lista);
        return (float) Math.sqrt(varianza);

    }


}