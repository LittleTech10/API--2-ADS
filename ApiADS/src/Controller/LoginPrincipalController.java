package Controller;

import View.Login;
import View.LoginPrincipal;

public class LoginPrincipalController {
    
    private final LoginPrincipal view;

    public LoginPrincipalController(LoginPrincipal view) {
        this.view = view;
        
    }
    
    public void entrarNoLogin() {
        Login login = new Login();
        login.setVisible(true);
    }
}
