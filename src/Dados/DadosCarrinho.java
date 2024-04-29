
package Dados;

import codigos.ItemCarrinho;
import codigos.Quarto;
import codigos.Voo;
import java.util.ArrayList;
import java.util.List;

public class DadosCarrinho {
     private static List<ItemCarrinho> listaCarrinho = new ArrayList<>();
     
   
    public static void adicionarVoo(Voo voo, int qtd) {
        listaCarrinho.add(new ItemCarrinho(voo, qtd));
    }
    
    public static void adicionarQuarto(Quarto quarto, int qtd) {
        listaCarrinho.add(new ItemCarrinho(quarto, qtd));
    }
    
    public static List<ItemCarrinho> getListaCarrinho(){
        return listaCarrinho;
    }
     
    public static void esvaziarCarrinho() {
        listaCarrinho.clear();
    }
    
}
