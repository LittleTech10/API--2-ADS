package Controller;

import View.CadastroCanais;
import View.LoginADM;
import View.MainLogin;
import java.awt.Dimension;
import java.awt.Frame;

public class LoginADMController {
    
    private LoginADM view;

    public LoginADMController(LoginADM view) {
        this.view = view;
    }
    
    public void entrarNoSistemaADM() { 
        String nome = view.getCampoUsuarioADM().getText();
        String senha = view.getCampoSenhaADM().getText();
        Dimension telaAtual = view.getPreferredSize();
        Dimension telaNova = view.getSize();
        
        int tamanhoTelaAtual = (int) telaAtual.getWidth();
        int tamanhoTelaNova = (int) telaNova.getWidth();
        
        if (tamanhoTelaAtual < tamanhoTelaNova && nome.equals("admin") & senha.equals("admin")) {
            CadastroCanais cadastroCanais = new CadastroCanais();
            cadastroCanais.setExtendedState(Frame.MAXIMIZED_BOTH);
            cadastroCanais.setVisible(true);
            this.view.dispose();
        } 
  
        else if (nome.equals("admin") & senha.equals("admin")) {
            CadastroCanais cadastroCanais = new CadastroCanais();
            cadastroCanais.setVisible(true);
            this.view.dispose();
        }      
        
        else if (nome.isEmpty() | senha.isEmpty()) {
            this.view.exibeMensagem("Campos em branco");
        }
        
        else {
            this.view.exibeMensagem("Usuario ou senha incorretos");          
        }
    }
    
    public void limparTela() {
        view.getCampoUsuarioADM().setText("");
        view.getCampoSenhaADM().setText("");
    }
    
    public void voltarMainLogin() {
        
        Dimension telaAtual = view.getPreferredSize();
        Dimension telaNova = view.getSize();
        
        int tamanhoTelaAtual = (int) telaAtual.getWidth();
        int tamanhoTelaNova = (int) telaNova.getWidth();
        
        if (tamanhoTelaAtual < tamanhoTelaNova) {
            MainLogin mainLogin = new MainLogin();
            mainLogin.setExtendedState(Frame.MAXIMIZED_BOTH);
            mainLogin.setVisible(true);
            this.view.dispose();
        }
        else {
            MainLogin mainLogin = new MainLogin();
            mainLogin.setVisible(true);
            this.view.dispose();
        }
    }
}
