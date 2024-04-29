package Dados;

import codigos.CompanhiaAerea;
import java.util.ArrayList;
import java.util.List;

public class DadosCompanhia {
        private static ArrayList<CompanhiaAerea> listaCompanhia = new ArrayList<CompanhiaAerea>();
    
    public static void adicionarCompanhia(CompanhiaAerea companhia) {
        listaCompanhia.add(companhia); 
    }
    
  
    public static CompanhiaAerea buscar(String cnpj) {
        CompanhiaAerea companhia = null;
        for (CompanhiaAerea c : listaCompanhia) {
            String cnpjCompanhia = c.getCnpj();
            if (cnpjCompanhia != null && cnpjCompanhia.equals(cnpj)) {
                companhia = c;
                break;
            }
        }
     return companhia;
    }
    
     public static CompanhiaAerea buscarNome(String nome) {
        CompanhiaAerea companhia = null;
        for (CompanhiaAerea c : listaCompanhia) {
            String nomeCompanhia = c.getNomeDivulga();
            if (nomeCompanhia != null && nomeCompanhia.equals(nome)) {
                companhia = c;
                break;
            }
        }
     return companhia;
    }


    
    public static boolean excluir(String cnpj){
        CompanhiaAerea c = buscar(cnpj);
        if (c != null) {
            listaCompanhia.remove(c);
        return true;
        }
        else {
            return false;
        }
    }
    
    public static ArrayList<CompanhiaAerea> getCompanhia(){
        return listaCompanhia;
    }
    
}
