package produto;

import interfaces.StrategyContabeis;

public class Estoque extends Medicamento implements StrategyContabeis {

    public Estoque() {
    
    }

    private int limiteEstoque;
    private int quantidadeTotal;

    
    
    public int getLimiteEstoque() {
		return limiteEstoque;
	}

	public void setLimiteEstoque(int limiteEstoque) {
		this.limiteEstoque = limiteEstoque;
	}

	public int getQuantidadeTotal() {
		return quantidadeTotal;
	}

	public void setQuantidadeTotal(int quantidadeTotal) {
		this.quantidadeTotal = quantidadeTotal;
	}

	public Estoque getEstoque() {
        return null;
    }

    public Estoque setEstoque(Estoque est) {
        return null;
    }

    public int calculaQuantidade() {
        return 0;
    }

    public String organizaInformacoes() {
        return "";
    }

    public void atualizar() {

    }

}