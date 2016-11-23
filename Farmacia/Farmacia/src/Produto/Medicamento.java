package Produto;

import java.util.*;

import Interfaces.StrategyContabeis;
import Enum.TipoUnidade;

public class Medicamento extends Sujeito implements StrategyContabeis {

    public Medicamento() {
  
    }

    private String nome;
    private String fabricante;
    private Date validade;
    private double valorUnitario;
    private String descricao;
    private TipoUnidade tipo;

    
    
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Medicamento getMedicamento() {
        return null;
    }

    public Medicamento setMedicamento(Medicamento mdc) {
        return null;
    }

    public String organizaInformacoes() {
        return "";
    }

    public void addObserver(Observer o) {

    }

    public void removeObserver(Observer o) {

    }

    public void notificar() {

    }

	public TipoUnidade getTipo() {
		return tipo;
	}

	public void setTipo(TipoUnidade tipo) {
		this.tipo = tipo;
	}

}