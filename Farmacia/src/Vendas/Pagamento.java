package Vendas;

import Enum.TipoPagamento;

public class Pagamento {

    public Pagamento() {
  
    }

    private double valorPago;
    private TipoPagamento tipo;
    private double desconto;

    
    
    public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public TipoPagamento getTipo() {
		return tipo;
	}

	public void setTipo(TipoPagamento tipo) {
		this.tipo = tipo;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public double gerarDesconto(TipoPagamento tipo) {
        return 0.0d;
    }

    public void getPagamento() {

    }

    public void setPagamento() {

    }

}