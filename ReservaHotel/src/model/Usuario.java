package model;


//import java.security.NoSuchAlgorithmException;


import Util.FuncaoHASH;

public class Usuario{
	private String Email, Senha, Nome, Cpf; 
	FuncaoHASH hash = new FuncaoHASH();

	public Usuario(String Nome, String Email, String Senha, String Cpf)  {
		this.Nome = Nome;
		this.Email = Email;
		this.Senha = Senha;
		this.Cpf = Cpf;
		}

	public Usuario(String Nome, String Cpf, String Senha) {
		// TODO Auto-generated constructor stub
	}

	public static Object getSenha() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object getCpf() {
		// TODO Auto-generated method stub
		return null;
	}


}