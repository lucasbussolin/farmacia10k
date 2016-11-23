package Pessoas;

import Interfaces.AbrirCaixa;

public class Usuario {

    public Usuario() {

    }

    private String cargo;
    private String senha;

    
    
    public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void getUsuario() {

    }

    public void setUsuario() {

    }

    public boolean abreCaixa(AbrirCaixa ac) {
        return false;
    }

}