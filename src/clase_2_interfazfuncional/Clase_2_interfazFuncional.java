
package clase_2_interfazfuncional;

import java.util.ArrayList;
import java.util.List;


public class Clase_2_interfazFuncional {

    public static void main(String[] args) {
        List<String> listaOriginal = new ArrayList<>();
        listaOriginal.add("hola");
        listaOriginal.add("como");
        listaOriginal.add("estas");        
        listaOriginal.add("estoy");
        listaOriginal.add("trabajando");
        listaOriginal.add("mucho");

        Transformador aMayusculas = String::toUpperCase;

        List<String> listaTransformada = TransformadorLetras.transformarLista(listaOriginal, aMayusculas);

        System.out.println("Lista original: " + listaOriginal);
        System.out.println("Lista transformada: " + listaTransformada);
    
    }


    }
    
