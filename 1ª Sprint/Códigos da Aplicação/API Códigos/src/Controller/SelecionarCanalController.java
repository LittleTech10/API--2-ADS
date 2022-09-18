package Controller;

import Helper.SelecionarCanalHelper;
import View.ConfiguracoesCanaisToken;
import View.Login;
import View.SelecionarCanal;
import java.awt.Dimension;
import java.awt.Frame;

public class SelecionarCanalController {
    private SelecionarCanal view;

    public SelecionarCanalController(SelecionarCanal view) {
        this.view = view;
    }
    
    public void acessarConfiguracoesCanaisToken() {
        
        Dimension telaAtual = view.getPreferredSize();
        Dimension telaNova = view.getSize();
        String select = (String) view.getSelecionarCanal().getSelectedItem();
        
        int tamanhoTelaAtual = (int) telaAtual.getWidth();
        int tamanhoTelaNova = (int) telaNova.getWidth();
        
        if (tamanhoTelaAtual < tamanhoTelaNova && select != "Selecione o canal que deseja registrar") {
            SelecionarCanalHelper selecionarCanalHelper = new SelecionarCanalHelper();
            selecionarCanalHelper.setItemSelect((String) view.getSelecionarCanal().getSelectedItem());
            selecionarCanalHelper.setUser(view.getMinhaConta().getText());
            
            ConfiguracoesCanaisToken configuracoesCanaisToken = new ConfiguracoesCanaisToken();
            configuracoesCanaisToken.exportar(selecionarCanalHelper);
            configuracoesCanaisToken.exportar2(selecionarCanalHelper);
            configuracoesCanaisToken.setExtendedState(Frame.MAXIMIZED_BOTH);
            configuracoesCanaisToken.setVisible(true);
            this.view.dispose();
        }
        
         if (tamanhoTelaNova == tamanhoTelaAtual && select != "Selecione o canal que deseja registrar") {
            SelecionarCanalHelper selecionarCanalHelper = new SelecionarCanalHelper();
            selecionarCanalHelper.setItemSelect((String) view.getSelecionarCanal().getSelectedItem());
            selecionarCanalHelper.setUser(view.getMinhaConta().getText());
            
            ConfiguracoesCanaisToken configuracoesCanaisToken = new ConfiguracoesCanaisToken();
            configuracoesCanaisToken.exportar(selecionarCanalHelper);
            configuracoesCanaisToken.exportar2(selecionarCanalHelper);
            configuracoesCanaisToken.setVisible(true);
            this.view.dispose();
         }
         
         else if (select == "Selecione o canal que deseja registrar") {
            this.view.exibeMensagem("Selecione um canal para prosseguir");
         }
    }
    
    public void sairUser() {
        Dimension telaAtual = view.getPreferredSize();
        Dimension telaNova = view.getSize();
        
        int tamanhoTelaAtual = (int) telaAtual.getWidth();
        int tamanhoTelaNova = (int) telaNova.getWidth();
        
        if (tamanhoTelaAtual < tamanhoTelaNova) {       
            Login login = new Login();
            login.setExtendedState(Frame.MAXIMIZED_BOTH);
            login.setVisible(true);
            this.view.dispose();
        } 
        
        else {
            Login loginADM = new Login();
            loginADM.setVisible(true);
            this.view.dispose();
        }
    }
}
