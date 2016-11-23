package dao;

import pessoas.Cliente;
import pessoas.Usuario;

public interface DAOPessoa {
	
	public void validaUsuario(String senha);
	
	public void cadastraUsuario(Usuario u);
	
	public void cadastraCliente(Cliente c);
	
	public Cliente buscaCliente(String cpf);

}
