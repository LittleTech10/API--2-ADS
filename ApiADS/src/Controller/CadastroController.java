package Controller;

import View.Cadastro;
import View.ConfirmacaoCadastro;
import View.Login;

public class CadastroController {
    private final Cadastro view;
    
    public CadastroController(Cadastro view) {
        this.view = view;
    }
    
    public void navegarConfirmacaoCadastro() { 
        ConfirmacaoCadastro confirmacaoCadastro = new ConfirmacaoCadastro();
        confirmacaoCadastro.setVisible(true); 
    }
    
    public void navegarDeVoltaProLogin() {
        Login login = new Login();
        login.setVisible(true);
    }
}
