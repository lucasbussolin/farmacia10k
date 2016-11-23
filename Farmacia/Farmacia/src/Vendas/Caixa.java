package Vendas;

import java.util.ArrayList;
import java.util.List;

public class Caixa {

    public Caixa() {
   
    }

    private double dinheironoCaixa;
    private List<Integer> quantidadeCedulas = new ArrayList<Integer>();
    private List<Integer> quantidadeNotas = new ArrayList<Integer>();
    
    

    public double getDinheironoCaixa() {
		return dinheironoCaixa;
	}

	public void setDinheironoCaixa(double dinheironoCaixa) {
		this.dinheironoCaixa = dinheironoCaixa;
	}

	public List<Integer> getQuantidadeCedulas() {
		return quantidadeCedulas;
	}

	public void setQuantidadeCedulas(List<Integer> quantidadeCedulas) {
		this.quantidadeCedulas = quantidadeCedulas;
	}

	public List<Integer> getQuantidadeNotas() {
		return quantidadeNotas;
	}

	public void setQuantidadeNotas(List<Integer> quantidadeNotas) {
		this.quantidadeNotas = quantidadeNotas;
	}

	public Caixa getCaixa() {
        return null;
    }

    public Caixa setCaixa(Caixa cx) {
        return null;
    }

    public double calculaDinheiro(ArrayList<Integer> cedulas, ArrayList<Integer> notas) {
        return 0.0d;
    }

}
