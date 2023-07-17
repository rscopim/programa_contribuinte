package entities;

public class Individual extends TaxaPagamento{

	private Double gastosComSaude;
	
	public Individual() {
		super();
	}

	public Individual(String nome, Double rendimentoAnual, Double gastosComSaude) {
		super(nome, rendimentoAnual);
		this.gastosComSaude = gastosComSaude;
	}

	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public double imposto() {
		double taxaImposto;
		if (getGastosComSaude() < 20000.0) {
			taxaImposto = getRendimentoAnual() * 0.15;
		}
		else {
			taxaImposto = getRendimentoAnual() * 0.25;
		}
		taxaImposto = taxaImposto - (getGastosComSaude() * 0.5);
		if (taxaImposto < 0.0) {
			taxaImposto = 0.0;
		}
		return taxaImposto;
	}
	
	
}
