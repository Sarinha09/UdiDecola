package Dados;

import codigos.Funcionario;
import java.util.ArrayList;

public class DadosFuncionario {
    private static ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
    
    public static void adicionarFuncionario(Funcionario funcionario) {
        listaFuncionario.add(funcionario); 
    }
    
    public static Funcionario buscar(String numero) {
        Funcionario funcionario = null;
        for ( Funcionario f: listaFuncionario) {
            if (f.getNumeroCarteira().equals(numero)) {
                 funcionario = f;
                 break;
            }
        }
        return funcionario;
    }
    
    public static ArrayList<Funcionario> getlistFuncionario(){
        return listaFuncionario;
    }
    
    public static boolean excluir(String numero){
        Funcionario funcionario = buscar(numero);
        if (funcionario != null) {
            listaFuncionario.remove(funcionario);
        return true;
        }
        else {
            return false;
        }
    }
    
}
