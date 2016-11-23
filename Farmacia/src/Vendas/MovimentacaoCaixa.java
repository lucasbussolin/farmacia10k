package Vendas;

import java.util.*;

public class MovimentacaoCaixa {

    public MovimentacaoCaixa() {
 
    }

    private double valorTotalVendas;
    private Calendar horarioFechamento;
    private Calendar horarioAbertura;
    
    

    public double getValorTotalVendas() {
		return valorTotalVendas;
	}

	public void setValorTotalVendas(double valorTotalVendas) {
		this.valorTotalVendas = valorTotalVendas;
	}

	public Calendar getHorarioFechamento() {
		return horarioFechamento;
	}

	public void setHorarioFechamento(Calendar horarioFechamento) {
		this.horarioFechamento = horarioFechamento;
	}

	public Calendar getHorarioAbertura() {
		return horarioAbertura;
	}

	public void setHorarioAbertura(Calendar horarioAbertura) {
		this.horarioAbertura = horarioAbertura;
	}

	public double calculaValor() {
        return 0.0d;
    }

    public MovimentacaoCaixa getMovimento() {
        return null;
    }

    public void setMovimento(MovimentacaoCaixa mv) {
    }

}
