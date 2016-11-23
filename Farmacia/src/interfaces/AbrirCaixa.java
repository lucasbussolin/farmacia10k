package interfaces;

import Vendas.Caixa;
import pessoas.Usuario;

public interface AbrirCaixa {

    public void abrirCaixa(Caixa cx);

    public void adicionarCedulas(Caixa cx);

    public void adicionarMoedas(Caixa cx);

    public boolean verificarSenha(Usuario usr);

}