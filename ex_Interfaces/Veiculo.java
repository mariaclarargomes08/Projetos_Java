package ex_Interfaces;

public abstract class Veiculo implements IVeiculo{
  
	int id;
	float combustivel;
	
	@Override
	public void dirigir() {
		if (combustivel > 0) {
		System.out.println("O veículo está em movimento.");
		} else {
		System.out.println("Não há combustível.");
		}
		
	}
	@Override
	public boolean reabastecer(float quantidade) {
		if(quantidade>0 && (quantidade + combustivel)<this.getCapacidadeMaxima()){
		combustivel += quantidade;
		System.out.println("Nível atual de combustível após reabastecer: "+combustivel);
		return true;
		}else {
		System.out.println("Erro. Quantidade inválida.");
		return false;
		}
	}
	
	public Veiculo(int id, float combustivel) {
		super();
		this.id = id;
		this.combustivel = combustivel;
	}
	
	protected abstract float getCapacidadeMaxima(); 
	//Implementado pela subclasse para informar a capacidade máxima do tanque
	
	protected abstract String getTipoVeiculo();
	
}
