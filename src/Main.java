
public class Main {	
	
	public static void main(String[] args) {

		Veiculo veiculo = new Veiculo();		
		Moto moto = new Moto();		
		Carro carro = new Carro();		
		EmitirGuia emitirGuia = new EmitirGuia();
		
		emitirGuia.emitirGuia(veiculo);
		emitirGuia.emitirGuia(moto);
		emitirGuia.emitirGuia(carro);
	}
}
