package codigos;
import java.io.Serializable;
import java.time.LocalDate;
public abstract class  Pessoa implements Serializable {
        private String nome;
        private String cpf;
        private String endereco;
        private LocalDate dataNasc;
        private String senha;

        public Pessoa(){}
        public Pessoa(String nome, String cpf){
            setCpf(cpf);
            setNome(nome);
        }
        public Pessoa(String nome, String cpf, String endereco, LocalDate dataNasc,String senha){
            setNome(nome);
            setCpf(cpf);
            setEndereco(endereco);
            setDataNasc(dataNasc);
            setSenha(senha);
        }

        // ---- setters ----
        private void setNome(String nome){
            if(nome.length() > 0){
                this.nome = nome;
            }
        }
        private void setCpf(String cpf){
            if(validarCpf(cpf)){
                this.cpf = cpf;
            }
        }

        private void setEndereco(String endereco){
            if(endereco.length() > 0) {
                this.endereco = endereco;
            }
        }
        private void setDataNasc(LocalDate dataNasc) {
            this.dataNasc = dataNasc;
        }
        
        private void setSenha(String senha) {
            if(senha.length() > 0){
                this.senha = senha;
            }
        }

        //---- getters ----
        public String getNome() {
            return nome;
        }
        public String getCpf(){
            return cpf;
        }
        public String getEndereco(){
            return endereco;
        }
        public LocalDate getDataNasc() {
            return dataNasc;
        }
        public String getSenha(){
            return senha;
                }


        //---- metodos ----
        public static boolean validarCpf(String cpf) {
            cpf = cpf.replaceAll("[^\\d]", "");
            if (cpf.length() != 11) {
                return false;
            }
            boolean digitosIguais = true;
            for (int i = 1; i < cpf.length(); i++) {
                if (cpf.charAt(i) != cpf.charAt(0)) {
                    digitosIguais = false;
                    break;
                }
            }

            if (digitosIguais) {
                return false;
            }

            int soma = 0;
            for (int i = 0; i < 9; i++) {
                int digito = Character.getNumericValue(cpf.charAt(i));
                soma += digito * (10 - i);
            }
            int digito1 = 11 - (soma % 11);
            if (digito1 > 9) {
                digito1 = 0;
            }
            if (Integer.parseInt(cpf.substring(9, 10)) != digito1) {
                return false;
            }

            soma = 0;
            for (int i = 0; i < 10; i++) {
                soma += Integer.parseInt(cpf.substring(i, i + 1)) * (11 - i);
            }
            int digito2 = 11 - (soma % 11);
            if (digito2 > 9) {
                digito2 = 0;
            }
            if (Integer.parseInt(cpf.substring(10)) != digito2) {
                return false;
            }
            return true;
        }
}

