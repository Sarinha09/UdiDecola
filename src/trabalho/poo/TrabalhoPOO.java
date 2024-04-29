package trabalho.poo;

import Dados.*;
import codigos.Aeroporto;
import codigos.CompanhiaAerea;
import codigos.Funcionario;
import codigos.TrechoVoo;
import java.io.IOException;
import java.util.ArrayList;
import menus.Inicial;
import persistencia.PersistenciaArquivo;
import persistencia.conexao;

public class TrabalhoPOO {

    public static void main(String[] args) throws IOException {
        
        try {
            ArrayList<CompanhiaAerea> companhiasRecuperadas = (ArrayList<CompanhiaAerea>) PersistenciaArquivo.recuperar("src/arquivos/companhiaAerea.dat");
            DadosCompanhia.getCompanhia().clear();
            DadosCompanhia.getCompanhia().addAll(companhiasRecuperadas);
            
            ArrayList<Aeroporto> aeroportoRecuperadas = (ArrayList<Aeroporto>) PersistenciaArquivo.recuperar("src/arquivos/aeroportos.dat");
            DadosAeroporto.getListaAeroporto().clear();
            DadosAeroporto.getListaAeroporto().addAll(aeroportoRecuperadas);
            
            ArrayList<TrechoVoo> trechosRecuperadas = (ArrayList<TrechoVoo>) PersistenciaArquivo.recuperar("src/arquivos/trechosVoo.dat");
            DadosTrechosVoo.getListaTrechoVoo().clear();
            DadosTrechosVoo.getListaTrechoVoo().addAll(trechosRecuperadas);
            
            ArrayList<Funcionario> funcionarioRecuperadas = (ArrayList<Funcionario>) PersistenciaArquivo.recuperar("src/arquivos/funcionario.dat");
            DadosFuncionario.getlistFuncionario().clear();
            DadosFuncionario.getlistFuncionario().addAll(funcionarioRecuperadas);
            
            
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        
        
        conexao con = new conexao();
        
        Inicial inicial = new Inicial();
        inicial.setLocationRelativeTo(null);
        inicial.setVisible(true);
        inicial.setResizable(false);
      
    }
    
}
