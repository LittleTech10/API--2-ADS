package Controller;

import View.Login;
import View.MainLogin;

public class MainLoginController {
    
    private MainLogin view;

    public MainLoginController(MainLogin view) {
        this.view = view;
    }
    
    public void entrarNoLogin() {
        Login login = new Login();
        login.setVisible(true);
        this.view.dispose();
    }  
}
