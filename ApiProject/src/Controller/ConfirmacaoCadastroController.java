package Controller;

import View.ConfirmacaoCadastro;
import View.Login;

public class ConfirmacaoCadastroController {
    
    private ConfirmacaoCadastro view;

    public ConfirmacaoCadastroController(ConfirmacaoCadastro view) {
        this.view = view;
    }
    
    public void acessarLogin() {
        Login login = new Login();
        login.setVisible(true);
        this.view.dispose();
    }
    
}
