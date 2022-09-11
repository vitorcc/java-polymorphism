
public class Moto extends Veiculo {	

	private int cilindradas;
	
	public void emitirGuiaSeguro() {
		System.out.println("Emitindo Guia do Seguro da MOTO.");
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

}
