package Controller;

import View.ConfiguracoesAtivas;
import View.ConfiguracoesCanaisUsuarioSenha;
import View.SelecionarCanal;

public class ConfiguracoesCanaisUsuarioSenhaController {
    private ConfiguracoesCanaisUsuarioSenha view;

    public ConfiguracoesCanaisUsuarioSenhaController(ConfiguracoesCanaisUsuarioSenha view) {
        this.view = view;
    }
    
    public void voltarSelecionarCanais() {
        SelecionarCanal selecionarCanal = new SelecionarCanal();
        selecionarCanal.setVisible(true);
        this.view.dispose();
    }
    
    public void acessarConfiguracoesAtivas() {
        ConfiguracoesAtivas configuracoesAtivas = new ConfiguracoesAtivas();
        configuracoesAtivas.setVisible(true);
        this.view.dispose();
    }
    
}
