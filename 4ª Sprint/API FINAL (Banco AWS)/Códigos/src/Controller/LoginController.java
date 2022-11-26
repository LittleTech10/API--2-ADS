package Controller;

import Helper.LoginHelper;
import Factory.ConnectionFactory;
import Model.UsuarioLogin;
import DAO.UsuarioDAO;
import View.Cadastro;
import View.Login;
import View.MainLogin;
import View.SelecionarCanal;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.Dimension;
import java.awt.Frame;

public class LoginController {
    
    private Login view;

    public LoginController(Login view) {
        this.view = view;
    }
    
    public void entrarNoSistema() throws SQLException {
     
        String username = view.getCampoUsuarioADM().getText();
        String senha = view.getCampoSenhaADM().getText();
        Dimension telaAtual = view.getPreferredSize();
        Dimension telaNova = view.getSize();
        
        UsuarioLogin verificaUsuario = new UsuarioLogin(username, senha);
        
        Connection conexao = new ConnectionFactory().getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO();
        boolean existe = usuarioDao.verificaUsuarioBanco(verificaUsuario);
        
        int tamanhoTelaAtual = (int) telaAtual.getWidth();
        int tamanhoTelaNova = (int) telaNova.getWidth();
        
        if (tamanhoTelaAtual < tamanhoTelaNova && existe) {
            LoginHelper loginHelper = new LoginHelper();
            loginHelper.setUser(view.getCampoUsuarioADM().getText());
            
            SelecionarCanal selecionarCanal = new SelecionarCanal();
            selecionarCanal.exportar(loginHelper);
            selecionarCanal.setExtendedState(Frame.MAXIMIZED_BOTH);
            selecionarCanal.setVisible(true);
            this.view.dispose();
        } 
  
        else if (existe) {          
            LoginHelper loginHelper = new LoginHelper();
            loginHelper.setUser(view.getCampoUsuarioADM().getText());
            
            SelecionarCanal selecionarCanal = new SelecionarCanal();
            selecionarCanal.exportar(loginHelper);
            selecionarCanal.setVisible(true);
            this.view.dispose();
        }      
        
        else if (username.isEmpty() | senha.isEmpty()) {
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
    
    public void entrarNoCadastro() {
        
        Dimension telaAtual = view.getPreferredSize();
        Dimension telaNova = view.getSize();
        
        int tamanhoTelaAtual = (int) telaAtual.getWidth();
        int tamanhoTelaNova = (int) telaNova.getWidth();
        
        if (tamanhoTelaAtual < tamanhoTelaNova) {
            Cadastro cadastro = new Cadastro();
            cadastro.setExtendedState(Frame.MAXIMIZED_BOTH);
            cadastro.setVisible(true);
            this.view.dispose();
        }
        else {
            Cadastro cadastro = new Cadastro();
            cadastro.setVisible(true);
            this.view.dispose();            
        }

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
