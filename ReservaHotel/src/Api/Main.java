package Api;

import model.Hotel;
import model.Usuario;
import view.CadastroUsuario;
import view.LoginView;

import javax.swing.*;

import controller.UsuarioController;


public class Main {
    public static void main(String[] args) {
       Hotel hotel = new Hotel();
       		UsuarioController usuarioController = new UsuarioController(hotel);
        while (true) {
            Object[] options = {"Cadastrar", "Login", "Listar Usuários"};
            int escolha = JOptionPane.showOptionDialog(null, "Bem-vindo ao San Andreas HOTEL! Escolha uma opção:", "HOTEL",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                    null, options, options[0]);

            switch (escolha) {
            case 0: //Cadastro
            	 
            	 CadastroUsuario cadastroUsuario = new CadastroUsuario(usuarioController);
                 cadastroUsuario.exibir();
                  
                break;
             
            case 1: //Login
            	LoginView loginView = new LoginView(usuarioController);
                Usuario usuarioLogado = loginView.exibir();
                if (usuarioLogado != null) {
            	
            	}
  		
            	break;	
                         
        }
        }
    }
}