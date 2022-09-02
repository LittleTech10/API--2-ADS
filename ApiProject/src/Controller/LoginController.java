package Controller;

import View.Cadastro;
import View.CadastroCanais;
import View.Login;

public class LoginController {
    
    private Login view;

    public LoginController(Login view) {
        this.view = view;
    }
    
    public void entrarNoSistema() {
        String nome = view.getCampoUsuario().getText();
        String senha = view.getCampoSenha().getText();
        
        if (nome.equals("admin") & senha.equals("admin")) {
            CadastroCanais cadastroCanais = new CadastroCanais();
            cadastroCanais.setVisible(true);
            this.view.dispose();
        }
        
        else {
            this.view.exibeMensagem("Usuario ou senha incorretos");
            
        }
    }
    
    public void limparTela() {
        view.getCampoUsuario().setText("");
        view.getCampoSenha().setText("");
    }
    
    public void entrarNoCadastro() {
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);
        this.view.dispose();
    }
}
