package Vendas;

import java.util.*;

import Interfaces.StrategyContabeis;

public class Venda implements StrategyContabeis {

    public Venda() {
   
    }

    private Date data;

    public double geraValor() {
        return 0.0d;
    }

    public Venda getVenda() {
        return null;
    }

    public void setVenda(Venda vd) {

    }

    public void addComponente(ComponenteVenda cv) {

    }

    public ComponenteVenda removeComponente() {
        return null;
    }

    public ComponenteVenda getFilho() {
        return null;
    }

    public String organizaInformacoes() {
        return "";
    }

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}