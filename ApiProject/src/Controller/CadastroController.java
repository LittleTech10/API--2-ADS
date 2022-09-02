package Controller;

import View.Cadastro;
import View.ConfirmacaoCadastro;
import View.Login;

public class CadastroController {
    
    private Cadastro view;

    public CadastroController(Cadastro view) {
        this.view = view;
    }
    
    public void acessarConfirmacaoCadastro() {
        ConfirmacaoCadastro confirmacaoCadastro = new ConfirmacaoCadastro();
        confirmacaoCadastro.setVisible(true);
        this.view.dispose();
    }
    
    public void voltarLogin() {
        Login login = new Login();
        login.setVisible(true);
        this.view.dispose();
    }
    
}
