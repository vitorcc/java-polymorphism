
public class Carro extends Veiculo{
	
	private int qtdPortas;
	
	public void emitirGuiaSeguro() {
		System.out.println("Emitindo Guia do Seguro do CARRO.");
	}

	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}	

}
