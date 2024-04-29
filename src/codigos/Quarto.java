package codigos;

import java.io.Serializable;

public class Quarto implements Serializable{

    //ATRIBBUTOS
    private float valorDiaria;
    private double desconto;
    private double valorComDesconto;

    private TipoQuarto tipo;


    //CONSTRUTOR
    public Quarto(float valorDiaria, double desconto, TipoQuarto tipo) {
        setValorComDesconto();
        setValorDiaria(valorDiaria);
        setDesconto(desconto);
    }
    public Quarto(){}

    //---- setters ----

    public void setValorDiaria(float valorDiaria) {
        if(valorDiaria > 0) {
            this.valorDiaria = valorDiaria;
        }
    }
    public void setDesconto(double desconto) {
        if(desconto > 0) {
            this.desconto = desconto;
        }
    }
    public void setValorComDesconto() {
        if(desconto > valorDiaria) {
            this.valorComDesconto = valorDiaria - desconto;
        }
    }

    //----- getters ----
    public float getValorDiaria() {

        return valorDiaria;
    }
    public double getDesconto() {

        return desconto;
    }

    public TipoQuarto getTipo() {
        return tipo;
    }
    public double getValorComDesconto() {
        return valorComDesconto;
    }

    //METODOS



}
