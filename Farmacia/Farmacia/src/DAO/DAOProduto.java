package DAO;

import Produto.Medicamento;

public interface DAOProduto {

	public void cadastraMedicamento(Medicamento m);
	
	public Medicamento buscaMedicamento(String nome);
	
	public void atualizaEstoque();
	
}
