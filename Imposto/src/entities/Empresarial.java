package entities;

public class Empresarial extends TaxaPagamento{
	
	private Integer numeroDeFuncionarios;

	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public Empresarial(String nome, Double rendimentoAnual, Integer numeroDeFuncionarios) {
		super(nome, rendimentoAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public double imposto() {
		if (numeroDeFuncionarios > 10) {
			return getRendimentoAnual() * 0.14;
		}
		else {
			return getRendimentoAnual() * 0.16;
		}
	}
	

}
