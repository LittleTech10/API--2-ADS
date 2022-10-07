package Controller;

import View.Login;
import View.LoginADM;
import View.MainLogin;
import java.awt.Dimension;
import java.awt.Frame;

public class MainLoginController {
    
    private MainLogin view;

    public MainLoginController(MainLogin view) {
        this.view = view;
    }
    
    public void entrarNoLogin() {
        Dimension telaAtual = view.getPreferredSize();
        Dimension telaNova = view.getSize();
        
        int tamanhoTelaAtual = (int) telaAtual.getWidth();
        int tamanhoTelaNova = (int) telaNova.getWidth();

        if (tamanhoTelaAtual < tamanhoTelaNova) {
            Login login = new Login();
            login.setExtendedState(Frame.MAXIMIZED_BOTH);
            login.setVisible(true);
            this.view.dispose();
        } 
        else {
            Login login = new Login();
            login.setVisible(true);
            this.view.dispose();
        }
    }
    
    public void entrarNoLoginADM() {
        Dimension telaAtual = view.getPreferredSize();
        Dimension telaNova = view.getSize();
        
        int tamanhoTelaAtual = (int) telaAtual.getWidth();
        int tamanhoTelaNova = (int) telaNova.getWidth();
        
        if (tamanhoTelaAtual < tamanhoTelaNova) {
            LoginADM loginADM = new LoginADM();
            loginADM.setExtendedState(Frame.MAXIMIZED_BOTH);
            loginADM.setVisible(true);
            this.view.dispose();
        } 
        
        else {
        LoginADM loginADM = new LoginADM();
        loginADM.setVisible(true);
        this.view.dispose();
        }
    }
}
