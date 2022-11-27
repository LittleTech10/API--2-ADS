package Controller;

import View.ConfirmacaoCadastro;
import View.Login;
import java.awt.Dimension;
import java.awt.Frame;

public class ConfirmacaoCadastroController {
    
    private ConfirmacaoCadastro view;

    public ConfirmacaoCadastroController(ConfirmacaoCadastro view) {
        this.view = view;
    }
    
    public void acessarLogin() {
        
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
}
