package controle;

import dao.DAOProduto;
import produto.DAOProdutoImpl;
import produto.Medicamento;

public class CtlMedicamento {

	public CtlMedicamento() {

	}

	public void salvarMedicamento(Medicamento mdc) {
		System.out.println(".....");
		DAOProduto dao = new DAOProdutoImpl();
		dao.cadastraMedicamento(mdc);
	}

	public boolean checarValidade(Medicamento mdc) {
		return false;
	}

	public Medicamento buscarMedicamento(String nome) {
		return null;
	}

}