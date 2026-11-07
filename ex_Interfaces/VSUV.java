package ex_Interfaces;

public class VSUV extends Veiculo {

	public VSUV(int id, float combustivel) {
		super(id, combustivel);
	}

	@Override
	protected float getCapacidadeMaxima() {
		return 90;
	}

	@Override
	protected String getTipoVeiculo() {
		return "Veículo SUV";
	}

	
	
}
