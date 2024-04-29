package codigos;
import java.util.ArrayList;
import java.util.List;

public class Servicos {
	
	//ATRIBUTOS
	private boolean temWifi;
	private boolean aceitaPet;
	private boolean temAcademia;
	private boolean bar;
	private boolean cafeDaManha;
	private boolean temEstacionamento;
	private boolean temPicina;
	
	List<String> adicionais = new ArrayList<>();
	List<String> idiomas = new ArrayList<>();
	List<String> regras = new ArrayList<>();
	
	
	//CONSTRUTOR
	public Servicos(boolean temWifi, boolean aceitaPet, boolean temAcademia, boolean bar, boolean cafeDaManha, boolean temEstacionamento,boolean temPicina) {
		setTemWifi(temWifi);
		setAceitaPet(aceitaPet);
		setTemAcademia(temAcademia);
		setBar(bar);
		setCafeDaManha(cafeDaManha);
		setTemEstacionamento(temEstacionamento);
		setTemPicina(temPicina);
	}

	

	//GET AND SET
	public boolean isTemPicina() {
		return temPicina;
	}

	public void setTemPicina(boolean temPicina) {
		this.temPicina = temPicina;
	}
	
	public boolean isTemWifi() {

		return temWifi;
	}
	public void setTemWifi(boolean temWifi) {

		this.temWifi = temWifi;
	}


	public boolean isAceitaPet() {
		return aceitaPet;
	}


	public void setAceitaPet(boolean aceitaPet) {
		this.aceitaPet = aceitaPet;
	}


	public boolean isTemAcademia() {
		return temAcademia;
	}


	public void setTemAcademia(boolean temAcademia) {
		this.temAcademia = temAcademia;
	}


	public boolean isBar() {
		return bar;
	}


	public void setBar(boolean bar) {
		this.bar = bar;
	}


	public boolean isCafeDaManha() {
		return cafeDaManha;
	}


	public void setCafeDaManha(boolean cafeDaManha) {
		this.cafeDaManha = cafeDaManha;
	}


	public boolean isTemEstacionamento() {
		return temEstacionamento;
	}


	public void setTemEstacionamento(boolean temEstacionamento) {
		this.temEstacionamento = temEstacionamento;
	}


	public List<String> getAdicionais() {
		return adicionais;
	}


	public void setAdicionais(List<String> adicionais) {
		this.adicionais = adicionais;
	}


	public List<String> getIdiomas() {
		return idiomas;
	}


	public void setIdiomas(List<String> idiomas) {
		this.idiomas = idiomas;
	}


	public List<String> getRegras() {
		return regras;
	}


	public void setRegras(List<String> regras) {
		this.regras = regras;
	};
	
	//METODOS
	//adicionar mais servicos
	public void servicosAdicionais(String servico) {
		if(servico.length() > 0) {
			adicionais.add(servico);
		}	
	}
	//adicionar idiomas 
	public void idiomasFalados(String idioma) {
		if(idioma.length() > 0) {
			idiomas.add(idioma);
		}
	}
	//Adicionar regras do hotel
	public void regrasDoHotel(String regra) {
		if(regra.length() > 0) {
			regras.add(regra);
		}
	}
	
}
