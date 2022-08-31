package Controller;

import View.Cadastro;
import View.ConfiguracoesDeCanaisUsuarioSenha;
import View.Login;
import javax.swing.JOptionPane;

public class LoginController {
    private final Login view;

    public LoginController(Login view) {
        this.view = view;
        }

    public void entrarNoSistema() {
        
        String nome = view.getUsuarioText().getText();
        String senha = view.getSenhaText().getText();
        
        if (nome.equals("admin") & senha.equals("admin")) {
            ConfiguracoesDeCanaisUsuarioSenha configuracoesDeCanaisUsuarioSenha = new ConfiguracoesDeCanaisUsuarioSenha();
            configuracoesDeCanaisUsuarioSenha.setVisible(true);
        }
        
        else {
            this.view.exibeMensagem("Usuário ou senha inválidos");
        }
    }
    
    public void entrarNoCadastro() {
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);
    }
    
    public void limparTela() {
        view.getUsuarioText().setText("");
        view.getSenhaText().setText("");
    }
}
