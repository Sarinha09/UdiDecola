package Dados;

import codigos.TrechoVoo;
import java.util.ArrayList;

public class DadosTrechosVoo {
    private static ArrayList<TrechoVoo> listaTrechoVoo = new ArrayList<TrechoVoo>();
    
    public static void adicionarTrechoo(TrechoVoo trecho) {
        listaTrechoVoo.add(trecho); 
    }
    
    public static TrechoVoo buscarTrecho(String codigo) {
       TrechoVoo trecho = null;
       for ( TrechoVoo f: listaTrechoVoo) {
          if (f.getCodigo().equals(codigo)) {
              trecho = f;
              break;
           }
       }
        return trecho;
   }
    
    public static ArrayList<TrechoVoo> getListaTrechoVoo(){
        return listaTrechoVoo;
    }
    
   public static boolean excluir(String codigo){
        TrechoVoo trecho = buscarTrecho(codigo);
           if (trecho != null) {
            listaTrechoVoo.remove(trecho);
            return true;
           }
          else {
             return false;
           }
        }
    }
