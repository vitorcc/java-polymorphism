
public class Veiculo {
	
	private String montadora;
	private String modelo;
	private int ano;
	private String cor;
	
	public void emitirGuiaSeguro() {
		System.out.println("Emitindo Guia do Seguro do VEÍCULO.");
	}
	
	public String getMontadora() {
		return montadora;
	}
	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

}
