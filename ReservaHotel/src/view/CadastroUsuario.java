package view;

import javax.swing.JOptionPane;

import controller.UsuarioController;

public class CadastroUsuario {

	private UsuarioController usuarioController;

	public CadastroUsuario(UsuarioController usuarioController) {
		this.usuarioController = usuarioController;
	}

	public void exibir() {
		        String Nome = JOptionPane.showInputDialog(null, "Nome Completo:", "Cadastro de Usuário", JOptionPane.QUESTION_MESSAGE);
		        String Cpf = JOptionPane.showInputDialog(null, "CPF:", "Cadastro de Usuário", JOptionPane.QUESTION_MESSAGE);
		        String Senha = JOptionPane.showInputDialog(null, "Crie uma Senha:", "Cadastro de Usuário", JOptionPane.QUESTION_MESSAGE);
		        String Email= JOptionPane.showInputDialog(null, "Crie um Email:", "Cadastro de Usuário", JOptionPane.QUESTION_MESSAGE);
		        
		        
		        if (usuarioController.cadastrarUsuario(Nome, Cpf, Senha, Email)) {
		            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		        } else {
		            JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário. CPF já pode estar em uso.", "Erro", JOptionPane.ERROR_MESSAGE);
		        }
		    }
		
	}