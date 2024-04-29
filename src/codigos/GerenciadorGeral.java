package codigos;

public abstract class GerenciadorGeral {
    private static float TAXA_VOO;
    private static float TAXA_HOTEL;
    private static float PORCENTAGEM_PARCERIA;
    private static int numeroCompraVip;
    private static float DESCONTO_VIP;


    //---- Setters -----

    public static void setTaxaVoo(float taxaVoo) {
        if(taxaVoo > 0) {
            TAXA_VOO = taxaVoo;
        }
    }

    public static void setTaxaHotel(float taxaHotel) {
        if(taxaHotel > 0) {
            TAXA_HOTEL = taxaHotel;
        }
    }

    public static void setNumeroCompraVip(int numeroCompraVip) {
        if(numeroCompraVip > 0) {
            GerenciadorGeral.numeroCompraVip = numeroCompraVip;
        }
    }
    
    public static void setDescontoVip(float descontoVip){
        if(descontoVip > 0) {
          DESCONTO_VIP = descontoVip;
        }
    }

    //----- getters -----
    
    public static float getDescontoVip(){
        return DESCONTO_VIP;
    }

    public static float getTaxaVoo() {
        return TAXA_VOO;
    }

    public static float getTaxaHotel() {
        return TAXA_HOTEL;
    }

    public static float getPorcentagemParceria() {
        return PORCENTAGEM_PARCERIA;
    }

    public static int getNumeroCompraVip() {
        return numeroCompraVip;
    }

    // ---- metodos -----

   public static boolean validarFormatoHora(String hora) {
    return hora.matches("^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$");
}

}
