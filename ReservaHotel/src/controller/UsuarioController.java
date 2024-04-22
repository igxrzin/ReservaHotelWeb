package controller;
import java.util.ArrayList;

import model.Hotel;
import model.Usuario;
public class UsuarioController  {
	private String Senha;
	public String Email;
	private ArrayList<Usuario> usuarios;


	public UsuarioController(Hotel hotel) {
		// TODO Auto-generated constructor stub
	}

	public String CriarUsuario( String Nome, String Email, String Senha, String Cpf) {
	
	Usuario usuarioNovo = new Usuario(Nome, Email,Senha, Cpf);
	usuarios.add(usuarioNovo);
	
	
	return "Usuario cadastrado com sucesso";
	}

	public String getUsuario() {
		return ("\nEmail" + this.Email
				+"\nSenha" + this.Senha);
	}
	
	void Autenticacao(String Email, String Senha) {
		if (this.Email == Email && this.Senha == Senha);
		{
		
	}
		}

	@SuppressWarnings("static-access")
	public boolean cadastrarUsuario(String Nome, String Cpf, String Senha, String Email) {
		 // Verifica se o usuário já existe
        for (Usuario usuarioExistente : Hotel.getUsuario()) {
            if (usuarioExistente.getCpf().equals(Cpf)) {
                return false; // Usuário já existe
            }
        }
        Usuario novoUsuario = new Usuario(Nome, Cpf, Senha, Email);
        Hotel hotel = new Hotel();
		hotel.adicionarUsuario(novoUsuario);
        return true;
    }

	public Usuario autenticarUsuario(String cpf, String Senha) {
		
		return Hotel.buscarUsuario(cpf, Senha);
	}


	}