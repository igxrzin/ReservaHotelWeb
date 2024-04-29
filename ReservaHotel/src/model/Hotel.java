package model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	//LISTA,ADICIONAR USUARIOS
	private static List<Usuario> usuarios = new ArrayList<>();

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    //LISTA,ADICIONAR QUARTOS
    private static List<Quarto> quartos = new ArrayList<>();

    public void adicionarQuarto(Quarto quarto) {
        quartos.add(quarto);
    }
    
    //BUSCAR USUARIO
    public static Usuario buscarUsuario(String Cpf) {
        for (Usuario usuario : usuarios) {
            if (Usuario.getCpf().equals(Cpf)) {
                return usuario;
            }
        }
        return null;
    }

    //BUSCAR QUARTOS
    public static Quarto buscarQuarto(String nomeQuarto) {
        for (Quarto quarto : quartos) {
            if (Usuario.getnomeQuarto().equals(nomeQuarto)) {
                return quarto;
            }
        }
        return null;
    }

    
	public static Usuario[] getUsuario() {
		return null;
	}
	
	public static Quarto[] getQuarto() {
		return null;
	}
	
}