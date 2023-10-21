package lapiseira;

public class Lapiseira {
	private String marca;
	private String cor;
	private String grafite;
	public Lapiseira(String marca, String cor, String grafite) {
		super();
		this.marca = marca;
		this.cor = cor;
		this.grafite = grafite;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getGrafite() {
		return grafite;
	}
	public void setGrafite(String grafite) {
		this.grafite = grafite;
	}
	@Override
	public String toString() {
		return "Lapiseira [Marca = " + marca + ", Cor = " + cor + ", Grafite = " + grafite + "]";
	}
	
	

}
