
package clase_2_interfazfuncional;

import java.util.ArrayList;
import java.util.List;


public class TransformadorLetras {
     public static List<String> transformarLista(List<String> lista, Transformador transformador) {
        List<String> listaTransformada = new ArrayList<>();
        for (String elemento : lista) {
            String transformado = transformador.transformar(elemento);
            listaTransformada.add(transformado);
        }
        return listaTransformada;
     }
        

}
