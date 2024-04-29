package persistencia;

import Dados.DadosCliente;
import Dados.DadosCompanhia;
import Dados.DadosFuncionario;
import codigos.Cliente;
import codigos.CompanhiaAerea;
import codigos.Funcionario;
import java.math.BigDecimal;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.sql.PreparedStatement;



public class conexao {

    private String url;
    private String usuario;
    private String senha;
    private static Connection con;

    public conexao() {
        url = "jdbc:postgresql://localhost:5432/banco";
        usuario = "postgres";
        senha = "admin";

        try {

            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada");

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        carregarClientes();
        carregarFuncionarios();
    }
    
    
    //Clientes
    public void  carregarClientes() {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM clientes");

            while (rs.next()) {
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String endereco = rs.getString("endereco");
                String dataNasci = rs.getString("datanacimento");
                String email = rs.getString("email");
                String senha = rs.getString("senha");
                String dataconta = rs.getString("dataconta");
                
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate dataNascimento = LocalDate.parse(dataNasci, formatter);
                LocalDate dataConta = LocalDate.parse(dataNasci, formatter);
                
                Cliente cliente = new Cliente(nome, cpf, endereco, dataNascimento, email, senha, dataConta);

                DadosCliente.adicionarCliente(cliente);
            }

            rs.close();
            stmt.close();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
   public static void inserirClienteBanco(Cliente cliente) {
        String sql = "INSERT INTO clientes (cpf, nome, endereco, datanacimento, email, senha, dataconta) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, cliente.getCpf());
            pstmt.setString(2, cliente.getNome());
            pstmt.setString(3, cliente.getEndereco());
            pstmt.setString(4, String.valueOf(cliente.getDataNasc()));
            pstmt.setString(5, cliente.getEmail());
            pstmt.setString(6, cliente.getSenha());
            pstmt.setString(7, String.valueOf(cliente.getDataCadastro()));

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
   
   //Funcionarios
   
       public void  carregarFuncionarios() {
            try {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM funcionarios");

                while (rs.next()) {
                    String nome = rs.getString("nome");
                    String cpf = rs.getString("cpf");
                    String endereco = rs.getString("endereco");
                    String dataNasci = rs.getString("datanascimento");
                    String senha = rs.getString("senha");
                    System.out.println("Data Nascimento String: " + dataNasci);
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate dataNascimento = LocalDate.parse(dataNasci, formatter);
                    String numero = rs.getString("numerocarteira");
                    String salarioS = rs.getString("salario");
                    float salario = Float.parseFloat(salarioS);

                    Funcionario funcionario = new Funcionario(nome, cpf, endereco, dataNascimento, numero, senha, salario);

                    DadosFuncionario.adicionarFuncionario(funcionario);
                }

                rs.close();
                stmt.close();
            } 
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
       
       public static void inserirFuncionarioBanco(Funcionario funcionario) {
        String sql = "INSERT INTO funcionarios (nome, cpf, endereco, datanascimento, numerocarteira, senha, salario) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, funcionario.getNome());
            pstmt.setString(2, funcionario.getCpf());
            pstmt.setString(3, funcionario.getEndereco());
            pstmt.setString(4, String.valueOf(funcionario.getDataNasc()));
            pstmt.setString(5, funcionario.getNumeroCarteira());
            pstmt.setString(6, funcionario.getSenha());
            pstmt.setString(7, String.valueOf(funcionario.getSalarioFixo()));
           

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
       
       public static void removerFuncionarioBanco(String numero) {
            String sql = "DELETE FROM funcionarios WHERE numerocarteira = ?";
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setString(1, numero);
                pstmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
      
       public static void atualizarSalarioFuncionario(String numero, float novoSalario) {
            String sql = "UPDATE funcionarios SET salario = ? WHERE numerocarteira = ?";
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                pstmt.setFloat(1, novoSalario);
                pstmt.setString(2, numero);

                int rowsUpdated = pstmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }


    
    

}
