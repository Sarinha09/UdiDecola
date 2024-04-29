package codigos;
import Dados.DadosCarrinho;
import codigos.Quarto;
import codigos.Voo;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Compra {
    private float DESCONTO_VIP = GerenciadorGeral.getDescontoVip();
    private Cliente cliente;
    private Voo passagem;
    private Quarto diaria;
    private int qtdPassagem;
    private LocalDate dataCompra;
    private float totalCompra;
    private String formaPagamento;
    private LocalTime horaCompra;

    public Compra(Cliente cliente, Voo passagem, LocalDate dataCompra, LocalTime horaCompra) {
        setCliente(cliente);
        setVoo(passagem);
        setHoraCompra(horaCompra);
        setDataCompra(dataCompra);
    }


    //---- setters ----
    public void setHoraCompra(LocalTime horaCompra) {
        this.horaCompra = horaCompra;
    }
    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public void setCliente(Cliente cliente) {
        if(cliente != null) {
            this.cliente = cliente;
        }
    }

    public void setVoo(Voo passagem) {
        if(passagem != null) {
            this.passagem = passagem;
        }
    }

    public void setQuarto(Quarto diaria) {
        if(diaria != null) {
            this.diaria = diaria;
        }
    }

    public void setQtdPassagem(int qtdPassagem) {
        if(qtdPassagem > 0) {
            this.qtdPassagem = qtdPassagem;
        }
    }


    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public void setTotalCompra(float totalCompra) {
        if(totalCompra > 0) {
            this.totalCompra = totalCompra;
        }
    }

    // ---- getters -----
    public Cliente getCliente() {
        return cliente;
    }

    public Voo getPassagem() {
        return passagem;
    }

    public Quarto getDiaria() {
        return diaria;
    }

    public int getQtdPassagem() {
        return qtdPassagem;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public LocalTime getHoraCompra() {

        return horaCompra;
    }

    public float getTotalCompra() {
        return totalCompra;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }
    
   


    // ---- métodos ----
   

    /*
    Percorre toda lista carrinho em loop, e verifica se o tipo do item do carrinho é do
    objeto voo ou quarto, adiciona o valor total de acordo com o item
    */
    public static float calcularTotalCarrinho() {
        float total = 0;
        for (ItemCarrinho item : DadosCarrinho.getListaCarrinho()) {
            if (item.getItem() instanceof Voo) {
                total += ((Voo) item.getItem()).getValorPassagem() * item.getQuantidade();
            }
            else if (item.getItem() instanceof Quarto) {
                total += (((Quarto) item.getItem()).getValorDiaria() * item.getQuantidade());
            }
        }
        return total;
    }
    //CALCULOS DE TAXA
    public static float calcularTaxaTotal() {
        float taxaVoo = 0.0f;
        float taxaHotel = 0.0f;
        for (ItemCarrinho item : DadosCarrinho.getListaCarrinho()) {
            Object objeto = item.getItem();
            if (objeto instanceof Voo) {
                taxaVoo += ((Voo) objeto).getValorPassagem() * GerenciadorGeral.getTaxaVoo();
            } else if (objeto instanceof Quarto) {
                taxaHotel+= ((Quarto) objeto).getValorDiaria() * GerenciadorGeral.getTaxaHotel();
            }
        }
        return taxaVoo + taxaHotel;
    }

    //calcula o lucro
    public float Lucro() {
        float total = calcularTotalCarrinho();
        float taxaTotal = calcularTaxaTotal();
        return total - taxaTotal;
    }

    /*
      Calcula o total da compra e seta no cliente
    */
    public float calcularCompraVip(){
        float total = calcularTotalCarrinho();
        float descontoVip = total * DESCONTO_VIP;
        float totalVip = total - descontoVip;
        return totalVip;
    }
    
    public void AtualizarCompras(){
        cliente.setTotalCompra();
    }

    public void efetuarPedido(String formaPagamento){
        if(cliente.isVip()){
            calcularCompraVip();
        }
        else {
            calcularTotalCarrinho();
        }

        setFormaPagamento(formaPagamento);
        passagem.darBaixaVagas(qtdPassagem);
        //alugar quarto
        for (ItemCarrinho item : DadosCarrinho.getListaCarrinho()) {
            if (item.getItem() instanceof Quarto) {
                Quarto quarto = (Quarto) item.getItem();
                Hotel.alugarQuarto(quarto.getTipo(), item.getDataInicio(), item.getDataFim());
            }
        }

        //atualiza a quantidade de compras
        AtualizarCompras();
    }
    
    public void clienteVipSet(){
        if(cliente.isVip()){
            String nome = cliente.getNome();
            String cpf = cliente.getCpf();
            String email = cliente.getEmail();
            String senha = cliente.getSenha();
            LocalDate data = cliente.getDataNasc();
            LocalDate dataCadastro = cliente.getDataCadastro();
            String endereco = cliente.getEndereco();
            
            
           Cliente clientevip = new ClienteVip(nome, cpf, endereco, data, email, senha);
        
        }
    
    }
    
    
    public static String gerarPix() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder codigo = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int index = random.nextInt(caracteres.length());
            codigo.append(caracteres.charAt(index));
        }

        return codigo.toString();
    }
    
  
    
}

