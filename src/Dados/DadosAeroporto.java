
package Dados;

import codigos.Aeroporto;
import java.util.ArrayList;

public class DadosAeroporto {
    
    private static ArrayList<Aeroporto> listaAeroporto = new ArrayList<>();
    
      public static void adicionarAeroporto(Aeroporto aeroporto) {
        listaAeroporto.add(aeroporto); 
    }
      
      public static ArrayList<Aeroporto> getListaAeroporto(){
          return listaAeroporto;
      }
    
}
