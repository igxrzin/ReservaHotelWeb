package model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private static List<Usuario> usuarios = new ArrayList<>();

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public static Usuario buscarUsuario(String Cpf, String senha) {
        for (Usuario usuario : usuarios) {
            if (Usuario.getCpf().equals(Cpf) && Usuario.getSenha().equals(senha)) {
                return usuario;
            }
        }
        return null;
    }

	public static Usuario[] getUsuario() {
		// TODO Auto-generated method stub
		return null;
	}
	
}