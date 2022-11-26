
package Controller;


import View.FAQ;
import View.MainLogin;
import java.awt.Dimension;
import java.awt.Frame;

public class FAQController {
    
    private FAQ view;

    public FAQController(FAQ view) {
        this.view = view;
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
