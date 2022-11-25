package Controller;

import Helper.ConfiguracoesAtivasHelper;
import Helper.ConfiguracoesCanaisTokenHelper;
import View.ConfiguracoesAtivasToken;
import View.ConfiguracoesAtivasUsuarioSenha;
import View.SelecionarCanal;
import java.awt.Dimension;
import java.awt.Frame;


public class ConfiguracoesAtivasTokenController {
    private ConfiguracoesAtivasToken view;

    public ConfiguracoesAtivasTokenController(ConfiguracoesAtivasToken view) {
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
    
    public void acessarConfigUsuario() {
        Dimension telaAtual = view.getPreferredSize();
        Dimension telaNova = view.getSize();
        ConfiguracoesCanaisTokenHelper configuracoesCanaisTokenHelper = new ConfiguracoesCanaisTokenHelper();
        String user = view.getMinhaConta().getText();
        configuracoesCanaisTokenHelper.setUser(user);
        
        int tamanhoTelaAtual = (int) telaAtual.getWidth();
        int tamanhoTelaNova = (int) telaNova.getWidth();
        
        if (tamanhoTelaAtual < tamanhoTelaNova) {
            
            ConfiguracoesAtivasUsuarioSenha configuracoesAtivasUsuarioSenha = new ConfiguracoesAtivasUsuarioSenha();
            configuracoesAtivasUsuarioSenha.exportar(configuracoesCanaisTokenHelper);
            configuracoesAtivasUsuarioSenha.setExtendedState(Frame.MAXIMIZED_BOTH);
            configuracoesAtivasUsuarioSenha.setVisible(true);
            this.view.dispose();
        }
        
        else{
            
            ConfiguracoesAtivasUsuarioSenha configuracoesAtivasUsuarioSenha = new ConfiguracoesAtivasUsuarioSenha();
            configuracoesAtivasUsuarioSenha.exportar(configuracoesCanaisTokenHelper);
            configuracoesAtivasUsuarioSenha.setVisible(true);
            this.view.dispose();
        }
    }
}
