package devmedia.springmvc.vitrinedecarros.model;

public class Carro {
	private String modelo;
	private String marca;
	private String ano;

	public String getModelo() {
		return modelo;
	}
	
	public Carro(String modelo, String marca, String ano) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	
}
