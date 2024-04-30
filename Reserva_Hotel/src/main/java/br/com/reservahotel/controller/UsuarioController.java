package br.com.reservahotel.controller;

import java.util.ArrayList;

import br.com.reservahotel.model.Usuario;

public class UsuarioController {	
	ArrayList<Usuario> usuarios;
	
	public void CadastrarUsuario(String nome, String email) {
		Usuario usuarioNovo = new Usuario(nome,email);
		usuarios.add(usuarioNovo);
		}
	
}
