package controle;

import java.util.Date;

import produto.Medicamento;

public class Teste {

	public static void main(String[] args) {
		Medicamento mdc = new Medicamento();
		mdc.setNome("naosei");
		mdc.setFabricante("fabricantessss");
		mdc.setValorUnitario(10.0);
		mdc.setDescricao("Vai q vai");
		
		CtlMedicamento m = new CtlMedicamento();
		m.salvarMedicamento(mdc);
	}

}
