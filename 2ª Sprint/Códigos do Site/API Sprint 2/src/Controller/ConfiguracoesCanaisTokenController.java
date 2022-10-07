package Controller;

import Helper.ConfiguracoesCanaisTokenHelper;
import Helper.LoginHelper;
import DAO.ConfiguracaoCanalDAO;
import Model.ConfiguracaoCanais;
import View.ConfiguracoesAtivasToken;
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
            LoginHelper loginHelper = new LoginHelper();
            loginHelper.setUser(view.getMinhaConta().getText());
            
            SelecionarCanal selecionarCanal = new SelecionarCanal();
            selecionarCanal.exportar(loginHelper);
            selecionarCanal.setExtendedState(Frame.MAXIMIZED_BOTH);
            selecionarCanal.setVisible(true);
            this.view.dispose();
        } 
        
        else {
            LoginHelper loginHelper = new LoginHelper();
            loginHelper.setUser(view.getMinhaConta().getText());
            
            SelecionarCanal selecionarCanal = new SelecionarCanal();
            selecionarCanal.exportar(loginHelper);
            selecionarCanal.setVisible(true);
            this.view.dispose();
        }
    }
    
    public void acessarConfiguracoesAtivas() {
        String canal = view.getEditCanalToken().getText();
        String idConta = view.getEditIDToken().getText();
        String token = view.getEditToken().getText();
        String user = view.getMinhaConta().getText();
        
        ConfiguracoesCanaisTokenHelper configuracoesCanaisTokenHelper = new ConfiguracoesCanaisTokenHelper();
        configuracoesCanaisTokenHelper.setUser(user);
        
        ConfiguracaoCanais configCanal = new ConfiguracaoCanais();
        configCanal.setNomeCanal(canal);
        configCanal.setIdConta(idConta);
        configCanal.setToken(token);
        
        Dimension telaAtual = view.getPreferredSize();
        Dimension telaNova = view.getSize();
        
        int tamanhoTelaAtual = (int) telaAtual.getWidth();
        int tamanhoTelaNova = (int) telaNova.getWidth();
        
        if (tamanhoTelaAtual < tamanhoTelaNova && idConta.isEmpty() == false && token.isEmpty() == false) {
            ConfiguracaoCanalDAO dao = new ConfiguracaoCanalDAO();
            dao.adicionar_configuracaoCanal(configCanal);
            
            ConfiguracoesAtivasToken configuracoesAtivas = new ConfiguracoesAtivasToken();
            configuracoesAtivas.exportar(configuracoesCanaisTokenHelper);
            configuracoesAtivas.setExtendedState(Frame.MAXIMIZED_BOTH);
            configuracoesAtivas.setVisible(true);
            this.view.dispose();
        }
        
        else if (idConta.isEmpty() || token.isEmpty()){
            this.view.exibeMensagem("Preencha todos os campos para continuar com o registro do canal");
        }
        
        else{
            ConfiguracaoCanalDAO dao = new ConfiguracaoCanalDAO();
            dao.adicionar_configuracaoCanal(configCanal);
            
            ConfiguracoesAtivasToken configuracoesAtivas = new ConfiguracoesAtivasToken();
            configuracoesAtivas.exportar(configuracoesCanaisTokenHelper);
            configuracoesAtivas.setVisible(true);
            this.view.dispose();
        }
    }
}
