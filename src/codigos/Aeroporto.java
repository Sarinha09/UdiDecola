package codigos;
import java.io.Serializable;

public class Aeroporto implements Serializable{
	private String cidade;	
	private String estado;
	private String pais;
	private String nomeAeroporto;
	private String codigoAeroporto;
	
	
	//CONSTRUTO
	public Aeroporto (String nomeAeroporto, String cidade, String estado, String pais, String codigoAeroporto) {
		setCidade(cidade);
		setEstado(estado);
		setPais(pais);
		setNomeAeroporto(nomeAeroporto);
		setCodigoAeroporto(codigoAeroporto);
	}
        
        public Aeroporto(){}
	
	//GET E SET
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		if(estado.length() > 0) {
			this.estado = estado;
		}
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		if(pais.length() > 0) {
			this.pais = pais;
		}
	}

	public String getCodigoAeroporto() {
		return codigoAeroporto;
	}

	public void setCodigoAeroporto(String codigoAeroporto) {
		if(codigoAeroporto.length() > 0) {
			this.codigoAeroporto = codigoAeroporto;
		}	
	}

	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		if(cidade.length() > 0) {
			this.cidade = cidade;
		}
	}
	public String getNomeAeroporto() {
		return nomeAeroporto;
	}
	public void setNomeAeroporto(String nomeAeroporto) {
		if(nomeAeroporto.length() > 0) {
			this.nomeAeroporto = nomeAeroporto;
		}		
	}
	
	
}
