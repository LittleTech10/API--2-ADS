package Controller;

import Helper.ConfiguracoesAtivasHelper;
import Helper.ConfiguracoesCanaisTokenHelper;
import View.ConfiguracoesAtivasToken;
import View.ConfiguracoesAtivasUsuarioSenha;
import View.SelecionarCanal;
import java.awt.Dimension;
import java.awt.Frame;


public class ConfiguracoesAtivasUsuarioSenhaController {
    private ConfiguracoesAtivasUsuarioSenha view;

    public ConfiguracoesAtivasUsuarioSenhaController(ConfiguracoesAtivasUsuarioSenha view) {
        this.view = view;
    }
    
    public void voltarCanais() {
        Dimension telaAtual = view.getPreferredSize();
        Dimension telaNova = view.getSize();
        
        int tamanhoTelaAtual = (int) telaAtual.getWidth();
        int tamanhoTelaNova = (int) telaNova.getWidth();
        
        if (tamanhoTelaAtual < tamanhoTelaNova) {       
            ConfiguracoesAtivasHelper configuracoesAtivasHelper = new ConfiguracoesAtivasHelper();
            configuracoesAtivasHelper.setUser(view.getMinhaConta().getText());
            
            SelecionarCanal selecionarCanal = new SelecionarCanal();
            selecionarCanal.exportar2(configuracoesAtivasHelper);
            selecionarCanal.setExtendedState(Frame.MAXIMIZED_BOTH);
            selecionarCanal.setVisible(true);
            this.view.dispose();
        } 
        
        else {
            ConfiguracoesAtivasHelper configuracoesAtivasHelper = new ConfiguracoesAtivasHelper();
            configuracoesAtivasHelper.setUser(view.getMinhaConta().getText());
            
            SelecionarCanal selecionarCanal = new SelecionarCanal();
            selecionarCanal.exportar2(configuracoesAtivasHelper);
            selecionarCanal.setVisible(true);
            this.view.dispose();
        }
    } 
    
    public void acessarConfigToken() {
        Dimension telaAtual = view.getPreferredSize();
        Dimension telaNova = view.getSize();
        ConfiguracoesCanaisTokenHelper configuracoesCanaisTokenHelper = new ConfiguracoesCanaisTokenHelper();
        String user = view.getMinhaConta().getText();
        configuracoesCanaisTokenHelper.setUser(user);
        
        int tamanhoTelaAtual = (int) telaAtual.getWidth();
        int tamanhoTelaNova = (int) telaNova.getWidth();
        
        if (tamanhoTelaAtual < tamanhoTelaNova) {
            
            ConfiguracoesAtivasToken configuracoesAtivas = new ConfiguracoesAtivasToken();
            configuracoesAtivas.exportar(configuracoesCanaisTokenHelper);
            configuracoesAtivas.setExtendedState(Frame.MAXIMIZED_BOTH);
            configuracoesAtivas.setVisible(true);
            this.view.dispose();
        }
        
        else{
            
            ConfiguracoesAtivasToken configuracoesAtivas = new ConfiguracoesAtivasToken();
            configuracoesAtivas.exportar(configuracoesCanaisTokenHelper);
            configuracoesAtivas.setVisible(true);
            this.view.dispose();
        }
    }
}
