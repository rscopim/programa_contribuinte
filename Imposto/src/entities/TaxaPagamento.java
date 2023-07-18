package entities;

public abstract class TaxaPagamento {
	
	private String nome;
	private Double rendimentoAnual;
	
	public TaxaPagamento() {
		}

	public TaxaPagamento(String nome, Double rendimentoAnual) {
		super();
		this.nome = nome;
		this.rendimentoAnual = rendimentoAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendimentoAnual() {
		return rendimentoAnual;
	}

	public void setRendimentoAnual(Double rendimentoAnual) {
		this.rendimentoAnual = rendimentoAnual;
	}
	
	public abstract double imposto();
}
