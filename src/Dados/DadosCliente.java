package Dados;

import codigos.Cliente;
import java.util.ArrayList;
import java.util.List;

public class DadosCliente {
    private static ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
    
    public static void adicionarCliente(Cliente cliente) {
        listaCliente.add(cliente); 
    }
    
    public static List<Cliente> getCliente(){
       return listaCliente;
    }
    
    public static Cliente buscar(String cpf) {
        Cliente cliente = null;
        for ( Cliente c: listaCliente) {
            if (c.getCpf().equals(cpf)) {
                 cliente = c;
                 break;
            }
        }
        return cliente;
    }
    
    public static boolean excluir(String cpf){
        Cliente cliente = buscar(cpf);
        if (cliente != null) {
            listaCliente.remove(cliente);
        return true;
        }
        else {
            return false;
        }
    }
    
}

    
