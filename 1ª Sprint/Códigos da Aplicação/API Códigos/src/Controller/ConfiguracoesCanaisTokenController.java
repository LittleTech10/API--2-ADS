
package Controller;

import Helper.ConfiguracoesCanaisTokenHelper;
import View.ConfiguracoesAtivas;
import View.ConfiguracoesCanaisToken;
import View.SelecionarCanal;
import java.awt.Dimension;
import java.awt.Frame;

public class ConfiguracoesCanaisTokenController {
    private ConfiguracoesCanaisToken view;

    public ConfiguracoesCanaisTokenController(ConfiguracoesCanaisToken view) {
        this.view = view;
    }
    
    public void voltarSelecionarCanais() {
        
        Dimension telaAtual = view.getPreferredSize();
        Dimension telaNova = view.getSize();
        
        int tamanhoTelaAtual = (int) telaAtual.getWidth();
        int tamanhoTelaNova = (int) telaNova.getWidth();
        
        if (tamanhoTelaAtual < tamanhoTelaNova) {       
            SelecionarCanal selecionarCanal = new SelecionarCanal();
            selecionarCanal.setExtendedState(Frame.MAXIMIZED_BOTH);
            selecionarCanal.setVisible(true);
            this.view.dispose();
        } 
        
        else {
            SelecionarCanal selecionarCanal = new SelecionarCanal();
            selecionarCanal.setVisible(true);
            this.view.dispose();
        }
    }
    
    public void acessarConfiguracoesAtivas() {
        String idConta = view.getEditIDToken().getText();
        String token = view.getEditToken().getText();
        
        Dimension telaAtual = view.getPreferredSize();
        Dimension telaNova = view.getSize();
        
        int tamanhoTelaAtual = (int) telaAtual.getWidth();
        int tamanhoTelaNova = (int) telaNova.getWidth();
        
        if (tamanhoTelaAtual < tamanhoTelaNova && idConta.isEmpty() == false && token.isEmpty() == false) {
            ConfiguracoesCanaisTokenHelper configuracoesCanaisTokenHelper = new ConfiguracoesCanaisTokenHelper();
            configuracoesCanaisTokenHelper.setUser(view.getMinhaConta().getText());
            configuracoesCanaisTokenHelper.setCanal(view.getEditCanalToken().getText());
            configuracoesCanaisTokenHelper.setId(view.getEditIDToken().getText());
            configuracoesCanaisTokenHelper.setToken(view.getEditToken().getText());

            ConfiguracoesAtivas configuracoesAtivas = new ConfiguracoesAtivas();
            configuracoesAtivas.exportar(configuracoesCanaisTokenHelper);
            configuracoesAtivas.exportarToTable(configuracoesCanaisTokenHelper);
            configuracoesAtivas.setExtendedState(Frame.MAXIMIZED_BOTH);
            configuracoesAtivas.setVisible(true);
            this.view.dispose();
        }
        
        else if (idConta.isEmpty() == false && token.isEmpty() == false) {
            ConfiguracoesCanaisTokenHelper configuracoesCanaisTokenHelper = new ConfiguracoesCanaisTokenHelper();
            configuracoesCanaisTokenHelper.setUser(view.getMinhaConta().getText());
            configuracoesCanaisTokenHelper.setCanal(view.getEditCanalToken().getText());
            configuracoesCanaisTokenHelper.setId(view.getEditIDToken().getText());
            configuracoesCanaisTokenHelper.setToken(view.getEditToken().getText());
     
            ConfiguracoesAtivas configuracoesAtivas = new ConfiguracoesAtivas();
            configuracoesAtivas.exportar(configuracoesCanaisTokenHelper);
            configuracoesAtivas.exportarToTable(configuracoesCanaisTokenHelper);
            configuracoesAtivas.setVisible(true);
            this.view.dispose();
         }
        
        else {
            this.view.exibeMensagem("Preencha todos os campos para continuar com o registro do canal");
        }
    }
}
