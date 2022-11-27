package Controller;

import Helper.ConfiguracoesCanaisTokenHelper;
import Helper.LoginHelper;
import DAO.ConfiguracaoCanalDAO;
import Factory.ConnectionFactory;
import Model.ConfiguracaoCanais;
import Model.VerificarConfigCanais;
import View.ConfiguracoesAtivasToken;
import View.ConfiguracoesCanaisToken;
import View.SelecionarCanal;
import java.awt.Dimension;
import java.awt.Frame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;

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
    
    public void acessarConfiguracoesAtivas() throws SQLException {
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
        
        VerificarConfigCanais verificarConfig = new VerificarConfigCanais(idConta);
        Connection conexao = new ConnectionFactory().getConnection();
        ConfiguracaoCanalDAO configDao = new ConfiguracaoCanalDAO();
        boolean existeConfigurado = configDao.verificaConfigToken(verificarConfig);
        
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
        
        else if (existeConfigurado) {
            this.view.exibeMensagem("Este canal já está configurado");
        }
        else {
            ConfiguracaoCanalDAO dao = new ConfiguracaoCanalDAO();
            dao.adicionar_configuracaoCanal(configCanal);
            
            ConfiguracoesAtivasToken configuracoesAtivas = new ConfiguracoesAtivasToken();
            configuracoesAtivas.exportar(configuracoesCanaisTokenHelper);
            configuracoesAtivas.setVisible(true);
            this.view.dispose();
        }
    }
}
