package Controller;

import View.ConfirmacaoCadastro;
import View.Login;

public class ConfirmacaoCadastroController {
    private final ConfirmacaoCadastro view;

    public ConfirmacaoCadastroController(ConfirmacaoCadastro view) {
        this.view = view;
    }
    
    public void navegarProLogin() {
        Login login = new Login();
        login.setVisible(true);
    }  
}
